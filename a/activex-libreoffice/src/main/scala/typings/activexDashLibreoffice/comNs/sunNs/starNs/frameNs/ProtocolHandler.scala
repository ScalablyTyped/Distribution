package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XInitialization
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.URL
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * special dispatch provider registered for URL protocols
  *
  * The generic dispatch mechanism on a {@link Frame} search for such registered protocol handler and use it if it agrees with the dispatched URL.
  *
  * Supported URLs must match follow format: `protocol scheme:protocol specific part` If a handler provides optional arguments ("?") or jump marks ("#")
  * depends from his definition and implementation. The generic dispatch provider will use registered URL pattern to detect right handler.
  */
trait ProtocolHandler
  extends XDispatchProvider
     with XInitialization

object ProtocolHandler {
  @scala.inline
  def apply(
    acquire: () => Unit,
    initialize: SeqEquiv[_] => Unit,
    queryDispatch: (URL, String, Double) => XDispatch,
    queryDispatches: SeqEquiv[DispatchDescriptor] => SafeArray[XDispatch],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): ProtocolHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), initialize = js.Any.fromFunction1(initialize), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[ProtocolHandler]
  }
}

