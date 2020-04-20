package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFleetRequest extends js.Object {
  /**
    * The name of the fleet.
    */
  var Name: String = js.native
}

object DeleteFleetRequest {
  @scala.inline
  def apply(Name: String): DeleteFleetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFleetRequest]
  }
}

