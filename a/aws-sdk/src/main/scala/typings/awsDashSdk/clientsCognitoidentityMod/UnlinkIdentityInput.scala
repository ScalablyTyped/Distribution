package typings.awsDashSdk.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnlinkIdentityInput extends js.Object {
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: typings.awsDashSdk.clientsCognitoidentityMod.IdentityId
  /**
    * A set of optional name-value pairs that map provider names to provider tokens.
    */
  var Logins: LoginsMap
  /**
    * Provider names to unlink from this identity.
    */
  var LoginsToRemove: LoginsList
}

object UnlinkIdentityInput {
  @scala.inline
  def apply(IdentityId: IdentityId, Logins: LoginsMap, LoginsToRemove: LoginsList): UnlinkIdentityInput = {
    val __obj = js.Dynamic.literal(IdentityId = IdentityId, Logins = Logins, LoginsToRemove = LoginsToRemove)
  
    __obj.asInstanceOf[UnlinkIdentityInput]
  }
}

