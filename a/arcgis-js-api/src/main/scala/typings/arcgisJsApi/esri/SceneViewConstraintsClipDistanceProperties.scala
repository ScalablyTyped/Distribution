package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.arcgisJsApi.arcgisJsApiStrings.manual
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewConstraintsClipDistanceProperties
  extends StObject
     with Object {
  
  /**
    * The far clip distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var far: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the mode of the constraint which is either `auto` or `manual`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var mode: js.UndefOr[auto | manual] = js.undefined
  
  /**
    * The near clip distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var near: js.UndefOr[Double] = js.undefined
}
object SceneViewConstraintsClipDistanceProperties {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SceneViewConstraintsClipDistanceProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SceneViewConstraintsClipDistanceProperties]
  }
  
  @scala.inline
  implicit class SceneViewConstraintsClipDistancePropertiesMutableBuilder[Self <: SceneViewConstraintsClipDistanceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFar(value: Double): Self = StObject.set(x, "far", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFarUndefined: Self = StObject.set(x, "far", js.undefined)
    
    @scala.inline
    def setMode(value: auto | manual): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setNear(value: Double): Self = StObject.set(x, "near", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearUndefined: Self = StObject.set(x, "near", js.undefined)
  }
}
