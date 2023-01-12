package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SunLightingProperties
  extends StObject
     with websceneSunLightingProperties {
  
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
    * Indicates whether [WaterSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html) display reflections of surrounding terrain, buildings and other 3D objects.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SunLighting.html#waterReflectionEnabled)
    */
  var waterReflectionEnabled: js.UndefOr[Boolean] = js.undefined
}
object SunLightingProperties {
  
  inline def apply(): SunLightingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SunLightingProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SunLightingProperties] (val x: Self) extends AnyVal {
    
    inline def setAmbientOcclusionEnabled(value: Boolean): Self = StObject.set(x, "ambientOcclusionEnabled", value.asInstanceOf[js.Any])
    
    inline def setAmbientOcclusionEnabledUndefined: Self = StObject.set(x, "ambientOcclusionEnabled", js.undefined)
    
    inline def setCameraTrackingEnabled(value: Boolean): Self = StObject.set(x, "cameraTrackingEnabled", value.asInstanceOf[js.Any])
    
    inline def setCameraTrackingEnabledUndefined: Self = StObject.set(x, "cameraTrackingEnabled", js.undefined)
    
    inline def setWaterReflectionEnabled(value: Boolean): Self = StObject.set(x, "waterReflectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setWaterReflectionEnabledUndefined: Self = StObject.set(x, "waterReflectionEnabled", js.undefined)
  }
}
