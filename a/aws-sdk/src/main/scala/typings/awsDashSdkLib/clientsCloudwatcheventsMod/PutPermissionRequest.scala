package typings
package awsDashSdkLib.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutPermissionRequest extends js.Object {
  /**
    * The action that you are enabling the other account to perform. Currently, this must be events:PutEvents.
    */
  var Action: awsDashSdkLib.clientsCloudwatcheventsMod.Action
  /**
    * This parameter enables you to limit the permission to accounts that fulfill a certain condition, such as being a member of a certain AWS organization. For more information about AWS Organizations, see What Is AWS Organizations in the AWS Organizations User Guide. If you specify Condition with an AWS organization ID, and specify "*" as the value for Principal, you grant permission to all the accounts in the named organization. The Condition is a JSON string which must contain Type, Key, and Value fields.
    */
  var Condition: js.UndefOr[Condition] = js.undefined
  /**
    * The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify "*" to permit any account to put events to your default event bus. If you specify "*" without specifying Condition, avoid creating rules that may match undesirable events. To create more secure rules, make sure that the event pattern for each rule contains an account field with a specific account ID from which to receive events. Rules with an account field do not match any events sent from other accounts.
    */
  var Principal: awsDashSdkLib.clientsCloudwatcheventsMod.Principal
  /**
    * An identifier string for the external account that you are granting permissions to. If you later want to revoke the permission for this external account, specify this StatementId when you run RemovePermission.
    */
  var StatementId: awsDashSdkLib.clientsCloudwatcheventsMod.StatementId
}

object PutPermissionRequest {
  @scala.inline
  def apply(Action: Action, Principal: Principal, StatementId: StatementId, Condition: Condition = null): PutPermissionRequest = {
    val __obj = js.Dynamic.literal(Action = Action, Principal = Principal, StatementId = StatementId)
    if (Condition != null) __obj.updateDynamic("Condition")(Condition)
    __obj.asInstanceOf[PutPermissionRequest]
  }
}

