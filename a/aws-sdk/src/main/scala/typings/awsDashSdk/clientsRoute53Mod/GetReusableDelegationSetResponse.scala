package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReusableDelegationSetResponse extends js.Object {
  /**
    * A complex type that contains information about the reusable delegation set.
    */
  var DelegationSet: typings.awsDashSdk.clientsRoute53Mod.DelegationSet = js.native
}

object GetReusableDelegationSetResponse {
  @scala.inline
  def apply(DelegationSet: DelegationSet): GetReusableDelegationSetResponse = {
    val __obj = js.Dynamic.literal(DelegationSet = DelegationSet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetReusableDelegationSetResponse]
  }
}

