package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeatmapSliderProperties extends WidgetProperties {
  
  /**
    * The colorStops of the [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html) to associate with the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider.html#stops)
    */
  var stops: js.UndefOr[js.Array[HeatmapColorStopProperties]] = js.native
  
  /**
    * The view model for the Heatmap widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider.html#viewModel)
    */
  var viewModel: js.UndefOr[HeatmapSliderViewModelProperties] = js.native
}
object HeatmapSliderProperties {
  
  @scala.inline
  def apply(): HeatmapSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeatmapSliderProperties]
  }
  
  @scala.inline
  implicit class HeatmapSliderPropertiesMutableBuilder[Self <: HeatmapSliderProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStops(value: js.Array[HeatmapColorStopProperties]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    @scala.inline
    def setStopsVarargs(value: HeatmapColorStopProperties*): Self = StObject.set(x, "stops", js.Array(value :_*))
    
    @scala.inline
    def setViewModel(value: HeatmapSliderViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
