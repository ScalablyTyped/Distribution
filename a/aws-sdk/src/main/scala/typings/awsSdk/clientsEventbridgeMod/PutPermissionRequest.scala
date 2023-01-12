package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutPermissionRequest extends StObject {
  
  /**
    * The action that you are enabling the other account to perform.
    */
  var Action: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.Action] = js.undefined
  
  /**
    * This parameter enables you to limit the permission to accounts that fulfill a certain condition, such as being a member of a certain Amazon Web Services organization. For more information about Amazon Web Services Organizations, see What Is Amazon Web Services Organizations in the Amazon Web Services Organizations User Guide. If you specify Condition with an Amazon Web Services organization ID, and specify "*" as the value for Principal, you grant permission to all the accounts in the named organization. The Condition is a JSON string which must contain Type, Key, and Value fields.
    */
  var Condition: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.Condition] = js.undefined
  
  /**
    * The name of the event bus associated with the rule. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[NonPartnerEventBusName] = js.undefined
  
  /**
    * A JSON string that describes the permission policy statement. You can include a Policy parameter in the request instead of using the StatementId, Action, Principal, or Condition parameters.
    */
  var Policy: js.UndefOr[String] = js.undefined
  
  /**
    * The 12-digit Amazon Web Services account ID that you are permitting to put events to your default event bus. Specify "*" to permit any account to put events to your default event bus. If you specify "*" without specifying Condition, avoid creating rules that may match undesirable events. To create more secure rules, make sure that the event pattern for each rule contains an account field with a specific account ID from which to receive events. Rules with an account field do not match any events sent from other accounts.
    */
  var Principal: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.Principal] = js.undefined
  
  /**
    * An identifier string for the external account that you are granting permissions to. If you later want to revoke the permission for this external account, specify this StatementId when you run RemovePermission.  Each StatementId must be unique. 
    */
  var StatementId: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.StatementId] = js.undefined
}
object PutPermissionRequest {
  
  inline def apply(): PutPermissionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutPermissionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutPermissionRequest] (val x: Self) extends AnyVal {
    
    inline def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setCondition(value: Condition): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
    
    inline def setEventBusName(value: NonPartnerEventBusName): Self = StObject.set(x, "EventBusName", value.asInstanceOf[js.Any])
    
    inline def setEventBusNameUndefined: Self = StObject.set(x, "EventBusName", js.undefined)
    
    inline def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    
    inline def setPrincipal(value: Principal): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "Principal", js.undefined)
    
    inline def setStatementId(value: StatementId): Self = StObject.set(x, "StatementId", value.asInstanceOf[js.Any])
    
    inline def setStatementIdUndefined: Self = StObject.set(x, "StatementId", js.undefined)
  }
}
