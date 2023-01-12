package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSecurityProfilesResponse extends StObject {
  
  /**
    * The total number of security profiles which matched your search query.
    */
  var ApproximateTotalCount: js.UndefOr[typings.awsSdk.clientsConnectMod.ApproximateTotalCount] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[NextToken2500] = js.undefined
  
  /**
    * Information about the security profiles.
    */
  var SecurityProfiles: js.UndefOr[SecurityProfilesSearchSummaryList] = js.undefined
}
object SearchSecurityProfilesResponse {
  
  inline def apply(): SearchSecurityProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSecurityProfilesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchSecurityProfilesResponse] (val x: Self) extends AnyVal {
    
    inline def setApproximateTotalCount(value: ApproximateTotalCount): Self = StObject.set(x, "ApproximateTotalCount", value.asInstanceOf[js.Any])
    
    inline def setApproximateTotalCountUndefined: Self = StObject.set(x, "ApproximateTotalCount", js.undefined)
    
    inline def setNextToken(value: NextToken2500): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSecurityProfiles(value: SecurityProfilesSearchSummaryList): Self = StObject.set(x, "SecurityProfiles", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfilesUndefined: Self = StObject.set(x, "SecurityProfiles", js.undefined)
    
    inline def setSecurityProfilesVarargs(value: SecurityProfileSearchSummary*): Self = StObject.set(x, "SecurityProfiles", js.Array(value*))
  }
}
