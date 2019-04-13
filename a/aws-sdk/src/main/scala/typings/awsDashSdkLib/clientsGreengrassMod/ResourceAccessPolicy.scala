package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceAccessPolicy extends js.Object {
  /**
    * The permissions that the Lambda function has to the resource. Can be one of ''rw'' (read/write) or ''ro'' (read-only).
    */
  var Permission: js.UndefOr[Permission] = js.undefined
  /**
    * The ID of the resource. (This ID is assigned to the resource when you create the resource definiton.)
    */
  var ResourceId: js.UndefOr[__string] = js.undefined
}

object ResourceAccessPolicy {
  @scala.inline
  def apply(Permission: Permission = null, ResourceId: __string = null): ResourceAccessPolicy = {
    val __obj = js.Dynamic.literal()
    if (Permission != null) __obj.updateDynamic("Permission")(Permission.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    __obj.asInstanceOf[ResourceAccessPolicy]
  }
}

