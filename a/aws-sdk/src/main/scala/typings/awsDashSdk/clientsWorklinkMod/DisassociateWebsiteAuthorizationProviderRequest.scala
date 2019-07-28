package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateWebsiteAuthorizationProviderRequest extends js.Object {
  /**
    * A unique identifier for the authorization provider.
    */
  var AuthorizationProviderId: Id
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsDashSdk.clientsWorklinkMod.FleetArn
}

object DisassociateWebsiteAuthorizationProviderRequest {
  @scala.inline
  def apply(AuthorizationProviderId: Id, FleetArn: FleetArn): DisassociateWebsiteAuthorizationProviderRequest = {
    val __obj = js.Dynamic.literal(AuthorizationProviderId = AuthorizationProviderId, FleetArn = FleetArn)
  
    __obj.asInstanceOf[DisassociateWebsiteAuthorizationProviderRequest]
  }
}

