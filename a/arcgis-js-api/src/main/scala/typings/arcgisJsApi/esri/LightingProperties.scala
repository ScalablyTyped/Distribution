package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LightingProperties extends StObject {
  
  /**
    * The time and date for which the sun position and light direction is computed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Lighting.html#date)
    */
  var date: js.UndefOr[DateProperties] = js.undefined
  
  /**
    * Indicates whether to show shadows cast by the sun.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Lighting.html#directShadowsEnabled)
    */
  var directShadowsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The UTC time zone offset in hours that should be displayed in the UI to represent the date.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Lighting.html#displayUTCOffset)
    */
  var displayUTCOffset: js.UndefOr[Double] = js.undefined
}
object LightingProperties {
  
  inline def apply(): LightingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LightingProperties]
  }
  
  extension [Self <: LightingProperties](x: Self) {
    
    inline def setDate(value: DateProperties): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDirectShadowsEnabled(value: Boolean): Self = StObject.set(x, "directShadowsEnabled", value.asInstanceOf[js.Any])
    
    inline def setDirectShadowsEnabledUndefined: Self = StObject.set(x, "directShadowsEnabled", js.undefined)
    
    inline def setDisplayUTCOffset(value: Double): Self = StObject.set(x, "displayUTCOffset", value.asInstanceOf[js.Any])
    
    inline def setDisplayUTCOffsetUndefined: Self = StObject.set(x, "displayUTCOffset", js.undefined)
  }
}
