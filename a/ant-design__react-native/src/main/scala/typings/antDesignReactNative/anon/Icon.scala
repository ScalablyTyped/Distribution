package typings.antDesignReactNative.anon

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Icon extends js.Object {
  var icon: Element = js.native
  var text: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 420 */ js.Any = js.native
}

object Icon {
  @scala.inline
  def apply(
    icon: Element,
    text: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 420 */ js.Any
  ): Icon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  @scala.inline
  implicit class IconOps[Self <: Icon] (val x: Self) extends AnyVal {
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
    def setIcon(value: Element): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 420 */ js.Any): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

