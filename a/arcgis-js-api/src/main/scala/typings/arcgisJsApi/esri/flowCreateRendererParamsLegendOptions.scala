package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait flowCreateRendererParamsLegendOptions extends StObject {
  
  /**
  		 * The title used to represent the data in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-flow.html#createRenderer)
  		 */
  var title: js.UndefOr[String] = js.undefined
}
object flowCreateRendererParamsLegendOptions {
  
  inline def apply(): flowCreateRendererParamsLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[flowCreateRendererParamsLegendOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: flowCreateRendererParamsLegendOptions] (val x: Self) extends AnyVal {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
