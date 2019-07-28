package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceAccessPolicy extends js.Object {
  /**
    * The permissions that the Lambda function has to the resource. Can be one of ''rw'' (read/write) or ''ro'' (read-only).
    */
  var Permission: js.UndefOr[typings.awsDashSdk.clientsGreengrassMod.Permission] = js.undefined
  /**
    * The ID of the resource. (This ID is assigned to the resource when you create the resource definiton.)
    */
  var ResourceId: __string
}

object ResourceAccessPolicy {
  @scala.inline
  def apply(ResourceId: __string, Permission: Permission = null): ResourceAccessPolicy = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId)
    if (Permission != null) __obj.updateDynamic("Permission")(Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceAccessPolicy]
  }
}

