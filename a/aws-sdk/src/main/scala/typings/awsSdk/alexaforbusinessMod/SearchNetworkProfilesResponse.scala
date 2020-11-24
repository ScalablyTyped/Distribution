package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchNetworkProfilesResponse extends js.Object {
  
  /**
    * The network profiles that meet the specified set of filter criteria, in sort order. It is a list of NetworkProfileData objects. 
    */
  var NetworkProfiles: js.UndefOr[NetworkProfileDataList] = js.native
  
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
  
  /**
    * The total number of network profiles returned.
    */
  var TotalCount: js.UndefOr[typings.awsSdk.alexaforbusinessMod.TotalCount] = js.native
}
object SearchNetworkProfilesResponse {
  
  @scala.inline
  def apply(): SearchNetworkProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchNetworkProfilesResponse]
  }
  
  @scala.inline
  implicit class SearchNetworkProfilesResponseOps[Self <: SearchNetworkProfilesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNetworkProfilesVarargs(value: NetworkProfileData*): Self = this.set("NetworkProfiles", js.Array(value :_*))
    
    @scala.inline
    def setNetworkProfiles(value: NetworkProfileDataList): Self = this.set("NetworkProfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkProfiles: Self = this.set("NetworkProfiles", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setTotalCount(value: TotalCount): Self = this.set("TotalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalCount: Self = this.set("TotalCount", js.undefined)
  }
}
