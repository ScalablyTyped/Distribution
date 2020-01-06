package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateResolverEndpointRequest extends js.Object {
  /**
    * The name of the resolver endpoint that you want to update.
    */
  var Name: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.Name] = js.native
  /**
    * The ID of the resolver endpoint that you want to update.
    */
  var ResolverEndpointId: ResourceId = js.native
}

object UpdateResolverEndpointRequest {
  @scala.inline
  def apply(ResolverEndpointId: ResourceId, Name: Name = null): UpdateResolverEndpointRequest = {
    val __obj = js.Dynamic.literal(ResolverEndpointId = ResolverEndpointId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResolverEndpointRequest]
  }
}

