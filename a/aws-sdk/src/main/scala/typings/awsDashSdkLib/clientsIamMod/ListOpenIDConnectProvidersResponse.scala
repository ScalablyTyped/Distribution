package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOpenIDConnectProvidersResponse extends js.Object {
  /**
    * The list of IAM OIDC provider resource objects defined in the AWS account.
    */
  var OpenIDConnectProviderList: js.UndefOr[OpenIDConnectProviderListType] = js.undefined
}

object ListOpenIDConnectProvidersResponse {
  @scala.inline
  def apply(OpenIDConnectProviderList: OpenIDConnectProviderListType = null): ListOpenIDConnectProvidersResponse = {
    val __obj = js.Dynamic.literal()
    if (OpenIDConnectProviderList != null) __obj.updateDynamic("OpenIDConnectProviderList")(OpenIDConnectProviderList)
    __obj.asInstanceOf[ListOpenIDConnectProvidersResponse]
  }
}

