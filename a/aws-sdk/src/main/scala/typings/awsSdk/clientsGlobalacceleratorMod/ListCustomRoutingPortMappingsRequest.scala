package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomRoutingPortMappingsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the accelerator to list the custom routing port mappings for.
    */
  var AcceleratorArn: GenericString
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint group to list the custom routing port mappings for.
    */
  var EndpointGroupArn: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The number of destination port mappings that you want to return with this call. The default value is 10.
    */
  var MaxResults: js.UndefOr[PortMappingsMaxResults] = js.undefined
  
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object ListCustomRoutingPortMappingsRequest {
  
  inline def apply(AcceleratorArn: GenericString): ListCustomRoutingPortMappingsRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCustomRoutingPortMappingsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCustomRoutingPortMappingsRequest] (val x: Self) extends AnyVal {
    
    inline def setAcceleratorArn(value: GenericString): Self = StObject.set(x, "AcceleratorArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointGroupArn(value: GenericString): Self = StObject.set(x, "EndpointGroupArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointGroupArnUndefined: Self = StObject.set(x, "EndpointGroupArn", js.undefined)
    
    inline def setMaxResults(value: PortMappingsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
