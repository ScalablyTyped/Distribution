package typings.awsDashSdk.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityPoolShortDescription extends js.Object {
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: js.UndefOr[typings.awsDashSdk.clientsCognitoidentityMod.IdentityPoolId] = js.undefined
  /**
    * A string that you provide.
    */
  var IdentityPoolName: js.UndefOr[typings.awsDashSdk.clientsCognitoidentityMod.IdentityPoolName] = js.undefined
}

object IdentityPoolShortDescription {
  @scala.inline
  def apply(IdentityPoolId: IdentityPoolId = null, IdentityPoolName: IdentityPoolName = null): IdentityPoolShortDescription = {
    val __obj = js.Dynamic.literal()
    if (IdentityPoolId != null) __obj.updateDynamic("IdentityPoolId")(IdentityPoolId)
    if (IdentityPoolName != null) __obj.updateDynamic("IdentityPoolName")(IdentityPoolName)
    __obj.asInstanceOf[IdentityPoolShortDescription]
  }
}

