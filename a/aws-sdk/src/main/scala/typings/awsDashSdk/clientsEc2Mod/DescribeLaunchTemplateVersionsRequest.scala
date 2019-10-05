package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLaunchTemplateVersionsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * One or more filters.    create-time - The time the launch template version was created.    ebs-optimized - A boolean that indicates whether the instance is optimized for Amazon EBS I/O.    iam-instance-profile - The ARN of the IAM instance profile.    image-id - The ID of the AMI.    instance-type - The instance type.    is-default-version - A boolean that indicates whether the launch template version is the default version.    kernel-id - The kernel ID.    ram-disk-id - The RAM disk ID.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * The ID of the launch template. You must specify either the launch template ID or launch template name in the request.
    */
  var LaunchTemplateId: js.UndefOr[String] = js.undefined
  /**
    * The name of the launch template. You must specify either the launch template ID or launch template name in the request.
    */
  var LaunchTemplateName: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.LaunchTemplateName] = js.undefined
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value. This value can be between 1 and 200.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  /**
    * The version number up to which to describe launch template versions.
    */
  var MaxVersion: js.UndefOr[String] = js.undefined
  /**
    * The version number after which to describe launch template versions.
    */
  var MinVersion: js.UndefOr[String] = js.undefined
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * One or more versions of the launch template.
    */
  var Versions: js.UndefOr[VersionStringList] = js.undefined
}

object DescribeLaunchTemplateVersionsRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Filters: FilterList = null,
    LaunchTemplateId: String = null,
    LaunchTemplateName: LaunchTemplateName = null,
    MaxResults: Int | scala.Double = null,
    MaxVersion: String = null,
    MinVersion: String = null,
    NextToken: String = null,
    Versions: VersionStringList = null
  ): DescribeLaunchTemplateVersionsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (LaunchTemplateId != null) __obj.updateDynamic("LaunchTemplateId")(LaunchTemplateId)
    if (LaunchTemplateName != null) __obj.updateDynamic("LaunchTemplateName")(LaunchTemplateName)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (MaxVersion != null) __obj.updateDynamic("MaxVersion")(MaxVersion)
    if (MinVersion != null) __obj.updateDynamic("MinVersion")(MinVersion)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Versions != null) __obj.updateDynamic("Versions")(Versions)
    __obj.asInstanceOf[DescribeLaunchTemplateVersionsRequest]
  }
}

