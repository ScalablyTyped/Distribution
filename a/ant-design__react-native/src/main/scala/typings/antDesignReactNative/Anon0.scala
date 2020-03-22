package typings.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  def onPress(): Unit
}

object Anon0 {
  @scala.inline
  def apply(onPress: () => Unit): Anon0 = {
    val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction0(onPress))
  
    __obj.asInstanceOf[Anon0]
  }
}

