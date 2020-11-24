package typings.activexLibreoffice.com_.sun.star.bridge

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.connection.XConnection
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a unified interface for the {@link BridgeFactory} service to implement.
  * @since LibreOffice 4.0
  */
@js.native
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
    val __obj = js.Dynamic.literal(ExistingBridges = ExistingBridges.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), createBridge = js.Any.fromFunction4(createBridge), dispose = js.Any.fromFunction0(dispose), getBridge = js.Any.fromFunction1(getBridge), getExistingBridges = js.Any.fromFunction0(getExistingBridges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[XBridgeFactory2]
  }
}
