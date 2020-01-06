package typings.awsDashSdk.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPendingInvitationResourcesResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * Information about the resources included the resource share.
    */
  var resources: js.UndefOr[ResourceList] = js.native
}

object ListPendingInvitationResourcesResponse {
  @scala.inline
  def apply(nextToken: String = null, resources: ResourceList = null): ListPendingInvitationResourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPendingInvitationResourcesResponse]
  }
}

