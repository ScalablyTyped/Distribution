package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateModelPackageInput extends js.Object {
  /**
    * Whether to certify the model package for listing on AWS Marketplace.
    */
  var CertifyForMarketplace: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.CertifyForMarketplace] = js.undefined
  /**
    * Specifies details about inference jobs that can be run with models based on this model package, including the following:   The Amazon ECR paths of containers that contain the inference code and model artifacts.   The instance types that the model package supports for transform jobs and real-time endpoints used for inference.   The input and output content formats that the model package supports for inference.  
    */
  var InferenceSpecification: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.InferenceSpecification] = js.undefined
  /**
    * A description of the model package.
    */
  var ModelPackageDescription: js.UndefOr[EntityDescription] = js.undefined
  /**
    * The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and - (hyphen).
    */
  var ModelPackageName: EntityName
  /**
    * Details about the algorithm that was used to create the model package.
    */
  var SourceAlgorithmSpecification: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.SourceAlgorithmSpecification] = js.undefined
  /**
    * Specifies configurations for one or more transform jobs that Amazon SageMaker runs to test the model package.
    */
  var ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification] = js.undefined
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
    val __obj = js.Dynamic.literal(ModelPackageName = ModelPackageName)
    if (!js.isUndefined(CertifyForMarketplace)) __obj.updateDynamic("CertifyForMarketplace")(CertifyForMarketplace)
    if (InferenceSpecification != null) __obj.updateDynamic("InferenceSpecification")(InferenceSpecification)
    if (ModelPackageDescription != null) __obj.updateDynamic("ModelPackageDescription")(ModelPackageDescription)
    if (SourceAlgorithmSpecification != null) __obj.updateDynamic("SourceAlgorithmSpecification")(SourceAlgorithmSpecification)
    if (ValidationSpecification != null) __obj.updateDynamic("ValidationSpecification")(ValidationSpecification)
    __obj.asInstanceOf[CreateModelPackageInput]
  }
}

