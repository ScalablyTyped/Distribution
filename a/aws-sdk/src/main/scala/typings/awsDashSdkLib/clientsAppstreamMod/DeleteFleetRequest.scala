package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFleetRequest extends js.Object {
  /**
    * The name of the fleet.
    */
  var Name: String
}

object DeleteFleetRequest {
  @scala.inline
  def apply(Name: String): DeleteFleetRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DeleteFleetRequest]
  }
}

