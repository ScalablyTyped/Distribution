package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.2 */
trait XAppDispatchProvider
  extends XDispatchInformationProvider
     with XDispatchProvider

object XAppDispatchProvider {
  @scala.inline
  def apply(
    SupportedCommandGroups: activexDashInteropLib.SafeArray[scala.Double],
    acquire: js.Function0[scala.Unit],
    getConfigurableDispatchInformation: js.Function1[scala.Double, activexDashInteropLib.SafeArray[DispatchInformation]],
    getSupportedCommandGroups: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
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
  ): XAppDispatchProvider = {
    val __obj = js.Dynamic.literal(SupportedCommandGroups = SupportedCommandGroups, acquire = acquire, getConfigurableDispatchInformation = getConfigurableDispatchInformation, getSupportedCommandGroups = getSupportedCommandGroups, queryDispatch = queryDispatch, queryDispatches = queryDispatches, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XAppDispatchProvider]
  }
}

