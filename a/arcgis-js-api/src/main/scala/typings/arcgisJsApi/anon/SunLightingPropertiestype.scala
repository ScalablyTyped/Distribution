package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.sun
import typings.arcgisJsApi.esri.DateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.SunLightingProperties & {  type :'sun' | undefined} */
trait SunLightingPropertiestype extends StObject {
  
  /**
    * Indicates whether to show ambient occlusion shading.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SunLighting.html#ambientOcclusionEnabled)
    */
  var ambientOcclusionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the date and time of the simulated sun is automatically updated to maintain the current time of day while the camera changes.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SunLighting.html#cameraTrackingEnabled)
    */
  var cameraTrackingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The current date and time of the simulated sun.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-SunLighting.html#date)
    */
  var date: js.UndefOr[DateProperties] = js.undefined
  
  /**
    * Indicates whether to show shadows cast by the sun.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-SunLighting.html#directShadowsEnabled)
    */
  var directShadowsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The UTC time zone offset in hours that should be displayed in the UI to represent the date.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-SunLighting.html#displayUTCOffset)
    */
  var displayUTCOffset: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[sun] = js.undefined
  
  /**
    * Indicates whether [WaterSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html) display reflections of surrounding terrain, buildings and other 3D objects.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SunLighting.html#waterReflectionEnabled)
    */
  var waterReflectionEnabled: js.UndefOr[Boolean] = js.undefined
}
object SunLightingPropertiestype {
  
  inline def apply(): SunLightingPropertiestype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SunLightingPropertiestype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SunLightingPropertiestype] (val x: Self) extends AnyVal {
    
    inline def setAmbientOcclusionEnabled(value: Boolean): Self = StObject.set(x, "ambientOcclusionEnabled", value.asInstanceOf[js.Any])
    
    inline def setAmbientOcclusionEnabledUndefined: Self = StObject.set(x, "ambientOcclusionEnabled", js.undefined)
    
    inline def setCameraTrackingEnabled(value: Boolean): Self = StObject.set(x, "cameraTrackingEnabled", value.asInstanceOf[js.Any])
    
    inline def setCameraTrackingEnabledUndefined: Self = StObject.set(x, "cameraTrackingEnabled", js.undefined)
    
    inline def setDate(value: DateProperties): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDirectShadowsEnabled(value: Boolean): Self = StObject.set(x, "directShadowsEnabled", value.asInstanceOf[js.Any])
    
    inline def setDirectShadowsEnabledUndefined: Self = StObject.set(x, "directShadowsEnabled", js.undefined)
    
    inline def setDisplayUTCOffset(value: Double): Self = StObject.set(x, "displayUTCOffset", value.asInstanceOf[js.Any])
    
    inline def setDisplayUTCOffsetUndefined: Self = StObject.set(x, "displayUTCOffset", js.undefined)
    
    inline def setType(value: sun): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWaterReflectionEnabled(value: Boolean): Self = StObject.set(x, "waterReflectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setWaterReflectionEnabledUndefined: Self = StObject.set(x, "waterReflectionEnabled", js.undefined)
  }
}
