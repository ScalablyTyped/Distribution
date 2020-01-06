package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCostCategoryDefinitionRequest extends js.Object {
  /**
    *  The unique identifier for your Cost Category. 
    */
  var CostCategoryArn: Arn = js.native
  /**
    *  The date when the Cost Category was effective. 
    */
  var EffectiveOn: js.UndefOr[ZonedDateTime] = js.native
}

object DescribeCostCategoryDefinitionRequest {
  @scala.inline
  def apply(CostCategoryArn: Arn, EffectiveOn: ZonedDateTime = null): DescribeCostCategoryDefinitionRequest = {
    val __obj = js.Dynamic.literal(CostCategoryArn = CostCategoryArn.asInstanceOf[js.Any])
    if (EffectiveOn != null) __obj.updateDynamic("EffectiveOn")(EffectiveOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCostCategoryDefinitionRequest]
  }
}

