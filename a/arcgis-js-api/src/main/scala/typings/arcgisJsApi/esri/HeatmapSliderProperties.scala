package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatmapSliderProperties
  extends StObject
     with WidgetProperties {
  
  /**
    * The colorStops of the [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html) to associate with the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider.html#stops)
    */
  var stops: js.UndefOr[js.Array[HeatmapColorStopProperties]] = js.undefined
  
  /**
    * The view model for the Heatmap widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider.html#viewModel)
    */
  var viewModel: js.UndefOr[HeatmapSliderViewModelProperties] = js.undefined
}
object HeatmapSliderProperties {
  
  inline def apply(): HeatmapSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeatmapSliderProperties]
  }
  
  extension [Self <: HeatmapSliderProperties](x: Self) {
    
    inline def setStops(value: js.Array[HeatmapColorStopProperties]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    inline def setStopsVarargs(value: HeatmapColorStopProperties*): Self = StObject.set(x, "stops", js.Array(value :_*))
    
    inline def setViewModel(value: HeatmapSliderViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
