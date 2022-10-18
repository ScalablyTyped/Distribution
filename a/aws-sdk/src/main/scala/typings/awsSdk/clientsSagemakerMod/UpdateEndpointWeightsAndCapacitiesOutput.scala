package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEndpointWeightsAndCapacitiesOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the updated endpoint.
    */
  var EndpointArn: typings.awsSdk.clientsSagemakerMod.EndpointArn
}
object UpdateEndpointWeightsAndCapacitiesOutput {
  
  inline def apply(EndpointArn: EndpointArn): UpdateEndpointWeightsAndCapacitiesOutput = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointWeightsAndCapacitiesOutput]
  }
  
  extension [Self <: UpdateEndpointWeightsAndCapacitiesOutput](x: Self) {
    
    inline def setEndpointArn(value: EndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
  }
}
