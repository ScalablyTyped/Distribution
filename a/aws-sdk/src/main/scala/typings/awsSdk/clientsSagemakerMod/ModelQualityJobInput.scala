package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelQualityJobInput extends StObject {
  
  var EndpointInput: typings.awsSdk.clientsSagemakerMod.EndpointInput
  
  /**
    * The ground truth label provided for the model.
    */
  var GroundTruthS3Input: MonitoringGroundTruthS3Input
}
object ModelQualityJobInput {
  
  inline def apply(EndpointInput: EndpointInput, GroundTruthS3Input: MonitoringGroundTruthS3Input): ModelQualityJobInput = {
    val __obj = js.Dynamic.literal(EndpointInput = EndpointInput.asInstanceOf[js.Any], GroundTruthS3Input = GroundTruthS3Input.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelQualityJobInput]
  }
  
  extension [Self <: ModelQualityJobInput](x: Self) {
    
    inline def setEndpointInput(value: EndpointInput): Self = StObject.set(x, "EndpointInput", value.asInstanceOf[js.Any])
    
    inline def setGroundTruthS3Input(value: MonitoringGroundTruthS3Input): Self = StObject.set(x, "GroundTruthS3Input", value.asInstanceOf[js.Any])
  }
}
