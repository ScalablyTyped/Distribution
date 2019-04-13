package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateFleetRequest extends js.Object {
  /**
    * The name of the fleet. 
    */
  var FleetName: String
  /**
    * The name of the stack.
    */
  var StackName: String
}

object AssociateFleetRequest {
  @scala.inline
  def apply(FleetName: String, StackName: String): AssociateFleetRequest = {
    val __obj = js.Dynamic.literal(FleetName = FleetName, StackName = StackName)
  
    __obj.asInstanceOf[AssociateFleetRequest]
  }
}

