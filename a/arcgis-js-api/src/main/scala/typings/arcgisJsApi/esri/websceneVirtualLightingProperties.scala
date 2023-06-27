package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait websceneVirtualLightingProperties extends StObject {
  
  /**
  		 * Indicates whether to show shadows cast by the light source.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-VirtualLighting.html#directShadowsEnabled)
  		 */
  var directShadowsEnabled: js.UndefOr[Boolean] = js.undefined
}
object websceneVirtualLightingProperties {
  
  inline def apply(): websceneVirtualLightingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[websceneVirtualLightingProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: websceneVirtualLightingProperties] (val x: Self) extends AnyVal {
    
    inline def setDirectShadowsEnabled(value: Boolean): Self = StObject.set(x, "directShadowsEnabled", value.asInstanceOf[js.Any])
    
    inline def setDirectShadowsEnabledUndefined: Self = StObject.set(x, "directShadowsEnabled", js.undefined)
  }
}
