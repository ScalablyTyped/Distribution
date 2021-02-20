package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeSliderViewModelProperties extends SmartMappingSliderViewModelProperties {
  
  /**
    * The size stops from the [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) to link to the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider-SizeSliderViewModel.html#stops)
    */
  var stops: js.UndefOr[js.Array[SizeStopProperties]] = js.native
}
object SizeSliderViewModelProperties {
  
  @scala.inline
  def apply(): SizeSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeSliderViewModelProperties]
  }
  
  @scala.inline
  implicit class SizeSliderViewModelPropertiesMutableBuilder[Self <: SizeSliderViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStops(value: js.Array[SizeStopProperties]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    @scala.inline
    def setStopsVarargs(value: SizeStopProperties*): Self = StObject.set(x, "stops", js.Array(value :_*))
  }
}
