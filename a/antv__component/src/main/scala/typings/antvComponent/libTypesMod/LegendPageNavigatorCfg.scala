package typings.antvComponent.libTypesMod

import typings.antvComponent.anon.`2`
import typings.antvComponent.anon.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendPageNavigatorCfg extends StObject {
  
  var marker: js.UndefOr[`2`] = js.undefined
  
  var text: js.UndefOr[`4`] = js.undefined
}
object LegendPageNavigatorCfg {
  
  inline def apply(): LegendPageNavigatorCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendPageNavigatorCfg]
  }
  
  extension [Self <: LegendPageNavigatorCfg](x: Self) {
    
    inline def setMarker(value: `2`): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setText(value: `4`): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
