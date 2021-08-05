package typings.antvG2.mod

import typings.antvG2.antvG2Booleans.`false`
import typings.antvG2.antvG2Strings.default
import typings.antvG2.mod.Styles.background
import typings.antvG2.mod.Styles.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasTooltipConfig
  extends StObject
     with CommonTooltipConfig
     with TooltipConfig {
  
  var boardStyle: js.UndefOr[background] = js.undefined
  
  var itemGap: js.UndefOr[Double] = js.undefined
  
  var nameStyle: js.UndefOr[text] = js.undefined
  
  var titleStyle: js.UndefOr[text] = js.undefined
  
  @JSName("type")
  var type_CanvasTooltipConfig: js.UndefOr[default] = js.undefined
  
  @JSName("useHtml")
  var useHtml_CanvasTooltipConfig: `false`
  
  var valueStyle: js.UndefOr[text] = js.undefined
}
object CanvasTooltipConfig {
  
  inline def apply(): CanvasTooltipConfig = {
    val __obj = js.Dynamic.literal(useHtml = false)
    __obj.asInstanceOf[CanvasTooltipConfig]
  }
  
  extension [Self <: CanvasTooltipConfig](x: Self) {
    
    inline def setBoardStyle(value: background): Self = StObject.set(x, "boardStyle", value.asInstanceOf[js.Any])
    
    inline def setBoardStyleUndefined: Self = StObject.set(x, "boardStyle", js.undefined)
    
    inline def setItemGap(value: Double): Self = StObject.set(x, "itemGap", value.asInstanceOf[js.Any])
    
    inline def setItemGapUndefined: Self = StObject.set(x, "itemGap", js.undefined)
    
    inline def setNameStyle(value: text): Self = StObject.set(x, "nameStyle", value.asInstanceOf[js.Any])
    
    inline def setNameStyleUndefined: Self = StObject.set(x, "nameStyle", js.undefined)
    
    inline def setTitleStyle(value: text): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    inline def setType(value: default): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUseHtml(value: `false`): Self = StObject.set(x, "useHtml", value.asInstanceOf[js.Any])
    
    inline def setValueStyle(value: text): Self = StObject.set(x, "valueStyle", value.asInstanceOf[js.Any])
    
    inline def setValueStyleUndefined: Self = StObject.set(x, "valueStyle", js.undefined)
  }
}
