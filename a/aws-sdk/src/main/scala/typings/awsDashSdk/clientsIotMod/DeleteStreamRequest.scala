package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteStreamRequest extends js.Object {
  /**
    * The stream ID.
    */
  var streamId: StreamId
}

object DeleteStreamRequest {
  @scala.inline
  def apply(streamId: StreamId): DeleteStreamRequest = {
    val __obj = js.Dynamic.literal(streamId = streamId)
  
    __obj.asInstanceOf[DeleteStreamRequest]
  }
}

