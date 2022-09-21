package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.cloudy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.CloudyWeatherProperties & {  type :'cloudy'} */
trait CloudyWeatherPropertiesty extends StObject {
  
  /**
    * Specifies the amount of cloud cover in the sky for a certain weather type.
    *
    * @default 0.5
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-CloudyWeather.html#cloudCover)
    */
  var cloudCover: js.UndefOr[Double] = js.undefined
  
  var `type`: cloudy
}
object CloudyWeatherPropertiesty {
  
  inline def apply(): CloudyWeatherPropertiesty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("cloudy")
    __obj.asInstanceOf[CloudyWeatherPropertiesty]
  }
  
  extension [Self <: CloudyWeatherPropertiesty](x: Self) {
    
    inline def setCloudCover(value: Double): Self = StObject.set(x, "cloudCover", value.asInstanceOf[js.Any])
    
    inline def setCloudCoverUndefined: Self = StObject.set(x, "cloudCover", js.undefined)
    
    inline def setType(value: cloudy): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
