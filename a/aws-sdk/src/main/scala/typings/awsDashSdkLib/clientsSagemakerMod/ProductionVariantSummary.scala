package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductionVariantSummary extends js.Object {
  /**
    * The number of instances associated with the variant.
    */
  var CurrentInstanceCount: js.UndefOr[TaskCount] = js.undefined
  /**
    * The weight associated with the variant.
    */
  var CurrentWeight: js.UndefOr[VariantWeight] = js.undefined
  /**
    * An array of DeployedImage objects that specify the Amazon EC2 Container Registry paths of the inference images deployed on instances of this ProductionVariant.
    */
  var DeployedImages: js.UndefOr[DeployedImages] = js.undefined
  /**
    * The number of instances requested in the UpdateEndpointWeightsAndCapacities request. 
    */
  var DesiredInstanceCount: js.UndefOr[TaskCount] = js.undefined
  /**
    * The requested weight, as specified in the UpdateEndpointWeightsAndCapacities request. 
    */
  var DesiredWeight: js.UndefOr[VariantWeight] = js.undefined
  /**
    * The name of the variant.
    */
  var VariantName: awsDashSdkLib.clientsSagemakerMod.VariantName
}

object ProductionVariantSummary {
  @scala.inline
  def apply(
    VariantName: VariantName,
    CurrentInstanceCount: js.UndefOr[TaskCount] = js.undefined,
    CurrentWeight: js.UndefOr[VariantWeight] = js.undefined,
    DeployedImages: DeployedImages = null,
    DesiredInstanceCount: js.UndefOr[TaskCount] = js.undefined,
    DesiredWeight: js.UndefOr[VariantWeight] = js.undefined
  ): ProductionVariantSummary = {
    val __obj = js.Dynamic.literal(VariantName = VariantName)
    if (!js.isUndefined(CurrentInstanceCount)) __obj.updateDynamic("CurrentInstanceCount")(CurrentInstanceCount)
    if (!js.isUndefined(CurrentWeight)) __obj.updateDynamic("CurrentWeight")(CurrentWeight)
    if (DeployedImages != null) __obj.updateDynamic("DeployedImages")(DeployedImages)
    if (!js.isUndefined(DesiredInstanceCount)) __obj.updateDynamic("DesiredInstanceCount")(DesiredInstanceCount)
    if (!js.isUndefined(DesiredWeight)) __obj.updateDynamic("DesiredWeight")(DesiredWeight)
    __obj.asInstanceOf[ProductionVariantSummary]
  }
}

