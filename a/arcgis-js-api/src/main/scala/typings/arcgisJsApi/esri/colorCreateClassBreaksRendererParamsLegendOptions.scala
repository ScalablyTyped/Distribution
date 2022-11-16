package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait colorCreateClassBreaksRendererParamsLegendOptions extends StObject {
  
  /**
    * The title used to represent the given field or expression in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    */
  var title: js.UndefOr[String] = js.undefined
}
object colorCreateClassBreaksRendererParamsLegendOptions {
  
  inline def apply(): colorCreateClassBreaksRendererParamsLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[colorCreateClassBreaksRendererParamsLegendOptions]
  }
  
  extension [Self <: colorCreateClassBreaksRendererParamsLegendOptions](x: Self) {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
