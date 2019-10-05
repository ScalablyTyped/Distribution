package typings.awsDashSdk.clientsSagemakerMod

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
  var DeployedImages: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.DeployedImages] = js.undefined
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
  var VariantName: typings.awsDashSdk.clientsSagemakerMod.VariantName
}

object ProductionVariantSummary {
  @scala.inline
  def apply(
    VariantName: VariantName,
    CurrentInstanceCount: Int | Double = null,
    CurrentWeight: Int | Double = null,
    DeployedImages: DeployedImages = null,
    DesiredInstanceCount: Int | Double = null,
    DesiredWeight: Int | Double = null
  ): ProductionVariantSummary = {
    val __obj = js.Dynamic.literal(VariantName = VariantName)
    if (CurrentInstanceCount != null) __obj.updateDynamic("CurrentInstanceCount")(CurrentInstanceCount.asInstanceOf[js.Any])
    if (CurrentWeight != null) __obj.updateDynamic("CurrentWeight")(CurrentWeight.asInstanceOf[js.Any])
    if (DeployedImages != null) __obj.updateDynamic("DeployedImages")(DeployedImages)
    if (DesiredInstanceCount != null) __obj.updateDynamic("DesiredInstanceCount")(DesiredInstanceCount.asInstanceOf[js.Any])
    if (DesiredWeight != null) __obj.updateDynamic("DesiredWeight")(DesiredWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductionVariantSummary]
  }
}

