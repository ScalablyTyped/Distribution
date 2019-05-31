package typings
package awsDashSdkLib.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timer extends js.Object {
  /**
    * The name of the timer.
    */
  var name: TimerName
  /**
    * The number of seconds which have elapsed on the timer.
    */
  var timestamp: Timestamp
}

object Timer {
  @scala.inline
  def apply(name: TimerName, timestamp: Timestamp): Timer = {
    val __obj = js.Dynamic.literal(name = name, timestamp = timestamp)
  
    __obj.asInstanceOf[Timer]
  }
}

