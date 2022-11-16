package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewConstraintsAltitude
  extends StObject
     with AnonymousAccessor {
  
  /**
    * The maximum allowed camera altitude (in meters).
    *
    * @default EARTH_RADIUS * 4
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum allowed camera altitude (in meters).
    *
    * @default -∞
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var min: js.UndefOr[Double] = js.undefined
}
object SceneViewConstraintsAltitude {
  
  inline def apply(
    set: (js.UndefOr[
      js.Function2[/* propertyName */ String, /* value */ Any, SceneViewConstraintsAltitude]
    ]) & (js.UndefOr[js.Function1[/* props */ HashMap[Any], SceneViewConstraintsAltitude]])
  ): SceneViewConstraintsAltitude = {
    val __obj = js.Dynamic.literal(set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewConstraintsAltitude]
  }
  
  extension [Self <: SceneViewConstraintsAltitude](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
