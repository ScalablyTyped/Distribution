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
    ExistingBridges: activexDashInteropLib.SafeArray[XBridge],
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    createBridge: js.Function4[
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.connectionNs.XConnection, 
      XInstanceProvider, 
      XBridge
    ],
    dispose: js.Function0[scala.Unit],
    getBridge: js.Function1[java.lang.String, XBridge],
    getExistingBridges: js.Function0[activexDashInteropLib.SafeArray[XBridge]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit]
  ): XBridgeFactory2 = {
    val __obj = js.Dynamic.literal(ExistingBridges = ExistingBridges, acquire = acquire, addEventListener = addEventListener, createBridge = createBridge, dispose = dispose, getBridge = getBridge, getExistingBridges = getExistingBridges, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[XBridgeFactory2]
  }
}

