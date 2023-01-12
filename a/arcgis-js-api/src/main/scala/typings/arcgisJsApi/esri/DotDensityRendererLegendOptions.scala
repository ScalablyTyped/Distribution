package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DotDensityRendererLegendOptions extends StObject {
  
  /**
    * Indicates the unit of the data being visualized.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#legendOptions)
    */
  var unit: js.UndefOr[String] = js.undefined
}
object DotDensityRendererLegendOptions {
  
  inline def apply(): DotDensityRendererLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DotDensityRendererLegendOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DotDensityRendererLegendOptions] (val x: Self) extends AnyVal {
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
