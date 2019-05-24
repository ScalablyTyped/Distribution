package typings
package awsDashSdkLib.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateWebsiteAuthorizationProviderResponse extends js.Object {
  /**
    * A unique identifier for the authorization provider.
    */
  var AuthorizationProviderId: js.UndefOr[Id] = js.undefined
}

object AssociateWebsiteAuthorizationProviderResponse {
  @scala.inline
  def apply(AuthorizationProviderId: Id = null): AssociateWebsiteAuthorizationProviderResponse = {
    val __obj = js.Dynamic.literal()
    if (AuthorizationProviderId != null) __obj.updateDynamic("AuthorizationProviderId")(AuthorizationProviderId)
    __obj.asInstanceOf[AssociateWebsiteAuthorizationProviderResponse]
  }
}

