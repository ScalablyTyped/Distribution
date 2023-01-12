package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResourcePolicyResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy is attached to.
    */
  var resourceArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The current revision of the resource policy. Use the revision ID to make sure that you are updating the most current version of a resource policy when you add a policy statement to a resource, delete a resource, or update a resource.
    */
  var revisionId: js.UndefOr[RevisionId] = js.undefined
}
object UpdateResourcePolicyResponse {
  
  inline def apply(): UpdateResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateResourcePolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateResourcePolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: AmazonResourceName): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
    
    inline def setRevisionId(value: RevisionId): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
  }
}
