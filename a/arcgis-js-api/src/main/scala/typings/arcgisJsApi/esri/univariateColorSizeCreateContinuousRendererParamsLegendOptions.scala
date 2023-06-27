package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait univariateColorSizeCreateContinuousRendererParamsLegendOptions extends StObject {
  
  /**
  		 * Indicates if the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget should display content describing the generated renderer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
  		 */
  var showLegend: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The title used to represent the renderer generated from this method in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
  		 */
  var title: js.UndefOr[String] = js.undefined
}
object univariateColorSizeCreateContinuousRendererParamsLegendOptions {
  
  inline def apply(): univariateColorSizeCreateContinuousRendererParamsLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[univariateColorSizeCreateContinuousRendererParamsLegendOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: univariateColorSizeCreateContinuousRendererParamsLegendOptions] (val x: Self) extends AnyVal {
    
    inline def setShowLegend(value: Boolean): Self = StObject.set(x, "showLegend", value.asInstanceOf[js.Any])
    
    inline def setShowLegendUndefined: Self = StObject.set(x, "showLegend", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
