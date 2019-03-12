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
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    dispose: () => scala.Unit,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    queryDispatch: (activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, java.lang.String, scala.Double) => XDispatch,
    queryDispatches: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DispatchDescriptor] => stdLib.SafeArray[XDispatch],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    setPopupMenu: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPopupMenu => scala.Unit,
    statusChanged: FeatureStateEvent => scala.Unit,
    updatePopupMenu: () => scala.Unit
  ): PopupMenuController = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), disposing = js.Any.fromFunction1(disposing), initialize = js.Any.fromFunction1(initialize), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setPopupMenu = js.Any.fromFunction1(setPopupMenu), statusChanged = js.Any.fromFunction1(statusChanged), updatePopupMenu = js.Any.fromFunction0(updatePopupMenu))
  
    __obj.asInstanceOf[PopupMenuController]
  }
}

