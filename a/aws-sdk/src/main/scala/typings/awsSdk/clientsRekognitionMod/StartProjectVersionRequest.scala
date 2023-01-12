package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartProjectVersionRequest extends StObject {
  
  /**
    * The maximum number of inference units to use for auto-scaling the model. If you don't specify a value, Amazon Rekognition Custom Labels doesn't auto-scale the model.
    */
  var MaxInferenceUnits: js.UndefOr[InferenceUnits] = js.undefined
  
  /**
    * The minimum number of inference units to use. A single inference unit represents 1 hour of processing.  For information about the number of transactions per second (TPS) that an inference unit can support, see Running a trained Amazon Rekognition Custom Labels model in the Amazon Rekognition Custom Labels Guide.  Use a higher number to increase the TPS throughput of your model. You are charged for the number of inference units that you use. 
    */
  var MinInferenceUnits: InferenceUnits
  
  /**
    * The Amazon Resource Name(ARN) of the model version that you want to start.
    */
  var ProjectVersionArn: typings.awsSdk.clientsRekognitionMod.ProjectVersionArn
}
object StartProjectVersionRequest {
  
  inline def apply(MinInferenceUnits: InferenceUnits, ProjectVersionArn: ProjectVersionArn): StartProjectVersionRequest = {
    val __obj = js.Dynamic.literal(MinInferenceUnits = MinInferenceUnits.asInstanceOf[js.Any], ProjectVersionArn = ProjectVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartProjectVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartProjectVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxInferenceUnits(value: InferenceUnits): Self = StObject.set(x, "MaxInferenceUnits", value.asInstanceOf[js.Any])
    
    inline def setMaxInferenceUnitsUndefined: Self = StObject.set(x, "MaxInferenceUnits", js.undefined)
    
    inline def setMinInferenceUnits(value: InferenceUnits): Self = StObject.set(x, "MinInferenceUnits", value.asInstanceOf[js.Any])
    
    inline def setProjectVersionArn(value: ProjectVersionArn): Self = StObject.set(x, "ProjectVersionArn", value.asInstanceOf[js.Any])
  }
}
