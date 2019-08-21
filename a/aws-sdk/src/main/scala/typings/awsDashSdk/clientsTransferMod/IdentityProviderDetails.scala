package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityProviderDetails extends js.Object {
  /**
    * The InvocationRole parameter provides the type of InvocationRole used to authenticate the user account.
    */
  var InvocationRole: js.UndefOr[Role] = js.undefined
  /**
    * The Url parameter provides contains the location of the service endpoint used to authenticate users.
    */
  var Url: js.UndefOr[typings.awsDashSdk.clientsTransferMod.Url] = js.undefined
}

object IdentityProviderDetails {
  @scala.inline
  def apply(InvocationRole: Role = null, Url: Url = null): IdentityProviderDetails = {
    val __obj = js.Dynamic.literal()
    if (InvocationRole != null) __obj.updateDynamic("InvocationRole")(InvocationRole)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[IdentityProviderDetails]
  }
}

