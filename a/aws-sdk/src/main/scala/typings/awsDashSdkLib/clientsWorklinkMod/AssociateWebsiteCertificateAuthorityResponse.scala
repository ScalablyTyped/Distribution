package typings
package awsDashSdkLib.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateWebsiteCertificateAuthorityResponse extends js.Object {
  /**
    * A unique identifier for the CA.
    */
  var WebsiteCaId: js.UndefOr[Id] = js.undefined
}

object AssociateWebsiteCertificateAuthorityResponse {
  @scala.inline
  def apply(WebsiteCaId: Id = null): AssociateWebsiteCertificateAuthorityResponse = {
    val __obj = js.Dynamic.literal()
    if (WebsiteCaId != null) __obj.updateDynamic("WebsiteCaId")(WebsiteCaId)
    __obj.asInstanceOf[AssociateWebsiteCertificateAuthorityResponse]
  }
}

