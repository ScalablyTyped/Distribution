package typings.awsSdk.clientsMacieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateMemberAccountRequest extends StObject {
  
  /**
    * (Discontinued) The ID of the Amazon Web Services account that you want to associate with Amazon Macie Classic as a member account.
    */
  var memberAccountId: AWSAccountId
}
object AssociateMemberAccountRequest {
  
  inline def apply(memberAccountId: AWSAccountId): AssociateMemberAccountRequest = {
    val __obj = js.Dynamic.literal(memberAccountId = memberAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateMemberAccountRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateMemberAccountRequest] (val x: Self) extends AnyVal {
    
    inline def setMemberAccountId(value: AWSAccountId): Self = StObject.set(x, "memberAccountId", value.asInstanceOf[js.Any])
  }
}
