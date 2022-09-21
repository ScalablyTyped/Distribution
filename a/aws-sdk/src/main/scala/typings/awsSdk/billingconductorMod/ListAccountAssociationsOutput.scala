package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccountAssociationsOutput extends StObject {
  
  /**
    *  The list of linked accounts in the payer account. 
    */
  var LinkedAccounts: js.UndefOr[AccountAssociationsList] = js.undefined
  
  /**
    *  The pagination token used on subsequent calls to get accounts. 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListAccountAssociationsOutput {
  
  inline def apply(): ListAccountAssociationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountAssociationsOutput]
  }
  
  extension [Self <: ListAccountAssociationsOutput](x: Self) {
    
    inline def setLinkedAccounts(value: AccountAssociationsList): Self = StObject.set(x, "LinkedAccounts", value.asInstanceOf[js.Any])
    
    inline def setLinkedAccountsUndefined: Self = StObject.set(x, "LinkedAccounts", js.undefined)
    
    inline def setLinkedAccountsVarargs(value: AccountAssociationsListElement*): Self = StObject.set(x, "LinkedAccounts", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
