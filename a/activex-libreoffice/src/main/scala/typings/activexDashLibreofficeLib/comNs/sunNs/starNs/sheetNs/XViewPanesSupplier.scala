package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * enables access to the panes in a view.
  * @deprecated Deprecated
  */
trait XViewPanesSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the collection of panes in the view. */
  val ViewPanes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /** returns the collection of panes in the view. */
  def getViewPanes(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
}

object XViewPanesSupplier {
  @scala.inline
  def apply(
    ViewPanes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    acquire: js.Function0[scala.Unit],
    getViewPanes: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XViewPanesSupplier = {
    val __obj = js.Dynamic.literal(ViewPanes = ViewPanes, acquire = acquire, getViewPanes = getViewPanes, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XViewPanesSupplier]
  }
}

