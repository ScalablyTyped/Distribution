package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dotDensityCreateRendererParamsLegendOptions extends StObject {
  
  /**
    * Indicates the unit represented by each dot in the legend.
    *
    * [Read more...](global.html#unit)
    */
  var unit: js.UndefOr[String] = js.undefined
}
object dotDensityCreateRendererParamsLegendOptions {
  
  inline def apply(): dotDensityCreateRendererParamsLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dotDensityCreateRendererParamsLegendOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dotDensityCreateRendererParamsLegendOptions] (val x: Self) extends AnyVal {
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
