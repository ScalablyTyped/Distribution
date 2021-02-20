package typings.antd.anon

import typings.antd.formItemLabelMod.LabelTooltipType
import typings.antd.gridColMod.ColProps
import typings.antd.interfaceMod.FormLabelAlign
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined antd.antd/lib/form/FormItemLabel.FormItemLabelProps & {  required :boolean | undefined,   prefixCls :string} */
@js.native
trait FormItemLabelPropsrequire extends StObject {
  
  var colon: js.UndefOr[Boolean] = js.native
  
  var htmlFor: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[ReactNode] = js.native
  
  var labelAlign: js.UndefOr[FormLabelAlign] = js.native
  
  var labelCol: js.UndefOr[ColProps] = js.native
  
  var prefixCls: String = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var requiredMark: js.UndefOr[typings.antd.formFormMod.RequiredMark] = js.native
  
  var tooltip: js.UndefOr[LabelTooltipType] = js.native
}
object FormItemLabelPropsrequire {
  
  @scala.inline
  def apply(prefixCls: String): FormItemLabelPropsrequire = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormItemLabelPropsrequire]
  }
  
  @scala.inline
  implicit class FormItemLabelPropsrequireMutableBuilder[Self <: FormItemLabelPropsrequire] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColon(value: Boolean): Self = StObject.set(x, "colon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColonUndefined: Self = StObject.set(x, "colon", js.undefined)
    
    @scala.inline
    def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
    
    @scala.inline
    def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelAlign(value: FormLabelAlign): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
    
    @scala.inline
    def setLabelCol(value: ColProps): Self = StObject.set(x, "labelCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelColUndefined: Self = StObject.set(x, "labelCol", js.undefined)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredMark(value: typings.antd.formFormMod.RequiredMark): Self = StObject.set(x, "requiredMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredMarkUndefined: Self = StObject.set(x, "requiredMark", js.undefined)
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setTooltip(value: LabelTooltipType): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
