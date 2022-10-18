package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEndpointOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint.
    */
  var EndpointArn: typings.awsSdk.clientsSagemakerMod.EndpointArn
}
object UpdateEndpointOutput {
  
  inline def apply(EndpointArn: EndpointArn): UpdateEndpointOutput = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointOutput]
  }
  
  extension [Self <: UpdateEndpointOutput](x: Self) {
    
    inline def setEndpointArn(value: EndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
  }
}
