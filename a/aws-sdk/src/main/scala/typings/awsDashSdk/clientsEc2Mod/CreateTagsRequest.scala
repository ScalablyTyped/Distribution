package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTagsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The IDs of the resources, separated by spaces. Constraints: Up to 1000 resource IDs. We recommend breaking up this request into smaller batches.
    */
  var Resources: ResourceIdList = js.native
  /**
    * The tags. The value parameter is required, but if you don't want the tag to have a value, specify the parameter with no value, and we set the value to an empty string.
    */
  var Tags: TagList = js.native
}

object CreateTagsRequest {
  @scala.inline
  def apply(Resources: ResourceIdList, Tags: TagList, DryRun: js.UndefOr[scala.Boolean] = js.undefined): CreateTagsRequest = {
    val __obj = js.Dynamic.literal(Resources = Resources.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTagsRequest]
  }
}

