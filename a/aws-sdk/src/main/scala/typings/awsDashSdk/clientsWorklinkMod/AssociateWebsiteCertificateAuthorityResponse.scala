package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateWebsiteCertificateAuthorityResponse extends js.Object {
  /**
    * A unique identifier for the CA.
    */
  var WebsiteCaId: js.UndefOr[Id] = js.native
}

object AssociateWebsiteCertificateAuthorityResponse {
  @scala.inline
  def apply(WebsiteCaId: Id = null): AssociateWebsiteCertificateAuthorityResponse = {
    val __obj = js.Dynamic.literal()
    if (WebsiteCaId != null) __obj.updateDynamic("WebsiteCaId")(WebsiteCaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateWebsiteCertificateAuthorityResponse]
  }
}

