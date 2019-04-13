package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteReusableDelegationSetRequest extends js.Object {
  /**
    * The ID of the reusable delegation set that you want to delete.
    */
  var Id: ResourceId
}

object DeleteReusableDelegationSetRequest {
  @scala.inline
  def apply(Id: ResourceId): DeleteReusableDelegationSetRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[DeleteReusableDelegationSetRequest]
  }
}

