package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatmapSliderViewModelProperties
  extends StObject
     with SmartMappingSliderViewModelProperties {
  
  /**
    * The colorStops of the [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html) to associate with the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider-HeatmapSliderViewModel.html#stops)
    */
  var stops: js.UndefOr[js.Array[HeatmapColorStopProperties]] = js.undefined
}
object HeatmapSliderViewModelProperties {
  
  @scala.inline
  def apply(): HeatmapSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeatmapSliderViewModelProperties]
  }
  
  @scala.inline
  implicit class HeatmapSliderViewModelPropertiesMutableBuilder[Self <: HeatmapSliderViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStops(value: js.Array[HeatmapColorStopProperties]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    @scala.inline
    def setStopsVarargs(value: HeatmapColorStopProperties*): Self = StObject.set(x, "stops", js.Array(value :_*))
  }
}
