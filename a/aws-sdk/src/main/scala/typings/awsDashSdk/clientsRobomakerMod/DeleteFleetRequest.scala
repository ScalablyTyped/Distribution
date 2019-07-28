package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFleetRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleet: Arn
}

object DeleteFleetRequest {
  @scala.inline
  def apply(fleet: Arn): DeleteFleetRequest = {
    val __obj = js.Dynamic.literal(fleet = fleet)
  
    __obj.asInstanceOf[DeleteFleetRequest]
  }
}

