package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateModelPackageInput extends js.Object {
  /**
    * Whether to certify the model package for listing on AWS Marketplace.
    */
  var CertifyForMarketplace: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.CertifyForMarketplace] = js.native
  /**
    * Specifies details about inference jobs that can be run with models based on this model package, including the following:   The Amazon ECR paths of containers that contain the inference code and model artifacts.   The instance types that the model package supports for transform jobs and real-time endpoints used for inference.   The input and output content formats that the model package supports for inference.  
    */
  var InferenceSpecification: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.InferenceSpecification] = js.native
  /**
    * A description of the model package.
    */
  var ModelPackageDescription: js.UndefOr[EntityDescription] = js.native
  /**
    * The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and - (hyphen).
    */
  var ModelPackageName: EntityName = js.native
  /**
    * Details about the algorithm that was used to create the model package.
    */
  var SourceAlgorithmSpecification: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.SourceAlgorithmSpecification] = js.native
  /**
    * Specifies configurations for one or more transform jobs that Amazon SageMaker runs to test the model package.
    */
  var ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification] = js.native
}

object CreateModelPackageInput {
  @scala.inline
  def apply(
    ModelPackageName: EntityName,
    CertifyForMarketplace: js.UndefOr[scala.Boolean] = js.undefined,
    InferenceSpecification: InferenceSpecification = null,
    ModelPackageDescription: EntityDescription = null,
    SourceAlgorithmSpecification: SourceAlgorithmSpecification = null,
    ValidationSpecification: ModelPackageValidationSpecification = null
  ): CreateModelPackageInput = {
    val __obj = js.Dynamic.literal(ModelPackageName = ModelPackageName.asInstanceOf[js.Any])
    if (!js.isUndefined(CertifyForMarketplace)) __obj.updateDynamic("CertifyForMarketplace")(CertifyForMarketplace.asInstanceOf[js.Any])
    if (InferenceSpecification != null) __obj.updateDynamic("InferenceSpecification")(InferenceSpecification.asInstanceOf[js.Any])
    if (ModelPackageDescription != null) __obj.updateDynamic("ModelPackageDescription")(ModelPackageDescription.asInstanceOf[js.Any])
    if (SourceAlgorithmSpecification != null) __obj.updateDynamic("SourceAlgorithmSpecification")(SourceAlgorithmSpecification.asInstanceOf[js.Any])
    if (ValidationSpecification != null) __obj.updateDynamic("ValidationSpecification")(ValidationSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelPackageInput]
  }
}

