package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a pop-up menu controller.
  *
  * A pop-up menu controller is used to make special functions available to users, which depend on runtime or context specific conditions. ;  A typical
  * example for a pop-up menu controller can be a recent file list implementation which provides a list of latest files that a user has worked on. This
  * list gets changes consistently during a work session.
  * @since OOo 2.0
  */
trait PopupMenuController
  extends XStatusListener
     with XPopupMenuController
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization
     with XDispatchProvider
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent

object PopupMenuController {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    dispose: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryDispatch: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, 
      java.lang.String, 
      scala.Double, 
      XDispatch
    ],
    queryDispatches: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DispatchDescriptor], 
      activexDashInteropLib.SafeArray[XDispatch]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    setPopupMenu: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPopupMenu, scala.Unit],
    statusChanged: js.Function1[FeatureStateEvent, scala.Unit],
    updatePopupMenu: js.Function0[scala.Unit]
  ): PopupMenuController = {
    val __obj = js.Dynamic.literal(acquire = acquire, addEventListener = addEventListener, dispose = dispose, disposing = disposing, initialize = initialize, queryDispatch = queryDispatch, queryDispatches = queryDispatches, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, setPopupMenu = setPopupMenu, statusChanged = statusChanged, updatePopupMenu = updatePopupMenu)
  
    __obj.asInstanceOf[PopupMenuController]
  }
}

