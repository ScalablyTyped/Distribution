package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopFleetRequest extends js.Object {
  /**
    * The name of the fleet.
    */
  var Name: String
}

object StopFleetRequest {
  @scala.inline
  def apply(Name: String): StopFleetRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[StopFleetRequest]
  }
}

