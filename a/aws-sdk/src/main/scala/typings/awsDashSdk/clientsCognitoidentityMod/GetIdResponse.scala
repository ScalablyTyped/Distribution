package typings.awsDashSdk.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIdResponse extends js.Object {
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[typings.awsDashSdk.clientsCognitoidentityMod.IdentityId] = js.undefined
}

object GetIdResponse {
  @scala.inline
  def apply(IdentityId: IdentityId = null): GetIdResponse = {
    val __obj = js.Dynamic.literal()
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId)
    __obj.asInstanceOf[GetIdResponse]
  }
}

