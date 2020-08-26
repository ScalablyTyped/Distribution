package typings.antdMobile.viewMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewProps[T]
  extends AllHTMLAttributes[T]
     with ClassAttributes[T] {
  var Component: js.UndefOr[String] = js.native
}

object ViewProps {
  @scala.inline
  def apply[T](): ViewProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewProps[T]]
  }
  @scala.inline
  implicit class ViewPropsOps[Self <: ViewProps[_], T] (val x: Self with ViewProps[T]) extends AnyVal {
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
    def setComponent(value: String): Self = this.set("Component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("Component", js.undefined)
  }
  
}

