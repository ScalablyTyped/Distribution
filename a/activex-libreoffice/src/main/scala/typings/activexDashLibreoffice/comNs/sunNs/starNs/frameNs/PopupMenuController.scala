package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XPopupMenu
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XInitialization
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.URL
import typings.std.SafeArray
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
     with XInitialization
     with XDispatchProvider
     with XComponent

object PopupMenuController {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    disposing: EventObject => Unit,
    initialize: SeqEquiv[_] => Unit,
    queryDispatch: (URL, String, Double) => XDispatch,
    queryDispatches: SeqEquiv[DispatchDescriptor] => SafeArray[XDispatch],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    setPopupMenu: XPopupMenu => Unit,
    statusChanged: FeatureStateEvent => Unit,
    updatePopupMenu: () => Unit
  ): PopupMenuController = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), disposing = js.Any.fromFunction1(disposing), initialize = js.Any.fromFunction1(initialize), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setPopupMenu = js.Any.fromFunction1(setPopupMenu), statusChanged = js.Any.fromFunction1(statusChanged), updatePopupMenu = js.Any.fromFunction0(updatePopupMenu))
  
    __obj.asInstanceOf[PopupMenuController]
  }
}

