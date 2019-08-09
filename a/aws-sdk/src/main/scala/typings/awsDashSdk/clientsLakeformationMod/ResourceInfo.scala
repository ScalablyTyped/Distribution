package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceInfo extends js.Object {
  /**
    * The date and time the resource was last modified.
    */
  var LastModified: js.UndefOr[LastModifiedTimestamp] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: js.UndefOr[ResourceArnString] = js.undefined
  /**
    * The IAM role that registered a resource.
    */
  var RoleArn: js.UndefOr[IAMRoleArn] = js.undefined
}

object ResourceInfo {
  @scala.inline
  def apply(
    LastModified: LastModifiedTimestamp = null,
    ResourceArn: ResourceArnString = null,
    RoleArn: IAMRoleArn = null
  ): ResourceInfo = {
    val __obj = js.Dynamic.literal()
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified)
    if (ResourceArn != null) __obj.updateDynamic("ResourceArn")(ResourceArn)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    __obj.asInstanceOf[ResourceInfo]
  }
}

