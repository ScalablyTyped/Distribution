package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsAccount extends StObject {
  
  /**
    * The unique identifier for the Amazon Web Services account.
    */
  var accountId: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for the entity that performed the action.
    */
  var principalId: js.UndefOr[string] = js.undefined
}
object AwsAccount {
  
  inline def apply(): AwsAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsAccount] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: string): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setPrincipalId(value: string): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalIdUndefined: Self = StObject.set(x, "principalId", js.undefined)
  }
}
