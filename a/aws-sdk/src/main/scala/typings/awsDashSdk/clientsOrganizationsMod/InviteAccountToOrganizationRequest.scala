package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InviteAccountToOrganizationRequest extends js.Object {
  /**
    * Additional information that you want to include in the generated email to the recipient account owner.
    */
  var Notes: js.UndefOr[HandshakeNotes] = js.native
  /**
    * The identifier (ID) of the AWS account that you want to invite to join your organization. This is a JSON object that contains the following elements:   { "Type": "ACCOUNT", "Id": "&lt; account id number &gt;" }  If you use the AWS CLI, you can submit this as a single string, similar to the following example:  --target Id=123456789012,Type=ACCOUNT  If you specify "Type": "ACCOUNT", you must provide the AWS account ID number as the Id. If you specify "Type": "EMAIL", you must specify the email address that is associated with the account.  --target Id=diego@example.com,Type=EMAIL 
    */
  var Target: HandshakeParty = js.native
}

object InviteAccountToOrganizationRequest {
  @scala.inline
  def apply(Target: HandshakeParty, Notes: HandshakeNotes = null): InviteAccountToOrganizationRequest = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any])
    if (Notes != null) __obj.updateDynamic("Notes")(Notes.asInstanceOf[js.Any])
    __obj.asInstanceOf[InviteAccountToOrganizationRequest]
  }
}

