package typings.antd.clearableLabeledInputMod

import typings.antd.antdStrings.input
import typings.antd.antdStrings.text
import typings.react.mod.ReactElement
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This basic props required for input and textarea.
  */
@js.native
trait BasicProps extends js.Object {
  var allowClear: js.UndefOr[Boolean] = js.native
  var bordered: Boolean = js.native
  var className: js.UndefOr[String] = js.native
  var direction: js.UndefOr[js.Any] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var element: ReactElement = js.native
  var focused: js.UndefOr[Boolean] = js.native
  var inputType: text | input = js.native
  var prefixCls: String = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var value: js.UndefOr[js.Any] = js.native
  def handleReset(event: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
}

object BasicProps {
  @scala.inline
  def apply(
    bordered: Boolean,
    element: ReactElement,
    handleReset: typings.react.mod.MouseEvent[HTMLElement, MouseEvent] => Unit,
    inputType: text | input,
    prefixCls: String
  ): BasicProps = {
    val __obj = js.Dynamic.literal(bordered = bordered.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], handleReset = js.Any.fromFunction1(handleReset), inputType = inputType.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicProps]
  }
  @scala.inline
  implicit class BasicPropsOps[Self <: BasicProps] (val x: Self) extends AnyVal {
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
    def setBordered(value: Boolean): Self = this.set("bordered", value.asInstanceOf[js.Any])
    @scala.inline
    def setElement(value: ReactElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandleReset(value: typings.react.mod.MouseEvent[HTMLElement, MouseEvent] => Unit): Self = this.set("handleReset", js.Any.fromFunction1(value))
    @scala.inline
    def setInputType(value: text | input): Self = this.set("inputType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowClear(value: Boolean): Self = this.set("allowClear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowClear: Self = this.set("allowClear", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDirection(value: js.Any): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

