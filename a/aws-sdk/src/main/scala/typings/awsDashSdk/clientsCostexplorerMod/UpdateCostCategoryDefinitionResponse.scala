package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCostCategoryDefinitionResponse extends js.Object {
  /**
    *  The unique identifier for your Cost Category. 
    */
  var CostCategoryArn: js.UndefOr[Arn] = js.native
  /**
    *  The Cost Category's effective start date. 
    */
  var EffectiveStart: js.UndefOr[ZonedDateTime] = js.native
}

object UpdateCostCategoryDefinitionResponse {
  @scala.inline
  def apply(CostCategoryArn: Arn = null, EffectiveStart: ZonedDateTime = null): UpdateCostCategoryDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    if (CostCategoryArn != null) __obj.updateDynamic("CostCategoryArn")(CostCategoryArn.asInstanceOf[js.Any])
    if (EffectiveStart != null) __obj.updateDynamic("EffectiveStart")(EffectiveStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCostCategoryDefinitionResponse]
  }
}

