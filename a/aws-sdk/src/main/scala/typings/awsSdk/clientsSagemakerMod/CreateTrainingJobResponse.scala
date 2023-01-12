package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTrainingJobResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the training job.
    */
  var TrainingJobArn: typings.awsSdk.clientsSagemakerMod.TrainingJobArn
}
object CreateTrainingJobResponse {
  
  inline def apply(TrainingJobArn: TrainingJobArn): CreateTrainingJobResponse = {
    val __obj = js.Dynamic.literal(TrainingJobArn = TrainingJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrainingJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTrainingJobResponse] (val x: Self) extends AnyVal {
    
    inline def setTrainingJobArn(value: TrainingJobArn): Self = StObject.set(x, "TrainingJobArn", value.asInstanceOf[js.Any])
  }
}
