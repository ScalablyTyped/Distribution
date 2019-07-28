package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelingJobAlgorithmsConfig extends js.Object {
  /**
    * At the end of an auto-label job Amazon SageMaker Ground Truth sends the Amazon Resource Nam (ARN) of the final model used for auto-labeling. You can use this model as the starting point for subsequent similar jobs by providing the ARN of the model here. 
    */
  var InitialActiveLearningModelArn: js.UndefOr[ModelArn] = js.undefined
  /**
    * Specifies the Amazon Resource Name (ARN) of the algorithm used for auto-labeling. You must select one of the following ARNs:    Image classification   arn:aws:sagemaker:region:027400017018:labeling-job-algorithm-specification/image-classification     Text classification   arn:aws:sagemaker:region:027400017018:labeling-job-algorithm-specification/text-classification     Object detection   arn:aws:sagemaker:region:027400017018:labeling-job-algorithm-specification/object-detection   
    */
  var LabelingJobAlgorithmSpecificationArn: typings.awsDashSdk.clientsSagemakerMod.LabelingJobAlgorithmSpecificationArn
  /**
    * Provides configuration information for a labeling job.
    */
  var LabelingJobResourceConfig: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.LabelingJobResourceConfig] = js.undefined
}

object LabelingJobAlgorithmsConfig {
  @scala.inline
  def apply(
    LabelingJobAlgorithmSpecificationArn: LabelingJobAlgorithmSpecificationArn,
    InitialActiveLearningModelArn: ModelArn = null,
    LabelingJobResourceConfig: LabelingJobResourceConfig = null
  ): LabelingJobAlgorithmsConfig = {
    val __obj = js.Dynamic.literal(LabelingJobAlgorithmSpecificationArn = LabelingJobAlgorithmSpecificationArn)
    if (InitialActiveLearningModelArn != null) __obj.updateDynamic("InitialActiveLearningModelArn")(InitialActiveLearningModelArn)
    if (LabelingJobResourceConfig != null) __obj.updateDynamic("LabelingJobResourceConfig")(LabelingJobResourceConfig)
    __obj.asInstanceOf[LabelingJobAlgorithmsConfig]
  }
}

