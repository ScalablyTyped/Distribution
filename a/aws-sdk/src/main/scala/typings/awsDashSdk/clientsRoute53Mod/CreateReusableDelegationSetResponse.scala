package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReusableDelegationSetResponse extends js.Object {
  /**
    * A complex type that contains name server information.
    */
  var DelegationSet: typings.awsDashSdk.clientsRoute53Mod.DelegationSet = js.native
  /**
    * The unique URL representing the new reusable delegation set.
    */
  var Location: ResourceURI = js.native
}

object CreateReusableDelegationSetResponse {
  @scala.inline
  def apply(DelegationSet: DelegationSet, Location: ResourceURI): CreateReusableDelegationSetResponse = {
    val __obj = js.Dynamic.literal(DelegationSet = DelegationSet.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateReusableDelegationSetResponse]
  }
}

