package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DesiredWeightAndCapacity extends js.Object {
  /**
    * The variant's capacity.
    */
  var DesiredInstanceCount: js.UndefOr[TaskCount] = js.undefined
  /**
    * The variant's weight.
    */
  var DesiredWeight: js.UndefOr[VariantWeight] = js.undefined
  /**
    * The name of the variant to update.
    */
  var VariantName: typings.awsDashSdk.clientsSagemakerMod.VariantName
}

object DesiredWeightAndCapacity {
  @scala.inline
  def apply(
    VariantName: VariantName,
    DesiredInstanceCount: js.UndefOr[TaskCount] = js.undefined,
    DesiredWeight: js.UndefOr[VariantWeight] = js.undefined
  ): DesiredWeightAndCapacity = {
    val __obj = js.Dynamic.literal(VariantName = VariantName)
    if (!js.isUndefined(DesiredInstanceCount)) __obj.updateDynamic("DesiredInstanceCount")(DesiredInstanceCount)
    if (!js.isUndefined(DesiredWeight)) __obj.updateDynamic("DesiredWeight")(DesiredWeight)
    __obj.asInstanceOf[DesiredWeightAndCapacity]
  }
}

