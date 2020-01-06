package typings.awsDashSdk.clientsNetworkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLinkAssociationsResponse extends js.Object {
  /**
    * The link associations.
    */
  var LinkAssociations: js.UndefOr[LinkAssociationList] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object GetLinkAssociationsResponse {
  @scala.inline
  def apply(LinkAssociations: LinkAssociationList = null, NextToken: String = null): GetLinkAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    if (LinkAssociations != null) __obj.updateDynamic("LinkAssociations")(LinkAssociations.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLinkAssociationsResponse]
  }
}

