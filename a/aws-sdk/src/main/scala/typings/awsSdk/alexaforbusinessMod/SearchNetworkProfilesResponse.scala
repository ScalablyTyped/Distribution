package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchNetworkProfilesResponse extends StObject {
  
  /**
    * The network profiles that meet the specified set of filter criteria, in sort order. It is a list of NetworkProfileData objects. 
    */
  var NetworkProfiles: js.UndefOr[NetworkProfileDataList] = js.undefined
  
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.undefined
  
  /**
    * The total number of network profiles returned.
    */
  var TotalCount: js.UndefOr[typings.awsSdk.alexaforbusinessMod.TotalCount] = js.undefined
}
object SearchNetworkProfilesResponse {
  
  inline def apply(): SearchNetworkProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchNetworkProfilesResponse]
  }
  
  extension [Self <: SearchNetworkProfilesResponse](x: Self) {
    
    inline def setNetworkProfiles(value: NetworkProfileDataList): Self = StObject.set(x, "NetworkProfiles", value.asInstanceOf[js.Any])
    
    inline def setNetworkProfilesUndefined: Self = StObject.set(x, "NetworkProfiles", js.undefined)
    
    inline def setNetworkProfilesVarargs(value: NetworkProfileData*): Self = StObject.set(x, "NetworkProfiles", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTotalCount(value: TotalCount): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
  }
}
