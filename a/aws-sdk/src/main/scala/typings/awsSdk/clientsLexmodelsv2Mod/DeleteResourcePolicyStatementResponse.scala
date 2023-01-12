package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourcePolicyStatementResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy statement was removed from.
    */
  var resourceArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The current revision of the resource policy. Use the revision ID to make sure that you are updating the most current version of a resource policy when you add a policy statement to a resource, delete a resource, or update a resource.
    */
  var revisionId: js.UndefOr[RevisionId] = js.undefined
}
object DeleteResourcePolicyStatementResponse {
  
  inline def apply(): DeleteResourcePolicyStatementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteResourcePolicyStatementResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResourcePolicyStatementResponse] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: AmazonResourceName): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
    
    inline def setRevisionId(value: RevisionId): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
  }
}
