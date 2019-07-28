package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSAMLProviderRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the SAML provider to delete.
    */
  var SAMLProviderArn: arnType
}

object DeleteSAMLProviderRequest {
  @scala.inline
  def apply(SAMLProviderArn: arnType): DeleteSAMLProviderRequest = {
    val __obj = js.Dynamic.literal(SAMLProviderArn = SAMLProviderArn)
  
    __obj.asInstanceOf[DeleteSAMLProviderRequest]
  }
}

