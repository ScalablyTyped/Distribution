package typings.awsDashSdk.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceShareAssociationsResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * Information about the associations.
    */
  var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.native
}

object GetResourceShareAssociationsResponse {
  @scala.inline
  def apply(nextToken: String = null, resourceShareAssociations: ResourceShareAssociationList = null): GetResourceShareAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (resourceShareAssociations != null) __obj.updateDynamic("resourceShareAssociations")(resourceShareAssociations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceShareAssociationsResponse]
  }
}

