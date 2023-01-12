package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelingJobOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the most recent SageMaker model trained as part of automated data labeling. 
    */
  var FinalActiveLearningModelArn: js.UndefOr[ModelArn] = js.undefined
  
  /**
    * The Amazon S3 bucket location of the manifest file for labeled data. 
    */
  var OutputDatasetS3Uri: S3Uri
}
object LabelingJobOutput {
  
  inline def apply(OutputDatasetS3Uri: S3Uri): LabelingJobOutput = {
    val __obj = js.Dynamic.literal(OutputDatasetS3Uri = OutputDatasetS3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelingJobOutput] (val x: Self) extends AnyVal {
    
    inline def setFinalActiveLearningModelArn(value: ModelArn): Self = StObject.set(x, "FinalActiveLearningModelArn", value.asInstanceOf[js.Any])
    
    inline def setFinalActiveLearningModelArnUndefined: Self = StObject.set(x, "FinalActiveLearningModelArn", js.undefined)
    
    inline def setOutputDatasetS3Uri(value: S3Uri): Self = StObject.set(x, "OutputDatasetS3Uri", value.asInstanceOf[js.Any])
  }
}
