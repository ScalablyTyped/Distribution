package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLaunchTemplateVersionsResult extends js.Object {
  /**
    * Information about the launch template versions.
    */
  var LaunchTemplateVersions: js.UndefOr[LaunchTemplateVersionSet] = js.undefined
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeLaunchTemplateVersionsResult {
  @scala.inline
  def apply(LaunchTemplateVersions: LaunchTemplateVersionSet = null, NextToken: String = null): DescribeLaunchTemplateVersionsResult = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplateVersions != null) __obj.updateDynamic("LaunchTemplateVersions")(LaunchTemplateVersions)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeLaunchTemplateVersionsResult]
  }
}

