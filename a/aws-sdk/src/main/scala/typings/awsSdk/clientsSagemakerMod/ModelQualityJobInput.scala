package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelQualityJobInput extends StObject {
  
  /**
    * Input object for the batch transform job.
    */
  var BatchTransformInput: js.UndefOr[typings.awsSdk.clientsSagemakerMod.BatchTransformInput] = js.undefined
  
  var EndpointInput: js.UndefOr[typings.awsSdk.clientsSagemakerMod.EndpointInput] = js.undefined
  
  /**
    * The ground truth label provided for the model.
    */
  var GroundTruthS3Input: MonitoringGroundTruthS3Input
}
object ModelQualityJobInput {
  
  inline def apply(GroundTruthS3Input: MonitoringGroundTruthS3Input): ModelQualityJobInput = {
    val __obj = js.Dynamic.literal(GroundTruthS3Input = GroundTruthS3Input.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelQualityJobInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelQualityJobInput] (val x: Self) extends AnyVal {
    
    inline def setBatchTransformInput(value: BatchTransformInput): Self = StObject.set(x, "BatchTransformInput", value.asInstanceOf[js.Any])
    
    inline def setBatchTransformInputUndefined: Self = StObject.set(x, "BatchTransformInput", js.undefined)
    
    inline def setEndpointInput(value: EndpointInput): Self = StObject.set(x, "EndpointInput", value.asInstanceOf[js.Any])
    
    inline def setEndpointInputUndefined: Self = StObject.set(x, "EndpointInput", js.undefined)
    
    inline def setGroundTruthS3Input(value: MonitoringGroundTruthS3Input): Self = StObject.set(x, "GroundTruthS3Input", value.asInstanceOf[js.Any])
  }
}
