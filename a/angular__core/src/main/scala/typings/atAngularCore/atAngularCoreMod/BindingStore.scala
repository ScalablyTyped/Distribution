package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingStore extends js.Object {
  def setValue(prop: String, value: js.Any): Unit
}

object BindingStore {
  @scala.inline
  def apply(setValue: (String, js.Any) => Unit): BindingStore = {
    val __obj = js.Dynamic.literal(setValue = js.Any.fromFunction2(setValue))
  
    __obj.asInstanceOf[BindingStore]
  }
}

