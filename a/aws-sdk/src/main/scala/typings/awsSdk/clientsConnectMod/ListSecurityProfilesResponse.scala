package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSecurityProfilesResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
  
  /**
    * Information about the security profiles.
    */
  var SecurityProfileSummaryList: js.UndefOr[typings.awsSdk.clientsConnectMod.SecurityProfileSummaryList] = js.undefined
}
object ListSecurityProfilesResponse {
  
  inline def apply(): ListSecurityProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecurityProfilesResponse]
  }
  
  extension [Self <: ListSecurityProfilesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSecurityProfileSummaryList(value: SecurityProfileSummaryList): Self = StObject.set(x, "SecurityProfileSummaryList", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileSummaryListUndefined: Self = StObject.set(x, "SecurityProfileSummaryList", js.undefined)
    
    inline def setSecurityProfileSummaryListVarargs(value: SecurityProfileSummary*): Self = StObject.set(x, "SecurityProfileSummaryList", js.Array(value*))
  }
}
