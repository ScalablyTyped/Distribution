package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyRecommendationDetail extends js.Object {
  /**
    *  Identifies whether this instance type is the Amazon Web Services default recommendation.
    */
  var TargetInstances: js.UndefOr[TargetInstancesList] = js.undefined
}

object ModifyRecommendationDetail {
  @scala.inline
  def apply(TargetInstances: TargetInstancesList = null): ModifyRecommendationDetail = {
    val __obj = js.Dynamic.literal()
    if (TargetInstances != null) __obj.updateDynamic("TargetInstances")(TargetInstances)
    __obj.asInstanceOf[ModifyRecommendationDetail]
  }
}

