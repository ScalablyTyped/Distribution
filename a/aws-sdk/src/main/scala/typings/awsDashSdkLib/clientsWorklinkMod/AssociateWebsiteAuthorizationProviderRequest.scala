package typings
package awsDashSdkLib.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateWebsiteAuthorizationProviderRequest extends js.Object {
  /**
    * The authorization provider type.
    */
  var AuthorizationProviderType: awsDashSdkLib.clientsWorklinkMod.AuthorizationProviderType
  /**
    * The domain name of the authorization provider. This applies only to SAML-based authorization providers.
    */
  var DomainName: js.UndefOr[DomainName] = js.undefined
  /**
    * The ARN of the fleet.
    */
  var FleetArn: awsDashSdkLib.clientsWorklinkMod.FleetArn
}

object AssociateWebsiteAuthorizationProviderRequest {
  @scala.inline
  def apply(
    AuthorizationProviderType: AuthorizationProviderType,
    FleetArn: FleetArn,
    DomainName: DomainName = null
  ): AssociateWebsiteAuthorizationProviderRequest = {
    val __obj = js.Dynamic.literal(AuthorizationProviderType = AuthorizationProviderType.asInstanceOf[js.Any], FleetArn = FleetArn)
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName)
    __obj.asInstanceOf[AssociateWebsiteAuthorizationProviderRequest]
  }
}

