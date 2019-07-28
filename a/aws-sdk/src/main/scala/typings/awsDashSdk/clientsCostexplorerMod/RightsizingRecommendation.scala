package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RightsizingRecommendation extends js.Object {
  /**
    * The account that this recommendation is for.
    */
  var AccountId: js.UndefOr[GenericString] = js.undefined
  /**
    *  Context regarding the current instance.
    */
  var CurrentInstance: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.CurrentInstance] = js.undefined
  /**
    *  Details for modification recommendations. 
    */
  var ModifyRecommendationDetail: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.ModifyRecommendationDetail] = js.undefined
  /**
    * Recommendation to either terminate or modify the resource.
    */
  var RightsizingType: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.RightsizingType] = js.undefined
  /**
    * Details for termination recommendations.
    */
  var TerminateRecommendationDetail: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.TerminateRecommendationDetail] = js.undefined
}

object RightsizingRecommendation {
  @scala.inline
  def apply(
    AccountId: GenericString = null,
    CurrentInstance: CurrentInstance = null,
    ModifyRecommendationDetail: ModifyRecommendationDetail = null,
    RightsizingType: RightsizingType = null,
    TerminateRecommendationDetail: TerminateRecommendationDetail = null
  ): RightsizingRecommendation = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId)
    if (CurrentInstance != null) __obj.updateDynamic("CurrentInstance")(CurrentInstance)
    if (ModifyRecommendationDetail != null) __obj.updateDynamic("ModifyRecommendationDetail")(ModifyRecommendationDetail)
    if (RightsizingType != null) __obj.updateDynamic("RightsizingType")(RightsizingType.asInstanceOf[js.Any])
    if (TerminateRecommendationDetail != null) __obj.updateDynamic("TerminateRecommendationDetail")(TerminateRecommendationDetail)
    __obj.asInstanceOf[RightsizingRecommendation]
  }
}

