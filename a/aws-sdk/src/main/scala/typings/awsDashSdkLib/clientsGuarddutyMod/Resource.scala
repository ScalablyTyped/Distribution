package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  var AccessKeyDetails: js.UndefOr[AccessKeyDetails] = js.undefined
  var InstanceDetails: js.UndefOr[InstanceDetails] = js.undefined
  /**
    * The type of the AWS resource.
    */
  var ResourceType: js.UndefOr[__string] = js.undefined
}

object Resource {
  @scala.inline
  def apply(
    AccessKeyDetails: AccessKeyDetails = null,
    InstanceDetails: InstanceDetails = null,
    ResourceType: __string = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (AccessKeyDetails != null) __obj.updateDynamic("AccessKeyDetails")(AccessKeyDetails)
    if (InstanceDetails != null) __obj.updateDynamic("InstanceDetails")(InstanceDetails)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType)
    __obj.asInstanceOf[Resource]
  }
}

