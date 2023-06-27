package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.high
import typings.arcgisJsApi.arcgisJsApiStrings.low
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewEnvironmentAtmosphere
  extends StObject
     with AnonymousAccessor {
  
  /**
  		 * Indicates the quality of the atmosphere visualization.
  		 *
  		 * @default low
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
  		 */
  var quality: js.UndefOr[low | high] = js.undefined
}
object SceneViewEnvironmentAtmosphere {
  
  inline def apply(): SceneViewEnvironmentAtmosphere = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneViewEnvironmentAtmosphere]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneViewEnvironmentAtmosphere] (val x: Self) extends AnyVal {
    
    inline def setQuality(value: low | high): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}
