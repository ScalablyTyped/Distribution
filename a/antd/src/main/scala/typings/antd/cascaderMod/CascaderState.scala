package typings.antd.cascaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CascaderState extends js.Object {
  var flattenOptions: js.UndefOr[js.Array[js.Array[CascaderOptionType]]] = js.native
  var inputFocused: Boolean = js.native
  var inputValue: String = js.native
  var popupVisible: js.UndefOr[Boolean] = js.native
  var prevProps: CascaderProps = js.native
  var value: CascaderValueType = js.native
}

object CascaderState {
  @scala.inline
  def apply(inputFocused: Boolean, inputValue: String, prevProps: CascaderProps, value: CascaderValueType): CascaderState = {
    val __obj = js.Dynamic.literal(inputFocused = inputFocused.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], prevProps = prevProps.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascaderState]
  }
  @scala.inline
  implicit class CascaderStateOps[Self <: CascaderState] (val x: Self) extends AnyVal {
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
    def setInputFocused(value: Boolean): Self = this.set("inputFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevProps(value: CascaderProps): Self = this.set("prevProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueVarargs(value: (String | Double)*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: CascaderValueType): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlattenOptionsVarargs(value: js.Array[CascaderOptionType]*): Self = this.set("flattenOptions", js.Array(value :_*))
    @scala.inline
    def setFlattenOptions(value: js.Array[js.Array[CascaderOptionType]]): Self = this.set("flattenOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlattenOptions: Self = this.set("flattenOptions", js.undefined)
    @scala.inline
    def setPopupVisible(value: Boolean): Self = this.set("popupVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupVisible: Self = this.set("popupVisible", js.undefined)
  }
  
}

