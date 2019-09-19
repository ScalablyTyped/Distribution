package typings.awsDashSdk.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPendingInvitationResourcesResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the resources included the resource share.
    */
  var resources: js.UndefOr[ResourceList] = js.undefined
}

object ListPendingInvitationResourcesResponse {
  @scala.inline
  def apply(nextToken: String = null, resources: ResourceList = null): ListPendingInvitationResourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    __obj.asInstanceOf[ListPendingInvitationResourcesResponse]
  }
}

