package typings.awsDashSdk.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFargateProfilesResponse extends js.Object {
  /**
    * A list of all of the Fargate profiles associated with the specified cluster.
    */
  var fargateProfileNames: js.UndefOr[StringList] = js.native
  /**
    * The nextToken value to include in a future ListFargateProfiles request. When the results of a ListFargateProfiles request exceed maxResults, you can use this value to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListFargateProfilesResponse {
  @scala.inline
  def apply(fargateProfileNames: StringList = null, nextToken: String = null): ListFargateProfilesResponse = {
    val __obj = js.Dynamic.literal()
    if (fargateProfileNames != null) __obj.updateDynamic("fargateProfileNames")(fargateProfileNames.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFargateProfilesResponse]
  }
}

