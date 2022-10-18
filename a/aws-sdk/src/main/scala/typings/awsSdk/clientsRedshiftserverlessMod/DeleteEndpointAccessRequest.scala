package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEndpointAccessRequest extends StObject {
  
  /**
    * The name of the VPC endpoint to delete.
    */
  var endpointName: String
}
object DeleteEndpointAccessRequest {
  
  inline def apply(endpointName: String): DeleteEndpointAccessRequest = {
    val __obj = js.Dynamic.literal(endpointName = endpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEndpointAccessRequest]
  }
  
  extension [Self <: DeleteEndpointAccessRequest](x: Self) {
    
    inline def setEndpointName(value: String): Self = StObject.set(x, "endpointName", value.asInstanceOf[js.Any])
  }
}
