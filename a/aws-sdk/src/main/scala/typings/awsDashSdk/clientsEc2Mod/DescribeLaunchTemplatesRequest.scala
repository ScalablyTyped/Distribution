package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLaunchTemplatesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * One or more filters.    create-time - The time the launch template was created.    launch-template-name - The name of the launch template.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * One or more launch template IDs.
    */
  var LaunchTemplateIds: js.UndefOr[ValueStringList] = js.undefined
  /**
    * One or more launch template names.
    */
  var LaunchTemplateNames: js.UndefOr[LaunchTemplateNameStringList] = js.undefined
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value. This value can be between 1 and 200.
    */
  var MaxResults: js.UndefOr[DescribeLaunchTemplatesMaxResults] = js.undefined
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeLaunchTemplatesRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Filters: FilterList = null,
    LaunchTemplateIds: ValueStringList = null,
    LaunchTemplateNames: LaunchTemplateNameStringList = null,
    MaxResults: Int | scala.Double = null,
    NextToken: String = null
  ): DescribeLaunchTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (LaunchTemplateIds != null) __obj.updateDynamic("LaunchTemplateIds")(LaunchTemplateIds)
    if (LaunchTemplateNames != null) __obj.updateDynamic("LaunchTemplateNames")(LaunchTemplateNames)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeLaunchTemplatesRequest]
  }
}

