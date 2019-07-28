package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivateEventSourceRequest extends js.Object {
  /**
    * The name of the partner event source to activate.
    */
  var Name: EventSourceName
}

object ActivateEventSourceRequest {
  @scala.inline
  def apply(Name: EventSourceName): ActivateEventSourceRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[ActivateEventSourceRequest]
  }
}

