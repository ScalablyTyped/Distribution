package typings.awsDashSdk.clientsNetworkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateLinkResponse extends js.Object {
  /**
    * The link association.
    */
  var LinkAssociation: js.UndefOr[typings.awsDashSdk.clientsNetworkmanagerMod.LinkAssociation] = js.native
}

object AssociateLinkResponse {
  @scala.inline
  def apply(LinkAssociation: LinkAssociation = null): AssociateLinkResponse = {
    val __obj = js.Dynamic.literal()
    if (LinkAssociation != null) __obj.updateDynamic("LinkAssociation")(LinkAssociation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateLinkResponse]
  }
}

