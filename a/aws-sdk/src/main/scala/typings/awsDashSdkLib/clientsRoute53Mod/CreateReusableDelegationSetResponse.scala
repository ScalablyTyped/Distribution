package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateReusableDelegationSetResponse extends js.Object {
  /**
    * A complex type that contains name server information.
    */
  var DelegationSet: awsDashSdkLib.clientsRoute53Mod.DelegationSet
  /**
    * The unique URL representing the new reusable delegation set.
    */
  var Location: ResourceURI
}

object CreateReusableDelegationSetResponse {
  @scala.inline
  def apply(DelegationSet: DelegationSet, Location: ResourceURI): CreateReusableDelegationSetResponse = {
    val __obj = js.Dynamic.literal(DelegationSet = DelegationSet, Location = Location)
  
    __obj.asInstanceOf[CreateReusableDelegationSetResponse]
  }
}

