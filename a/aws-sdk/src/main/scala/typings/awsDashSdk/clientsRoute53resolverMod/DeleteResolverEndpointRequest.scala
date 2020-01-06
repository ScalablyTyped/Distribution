package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteResolverEndpointRequest extends js.Object {
  /**
    * The ID of the resolver endpoint that you want to delete.
    */
  var ResolverEndpointId: ResourceId = js.native
}

object DeleteResolverEndpointRequest {
  @scala.inline
  def apply(ResolverEndpointId: ResourceId): DeleteResolverEndpointRequest = {
    val __obj = js.Dynamic.literal(ResolverEndpointId = ResolverEndpointId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteResolverEndpointRequest]
  }
}

