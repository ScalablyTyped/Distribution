package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.enabled
import typings.arcgisJsApi.arcgisJsApiStrings.snowy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnowyWeather
  extends StObject
     with Accessor {
  
  /**
  		 * Specifies the amount of cloud cover in the sky for a certain weather type.
  		 *
  		 * @default 0.5
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SnowyWeather.html#cloudCover)
  		 */
  var cloudCover: Double = js.native
  
  /**
  		 * Specifies the amount of falling snow.
  		 *
  		 * @default 0.5
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SnowyWeather.html#precipitation)
  		 */
  var precipitation: Double = js.native
  
  /**
  		 * Display surfaces covered with snow.
  		 *
  		 * @default "disabled"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SnowyWeather.html#snowCover)
  		 */
  var snowCover: enabled | disabled = js.native
  
  /**
  		 * The type of Weather
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SnowyWeather.html#type)
  		 */
  val `type`: snowy = js.native
}
