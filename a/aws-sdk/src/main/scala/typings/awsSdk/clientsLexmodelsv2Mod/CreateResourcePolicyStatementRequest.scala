package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResourcePolicyStatementRequest extends StObject {
  
  /**
    * The Amazon Lex action that this policy either allows or denies. The action must apply to the resource type of the specified ARN. For more information, see  Actions, resources, and condition keys for Amazon Lex V2.
    */
  var action: OperationList
  
  /**
    * Specifies a condition when the policy is in effect. If the principal of the policy is a service principal, you must provide two condition blocks, one with a SourceAccount global condition key and one with a SourceArn global condition key. For more information, see IAM JSON policy elements: Condition .
    */
  var condition: js.UndefOr[ConditionMap] = js.undefined
  
  /**
    * Determines whether the statement allows or denies access to the resource.
    */
  var effect: Effect
  
  /**
    * The identifier of the revision of the policy to edit. If this revision ID doesn't match the current revision ID, Amazon Lex throws an exception. If you don't specify a revision, Amazon Lex overwrites the contents of the policy with the new values.
    */
  var expectedRevisionId: js.UndefOr[RevisionId] = js.undefined
  
  /**
    * An IAM principal, such as an IAM users, IAM roles, or AWS services that is allowed or denied access to a resource. For more information, see AWS JSON policy elements: Principal.
    */
  var principal: PrincipalList
  
  /**
    * The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy is attached to.
    */
  var resourceArn: AmazonResourceName
  
  /**
    * The name of the statement. The ID is the same as the Sid IAM property. The statement name must be unique within the policy. For more information, see IAM JSON policy elements: Sid. 
    */
  var statementId: Name
}
object CreateResourcePolicyStatementRequest {
  
  inline def apply(
    action: OperationList,
    effect: Effect,
    principal: PrincipalList,
    resourceArn: AmazonResourceName,
    statementId: Name
  ): CreateResourcePolicyStatementRequest = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], principal = principal.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], statementId = statementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourcePolicyStatementRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateResourcePolicyStatementRequest] (val x: Self) extends AnyVal {
    
    inline def setAction(value: OperationList): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionVarargs(value: Operation*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setCondition(value: ConditionMap): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setEffect(value: Effect): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setExpectedRevisionId(value: RevisionId): Self = StObject.set(x, "expectedRevisionId", value.asInstanceOf[js.Any])
    
    inline def setExpectedRevisionIdUndefined: Self = StObject.set(x, "expectedRevisionId", js.undefined)
    
    inline def setPrincipal(value: PrincipalList): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalVarargs(value: Principal*): Self = StObject.set(x, "principal", js.Array(value*))
    
    inline def setResourceArn(value: AmazonResourceName): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setStatementId(value: Name): Self = StObject.set(x, "statementId", value.asInstanceOf[js.Any])
  }
}
