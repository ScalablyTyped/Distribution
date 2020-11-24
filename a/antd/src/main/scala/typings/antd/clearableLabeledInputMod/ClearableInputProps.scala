package typings.antd.clearableLabeledInputMod

import typings.antd.antdStrings.input
import typings.antd.antdStrings.text_
import typings.antd.configProviderSizeContextMod.SizeType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This props only for input.
  */
@js.native
trait ClearableInputProps extends BasicProps {
  
  var addonAfter: js.UndefOr[ReactNode] = js.native
  
  var addonBefore: js.UndefOr[ReactNode] = js.native
  
  var prefix: js.UndefOr[ReactNode] = js.native
  
  var size: js.UndefOr[SizeType] = js.native
  
  var suffix: js.UndefOr[ReactNode] = js.native
  
  var triggerFocus: js.UndefOr[js.Function0[Unit]] = js.native
}
object ClearableInputProps {
  
  @scala.inline
  def apply(
    bordered: Boolean,
    element: ReactElement,
    handleReset: typings.react.mod.MouseEvent[HTMLElement, MouseEvent] => Unit,
    inputType: text_ | input,
    prefixCls: String
  ): ClearableInputProps = {
    val __obj = js.Dynamic.literal(bordered = bordered.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], handleReset = js.Any.fromFunction1(handleReset), inputType = inputType.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearableInputProps]
  }
  
  @scala.inline
  implicit class ClearableInputPropsOps[Self <: ClearableInputProps] (val x: Self) extends AnyVal {
    
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
    def setAddonAfter(value: ReactNode): Self = this.set("addonAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddonAfter: Self = this.set("addonAfter", js.undefined)
    
    @scala.inline
    def setAddonBefore(value: ReactNode): Self = this.set("addonBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddonBefore: Self = this.set("addonBefore", js.undefined)
    
    @scala.inline
    def setPrefix(value: ReactNode): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setSize(value: SizeType): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSuffix(value: ReactNode): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    
    @scala.inline
    def setTriggerFocus(value: () => Unit): Self = this.set("triggerFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteTriggerFocus: Self = this.set("triggerFocus", js.undefined)
  }
}
