package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelBiasJobInput extends StObject {
  
  /**
    * Input object for the batch transform job.
    */
  var BatchTransformInput: js.UndefOr[typings.awsSdk.clientsSagemakerMod.BatchTransformInput] = js.undefined
  
  var EndpointInput: js.UndefOr[typings.awsSdk.clientsSagemakerMod.EndpointInput] = js.undefined
  
  /**
    * Location of ground truth labels to use in model bias job.
    */
  var GroundTruthS3Input: MonitoringGroundTruthS3Input
}
object ModelBiasJobInput {
  
  inline def apply(GroundTruthS3Input: MonitoringGroundTruthS3Input): ModelBiasJobInput = {
    val __obj = js.Dynamic.literal(GroundTruthS3Input = GroundTruthS3Input.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelBiasJobInput]
  }
  
  extension [Self <: ModelBiasJobInput](x: Self) {
    
    inline def setBatchTransformInput(value: BatchTransformInput): Self = StObject.set(x, "BatchTransformInput", value.asInstanceOf[js.Any])
    
    inline def setBatchTransformInputUndefined: Self = StObject.set(x, "BatchTransformInput", js.undefined)
    
    inline def setEndpointInput(value: EndpointInput): Self = StObject.set(x, "EndpointInput", value.asInstanceOf[js.Any])
    
    inline def setEndpointInputUndefined: Self = StObject.set(x, "EndpointInput", js.undefined)
    
    inline def setGroundTruthS3Input(value: MonitoringGroundTruthS3Input): Self = StObject.set(x, "GroundTruthS3Input", value.asInstanceOf[js.Any])
  }
}
