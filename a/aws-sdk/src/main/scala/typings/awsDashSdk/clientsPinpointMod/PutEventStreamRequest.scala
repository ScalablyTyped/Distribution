package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutEventStreamRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  var WriteEventStream: typings.awsDashSdk.clientsPinpointMod.WriteEventStream
}

object PutEventStreamRequest {
  @scala.inline
  def apply(ApplicationId: __string, WriteEventStream: WriteEventStream): PutEventStreamRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, WriteEventStream = WriteEventStream)
  
    __obj.asInstanceOf[PutEventStreamRequest]
  }
}

