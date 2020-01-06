package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLaunchTemplatesResult extends js.Object {
  /**
    * Information about the launch templates.
    */
  var LaunchTemplates: js.UndefOr[LaunchTemplateSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeLaunchTemplatesResult {
  @scala.inline
  def apply(LaunchTemplates: LaunchTemplateSet = null, NextToken: String = null): DescribeLaunchTemplatesResult = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplates != null) __obj.updateDynamic("LaunchTemplates")(LaunchTemplates.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLaunchTemplatesResult]
  }
}

