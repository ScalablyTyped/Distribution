package typings.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnPress extends js.Object {
  var mode: String
  def onPress(): Unit
}

object AnonOnPress {
  @scala.inline
  def apply(mode: String, onPress: () => Unit): AnonOnPress = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
  
    __obj.asInstanceOf[AnonOnPress]
  }
}

