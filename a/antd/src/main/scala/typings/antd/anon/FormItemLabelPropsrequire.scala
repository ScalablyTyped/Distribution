package typings.antd.anon

import typings.antd.formInterfaceMod.FormLabelAlign
import typings.antd.formItemLabelMod.LabelTooltipType
import typings.antd.gridColMod.ColProps
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined antd.antd/lib/form/FormItemLabel.FormItemLabelProps & {  required :boolean | undefined,   prefixCls :string} */
trait FormItemLabelPropsrequire extends StObject {
  
  var colon: js.UndefOr[Boolean] = js.undefined
  
  var htmlFor: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[ReactNode] = js.undefined
  
  var labelAlign: js.UndefOr[FormLabelAlign] = js.undefined
  
  var labelCol: js.UndefOr[ColProps] = js.undefined
  
  var prefixCls: String
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var requiredMark: js.UndefOr[typings.antd.formFormMod.RequiredMark] = js.undefined
  
  var tooltip: js.UndefOr[LabelTooltipType] = js.undefined
}
object FormItemLabelPropsrequire {
  
  inline def apply(prefixCls: String): FormItemLabelPropsrequire = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormItemLabelPropsrequire]
  }
  
  extension [Self <: FormItemLabelPropsrequire](x: Self) {
    
    inline def setColon(value: Boolean): Self = StObject.set(x, "colon", value.asInstanceOf[js.Any])
    
    inline def setColonUndefined: Self = StObject.set(x, "colon", js.undefined)
    
    inline def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
    
    inline def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
    
    inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelAlign(value: FormLabelAlign): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
    
    inline def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
    
    inline def setLabelCol(value: ColProps): Self = StObject.set(x, "labelCol", value.asInstanceOf[js.Any])
    
    inline def setLabelColUndefined: Self = StObject.set(x, "labelCol", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredMark(value: typings.antd.formFormMod.RequiredMark): Self = StObject.set(x, "requiredMark", value.asInstanceOf[js.Any])
    
    inline def setRequiredMarkUndefined: Self = StObject.set(x, "requiredMark", js.undefined)
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setTooltip(value: LabelTooltipType): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
