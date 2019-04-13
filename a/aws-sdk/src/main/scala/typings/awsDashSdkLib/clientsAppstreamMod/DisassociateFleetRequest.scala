package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateFleetRequest extends js.Object {
  /**
    * The name of the fleet.
    */
  var FleetName: String
  /**
    * The name of the stack.
    */
  var StackName: String
}

object DisassociateFleetRequest {
  @scala.inline
  def apply(FleetName: String, StackName: String): DisassociateFleetRequest = {
    val __obj = js.Dynamic.literal(FleetName = FleetName, StackName = StackName)
  
    __obj.asInstanceOf[DisassociateFleetRequest]
  }
}

