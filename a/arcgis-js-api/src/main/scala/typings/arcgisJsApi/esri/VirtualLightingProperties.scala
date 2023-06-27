package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualLightingProperties
  extends StObject
     with websceneVirtualLightingProperties {
  
  /**
  		 * Indicates whether to show ambient occlusion shading.
  		 *
  		 * @default false
  		 * @deprecated since version 4.27. Ambient occlusion is automatically shown and this property has no effect.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-VirtualLighting.html#ambientOcclusionEnabled)
  		 */
  var ambientOcclusionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether [WaterSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html) display reflections of surrounding terrain, buildings and other 3D objects.
  		 *
  		 * @default false
  		 * @deprecated since version 4.27. Reflections are automatically shown and this property has no effect.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-VirtualLighting.html#waterReflectionEnabled)
  		 */
  var waterReflectionEnabled: js.UndefOr[Boolean] = js.undefined
}
object VirtualLightingProperties {
  
  inline def apply(): VirtualLightingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualLightingProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualLightingProperties] (val x: Self) extends AnyVal {
    
    inline def setAmbientOcclusionEnabled(value: Boolean): Self = StObject.set(x, "ambientOcclusionEnabled", value.asInstanceOf[js.Any])
    
    inline def setAmbientOcclusionEnabledUndefined: Self = StObject.set(x, "ambientOcclusionEnabled", js.undefined)
    
    inline def setWaterReflectionEnabled(value: Boolean): Self = StObject.set(x, "waterReflectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setWaterReflectionEnabledUndefined: Self = StObject.set(x, "waterReflectionEnabled", js.undefined)
  }
}
