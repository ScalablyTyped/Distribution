package typings.awsDashSdk.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeDeveloperIdentitiesResponse extends js.Object {
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[typings.awsDashSdk.clientsCognitoidentityMod.IdentityId] = js.undefined
}

object MergeDeveloperIdentitiesResponse {
  @scala.inline
  def apply(IdentityId: IdentityId = null): MergeDeveloperIdentitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId)
    __obj.asInstanceOf[MergeDeveloperIdentitiesResponse]
  }
}

