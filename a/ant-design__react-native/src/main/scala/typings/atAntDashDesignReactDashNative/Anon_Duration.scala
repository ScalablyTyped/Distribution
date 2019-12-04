package typings.atAntDashDesignReactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  var duration: Double
  var mask: Boolean
  def onClose(): Unit
}

object Anon_Duration {
  @scala.inline
  def apply(duration: Double, mask: Boolean, onClose: () => Unit): Anon_Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose))
  
    __obj.asInstanceOf[Anon_Duration]
  }
}

