package typings
package awsDashSdkLib.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnlinkDeveloperIdentityInput extends js.Object {
  /**
    * The "domain" by which Cognito will refer to your users.
    */
  var DeveloperProviderName: awsDashSdkLib.clientsCognitoidentityMod.DeveloperProviderName
  /**
    * A unique ID used by your backend authentication process to identify a user.
    */
  var DeveloperUserIdentifier: awsDashSdkLib.clientsCognitoidentityMod.DeveloperUserIdentifier
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: awsDashSdkLib.clientsCognitoidentityMod.IdentityId
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: awsDashSdkLib.clientsCognitoidentityMod.IdentityPoolId
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

