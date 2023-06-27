package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeSliderViewModel
  extends StObject
     with SmartMappingPrimaryHandleSliderViewModel {
  
  /**
  		 * This property is typically used in diverging, or `above-and-below` renderer configurations.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider-SizeSliderViewModel.html#persistSizeRangeEnabled)
  		 */
  var persistSizeRangeEnabled: Boolean = js.native
  
  /**
  		 * The size stops from the [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) to link to the slider.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider-SizeSliderViewModel.html#stops)
  		 */
  var stops: js.Array[SizeStop] = js.native
}
