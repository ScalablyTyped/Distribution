package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewConstraintsProperties extends StObject {
  
  /**
    * Specifies a constraint on the minimum and maximum allowed camera altitude.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var altitude: js.UndefOr[SceneViewConstraintsAltitudeProperties] = js.undefined
  
  /**
    * Specifies the near and far webgl clip distances.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var clipDistance: js.UndefOr[SceneViewConstraintsClipDistanceProperties] = js.undefined
  
  /**
    * Specifies a constraint on the amount of allowed tilting of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var tilt: js.UndefOr[SceneViewConstraintsTiltProperties] = js.undefined
}
object SceneViewConstraintsProperties {
  
  inline def apply(): SceneViewConstraintsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneViewConstraintsProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneViewConstraintsProperties] (val x: Self) extends AnyVal {
    
    inline def setAltitude(value: SceneViewConstraintsAltitudeProperties): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    inline def setClipDistance(value: SceneViewConstraintsClipDistanceProperties): Self = StObject.set(x, "clipDistance", value.asInstanceOf[js.Any])
    
    inline def setClipDistanceUndefined: Self = StObject.set(x, "clipDistance", js.undefined)
    
    inline def setTilt(value: SceneViewConstraintsTiltProperties): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
    
    inline def setTiltUndefined: Self = StObject.set(x, "tilt", js.undefined)
  }
}
