package typings
package awsDashSdkLib.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutPermissionRequest extends js.Object {
  /**
    * The action that you're enabling the other account to perform. Currently, this must be events:PutEvents.
    */
  var Action: awsDashSdkLib.clientsEventbridgeMod.Action
  /**
    * This parameter enables you to limit the permission to accounts that fulfill a certain condition, such as being a member of a certain AWS organization. For more information about AWS Organizations, see What Is AWS Organizations? in the AWS Organizations User Guide. If you specify Condition with an AWS organization ID and specify "*" as the value for Principal, you grant permission to all the accounts in the named organization. The Condition is a JSON string that must contain Type, Key, and Value fields.
    */
  var Condition: js.UndefOr[Condition] = js.undefined
  /**
    * The event bus associated with the rule. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[NonPartnerEventBusName] = js.undefined
  /**
    * The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify "*" to permit any account to put events to your default event bus. If you specify "*" without specifying Condition, avoid creating rules that might match undesirable events. To create more secure rules, make sure that the event pattern for each rule contains an account field with a specific account ID to receive events from. Rules with an account field don't match any events sent from other accounts.
    */
  var Principal: awsDashSdkLib.clientsEventbridgeMod.Principal
  /**
    * An identifier string for the external account that you're granting permissions to. If you later want to revoke the permission for this external account, specify this StatementId when you run RemovePermission.
    */
  var StatementId: awsDashSdkLib.clientsEventbridgeMod.StatementId
}

object PutPermissionRequest {
  @scala.inline
  def apply(
    Action: Action,
    Principal: Principal,
    StatementId: StatementId,
    Condition: Condition = null,
    EventBusName: NonPartnerEventBusName = null
  ): PutPermissionRequest = {
    val __obj = js.Dynamic.literal(Action = Action, Principal = Principal, StatementId = StatementId)
    if (Condition != null) __obj.updateDynamic("Condition")(Condition)
    if (EventBusName != null) __obj.updateDynamic("EventBusName")(EventBusName)
    __obj.asInstanceOf[PutPermissionRequest]
  }
}

