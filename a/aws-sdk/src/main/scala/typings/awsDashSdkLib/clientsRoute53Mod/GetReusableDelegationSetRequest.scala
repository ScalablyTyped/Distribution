package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReusableDelegationSetRequest extends js.Object {
  /**
    * The ID of the reusable delegation set that you want to get a list of name servers for.
    */
  var Id: ResourceId
}

object GetReusableDelegationSetRequest {
  @scala.inline
  def apply(Id: ResourceId): GetReusableDelegationSetRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[GetReusableDelegationSetRequest]
  }
}

