package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceAccessInput extends js.Object {
  /**
    * Unique identifier for a fleet that contains the instance you want access to. The fleet can be in any of the following statuses: ACTIVATING, ACTIVE, or ERROR. Fleets with an ERROR status may be accessible for a short time before they are deleted.
    */
  var FleetId: awsDashSdkLib.clientsGameliftMod.FleetId
  /**
    * Unique identifier for an instance you want to get access to. You can access an instance in any status.
    */
  var InstanceId: awsDashSdkLib.clientsGameliftMod.InstanceId
}

object GetInstanceAccessInput {
  @scala.inline
  def apply(FleetId: FleetId, InstanceId: InstanceId): GetInstanceAccessInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId, InstanceId = InstanceId)
  
    __obj.asInstanceOf[GetInstanceAccessInput]
  }
}

