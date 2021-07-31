package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewConstraintsProperties
  extends StObject
     with Object {
  
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
    * When enabled, prevents the user from navigating below the surface in a local SceneView.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var collision: js.UndefOr[SceneViewConstraintsCollision] = js.undefined
  
  /**
    * Specifies a constraint on the amount of allowed tilting of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var tilt: js.UndefOr[SceneViewConstraintsTiltProperties] = js.undefined
}
object SceneViewConstraintsProperties {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SceneViewConstraintsProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SceneViewConstraintsProperties]
  }
  
  @scala.inline
  implicit class SceneViewConstraintsPropertiesMutableBuilder[Self <: SceneViewConstraintsProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: SceneViewConstraintsAltitudeProperties): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setClipDistance(value: SceneViewConstraintsClipDistanceProperties): Self = StObject.set(x, "clipDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipDistanceUndefined: Self = StObject.set(x, "clipDistance", js.undefined)
    
    @scala.inline
    def setCollision(value: SceneViewConstraintsCollision): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollisionUndefined: Self = StObject.set(x, "collision", js.undefined)
    
    @scala.inline
    def setTilt(value: SceneViewConstraintsTiltProperties): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiltUndefined: Self = StObject.set(x, "tilt", js.undefined)
  }
}
