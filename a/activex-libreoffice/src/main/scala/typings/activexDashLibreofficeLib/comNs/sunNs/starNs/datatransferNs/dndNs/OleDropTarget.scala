package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service connects the Java-like UNO Drag & Drop protocol to the protocol used on window platforms. It realizes the drop target.
  * @see XDropTarget
  */
trait OleDropTarget
  extends XDropTarget
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent

object OleDropTarget {
  @scala.inline
  def apply(
    DefaultActions: scala.Double,
    acquire: js.Function0[scala.Unit],
    addDropTargetListener: js.Function1[XDropTargetListener, scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getDefaultActions: js.Function0[scala.Double],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    isActive: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeDropTargetListener: js.Function1[XDropTargetListener, scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    setActive: js.Function1[scala.Boolean, scala.Unit],
    setDefaultActions: js.Function1[scala.Double, scala.Unit]
  ): OleDropTarget = {
    val __obj = js.Dynamic.literal(DefaultActions = DefaultActions, acquire = acquire, addDropTargetListener = addDropTargetListener, addEventListener = addEventListener, dispose = dispose, getDefaultActions = getDefaultActions, initialize = initialize, isActive = isActive, queryInterface = queryInterface, release = release, removeDropTargetListener = removeDropTargetListener, removeEventListener = removeEventListener, setActive = setActive, setDefaultActions = setDefaultActions)
  
    __obj.asInstanceOf[OleDropTarget]
  }
}

