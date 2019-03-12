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
    SupportedCommandGroups: stdLib.SafeArray[scala.Double],
    acquire: () => scala.Unit,
    getConfigurableDispatchInformation: scala.Double => stdLib.SafeArray[DispatchInformation],
    getSupportedCommandGroups: () => stdLib.SafeArray[scala.Double],
    queryDispatch: (activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, java.lang.String, scala.Double) => XDispatch,
    queryDispatches: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DispatchDescriptor] => stdLib.SafeArray[XDispatch],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XAppDispatchProvider = {
    val __obj = js.Dynamic.literal(SupportedCommandGroups = SupportedCommandGroups, acquire = js.Any.fromFunction0(acquire), getConfigurableDispatchInformation = js.Any.fromFunction1(getConfigurableDispatchInformation), getSupportedCommandGroups = js.Any.fromFunction0(getSupportedCommandGroups), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAppDispatchProvider]
  }
}

