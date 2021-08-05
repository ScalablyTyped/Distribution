package typings.antvG2.mod

import typings.antvG2.antvG2Strings.mini
import typings.antvG2.mod.Styles.background
import typings.antvG2.mod.Styles.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MiniTooltipConfig
  extends StObject
     with CommonTooltipConfig
     with TooltipConfig {
  
  var boardStyle: js.UndefOr[background] = js.undefined
  
  var triangleHeight: js.UndefOr[Double] = js.undefined
  
  var triangleWidth: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_MiniTooltipConfig: mini
  
  var valueStyle: js.UndefOr[text] = js.undefined
}
object MiniTooltipConfig {
  
  inline def apply(): MiniTooltipConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("mini")
    __obj.asInstanceOf[MiniTooltipConfig]
  }
  
  extension [Self <: MiniTooltipConfig](x: Self) {
    
    inline def setBoardStyle(value: background): Self = StObject.set(x, "boardStyle", value.asInstanceOf[js.Any])
    
    inline def setBoardStyleUndefined: Self = StObject.set(x, "boardStyle", js.undefined)
    
    inline def setTriangleHeight(value: Double): Self = StObject.set(x, "triangleHeight", value.asInstanceOf[js.Any])
    
    inline def setTriangleHeightUndefined: Self = StObject.set(x, "triangleHeight", js.undefined)
    
    inline def setTriangleWidth(value: Double): Self = StObject.set(x, "triangleWidth", value.asInstanceOf[js.Any])
    
    inline def setTriangleWidthUndefined: Self = StObject.set(x, "triangleWidth", js.undefined)
    
    inline def setType(value: mini): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValueStyle(value: text): Self = StObject.set(x, "valueStyle", value.asInstanceOf[js.Any])
    
    inline def setValueStyleUndefined: Self = StObject.set(x, "valueStyle", js.undefined)
  }
}
