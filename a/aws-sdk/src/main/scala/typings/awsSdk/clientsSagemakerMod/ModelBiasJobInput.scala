package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelBiasJobInput extends StObject {
  
  var EndpointInput: typings.awsSdk.clientsSagemakerMod.EndpointInput
  
  /**
    * Location of ground truth labels to use in model bias job.
    */
  var GroundTruthS3Input: MonitoringGroundTruthS3Input
}
object ModelBiasJobInput {
  
  inline def apply(EndpointInput: EndpointInput, GroundTruthS3Input: MonitoringGroundTruthS3Input): ModelBiasJobInput = {
    val __obj = js.Dynamic.literal(EndpointInput = EndpointInput.asInstanceOf[js.Any], GroundTruthS3Input = GroundTruthS3Input.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelBiasJobInput]
  }
  
  extension [Self <: ModelBiasJobInput](x: Self) {
    
    inline def setEndpointInput(value: EndpointInput): Self = StObject.set(x, "EndpointInput", value.asInstanceOf[js.Any])
    
    inline def setGroundTruthS3Input(value: MonitoringGroundTruthS3Input): Self = StObject.set(x, "GroundTruthS3Input", value.asInstanceOf[js.Any])
  }
}
