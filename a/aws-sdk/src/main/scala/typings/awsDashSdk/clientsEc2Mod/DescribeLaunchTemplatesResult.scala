package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLaunchTemplatesResult extends js.Object {
  /**
    * Information about the launch templates.
    */
  var LaunchTemplates: js.UndefOr[LaunchTemplateSet] = js.undefined
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeLaunchTemplatesResult {
  @scala.inline
  def apply(LaunchTemplates: LaunchTemplateSet = null, NextToken: String = null): DescribeLaunchTemplatesResult = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplates != null) __obj.updateDynamic("LaunchTemplates")(LaunchTemplates)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeLaunchTemplatesResult]
  }
}

