package typings.antd.formItemLabelMod

import typings.antd.formFormMod.RequiredMark
import typings.antd.gridColMod.ColProps
import typings.antd.interfaceMod.FormLabelAlign
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormItemLabelProps extends js.Object {
  
  var colon: js.UndefOr[Boolean] = js.native
  
  var htmlFor: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[ReactNode] = js.native
  
  var labelAlign: js.UndefOr[FormLabelAlign] = js.native
  
  var labelCol: js.UndefOr[ColProps] = js.native
  
  var requiredMark: js.UndefOr[RequiredMark] = js.native
  
  var tooltip: js.UndefOr[LabelTooltipType] = js.native
}
object FormItemLabelProps {
  
  @scala.inline
  def apply(): FormItemLabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormItemLabelProps]
  }
  
  @scala.inline
  implicit class FormItemLabelPropsOps[Self <: FormItemLabelProps] (val x: Self) extends AnyVal {
    
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
    def setColon(value: Boolean): Self = this.set("colon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColon: Self = this.set("colon", js.undefined)
    
    @scala.inline
    def setHtmlFor(value: String): Self = this.set("htmlFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlFor: Self = this.set("htmlFor", js.undefined)
    
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelAlign(value: FormLabelAlign): Self = this.set("labelAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelAlign: Self = this.set("labelAlign", js.undefined)
    
    @scala.inline
    def setLabelCol(value: ColProps): Self = this.set("labelCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelCol: Self = this.set("labelCol", js.undefined)
    
    @scala.inline
    def setRequiredMark(value: RequiredMark): Self = this.set("requiredMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredMark: Self = this.set("requiredMark", js.undefined)
    
    @scala.inline
    def setTooltip(value: LabelTooltipType): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
}
