package typings.awsDashSdk.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeactivateEventSourceRequest extends js.Object {
  /**
    * The name of the partner event source to deactivate.
    */
  var Name: EventSourceName
}

object DeactivateEventSourceRequest {
  @scala.inline
  def apply(Name: EventSourceName): DeactivateEventSourceRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DeactivateEventSourceRequest]
  }
}

