package typings.antDesignProLayout.anon

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlatMenuKeys extends js.Object {
  var flatMenuKeys: js.Array[String] = js.native
  var setFlatMenuKeys: Dispatch[SetStateAction[js.Array[String]]] = js.native
}

object FlatMenuKeys {
  @scala.inline
  def apply(flatMenuKeys: js.Array[String], setFlatMenuKeys: SetStateAction[js.Array[String]] => Unit): FlatMenuKeys = {
    val __obj = js.Dynamic.literal(flatMenuKeys = flatMenuKeys.asInstanceOf[js.Any], setFlatMenuKeys = js.Any.fromFunction1(setFlatMenuKeys))
    __obj.asInstanceOf[FlatMenuKeys]
  }
  @scala.inline
  implicit class FlatMenuKeysOps[Self <: FlatMenuKeys] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFlatMenuKeysVarargs(value: String*): Self = this.set("flatMenuKeys", js.Array(value :_*))
    @scala.inline
    def setFlatMenuKeys(value: js.Array[String]): Self = this.set("flatMenuKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetFlatMenuKeys(value: SetStateAction[js.Array[String]] => Unit): Self = this.set("setFlatMenuKeys", js.Any.fromFunction1(value))
  }
  
}

