package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResourcePolicyRequest extends StObject {
  
  /**
    * The identifier of the revision of the policy to update. If this revision ID doesn't match the current revision ID, Amazon Lex throws an exception. If you don't specify a revision, Amazon Lex overwrites the contents of the policy with the new values.
    */
  var expectedRevisionId: js.UndefOr[RevisionId] = js.undefined
  
  /**
    * A resource policy to add to the resource. The policy is a JSON structure that contains one or more statements that define the policy. The policy must follow the IAM syntax. For more information about the contents of a JSON policy document, see  IAM JSON policy reference .  If the policy isn't valid, Amazon Lex returns a validation exception.
    */
  var policy: Policy
  
  /**
    * The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy is attached to.
    */
  var resourceArn: AmazonResourceName
}
object UpdateResourcePolicyRequest {
  
  inline def apply(policy: Policy, resourceArn: AmazonResourceName): UpdateResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResourcePolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateResourcePolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setExpectedRevisionId(value: RevisionId): Self = StObject.set(x, "expectedRevisionId", value.asInstanceOf[js.Any])
    
    inline def setExpectedRevisionIdUndefined: Self = StObject.set(x, "expectedRevisionId", js.undefined)
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: AmazonResourceName): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
