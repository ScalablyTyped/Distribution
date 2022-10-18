package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPartnerEventSourceAccountsResponse extends StObject {
  
  /**
    * A token you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.NextToken] = js.undefined
  
  /**
    * The list of partner event sources returned by the operation.
    */
  var PartnerEventSourceAccounts: js.UndefOr[PartnerEventSourceAccountList] = js.undefined
}
object ListPartnerEventSourceAccountsResponse {
  
  inline def apply(): ListPartnerEventSourceAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPartnerEventSourceAccountsResponse]
  }
  
  extension [Self <: ListPartnerEventSourceAccountsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPartnerEventSourceAccounts(value: PartnerEventSourceAccountList): Self = StObject.set(x, "PartnerEventSourceAccounts", value.asInstanceOf[js.Any])
    
    inline def setPartnerEventSourceAccountsUndefined: Self = StObject.set(x, "PartnerEventSourceAccounts", js.undefined)
    
    inline def setPartnerEventSourceAccountsVarargs(value: PartnerEventSourceAccount*): Self = StObject.set(x, "PartnerEventSourceAccounts", js.Array(value*))
  }
}
