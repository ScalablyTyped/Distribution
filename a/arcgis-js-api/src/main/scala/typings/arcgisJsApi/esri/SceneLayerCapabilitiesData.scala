package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneLayerCapabilitiesData extends StObject {
  
  /**
  		 * Indicates if the features in the layer support z-values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#capabilities)
  		 */
  var supportsZ: Boolean
}
object SceneLayerCapabilitiesData {
  
  inline def apply(supportsZ: Boolean): SceneLayerCapabilitiesData = {
    val __obj = js.Dynamic.literal(supportsZ = supportsZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneLayerCapabilitiesData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneLayerCapabilitiesData] (val x: Self) extends AnyVal {
    
    inline def setSupportsZ(value: Boolean): Self = StObject.set(x, "supportsZ", value.asInstanceOf[js.Any])
  }
}
