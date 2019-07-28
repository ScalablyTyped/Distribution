package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSSLPoliciesInput extends js.Object {
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.Marker] = js.undefined
  /**
    * The names of the policies.
    */
  var Names: js.UndefOr[SslPolicyNames] = js.undefined
  /**
    * The maximum number of results to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.PageSize] = js.undefined
}

object DescribeSSLPoliciesInput {
  @scala.inline
  def apply(Marker: Marker = null, Names: SslPolicyNames = null, PageSize: js.UndefOr[PageSize] = js.undefined): DescribeSSLPoliciesInput = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (Names != null) __obj.updateDynamic("Names")(Names)
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize)
    __obj.asInstanceOf[DescribeSSLPoliciesInput]
  }
}

