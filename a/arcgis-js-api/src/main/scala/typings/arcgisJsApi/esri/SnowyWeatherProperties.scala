package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnowyWeatherProperties extends StObject {
  
  /**
    * Specifies the amount of cloud cover in the sky for a certain weather type.
    *
    * @default 0.5
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SnowyWeather.html#cloudCover)
    */
  var cloudCover: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the amount of falling snow.
    *
    * @default 0.5
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SnowyWeather.html#precipitation)
    */
  var precipitation: js.UndefOr[Double] = js.undefined
  
  /**
    * Display surfaces covered with snow.
    *
    * @default "disabled"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SnowyWeather.html#snowCover)
    */
  var snowCover: js.UndefOr[enabled | disabled] = js.undefined
}
object SnowyWeatherProperties {
  
  inline def apply(): SnowyWeatherProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnowyWeatherProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnowyWeatherProperties] (val x: Self) extends AnyVal {
    
    inline def setCloudCover(value: Double): Self = StObject.set(x, "cloudCover", value.asInstanceOf[js.Any])
    
    inline def setCloudCoverUndefined: Self = StObject.set(x, "cloudCover", js.undefined)
    
    inline def setPrecipitation(value: Double): Self = StObject.set(x, "precipitation", value.asInstanceOf[js.Any])
    
    inline def setPrecipitationUndefined: Self = StObject.set(x, "precipitation", js.undefined)
    
    inline def setSnowCover(value: enabled | disabled): Self = StObject.set(x, "snowCover", value.asInstanceOf[js.Any])
    
    inline def setSnowCoverUndefined: Self = StObject.set(x, "snowCover", js.undefined)
  }
}
