package typings.antDesignPro.tagSelectOptionMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagSelectOptionProps extends js.Object {
  var checked: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[js.Function2[/* value */ String | Double, /* state */ Boolean, Unit]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var value: js.UndefOr[String | Double] = js.native
}

object TagSelectOptionProps {
  @scala.inline
  def apply(): TagSelectOptionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagSelectOptionProps]
  }
  @scala.inline
  implicit class TagSelectOptionPropsOps[Self <: TagSelectOptionProps] (val x: Self) extends AnyVal {
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setOnChange(value: (/* value */ String | Double, /* state */ Boolean) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

