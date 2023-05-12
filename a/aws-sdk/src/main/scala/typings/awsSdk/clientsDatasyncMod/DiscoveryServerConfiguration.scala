package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscoveryServerConfiguration extends StObject {
  
  /**
    * The domain name or IP address of your storage system's management interface.
    */
  var ServerHostname: DiscoveryServerHostname
  
  /**
    * The network port for accessing the storage system's management interface.
    */
  var ServerPort: js.UndefOr[DiscoveryServerPort] = js.undefined
}
object DiscoveryServerConfiguration {
  
  inline def apply(ServerHostname: DiscoveryServerHostname): DiscoveryServerConfiguration = {
    val __obj = js.Dynamic.literal(ServerHostname = ServerHostname.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoveryServerConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiscoveryServerConfiguration] (val x: Self) extends AnyVal {
    
    inline def setServerHostname(value: DiscoveryServerHostname): Self = StObject.set(x, "ServerHostname", value.asInstanceOf[js.Any])
    
    inline def setServerPort(value: DiscoveryServerPort): Self = StObject.set(x, "ServerPort", value.asInstanceOf[js.Any])
    
    inline def setServerPortUndefined: Self = StObject.set(x, "ServerPort", js.undefined)
  }
}
