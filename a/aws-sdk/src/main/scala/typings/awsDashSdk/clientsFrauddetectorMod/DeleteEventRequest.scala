package typings.awsDashSdk.clientsFrauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEventRequest extends js.Object {
  /**
    * The ID of the event to delete.
    */
  var eventId: String = js.native
}

object DeleteEventRequest {
  @scala.inline
  def apply(eventId: String): DeleteEventRequest = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteEventRequest]
  }
}

