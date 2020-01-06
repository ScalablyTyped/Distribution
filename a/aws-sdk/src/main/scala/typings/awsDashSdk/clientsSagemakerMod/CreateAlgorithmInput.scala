package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAlgorithmInput extends js.Object {
  /**
    * A description of the algorithm.
    */
  var AlgorithmDescription: js.UndefOr[EntityDescription] = js.native
  /**
    * The name of the algorithm.
    */
  var AlgorithmName: EntityName = js.native
  /**
    * Whether to certify the algorithm so that it can be listed in AWS Marketplace.
    */
  var CertifyForMarketplace: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.CertifyForMarketplace] = js.native
  /**
    * Specifies details about inference jobs that the algorithm runs, including the following:   The Amazon ECR paths of containers that contain the inference code and model artifacts.   The instance types that the algorithm supports for transform jobs and real-time endpoints used for inference.   The input and output content formats that the algorithm supports for inference.  
    */
  var InferenceSpecification: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.InferenceSpecification] = js.native
  /**
    * Specifies details about training jobs run by this algorithm, including the following:   The Amazon ECR path of the container and the version digest of the algorithm.   The hyperparameters that the algorithm supports.   The instance types that the algorithm supports for training.   Whether the algorithm supports distributed training.   The metrics that the algorithm emits to Amazon CloudWatch.   Which metrics that the algorithm emits can be used as the objective metric for hyperparameter tuning jobs.   The input channels that the algorithm supports for training data. For example, an algorithm might support train, validation, and test channels.  
    */
  var TrainingSpecification: typings.awsDashSdk.clientsSagemakerMod.TrainingSpecification = js.native
  /**
    * Specifies configurations for one or more training jobs and that Amazon SageMaker runs to test the algorithm's training code and, optionally, one or more batch transform jobs that Amazon SageMaker runs to test the algorithm's inference code.
    */
  var ValidationSpecification: js.UndefOr[AlgorithmValidationSpecification] = js.native
}

object CreateAlgorithmInput {
  @scala.inline
  def apply(
    AlgorithmName: EntityName,
    TrainingSpecification: TrainingSpecification,
    AlgorithmDescription: EntityDescription = null,
    CertifyForMarketplace: js.UndefOr[scala.Boolean] = js.undefined,
    InferenceSpecification: InferenceSpecification = null,
    ValidationSpecification: AlgorithmValidationSpecification = null
  ): CreateAlgorithmInput = {
    val __obj = js.Dynamic.literal(AlgorithmName = AlgorithmName.asInstanceOf[js.Any], TrainingSpecification = TrainingSpecification.asInstanceOf[js.Any])
    if (AlgorithmDescription != null) __obj.updateDynamic("AlgorithmDescription")(AlgorithmDescription.asInstanceOf[js.Any])
    if (!js.isUndefined(CertifyForMarketplace)) __obj.updateDynamic("CertifyForMarketplace")(CertifyForMarketplace.asInstanceOf[js.Any])
    if (InferenceSpecification != null) __obj.updateDynamic("InferenceSpecification")(InferenceSpecification.asInstanceOf[js.Any])
    if (ValidationSpecification != null) __obj.updateDynamic("ValidationSpecification")(ValidationSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAlgorithmInput]
  }
}

