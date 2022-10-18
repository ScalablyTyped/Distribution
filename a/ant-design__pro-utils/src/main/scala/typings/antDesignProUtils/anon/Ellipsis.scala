package typings.antDesignProUtils.anon

import typings.antd.libFormFormItemLabelMod.LabelTooltipType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ellipsis extends StObject {
  
  var ellipsis: js.UndefOr[Boolean | ShowTitle] = js.undefined
  
  var label: ReactNode
  
  var subTitle: js.UndefOr[ReactNode] = js.undefined
  
  var tooltip: js.UndefOr[String | LabelTooltipType] = js.undefined
}
object Ellipsis {
  
  inline def apply(): Ellipsis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ellipsis]
  }
  
  extension [Self <: Ellipsis](x: Self) {
    
    inline def setEllipsis(value: Boolean | ShowTitle): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    
    inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSubTitle(value: ReactNode): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
    
    inline def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
    
    inline def setTooltip(value: String | LabelTooltipType): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
