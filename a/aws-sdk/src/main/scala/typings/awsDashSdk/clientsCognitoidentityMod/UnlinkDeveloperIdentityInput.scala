package typings.awsDashSdk.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnlinkDeveloperIdentityInput extends js.Object {
  /**
    * The "domain" by which Cognito will refer to your users.
    */
  var DeveloperProviderName: typings.awsDashSdk.clientsCognitoidentityMod.DeveloperProviderName
  /**
    * A unique ID used by your backend authentication process to identify a user.
    */
  var DeveloperUserIdentifier: typings.awsDashSdk.clientsCognitoidentityMod.DeveloperUserIdentifier
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: typings.awsDashSdk.clientsCognitoidentityMod.IdentityId
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: typings.awsDashSdk.clientsCognitoidentityMod.IdentityPoolId
}

object UnlinkDeveloperIdentityInput {
  @scala.inline
  def apply(
    DeveloperProviderName: DeveloperProviderName,
    DeveloperUserIdentifier: DeveloperUserIdentifier,
    IdentityId: IdentityId,
    IdentityPoolId: IdentityPoolId
  ): UnlinkDeveloperIdentityInput = {
    val __obj = js.Dynamic.literal(DeveloperProviderName = DeveloperProviderName, DeveloperUserIdentifier = DeveloperUserIdentifier, IdentityId = IdentityId, IdentityPoolId = IdentityPoolId)
  
    __obj.asInstanceOf[UnlinkDeveloperIdentityInput]
  }
}

