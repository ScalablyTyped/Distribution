package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEndpointAccessRequest extends StObject {
  
  /**
    * The name of the VPC endpoint to return information for.
    */
  var endpointName: String
}
object GetEndpointAccessRequest {
  
  inline def apply(endpointName: String): GetEndpointAccessRequest = {
    val __obj = js.Dynamic.literal(endpointName = endpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEndpointAccessRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEndpointAccessRequest] (val x: Self) extends AnyVal {
    
    inline def setEndpointName(value: String): Self = StObject.set(x, "endpointName", value.asInstanceOf[js.Any])
  }
}
