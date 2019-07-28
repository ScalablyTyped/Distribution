package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestAuthorizationResponse extends js.Object {
  /**
    * The authentication results.
    */
  var authResults: js.UndefOr[AuthResults] = js.undefined
}

object TestAuthorizationResponse {
  @scala.inline
  def apply(authResults: AuthResults = null): TestAuthorizationResponse = {
    val __obj = js.Dynamic.literal()
    if (authResults != null) __obj.updateDynamic("authResults")(authResults)
    __obj.asInstanceOf[TestAuthorizationResponse]
  }
}

