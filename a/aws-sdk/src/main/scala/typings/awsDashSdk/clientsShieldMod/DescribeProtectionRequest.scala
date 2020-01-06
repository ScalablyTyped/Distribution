package typings.awsDashSdk.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProtectionRequest extends js.Object {
  /**
    * The unique identifier (ID) for the Protection object that is described. When submitting the DescribeProtection request you must provide either the ResourceArn or the ProtectionID, but not both.
    */
  var ProtectionId: js.UndefOr[typings.awsDashSdk.clientsShieldMod.ProtectionId] = js.native
  /**
    * The ARN (Amazon Resource Name) of the AWS resource for the Protection object that is described. When submitting the DescribeProtection request you must provide either the ResourceArn or the ProtectionID, but not both.
    */
  var ResourceArn: js.UndefOr[typings.awsDashSdk.clientsShieldMod.ResourceArn] = js.native
}

object DescribeProtectionRequest {
  @scala.inline
  def apply(ProtectionId: ProtectionId = null, ResourceArn: ResourceArn = null): DescribeProtectionRequest = {
    val __obj = js.Dynamic.literal()
    if (ProtectionId != null) __obj.updateDynamic("ProtectionId")(ProtectionId.asInstanceOf[js.Any])
    if (ResourceArn != null) __obj.updateDynamic("ResourceArn")(ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProtectionRequest]
  }
}

