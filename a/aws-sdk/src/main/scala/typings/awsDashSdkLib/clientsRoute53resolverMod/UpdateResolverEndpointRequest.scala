package typings
package awsDashSdkLib.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateResolverEndpointRequest extends js.Object {
  /**
    * The name of the resolver endpoint that you want to update.
    */
  var Name: js.UndefOr[Name] = js.undefined
  /**
    * The ID of the resolver endpoint that you want to update.
    */
  var ResolverEndpointId: ResourceId
}

object UpdateResolverEndpointRequest {
  @scala.inline
  def apply(ResolverEndpointId: ResourceId, Name: Name = null): UpdateResolverEndpointRequest = {
    val __obj = js.Dynamic.literal(ResolverEndpointId = ResolverEndpointId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateResolverEndpointRequest]
  }
}

