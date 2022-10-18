package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEndpointInput extends StObject {
  
  /**
    * EndpointArn of endpoint to delete.
    */
  var EndpointArn: String
}
object DeleteEndpointInput {
  
  inline def apply(EndpointArn: String): DeleteEndpointInput = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEndpointInput]
  }
  
  extension [Self <: DeleteEndpointInput](x: Self) {
    
    inline def setEndpointArn(value: String): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
  }
}
