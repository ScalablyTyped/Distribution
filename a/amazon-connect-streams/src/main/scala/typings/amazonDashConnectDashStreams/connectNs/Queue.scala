package typings.amazonDashConnectDashStreams.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Queue extends js.Object {
  /**
    * The name of the queue.
    */
  var name: String
  /**
    * The queueARN of the queue.
    */
  var queueARN: String
}

object Queue {
  @scala.inline
  def apply(name: String, queueARN: String): Queue = {
    val __obj = js.Dynamic.literal(name = name, queueARN = queueARN)
  
    __obj.asInstanceOf[Queue]
  }
}

