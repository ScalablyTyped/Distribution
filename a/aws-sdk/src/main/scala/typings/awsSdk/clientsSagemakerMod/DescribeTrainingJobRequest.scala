package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTrainingJobRequest extends StObject {
  
  /**
    * The name of the training job.
    */
  var TrainingJobName: typings.awsSdk.clientsSagemakerMod.TrainingJobName
}
object DescribeTrainingJobRequest {
  
  inline def apply(TrainingJobName: TrainingJobName): DescribeTrainingJobRequest = {
    val __obj = js.Dynamic.literal(TrainingJobName = TrainingJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrainingJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTrainingJobRequest] (val x: Self) extends AnyVal {
    
    inline def setTrainingJobName(value: TrainingJobName): Self = StObject.set(x, "TrainingJobName", value.asInstanceOf[js.Any])
  }
}
