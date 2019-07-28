package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  /**
    * The IAM access key details (IAM user information) of a user that engaged in the activity that prompted GuardDuty to generate a finding.
    */
  var AccessKeyDetails: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.AccessKeyDetails] = js.undefined
  /**
    * The information about the EC2 instance associated with the activity that prompted GuardDuty to generate a finding.
    */
  var InstanceDetails: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.InstanceDetails] = js.undefined
  /**
    * The type of the AWS resource.
    */
  var ResourceType: js.UndefOr[String] = js.undefined
}

object Resource {
  @scala.inline
  def apply(
    AccessKeyDetails: AccessKeyDetails = null,
    InstanceDetails: InstanceDetails = null,
    ResourceType: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (AccessKeyDetails != null) __obj.updateDynamic("AccessKeyDetails")(AccessKeyDetails)
    if (InstanceDetails != null) __obj.updateDynamic("InstanceDetails")(InstanceDetails)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType)
    __obj.asInstanceOf[Resource]
  }
}

