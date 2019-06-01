package typings
package amazonDashConnectDashStreamsLib.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Queue extends js.Object {
  /**
    * The name of the queue.
    */
  var name: java.lang.String
  /**
    * The queueARN of the queue.
    */
  var queueARN: java.lang.String
}

object Queue {
  @scala.inline
  def apply(name: java.lang.String, queueARN: java.lang.String): Queue = {
    val __obj = js.Dynamic.literal(name = name, queueARN = queueARN)
  
    __obj.asInstanceOf[Queue]
  }
}

