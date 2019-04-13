package typings
package awsDashSdkLib.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResolverEndpointRequest extends js.Object {
  /**
    * The ID of the resolver endpoint that you want to get information about.
    */
  var ResolverEndpointId: ResourceId
}

object GetResolverEndpointRequest {
  @scala.inline
  def apply(ResolverEndpointId: ResourceId): GetResolverEndpointRequest = {
    val __obj = js.Dynamic.literal(ResolverEndpointId = ResolverEndpointId)
  
    __obj.asInstanceOf[GetResolverEndpointRequest]
  }
}

