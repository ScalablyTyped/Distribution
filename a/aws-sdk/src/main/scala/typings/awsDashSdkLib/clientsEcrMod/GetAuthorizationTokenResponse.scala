package typings
package awsDashSdkLib.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAuthorizationTokenResponse extends js.Object {
  /**
    * A list of authorization token data objects that correspond to the registryIds values in the request.
    */
  var authorizationData: js.UndefOr[AuthorizationDataList] = js.undefined
}

object GetAuthorizationTokenResponse {
  @scala.inline
  def apply(authorizationData: AuthorizationDataList = null): GetAuthorizationTokenResponse = {
    val __obj = js.Dynamic.literal()
    if (authorizationData != null) __obj.updateDynamic("authorizationData")(authorizationData)
    __obj.asInstanceOf[GetAuthorizationTokenResponse]
  }
}

