package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPress extends js.Object {
  def onPress(): Unit
}

object OnPress {
  @scala.inline
  def apply(onPress: () => Unit): OnPress = {
    val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[OnPress]
  }
}

