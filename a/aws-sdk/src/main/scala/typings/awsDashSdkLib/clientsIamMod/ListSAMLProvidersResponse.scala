package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSAMLProvidersResponse extends js.Object {
  /**
    * The list of SAML provider resource objects defined in IAM for this AWS account.
    */
  var SAMLProviderList: js.UndefOr[SAMLProviderListType] = js.undefined
}

object ListSAMLProvidersResponse {
  @scala.inline
  def apply(SAMLProviderList: SAMLProviderListType = null): ListSAMLProvidersResponse = {
    val __obj = js.Dynamic.literal()
    if (SAMLProviderList != null) __obj.updateDynamic("SAMLProviderList")(SAMLProviderList)
    __obj.asInstanceOf[ListSAMLProvidersResponse]
  }
}

