package typings.arcgisJsApi.esri

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
  
  inline def apply(): SceneViewConstraintsAltitude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneViewConstraintsAltitude]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneViewConstraintsAltitude] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
