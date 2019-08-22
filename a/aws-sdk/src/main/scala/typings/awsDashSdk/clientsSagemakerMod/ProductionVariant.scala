package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductionVariant extends js.Object {
  /**
    * The size of the Elastic Inference (EI) instance to use for the production variant. EI instances provide on-demand GPU computing for inference. For more information, see Using Elastic Inference in Amazon SageMaker.
    */
  var AcceleratorType: js.UndefOr[ProductionVariantAcceleratorType] = js.undefined
  /**
    * Number of instances to launch initially.
    */
  var InitialInstanceCount: TaskCount
  /**
    * Determines initial traffic distribution among all of the models that you specify in the endpoint configuration. The traffic to a production variant is determined by the ratio of the VariantWeight to the sum of all VariantWeight values across all ProductionVariants. If unspecified, it defaults to 1.0. 
    */
  var InitialVariantWeight: js.UndefOr[VariantWeight] = js.undefined
  /**
    * The ML compute instance type.
    */
  var InstanceType: ProductionVariantInstanceType
  /**
    * The name of the model that you want to host. This is the name that you specified when creating the model.
    */
  var ModelName: typings.awsDashSdk.clientsSagemakerMod.ModelName
  /**
    * The name of the production variant.
    */
  var VariantName: typings.awsDashSdk.clientsSagemakerMod.VariantName
}

object ProductionVariant {
  @scala.inline
  def apply(
    InitialInstanceCount: TaskCount,
    InstanceType: ProductionVariantInstanceType,
    ModelName: ModelName,
    VariantName: VariantName,
    AcceleratorType: ProductionVariantAcceleratorType = null,
    InitialVariantWeight: js.UndefOr[VariantWeight] = js.undefined
  ): ProductionVariant = {
    val __obj = js.Dynamic.literal(InitialInstanceCount = InitialInstanceCount, InstanceType = InstanceType.asInstanceOf[js.Any], ModelName = ModelName, VariantName = VariantName)
    if (AcceleratorType != null) __obj.updateDynamic("AcceleratorType")(AcceleratorType.asInstanceOf[js.Any])
    if (!js.isUndefined(InitialVariantWeight)) __obj.updateDynamic("InitialVariantWeight")(InitialVariantWeight)
    __obj.asInstanceOf[ProductionVariant]
  }
}

