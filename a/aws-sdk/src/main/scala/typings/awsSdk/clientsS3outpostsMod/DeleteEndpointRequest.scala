package typings.awsSdk.clientsS3outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEndpointRequest extends StObject {
  
  /**
    * The ID of the endpoint.
    */
  var EndpointId: typings.awsSdk.clientsS3outpostsMod.EndpointId
  
  /**
    * The ID of the Outposts. 
    */
  var OutpostId: typings.awsSdk.clientsS3outpostsMod.OutpostId
}
object DeleteEndpointRequest {
  
  inline def apply(EndpointId: EndpointId, OutpostId: OutpostId): DeleteEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointId = EndpointId.asInstanceOf[js.Any], OutpostId = OutpostId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEndpointRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteEndpointRequest] (val x: Self) extends AnyVal {
    
    inline def setEndpointId(value: EndpointId): Self = StObject.set(x, "EndpointId", value.asInstanceOf[js.Any])
    
    inline def setOutpostId(value: OutpostId): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
  }
}
