package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCrossAccountAccessRoleResponse extends js.Object {
  /**
    * The date when the cross-account access role was registered.
    */
  var registeredAt: Timestamp
  /**
    * The ARN that specifies the IAM role that Amazon Inspector uses to access your AWS account.
    */
  var roleArn: Arn
  /**
    * A Boolean value that specifies whether the IAM role has the necessary policies attached to enable Amazon Inspector to access your AWS account.
    */
  var valid: Bool
}

object DescribeCrossAccountAccessRoleResponse {
  @scala.inline
  def apply(registeredAt: Timestamp, roleArn: Arn, valid: Bool): DescribeCrossAccountAccessRoleResponse = {
    val __obj = js.Dynamic.literal(registeredAt = registeredAt, roleArn = roleArn, valid = valid)
  
    __obj.asInstanceOf[DescribeCrossAccountAccessRoleResponse]
  }
}

