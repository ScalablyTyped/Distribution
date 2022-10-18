package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateManagedEndpointResponse extends StObject {
  
  /**
    * The output contains the ARN of the managed endpoint.
    */
  var arn: js.UndefOr[EndpointArn] = js.undefined
  
  /**
    * The output contains the ID of the managed endpoint.
    */
  var id: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    * The output contains the name of the managed endpoint.
    */
  var name: js.UndefOr[ResourceNameString] = js.undefined
  
  /**
    * The output contains the ID of the virtual cluster.
    */
  var virtualClusterId: js.UndefOr[ResourceIdString] = js.undefined
}
object CreateManagedEndpointResponse {
  
  inline def apply(): CreateManagedEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateManagedEndpointResponse]
  }
  
  extension [Self <: CreateManagedEndpointResponse](x: Self) {
    
    inline def setArn(value: EndpointArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setId(value: ResourceIdString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: ResourceNameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVirtualClusterId(value: ResourceIdString): Self = StObject.set(x, "virtualClusterId", value.asInstanceOf[js.Any])
    
    inline def setVirtualClusterIdUndefined: Self = StObject.set(x, "virtualClusterId", js.undefined)
  }
}
