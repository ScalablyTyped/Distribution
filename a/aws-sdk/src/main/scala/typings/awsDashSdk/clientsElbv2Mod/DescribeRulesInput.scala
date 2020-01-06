package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRulesInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.ListenerArn] = js.native
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.Marker] = js.native
  /**
    * The maximum number of results to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.PageSize] = js.native
  /**
    * The Amazon Resource Names (ARN) of the rules.
    */
  var RuleArns: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.RuleArns] = js.native
}

object DescribeRulesInput {
  @scala.inline
  def apply(
    ListenerArn: ListenerArn = null,
    Marker: Marker = null,
    PageSize: Int | Double = null,
    RuleArns: RuleArns = null
  ): DescribeRulesInput = {
    val __obj = js.Dynamic.literal()
    if (ListenerArn != null) __obj.updateDynamic("ListenerArn")(ListenerArn.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize.asInstanceOf[js.Any])
    if (RuleArns != null) __obj.updateDynamic("RuleArns")(RuleArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRulesInput]
  }
}

