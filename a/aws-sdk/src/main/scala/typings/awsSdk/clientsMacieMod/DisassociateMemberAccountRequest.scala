package typings.awsSdk.clientsMacieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateMemberAccountRequest extends StObject {
  
  /**
    * (Discontinued) The ID of the member account that you want to remove from Amazon Macie Classic.
    */
  var memberAccountId: AWSAccountId
}
object DisassociateMemberAccountRequest {
  
  inline def apply(memberAccountId: AWSAccountId): DisassociateMemberAccountRequest = {
    val __obj = js.Dynamic.literal(memberAccountId = memberAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateMemberAccountRequest]
  }
  
  extension [Self <: DisassociateMemberAccountRequest](x: Self) {
    
    inline def setMemberAccountId(value: AWSAccountId): Self = StObject.set(x, "memberAccountId", value.asInstanceOf[js.Any])
  }
}
