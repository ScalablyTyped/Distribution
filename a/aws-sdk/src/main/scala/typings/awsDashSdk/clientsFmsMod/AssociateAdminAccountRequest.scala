package typings.awsDashSdk.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateAdminAccountRequest extends js.Object {
  /**
    * The AWS account ID to associate with AWS Firewall Manager as the AWS Firewall Manager administrator account. This can be an AWS Organizations master account or a member account. For more information about AWS Organizations and master accounts, see Managing the AWS Accounts in Your Organization.
    */
  var AdminAccount: AWSAccountId
}

object AssociateAdminAccountRequest {
  @scala.inline
  def apply(AdminAccount: AWSAccountId): AssociateAdminAccountRequest = {
    val __obj = js.Dynamic.literal(AdminAccount = AdminAccount)
  
    __obj.asInstanceOf[AssociateAdminAccountRequest]
  }
}

