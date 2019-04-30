package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTagsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The IDs of the resources, separated by spaces. Constraints: Up to 1000 resource IDs. We recommend breaking up this request into smaller batches.
    */
  var Resources: ResourceIdList
  /**
    * The tags. The value parameter is required, but if you don't want the tag to have a value, specify the parameter with no value, and we set the value to an empty string.
    */
  var Tags: TagList
}

object CreateTagsRequest {
  @scala.inline
  def apply(Resources: ResourceIdList, Tags: TagList, DryRun: js.UndefOr[Boolean] = js.undefined): CreateTagsRequest = {
    val __obj = js.Dynamic.literal(Resources = Resources, Tags = Tags)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[CreateTagsRequest]
  }
}

