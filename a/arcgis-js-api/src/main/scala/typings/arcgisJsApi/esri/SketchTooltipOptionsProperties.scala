package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchTooltipOptionsProperties extends StObject {
  
  /**
    * Whether tooltips are shown while sketching and editing.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-sketch-SketchTooltipOptions.html#enabled)
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object SketchTooltipOptionsProperties {
  
  inline def apply(): SketchTooltipOptionsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SketchTooltipOptionsProperties]
  }
  
  extension [Self <: SketchTooltipOptionsProperties](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
