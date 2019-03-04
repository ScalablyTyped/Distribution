package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to a configuration data composed of one or more platform backends containing settings used by software modules. */
trait SystemIntegration
  extends XBackend
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

object SystemIntegration {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getOwnUpdateHandler: js.Function1[java.lang.String, XUpdateHandler],
    getUpdateHandler: js.Function2[java.lang.String, java.lang.String, XUpdateHandler],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    listLayers: js.Function2[java.lang.String, java.lang.String, activexDashInteropLib.SafeArray[XLayer]],
    listOwnLayers: js.Function1[java.lang.String, activexDashInteropLib.SafeArray[XLayer]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): SystemIntegration = {
    val __obj = js.Dynamic.literal(acquire = acquire, getOwnUpdateHandler = getOwnUpdateHandler, getUpdateHandler = getUpdateHandler, initialize = initialize, listLayers = listLayers, listOwnLayers = listOwnLayers, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[SystemIntegration]
  }
}

