package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartFleetRequest extends js.Object {
  /**
    * The name of the fleet.
    */
  var Name: String = js.native
}

object StartFleetRequest {
  @scala.inline
  def apply(Name: String): StartFleetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartFleetRequest]
  }
}

