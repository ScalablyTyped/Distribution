package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomRoutingPortMappingsResponse extends StObject {
  
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The port mappings for a custom routing accelerator.
    */
  var PortMappings: js.UndefOr[typings.awsSdk.clientsGlobalacceleratorMod.PortMappings] = js.undefined
}
object ListCustomRoutingPortMappingsResponse {
  
  inline def apply(): ListCustomRoutingPortMappingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomRoutingPortMappingsResponse]
  }
  
  extension [Self <: ListCustomRoutingPortMappingsResponse](x: Self) {
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPortMappings(value: PortMappings): Self = StObject.set(x, "PortMappings", value.asInstanceOf[js.Any])
    
    inline def setPortMappingsUndefined: Self = StObject.set(x, "PortMappings", js.undefined)
    
    inline def setPortMappingsVarargs(value: PortMapping*): Self = StObject.set(x, "PortMappings", js.Array(value*))
  }
}
