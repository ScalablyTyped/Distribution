package typings.antdDashMobileDashRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnPress extends js.Object {
  def onPress(): Unit
}

object Anon_OnPress {
  @scala.inline
  def apply(onPress: () => Unit): Anon_OnPress = {
    val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction0(onPress))
  
    __obj.asInstanceOf[Anon_OnPress]
  }
}

