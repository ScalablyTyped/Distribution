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
    acquire: () => scala.Unit,
    getOwnUpdateHandler: java.lang.String => XUpdateHandler,
    getUpdateHandler: (java.lang.String, java.lang.String) => XUpdateHandler,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    listLayers: (java.lang.String, java.lang.String) => stdLib.SafeArray[XLayer],
    listOwnLayers: java.lang.String => stdLib.SafeArray[XLayer],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): SystemIntegration = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getOwnUpdateHandler = js.Any.fromFunction1(getOwnUpdateHandler), getUpdateHandler = js.Any.fromFunction2(getUpdateHandler), initialize = js.Any.fromFunction1(initialize), listLayers = js.Any.fromFunction2(listLayers), listOwnLayers = js.Any.fromFunction1(listOwnLayers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[SystemIntegration]
  }
}

