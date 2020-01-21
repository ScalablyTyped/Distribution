package typings.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnPress extends js.Object {
  def onPress(): Unit
}

object AnonOnPress {
  @scala.inline
  def apply(onPress: () => Unit): AnonOnPress = {
    val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction0(onPress))
  
    __obj.asInstanceOf[AnonOnPress]
  }
}

