package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends js.Object {
  var operation: String
  var playbackId: String
}

object Operation {
  @scala.inline
  def apply(operation: String, playbackId: String): Operation = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], playbackId = playbackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
}

