package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrokerInstance extends StObject {
  
  /**
    * The brokers web console URL.
    */
  var ConsoleURL: js.UndefOr[string] = js.undefined
  
  /**
    * The broker's wire-level protocol endpoints.
    */
  var Endpoints: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The IP address of the Elastic Network Interface (ENI) attached to the broker. Does not apply to RabbitMQ brokers.
    */
  var IpAddress: js.UndefOr[string] = js.undefined
}
object BrokerInstance {
  
  inline def apply(): BrokerInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrokerInstance] (val x: Self) extends AnyVal {
    
    inline def setConsoleURL(value: string): Self = StObject.set(x, "ConsoleURL", value.asInstanceOf[js.Any])
    
    inline def setConsoleURLUndefined: Self = StObject.set(x, "ConsoleURL", js.undefined)
    
    inline def setEndpoints(value: listOfString): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
    inline def setEndpointsVarargs(value: string*): Self = StObject.set(x, "Endpoints", js.Array(value*))
    
    inline def setIpAddress(value: string): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
  }
}
