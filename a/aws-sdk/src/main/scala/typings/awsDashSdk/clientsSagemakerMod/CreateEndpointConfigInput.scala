package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEndpointConfigInput extends js.Object {
  /**
    * The name of the endpoint configuration. You specify this name in a CreateEndpoint request. 
    */
  var EndpointConfigName: typings.awsDashSdk.clientsSagemakerMod.EndpointConfigName
  /**
    * The Amazon Resource Name (ARN) of a AWS Key Management Service key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint.  Nitro-based instances do not support encryption with AWS KMS. If any of the models that you specify in the ProductionVariants parameter use nitro-based instances, do not specify a value for the KmsKeyId parameter. If you specify a value for KmsKeyId when using any nitro-based instances, the call to CreateEndpointConfig fails. For a list of nitro-based instances, see Nitro-based Instances in the Amazon Elastic Compute Cloud User Guide for Linux Instances. For more information about storage volumes on nitro-based instances, see Amazon EBS and NVMe on Linux Instances. 
    */
  var KmsKeyId: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.KmsKeyId] = js.undefined
  /**
    * An list of ProductionVariant objects, one for each model that you want to host at this endpoint.
    */
  var ProductionVariants: ProductionVariantList
  /**
    * A list of key-value pairs. For more information, see Using Cost Allocation Tags in the  AWS Billing and Cost Management User Guide. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateEndpointConfigInput {
  @scala.inline
  def apply(
    EndpointConfigName: EndpointConfigName,
    ProductionVariants: ProductionVariantList,
    KmsKeyId: KmsKeyId = null,
    Tags: TagList = null
  ): CreateEndpointConfigInput = {
    val __obj = js.Dynamic.literal(EndpointConfigName = EndpointConfigName, ProductionVariants = ProductionVariants)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateEndpointConfigInput]
  }
}

