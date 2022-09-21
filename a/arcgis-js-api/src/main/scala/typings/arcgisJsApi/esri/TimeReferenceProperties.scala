package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeReferenceProperties extends StObject {
  
  /**
    * Indicates if the source time zone respects day light savings.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeReference.html#respectsDaylightSaving)
    */
  var respectsDaylightSaving: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The timezone of the source data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeReference.html#timezone)
    */
  var timezone: js.UndefOr[String] = js.undefined
}
object TimeReferenceProperties {
  
  inline def apply(): TimeReferenceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeReferenceProperties]
  }
  
  extension [Self <: TimeReferenceProperties](x: Self) {
    
    inline def setRespectsDaylightSaving(value: Boolean): Self = StObject.set(x, "respectsDaylightSaving", value.asInstanceOf[js.Any])
    
    inline def setRespectsDaylightSavingUndefined: Self = StObject.set(x, "respectsDaylightSaving", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
  }
}
