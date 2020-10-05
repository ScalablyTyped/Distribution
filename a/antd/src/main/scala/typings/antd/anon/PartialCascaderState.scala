package typings.antd.anon

import typings.antd.cascaderMod.CascaderOptionType
import typings.antd.cascaderMod.CascaderProps
import typings.antd.cascaderMod.CascaderValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd.antd/lib/cascader.CascaderState> */
@js.native
trait PartialCascaderState extends js.Object {
  var flattenOptions: js.UndefOr[js.Array[js.Array[CascaderOptionType]]] = js.native
  var inputFocused: js.UndefOr[Boolean] = js.native
  var inputValue: js.UndefOr[String] = js.native
  var popupVisible: js.UndefOr[Boolean] = js.native
  var prevProps: js.UndefOr[CascaderProps] = js.native
  var value: js.UndefOr[CascaderValueType] = js.native
}

object PartialCascaderState {
  @scala.inline
  def apply(): PartialCascaderState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCascaderState]
  }
  @scala.inline
  implicit class PartialCascaderStateOps[Self <: PartialCascaderState] (val x: Self) extends AnyVal {
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
    def setFlattenOptionsVarargs(value: js.Array[CascaderOptionType]*): Self = this.set("flattenOptions", js.Array(value :_*))
    @scala.inline
    def setFlattenOptions(value: js.Array[js.Array[CascaderOptionType]]): Self = this.set("flattenOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlattenOptions: Self = this.set("flattenOptions", js.undefined)
    @scala.inline
    def setInputFocused(value: Boolean): Self = this.set("inputFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputFocused: Self = this.set("inputFocused", js.undefined)
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputValue: Self = this.set("inputValue", js.undefined)
    @scala.inline
    def setPopupVisible(value: Boolean): Self = this.set("popupVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupVisible: Self = this.set("popupVisible", js.undefined)
    @scala.inline
    def setPrevProps(value: CascaderProps): Self = this.set("prevProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevProps: Self = this.set("prevProps", js.undefined)
    @scala.inline
    def setValueVarargs(value: (String | Double)*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: CascaderValueType): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

