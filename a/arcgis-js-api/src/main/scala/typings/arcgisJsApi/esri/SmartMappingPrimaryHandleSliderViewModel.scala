package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartMappingPrimaryHandleSliderViewModel
  extends StObject
     with SmartMappingSliderViewModel {
  
  /**
  		 * Only applicable when three thumbs (i.e.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingPrimaryHandleSliderViewModel.html#handlesSyncedToPrimary)
  		 */
  var handlesSyncedToPrimary: Boolean = js.native
  
  /**
  		 * When `true`, the slider will render a third handle between the two handles already provided by default.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingPrimaryHandleSliderViewModel.html#primaryHandleEnabled)
  		 */
  var primaryHandleEnabled: Boolean = js.native
}
