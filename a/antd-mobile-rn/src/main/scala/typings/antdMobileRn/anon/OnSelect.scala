package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSelect extends js.Object {
  def onSelect(): Unit
}

object OnSelect {
  @scala.inline
  def apply(onSelect: () => Unit): OnSelect = {
    val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction0(onSelect))
    __obj.asInstanceOf[OnSelect]
  }
}

