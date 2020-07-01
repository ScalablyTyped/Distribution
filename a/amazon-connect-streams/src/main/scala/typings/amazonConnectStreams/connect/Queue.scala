package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Queue extends js.Object {
  /** The name of the queue. */
  val name: String
  /** The ARN of the queue. */
  val queueARN: String
  /** Alias for `queueARN`. */
  val queueId: String
}

object Queue {
  @scala.inline
  def apply(name: String, queueARN: String, queueId: String): Queue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], queueARN = queueARN.asInstanceOf[js.Any], queueId = queueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Queue]
  }
}

