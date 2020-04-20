package typings.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDuration extends js.Object {
  var duration: Double
  var mask: Boolean
  def onClose(): Unit
}

object AnonDuration {
  @scala.inline
  def apply(duration: Double, mask: Boolean, onClose: () => Unit): AnonDuration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose))
    __obj.asInstanceOf[AnonDuration]
  }
}

