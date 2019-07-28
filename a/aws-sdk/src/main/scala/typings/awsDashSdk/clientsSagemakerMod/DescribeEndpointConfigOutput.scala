package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEndpointConfigOutput extends js.Object {
  /**
    * A timestamp that shows when the endpoint configuration was created.
    */
  var CreationTime: Timestamp
  /**
    * The Amazon Resource Name (ARN) of the endpoint configuration.
    */
  var EndpointConfigArn: typings.awsDashSdk.clientsSagemakerMod.EndpointConfigArn
  /**
    * Name of the Amazon SageMaker endpoint configuration.
    */
  var EndpointConfigName: typings.awsDashSdk.clientsSagemakerMod.EndpointConfigName
  /**
    * AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on the ML storage volume attached to the instance.
    */
  var KmsKeyId: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.KmsKeyId] = js.undefined
  /**
    * An array of ProductionVariant objects, one for each model that you want to host at this endpoint.
    */
  var ProductionVariants: ProductionVariantList
}

object DescribeEndpointConfigOutput {
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    EndpointConfigArn: EndpointConfigArn,
    EndpointConfigName: EndpointConfigName,
    ProductionVariants: ProductionVariantList,
    KmsKeyId: KmsKeyId = null
  ): DescribeEndpointConfigOutput = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime, EndpointConfigArn = EndpointConfigArn, EndpointConfigName = EndpointConfigName, ProductionVariants = ProductionVariants)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    __obj.asInstanceOf[DescribeEndpointConfigOutput]
  }
}

