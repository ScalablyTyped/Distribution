package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopTrainingJobRequest extends StObject {
  
  /**
    * The name of the training job to stop.
    */
  var TrainingJobName: typings.awsSdk.clientsSagemakerMod.TrainingJobName
}
object StopTrainingJobRequest {
  
  inline def apply(TrainingJobName: TrainingJobName): StopTrainingJobRequest = {
    val __obj = js.Dynamic.literal(TrainingJobName = TrainingJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopTrainingJobRequest]
  }
  
  extension [Self <: StopTrainingJobRequest](x: Self) {
    
    inline def setTrainingJobName(value: TrainingJobName): Self = StObject.set(x, "TrainingJobName", value.asInstanceOf[js.Any])
  }
}
