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
    acquire: js.Function0[scala.Unit],
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
    release: js.Function0[scala.Unit]
  ): ProtocolHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("queryDispatch")(queryDispatch)
    __obj.updateDynamic("queryDispatches")(queryDispatches)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[ProtocolHandler]
  }
}

