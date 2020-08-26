package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchProfilesResponse extends js.Object {
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
  /**
    * The profiles that meet the specified set of filter criteria, in sort order.
    */
  var Profiles: js.UndefOr[ProfileDataList] = js.native
  /**
    * The total number of room profiles returned.
    */
  var TotalCount: js.UndefOr[typings.awsSdk.alexaforbusinessMod.TotalCount] = js.native
}

object SearchProfilesResponse {
  @scala.inline
  def apply(): SearchProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchProfilesResponse]
  }
  @scala.inline
  implicit class SearchProfilesResponseOps[Self <: SearchProfilesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setProfilesVarargs(value: ProfileData*): Self = this.set("Profiles", js.Array(value :_*))
    @scala.inline
    def setProfiles(value: ProfileDataList): Self = this.set("Profiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfiles: Self = this.set("Profiles", js.undefined)
    @scala.inline
    def setTotalCount(value: TotalCount): Self = this.set("TotalCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalCount: Self = this.set("TotalCount", js.undefined)
  }
  
}

