package typings.atAntDashDesignReactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mode extends js.Object {
  var mode: String
  def onPress(): Unit
}

object Anon_Mode {
  @scala.inline
  def apply(mode: String, onPress: () => Unit): Anon_Mode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
  
    __obj.asInstanceOf[Anon_Mode]
  }
}

