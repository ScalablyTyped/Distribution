package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualLighting
  extends StObject
     with websceneVirtualLighting {
  
  /**
    * Indicates whether to show ambient occlusion shading.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-VirtualLighting.html#ambientOcclusionEnabled)
    */
  var ambientOcclusionEnabled: Boolean = js.native
  
  /**
    * Create a clone of this while partially applying the provided webscene lighting settings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-VirtualLighting.html#cloneWithWebsceneLighting)
    */
  def cloneWithWebsceneLighting(): scala.Unit = js.native
  
  /**
    * Indicates whether [WaterSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html) display reflections of surrounding terrain, buildings and other 3D objects.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-VirtualLighting.html#waterReflectionEnabled)
    */
  var waterReflectionEnabled: Boolean = js.native
}
