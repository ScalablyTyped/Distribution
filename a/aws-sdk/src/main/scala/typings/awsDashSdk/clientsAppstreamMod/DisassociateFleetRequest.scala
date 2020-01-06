package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateFleetRequest extends js.Object {
  /**
    * The name of the fleet.
    */
  var FleetName: String = js.native
  /**
    * The name of the stack.
    */
  var StackName: String = js.native
}

object DisassociateFleetRequest {
  @scala.inline
  def apply(FleetName: String, StackName: String): DisassociateFleetRequest = {
    val __obj = js.Dynamic.literal(FleetName = FleetName.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisassociateFleetRequest]
  }
}

