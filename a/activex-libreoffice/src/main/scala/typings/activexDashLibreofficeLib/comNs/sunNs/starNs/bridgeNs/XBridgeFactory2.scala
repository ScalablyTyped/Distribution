package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a unified interface for the {@link BridgeFactory} service to implement.
  * @since LibreOffice 4.0
  */
trait XBridgeFactory2
  extends XBridgeFactory
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent

object XBridgeFactory2 {
  @scala.inline
  def apply(
    ExistingBridges: stdLib.SafeArray[XBridge],
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    createBridge: (java.lang.String, java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.connectionNs.XConnection, XInstanceProvider) => XBridge,
    dispose: () => scala.Unit,
    getBridge: java.lang.String => XBridge,
    getExistingBridges: () => stdLib.SafeArray[XBridge],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit
  ): XBridgeFactory2 = {
    val __obj = js.Dynamic.literal(ExistingBridges = ExistingBridges, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), createBridge = js.Any.fromFunction4(createBridge), dispose = js.Any.fromFunction0(dispose), getBridge = js.Any.fromFunction1(getBridge), getExistingBridges = js.Any.fromFunction0(getExistingBridges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[XBridgeFactory2]
  }
}

