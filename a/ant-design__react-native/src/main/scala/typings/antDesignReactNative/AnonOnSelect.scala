package typings.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnSelect extends js.Object {
  def onSelect(): Unit
}

object AnonOnSelect {
  @scala.inline
  def apply(onSelect: () => Unit): AnonOnSelect = {
    val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction0(onSelect))
    __obj.asInstanceOf[AnonOnSelect]
  }
}

