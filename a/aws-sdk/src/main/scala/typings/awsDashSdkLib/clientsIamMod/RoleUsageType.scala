package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleUsageType extends js.Object {
  /**
    * The name of the region where the service-linked role is being used.
    */
  var Region: js.UndefOr[RegionNameType] = js.undefined
  /**
    * The name of the resource that is using the service-linked role.
    */
  var Resources: js.UndefOr[ArnListType] = js.undefined
}

object RoleUsageType {
  @scala.inline
  def apply(Region: RegionNameType = null, Resources: ArnListType = null): RoleUsageType = {
    val __obj = js.Dynamic.literal()
    if (Region != null) __obj.updateDynamic("Region")(Region)
    if (Resources != null) __obj.updateDynamic("Resources")(Resources)
    __obj.asInstanceOf[RoleUsageType]
  }
}

