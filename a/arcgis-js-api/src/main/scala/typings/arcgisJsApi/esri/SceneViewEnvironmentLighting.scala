package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import typings.std.Date
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewEnvironmentLighting
  extends StObject
     with AnonymousAccessor {
  
  /**
    * Indicates whether to show ambient occlusion shading.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var ambientOcclusionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the date and time of the simulated sun is automatically updated to maintain the current time of day while the camera changes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var cameraTrackingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The current date and time of the simulated sun.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var date: js.UndefOr[Date] = js.undefined
  
  /**
    * Indicates whether to show shadows cast by the sun.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var directShadowsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether polygons that use [WaterSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html) display reflections of surrounding terrain, buildings and other 3D objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var waterReflectionEnabled: js.UndefOr[Boolean] = js.undefined
}
object SceneViewEnvironmentLighting {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    set: (js.UndefOr[
      js.Function2[/* propertyName */ String, /* value */ js.Any, SceneViewEnvironmentLighting]
    ]) & (js.UndefOr[js.Function1[/* props */ HashMap[js.Any], SceneViewEnvironmentLighting]])
  ): SceneViewEnvironmentLighting = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewEnvironmentLighting]
  }
  
  extension [Self <: SceneViewEnvironmentLighting](x: Self) {
    
    inline def setAmbientOcclusionEnabled(value: Boolean): Self = StObject.set(x, "ambientOcclusionEnabled", value.asInstanceOf[js.Any])
    
    inline def setAmbientOcclusionEnabledUndefined: Self = StObject.set(x, "ambientOcclusionEnabled", js.undefined)
    
    inline def setCameraTrackingEnabled(value: Boolean): Self = StObject.set(x, "cameraTrackingEnabled", value.asInstanceOf[js.Any])
    
    inline def setCameraTrackingEnabledUndefined: Self = StObject.set(x, "cameraTrackingEnabled", js.undefined)
    
    inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDirectShadowsEnabled(value: Boolean): Self = StObject.set(x, "directShadowsEnabled", value.asInstanceOf[js.Any])
    
    inline def setDirectShadowsEnabledUndefined: Self = StObject.set(x, "directShadowsEnabled", js.undefined)
    
    inline def setWaterReflectionEnabled(value: Boolean): Self = StObject.set(x, "waterReflectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setWaterReflectionEnabledUndefined: Self = StObject.set(x, "waterReflectionEnabled", js.undefined)
  }
}
