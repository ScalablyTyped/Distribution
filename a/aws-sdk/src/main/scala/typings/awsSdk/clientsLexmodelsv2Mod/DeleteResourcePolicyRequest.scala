package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourcePolicyRequest extends StObject {
  
  /**
    * The identifier of the revision to edit. If this ID doesn't match the current revision number, Amazon Lex returns an exception If you don't specify a revision ID, Amazon Lex will delete the current policy.
    */
  var expectedRevisionId: js.UndefOr[RevisionId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the bot or bot alias that has the resource policy attached.
    */
  var resourceArn: AmazonResourceName
}
object DeleteResourcePolicyRequest {
  
  inline def apply(resourceArn: AmazonResourceName): DeleteResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourcePolicyRequest]
  }
  
  extension [Self <: DeleteResourcePolicyRequest](x: Self) {
    
    inline def setExpectedRevisionId(value: RevisionId): Self = StObject.set(x, "expectedRevisionId", value.asInstanceOf[js.Any])
    
    inline def setExpectedRevisionIdUndefined: Self = StObject.set(x, "expectedRevisionId", js.undefined)
    
    inline def setResourceArn(value: AmazonResourceName): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
