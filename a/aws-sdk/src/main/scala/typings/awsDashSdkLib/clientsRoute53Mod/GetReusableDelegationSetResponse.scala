package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReusableDelegationSetResponse extends js.Object {
  /**
    * A complex type that contains information about the reusable delegation set.
    */
  var DelegationSet: awsDashSdkLib.clientsRoute53Mod.DelegationSet
}

object GetReusableDelegationSetResponse {
  @scala.inline
  def apply(DelegationSet: DelegationSet): GetReusableDelegationSetResponse = {
    val __obj = js.Dynamic.literal(DelegationSet = DelegationSet)
  
    __obj.asInstanceOf[GetReusableDelegationSetResponse]
  }
}

