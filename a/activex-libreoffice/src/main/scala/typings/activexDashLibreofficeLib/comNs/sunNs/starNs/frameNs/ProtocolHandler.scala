package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

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
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

object ProtocolHandler {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    queryDispatch: (activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, java.lang.String, scala.Double) => XDispatch,
    queryDispatches: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DispatchDescriptor] => stdLib.SafeArray[XDispatch],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): ProtocolHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), initialize = js.Any.fromFunction1(initialize), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[ProtocolHandler]
  }
}

