package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRulesInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.ListenerArn] = js.undefined
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.Marker] = js.undefined
  /**
    * The maximum number of results to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.PageSize] = js.undefined
  /**
    * The Amazon Resource Names (ARN) of the rules.
    */
  var RuleArns: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.RuleArns] = js.undefined
}

object DescribeRulesInput {
  @scala.inline
  def apply(
    ListenerArn: ListenerArn = null,
    Marker: Marker = null,
    PageSize: js.UndefOr[PageSize] = js.undefined,
    RuleArns: RuleArns = null
  ): DescribeRulesInput = {
    val __obj = js.Dynamic.literal()
    if (ListenerArn != null) __obj.updateDynamic("ListenerArn")(ListenerArn)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize)
    if (RuleArns != null) __obj.updateDynamic("RuleArns")(RuleArns)
    __obj.asInstanceOf[DescribeRulesInput]
  }
}

