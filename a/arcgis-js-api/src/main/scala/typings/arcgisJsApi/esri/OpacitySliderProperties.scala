package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpacitySliderProperties
  extends StObject
     with SmartMappingSliderBaseProperties {
  
  /**
    * The opacity stops from the [OpacityVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html) to link to the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html#stops)
    */
  var stops: js.UndefOr[js.Array[OpacityStopProperties]] = js.undefined
  
  /**
    * Exposes various properties of the widget that can be styled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html#style)
    */
  var style: js.UndefOr[OpacitySliderStyleProperties] = js.undefined
  
  /**
    * The view model for the OpacitySlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html#viewModel)
    */
  var viewModel: js.UndefOr[OpacitySliderViewModelProperties] = js.undefined
}
object OpacitySliderProperties {
  
  @scala.inline
  def apply(): OpacitySliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpacitySliderProperties]
  }
  
  @scala.inline
  implicit class OpacitySliderPropertiesMutableBuilder[Self <: OpacitySliderProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStops(value: js.Array[OpacityStopProperties]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    @scala.inline
    def setStopsVarargs(value: OpacityStopProperties*): Self = StObject.set(x, "stops", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: OpacitySliderStyleProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setViewModel(value: OpacitySliderViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
