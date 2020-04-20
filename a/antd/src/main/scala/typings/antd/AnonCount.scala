package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCount extends js.Object {
  var count: Null
  def onAnimated(): Unit
}

object AnonCount {
  @scala.inline
  def apply(count: Null, onAnimated: () => Unit): AnonCount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], onAnimated = js.Any.fromFunction0(onAnimated))
    __obj.asInstanceOf[AnonCount]
  }
}

