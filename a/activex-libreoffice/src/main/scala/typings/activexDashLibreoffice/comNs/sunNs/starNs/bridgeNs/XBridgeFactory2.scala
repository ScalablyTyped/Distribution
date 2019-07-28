package typings.activexDashLibreoffice.comNs.sunNs.starNs.bridgeNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.connectionNs.XConnection
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a unified interface for the {@link BridgeFactory} service to implement.
  * @since LibreOffice 4.0
  */
trait XBridgeFactory2
  extends XBridgeFactory
     with XComponent

object XBridgeFactory2 {
  @scala.inline
  def apply(
    ExistingBridges: SafeArray[XBridge],
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    createBridge: (String, String, XConnection, XInstanceProvider) => XBridge,
    dispose: () => Unit,
    getBridge: String => XBridge,
    getExistingBridges: () => SafeArray[XBridge],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): XBridgeFactory2 = {
    val __obj = js.Dynamic.literal(ExistingBridges = ExistingBridges, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), createBridge = js.Any.fromFunction4(createBridge), dispose = js.Any.fromFunction0(dispose), getBridge = js.Any.fromFunction1(getBridge), getExistingBridges = js.Any.fromFunction0(getExistingBridges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[XBridgeFactory2]
  }
}

