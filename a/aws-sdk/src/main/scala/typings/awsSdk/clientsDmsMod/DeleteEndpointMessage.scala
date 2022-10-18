package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEndpointMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var EndpointArn: String
}
object DeleteEndpointMessage {
  
  inline def apply(EndpointArn: String): DeleteEndpointMessage = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEndpointMessage]
  }
  
  extension [Self <: DeleteEndpointMessage](x: Self) {
    
    inline def setEndpointArn(value: String): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
  }
}
