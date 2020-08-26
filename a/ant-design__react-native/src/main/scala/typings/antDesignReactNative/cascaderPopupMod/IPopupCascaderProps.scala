package typings.antDesignReactNative.cascaderPopupMod

import typings.antDesignReactNative.cascaderTypesMod.CascaderValue
import typings.antDesignReactNative.popupPickerTypesMod.PopupPickerProps
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPopupCascaderProps extends PopupPickerProps {
  var cascader: ReactElement = js.native
  var onChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[CascaderValue], Unit]] = js.native
}

object IPopupCascaderProps {
  @scala.inline
  def apply(cascader: ReactElement): IPopupCascaderProps = {
    val __obj = js.Dynamic.literal(cascader = cascader.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPopupCascaderProps]
  }
  @scala.inline
  implicit class IPopupCascaderPropsOps[Self <: IPopupCascaderProps] (val x: Self) extends AnyVal {
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
    def setCascader(value: ReactElement): Self = this.set("cascader", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: /* date */ js.UndefOr[CascaderValue] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
  }
  
}

