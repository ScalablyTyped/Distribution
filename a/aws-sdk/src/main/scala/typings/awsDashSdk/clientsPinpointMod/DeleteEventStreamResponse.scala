package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEventStreamResponse extends js.Object {
  var EventStream: typings.awsDashSdk.clientsPinpointMod.EventStream = js.native
}

object DeleteEventStreamResponse {
  @scala.inline
  def apply(EventStream: EventStream): DeleteEventStreamResponse = {
    val __obj = js.Dynamic.literal(EventStream = EventStream.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteEventStreamResponse]
  }
}

