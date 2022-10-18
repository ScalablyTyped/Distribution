package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrainingJobStepMetadata extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the training job that was run by this step execution.
    */
  var Arn: js.UndefOr[TrainingJobArn] = js.undefined
}
object TrainingJobStepMetadata {
  
  inline def apply(): TrainingJobStepMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingJobStepMetadata]
  }
  
  extension [Self <: TrainingJobStepMetadata](x: Self) {
    
    inline def setArn(value: TrainingJobArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
