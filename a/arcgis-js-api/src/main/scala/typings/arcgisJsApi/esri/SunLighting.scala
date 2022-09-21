package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SunLighting
  extends StObject
     with websceneSunLighting {
  
  /**
    * Indicates whether to show ambient occlusion shading.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SunLighting.html#ambientOcclusionEnabled)
    */
  var ambientOcclusionEnabled: Boolean = js.native
  
  /**
    * Indicates whether the date and time of the simulated sun is automatically updated to maintain the current time of day while the camera changes.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SunLighting.html#cameraTrackingEnabled)
    */
  var cameraTrackingEnabled: Boolean = js.native
  
  /**
    * Create a clone of this while partially applying the provided webscene lighting settings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SunLighting.html#cloneWithWebsceneLighting)
    */
  def cloneWithWebsceneLighting(): scala.Unit = js.native
  
  /**
    * Indicates whether [WaterSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html) display reflections of surrounding terrain, buildings and other 3D objects.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SunLighting.html#waterReflectionEnabled)
    */
  var waterReflectionEnabled: Boolean = js.native
}
