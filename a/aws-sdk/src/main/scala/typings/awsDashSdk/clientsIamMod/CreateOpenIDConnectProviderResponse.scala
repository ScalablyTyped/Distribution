package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOpenIDConnectProviderResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the new IAM OpenID Connect provider that is created. For more information, see OpenIDConnectProviderListEntry. 
    */
  var OpenIDConnectProviderArn: js.UndefOr[arnType] = js.undefined
}

object CreateOpenIDConnectProviderResponse {
  @scala.inline
  def apply(OpenIDConnectProviderArn: arnType = null): CreateOpenIDConnectProviderResponse = {
    val __obj = js.Dynamic.literal()
    if (OpenIDConnectProviderArn != null) __obj.updateDynamic("OpenIDConnectProviderArn")(OpenIDConnectProviderArn)
    __obj.asInstanceOf[CreateOpenIDConnectProviderResponse]
  }
}

