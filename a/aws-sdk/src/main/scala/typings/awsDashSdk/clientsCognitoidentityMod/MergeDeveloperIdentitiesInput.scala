package typings.awsDashSdk.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeDeveloperIdentitiesInput extends js.Object {
  /**
    * User identifier for the destination user. The value should be a DeveloperUserIdentifier.
    */
  var DestinationUserIdentifier: DeveloperUserIdentifier = js.native
  /**
    * The "domain" by which Cognito will refer to your users. This is a (pseudo) domain name that you provide while creating an identity pool. This name acts as a placeholder that allows your backend and the Cognito service to communicate about the developer provider. For the DeveloperProviderName, you can use letters as well as period (.), underscore (_), and dash (-).
    */
  var DeveloperProviderName: typings.awsDashSdk.clientsCognitoidentityMod.DeveloperProviderName = js.native
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: typings.awsDashSdk.clientsCognitoidentityMod.IdentityPoolId = js.native
  /**
    * User identifier for the source user. The value should be a DeveloperUserIdentifier.
    */
  var SourceUserIdentifier: DeveloperUserIdentifier = js.native
}

object MergeDeveloperIdentitiesInput {
  @scala.inline
  def apply(
    DestinationUserIdentifier: DeveloperUserIdentifier,
    DeveloperProviderName: DeveloperProviderName,
    IdentityPoolId: IdentityPoolId,
    SourceUserIdentifier: DeveloperUserIdentifier
  ): MergeDeveloperIdentitiesInput = {
    val __obj = js.Dynamic.literal(DestinationUserIdentifier = DestinationUserIdentifier.asInstanceOf[js.Any], DeveloperProviderName = DeveloperProviderName.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], SourceUserIdentifier = SourceUserIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MergeDeveloperIdentitiesInput]
  }
}

