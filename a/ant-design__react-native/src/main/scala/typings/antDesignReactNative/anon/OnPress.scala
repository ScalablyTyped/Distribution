package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPress extends js.Object {
  var mode: String
  def onPress(): Unit
}

object OnPress {
  @scala.inline
  def apply(mode: String, onPress: () => Unit): OnPress = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[OnPress]
  }
}

