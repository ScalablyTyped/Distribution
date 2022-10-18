package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTrainingJobResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the training job.
    */
  var TrainingJobArn: typings.awsSdk.clientsSagemakerMod.TrainingJobArn
}
object UpdateTrainingJobResponse {
  
  inline def apply(TrainingJobArn: TrainingJobArn): UpdateTrainingJobResponse = {
    val __obj = js.Dynamic.literal(TrainingJobArn = TrainingJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrainingJobResponse]
  }
  
  extension [Self <: UpdateTrainingJobResponse](x: Self) {
    
    inline def setTrainingJobArn(value: TrainingJobArn): Self = StObject.set(x, "TrainingJobArn", value.asInstanceOf[js.Any])
  }
}
