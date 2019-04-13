package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartFleetRequest extends js.Object {
  /**
    * The name of the fleet.
    */
  var Name: String
}

object StartFleetRequest {
  @scala.inline
  def apply(Name: String): StartFleetRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[StartFleetRequest]
  }
}

