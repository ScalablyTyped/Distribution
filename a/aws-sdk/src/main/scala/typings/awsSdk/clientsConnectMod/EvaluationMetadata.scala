package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationMetadata extends StObject {
  
  /**
    * The identifier of the agent who performed the contact.
    */
  var ContactAgentId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The identifier of the contact in this instance of Amazon Connect. 
    */
  var ContactId: typings.awsSdk.clientsConnectMod.ContactId
  
  /**
    * The Amazon Resource Name (ARN) of the user who last updated the evaluation.
    */
  var EvaluatorArn: ARN
  
  /**
    * The overall score of the contact evaluation.
    */
  var Score: js.UndefOr[EvaluationScore] = js.undefined
}
object EvaluationMetadata {
  
  inline def apply(ContactId: ContactId, EvaluatorArn: ARN): EvaluationMetadata = {
    val __obj = js.Dynamic.literal(ContactId = ContactId.asInstanceOf[js.Any], EvaluatorArn = EvaluatorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationMetadata] (val x: Self) extends AnyVal {
    
    inline def setContactAgentId(value: ResourceId): Self = StObject.set(x, "ContactAgentId", value.asInstanceOf[js.Any])
    
    inline def setContactAgentIdUndefined: Self = StObject.set(x, "ContactAgentId", js.undefined)
    
    inline def setContactId(value: ContactId): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    inline def setEvaluatorArn(value: ARN): Self = StObject.set(x, "EvaluatorArn", value.asInstanceOf[js.Any])
    
    inline def setScore(value: EvaluationScore): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
  }
}
