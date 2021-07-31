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
  
  @scala.inline
  def apply(): MiniTooltipConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("mini")
    __obj.asInstanceOf[MiniTooltipConfig]
  }
  
  @scala.inline
  implicit class MiniTooltipConfigMutableBuilder[Self <: MiniTooltipConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoardStyle(value: background): Self = StObject.set(x, "boardStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoardStyleUndefined: Self = StObject.set(x, "boardStyle", js.undefined)
    
    @scala.inline
    def setTriangleHeight(value: Double): Self = StObject.set(x, "triangleHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriangleHeightUndefined: Self = StObject.set(x, "triangleHeight", js.undefined)
    
    @scala.inline
    def setTriangleWidth(value: Double): Self = StObject.set(x, "triangleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriangleWidthUndefined: Self = StObject.set(x, "triangleWidth", js.undefined)
    
    @scala.inline
    def setType(value: mini): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueStyle(value: text): Self = StObject.set(x, "valueStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueStyleUndefined: Self = StObject.set(x, "valueStyle", js.undefined)
  }
}
