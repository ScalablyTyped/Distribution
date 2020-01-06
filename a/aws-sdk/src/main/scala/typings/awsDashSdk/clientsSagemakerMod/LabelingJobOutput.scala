package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelingJobOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the most recent Amazon SageMaker model trained as part of automated data labeling. 
    */
  var FinalActiveLearningModelArn: js.UndefOr[ModelArn] = js.native
  /**
    * The Amazon S3 bucket location of the manifest file for labeled data. 
    */
  var OutputDatasetS3Uri: S3Uri = js.native
}

object LabelingJobOutput {
  @scala.inline
  def apply(OutputDatasetS3Uri: S3Uri, FinalActiveLearningModelArn: ModelArn = null): LabelingJobOutput = {
    val __obj = js.Dynamic.literal(OutputDatasetS3Uri = OutputDatasetS3Uri.asInstanceOf[js.Any])
    if (FinalActiveLearningModelArn != null) __obj.updateDynamic("FinalActiveLearningModelArn")(FinalActiveLearningModelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobOutput]
  }
}

