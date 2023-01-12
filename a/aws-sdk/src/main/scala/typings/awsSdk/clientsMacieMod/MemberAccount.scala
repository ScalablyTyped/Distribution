package typings.awsSdk.clientsMacieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberAccount extends StObject {
  
  /**
    * (Discontinued) The Amazon Web Services account ID of the Amazon Macie Classic member account.
    */
  var accountId: js.UndefOr[AWSAccountId] = js.undefined
}
object MemberAccount {
  
  inline def apply(): MemberAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemberAccount] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AWSAccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
  }
}
