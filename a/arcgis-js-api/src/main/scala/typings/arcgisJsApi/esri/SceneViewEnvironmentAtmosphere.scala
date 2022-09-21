package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import typings.arcgisJsApi.arcgisJsApiStrings.high
import typings.arcgisJsApi.arcgisJsApiStrings.low
import typings.std.PropertyKey
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
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    set: (js.UndefOr[
      js.Function2[/* propertyName */ String, /* value */ Any, SceneViewEnvironmentAtmosphere]
    ]) & (js.UndefOr[js.Function1[/* props */ HashMap[Any], SceneViewEnvironmentAtmosphere]])
  ): SceneViewEnvironmentAtmosphere = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewEnvironmentAtmosphere]
  }
  
  extension [Self <: SceneViewEnvironmentAtmosphere](x: Self) {
    
    inline def setQuality(value: low | high): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}
