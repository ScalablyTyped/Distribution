package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPlatformApplicationsResponse extends js.Object {
  /**
    * NextToken string is returned when calling ListPlatformApplications action if additional records are available after the first page results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Platform applications returned when calling ListPlatformApplications action.
    */
  var PlatformApplications: js.UndefOr[ListOfPlatformApplications] = js.native
}

object ListPlatformApplicationsResponse {
  @scala.inline
  def apply(NextToken: String = null, PlatformApplications: ListOfPlatformApplications = null): ListPlatformApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PlatformApplications != null) __obj.updateDynamic("PlatformApplications")(PlatformApplications.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPlatformApplicationsResponse]
  }
}

