package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAlgorithmOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the algorithm.
    */
  var AlgorithmArn: typings.awsDashSdk.clientsSagemakerMod.AlgorithmArn
  /**
    * A brief summary about the algorithm.
    */
  var AlgorithmDescription: js.UndefOr[EntityDescription] = js.undefined
  /**
    * The name of the algorithm being described.
    */
  var AlgorithmName: EntityName
  /**
    * The current status of the algorithm.
    */
  var AlgorithmStatus: typings.awsDashSdk.clientsSagemakerMod.AlgorithmStatus
  /**
    * Details about the current status of the algorithm.
    */
  var AlgorithmStatusDetails: typings.awsDashSdk.clientsSagemakerMod.AlgorithmStatusDetails
  /**
    * Whether the algorithm is certified to be listed in AWS Marketplace.
    */
  var CertifyForMarketplace: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.CertifyForMarketplace] = js.undefined
  /**
    * A timestamp specifying when the algorithm was created.
    */
  var CreationTime: typings.awsDashSdk.clientsSagemakerMod.CreationTime
  /**
    * Details about inference jobs that the algorithm runs.
    */
  var InferenceSpecification: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.InferenceSpecification] = js.undefined
  /**
    * The product identifier of the algorithm.
    */
  var ProductId: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.ProductId] = js.undefined
  /**
    * Details about training jobs run by this algorithm.
    */
  var TrainingSpecification: typings.awsDashSdk.clientsSagemakerMod.TrainingSpecification
  /**
    * Details about configurations for one or more training jobs that Amazon SageMaker runs to test the algorithm.
    */
  var ValidationSpecification: js.UndefOr[AlgorithmValidationSpecification] = js.undefined
}

object DescribeAlgorithmOutput {
  @scala.inline
  def apply(
    AlgorithmArn: AlgorithmArn,
    AlgorithmName: EntityName,
    AlgorithmStatus: AlgorithmStatus,
    AlgorithmStatusDetails: AlgorithmStatusDetails,
    CreationTime: CreationTime,
    TrainingSpecification: TrainingSpecification,
    AlgorithmDescription: EntityDescription = null,
    CertifyForMarketplace: js.UndefOr[CertifyForMarketplace] = js.undefined,
    InferenceSpecification: InferenceSpecification = null,
    ProductId: ProductId = null,
    ValidationSpecification: AlgorithmValidationSpecification = null
  ): DescribeAlgorithmOutput = {
    val __obj = js.Dynamic.literal(AlgorithmArn = AlgorithmArn, AlgorithmName = AlgorithmName, AlgorithmStatus = AlgorithmStatus.asInstanceOf[js.Any], AlgorithmStatusDetails = AlgorithmStatusDetails, CreationTime = CreationTime, TrainingSpecification = TrainingSpecification)
    if (AlgorithmDescription != null) __obj.updateDynamic("AlgorithmDescription")(AlgorithmDescription)
    if (!js.isUndefined(CertifyForMarketplace)) __obj.updateDynamic("CertifyForMarketplace")(CertifyForMarketplace)
    if (InferenceSpecification != null) __obj.updateDynamic("InferenceSpecification")(InferenceSpecification)
    if (ProductId != null) __obj.updateDynamic("ProductId")(ProductId)
    if (ValidationSpecification != null) __obj.updateDynamic("ValidationSpecification")(ValidationSpecification)
    __obj.asInstanceOf[DescribeAlgorithmOutput]
  }
}

