package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeModelPackageOutput extends js.Object {
  /**
    * Whether the model package is certified for listing on AWS Marketplace.
    */
  var CertifyForMarketplace: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.CertifyForMarketplace] = js.undefined
  /**
    * A timestamp specifying when the model package was created.
    */
  var CreationTime: typings.awsDashSdk.clientsSagemakerMod.CreationTime
  /**
    * Details about inference jobs that can be run with models based on this model package.
    */
  var InferenceSpecification: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.InferenceSpecification] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the model package.
    */
  var ModelPackageArn: typings.awsDashSdk.clientsSagemakerMod.ModelPackageArn
  /**
    * A brief summary of the model package.
    */
  var ModelPackageDescription: js.UndefOr[EntityDescription] = js.undefined
  /**
    * The name of the model package being described.
    */
  var ModelPackageName: EntityName
  /**
    * The current status of the model package.
    */
  var ModelPackageStatus: typings.awsDashSdk.clientsSagemakerMod.ModelPackageStatus
  /**
    * Details about the current status of the model package.
    */
  var ModelPackageStatusDetails: typings.awsDashSdk.clientsSagemakerMod.ModelPackageStatusDetails
  /**
    * Details about the algorithm that was used to create the model package.
    */
  var SourceAlgorithmSpecification: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.SourceAlgorithmSpecification] = js.undefined
  /**
    * Configurations for one or more transform jobs that Amazon SageMaker runs to test the model package.
    */
  var ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification] = js.undefined
}

object DescribeModelPackageOutput {
  @scala.inline
  def apply(
    CreationTime: CreationTime,
    ModelPackageArn: ModelPackageArn,
    ModelPackageName: EntityName,
    ModelPackageStatus: ModelPackageStatus,
    ModelPackageStatusDetails: ModelPackageStatusDetails,
    CertifyForMarketplace: js.UndefOr[scala.Boolean] = js.undefined,
    InferenceSpecification: InferenceSpecification = null,
    ModelPackageDescription: EntityDescription = null,
    SourceAlgorithmSpecification: SourceAlgorithmSpecification = null,
    ValidationSpecification: ModelPackageValidationSpecification = null
  ): DescribeModelPackageOutput = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime, ModelPackageArn = ModelPackageArn, ModelPackageName = ModelPackageName, ModelPackageStatus = ModelPackageStatus.asInstanceOf[js.Any], ModelPackageStatusDetails = ModelPackageStatusDetails)
    if (!js.isUndefined(CertifyForMarketplace)) __obj.updateDynamic("CertifyForMarketplace")(CertifyForMarketplace)
    if (InferenceSpecification != null) __obj.updateDynamic("InferenceSpecification")(InferenceSpecification)
    if (ModelPackageDescription != null) __obj.updateDynamic("ModelPackageDescription")(ModelPackageDescription)
    if (SourceAlgorithmSpecification != null) __obj.updateDynamic("SourceAlgorithmSpecification")(SourceAlgorithmSpecification)
    if (ValidationSpecification != null) __obj.updateDynamic("ValidationSpecification")(ValidationSpecification)
    __obj.asInstanceOf[DescribeModelPackageOutput]
  }
}

