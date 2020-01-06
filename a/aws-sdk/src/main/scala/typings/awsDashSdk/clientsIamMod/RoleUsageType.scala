package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleUsageType extends js.Object {
  /**
    * The name of the Region where the service-linked role is being used.
    */
  var Region: js.UndefOr[RegionNameType] = js.native
  /**
    * The name of the resource that is using the service-linked role.
    */
  var Resources: js.UndefOr[ArnListType] = js.native
}

object RoleUsageType {
  @scala.inline
  def apply(Region: RegionNameType = null, Resources: ArnListType = null): RoleUsageType = {
    val __obj = js.Dynamic.literal()
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    if (Resources != null) __obj.updateDynamic("Resources")(Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleUsageType]
  }
}

