package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutEventStreamRequest extends js.Object {
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: __string
  var WriteEventStream: awsDashSdkLib.clientsPinpointMod.WriteEventStream
}

object PutEventStreamRequest {
  @scala.inline
  def apply(ApplicationId: __string, WriteEventStream: WriteEventStream): PutEventStreamRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, WriteEventStream = WriteEventStream)
  
    __obj.asInstanceOf[PutEventStreamRequest]
  }
}

