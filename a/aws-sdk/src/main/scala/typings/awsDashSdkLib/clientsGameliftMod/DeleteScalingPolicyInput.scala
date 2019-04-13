package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteScalingPolicyInput extends js.Object {
  /**
    * Unique identifier for a fleet to be deleted.
    */
  var FleetId: awsDashSdkLib.clientsGameliftMod.FleetId
  /**
    * Descriptive label that is associated with a scaling policy. Policy names do not need to be unique.
    */
  var Name: NonZeroAndMaxString
}

object DeleteScalingPolicyInput {
  @scala.inline
  def apply(FleetId: FleetId, Name: NonZeroAndMaxString): DeleteScalingPolicyInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId, Name = Name)
  
    __obj.asInstanceOf[DeleteScalingPolicyInput]
  }
}

