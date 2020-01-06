package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaFunctionStartedEventAttributes extends js.Object {
  /**
    * The ID of the LambdaFunctionScheduled event that was recorded when this activity task was scheduled. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId = js.native
}

object LambdaFunctionStartedEventAttributes {
  @scala.inline
  def apply(scheduledEventId: EventId): LambdaFunctionStartedEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LambdaFunctionStartedEventAttributes]
  }
}

