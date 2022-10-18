package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputDestination extends StObject {
  
  /**
    * The system-generated static IP address of endpoint.
  It remains fixed for the lifetime of the input.
    */
  var Ip: js.UndefOr[string] = js.undefined
  
  /**
    * The port number for the input.
    */
  var Port: js.UndefOr[string] = js.undefined
  
  /**
    * This represents the endpoint that the customer stream will be
  pushed to.
    */
  var Url: js.UndefOr[string] = js.undefined
  
  var Vpc: js.UndefOr[InputDestinationVpc] = js.undefined
}
object InputDestination {
  
  inline def apply(): InputDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputDestination]
  }
  
  extension [Self <: InputDestination](x: Self) {
    
    inline def setIp(value: string): Self = StObject.set(x, "Ip", value.asInstanceOf[js.Any])
    
    inline def setIpUndefined: Self = StObject.set(x, "Ip", js.undefined)
    
    inline def setPort(value: string): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setUrl(value: string): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    
    inline def setVpc(value: InputDestinationVpc): Self = StObject.set(x, "Vpc", value.asInstanceOf[js.Any])
    
    inline def setVpcUndefined: Self = StObject.set(x, "Vpc", js.undefined)
  }
}
