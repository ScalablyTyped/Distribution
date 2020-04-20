package typings.appBuilderLib.timerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timer extends js.Object {
  def end(): Unit
}

object Timer {
  @scala.inline
  def apply(end: () => Unit): Timer = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end))
    __obj.asInstanceOf[Timer]
  }
}

