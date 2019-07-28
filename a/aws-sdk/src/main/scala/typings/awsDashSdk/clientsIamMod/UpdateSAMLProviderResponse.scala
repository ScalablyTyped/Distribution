package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSAMLProviderResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the SAML provider that was updated.
    */
  var SAMLProviderArn: js.UndefOr[arnType] = js.undefined
}

object UpdateSAMLProviderResponse {
  @scala.inline
  def apply(SAMLProviderArn: arnType = null): UpdateSAMLProviderResponse = {
    val __obj = js.Dynamic.literal()
    if (SAMLProviderArn != null) __obj.updateDynamic("SAMLProviderArn")(SAMLProviderArn)
    __obj.asInstanceOf[UpdateSAMLProviderResponse]
  }
}

