package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReusableDelegationSetRequest extends js.Object {
  /**
    * The ID of the reusable delegation set that you want to delete.
    */
  var Id: ResourceId = js.native
}

object DeleteReusableDelegationSetRequest {
  @scala.inline
  def apply(Id: ResourceId): DeleteReusableDelegationSetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteReusableDelegationSetRequest]
  }
}

