package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`in-cubic`
import typings.arcgisJsApi.arcgisJsApiStrings.`in-expo`
import typings.arcgisJsApi.arcgisJsApiStrings.`in-out-coast-quadratic`
import typings.arcgisJsApi.arcgisJsApiStrings.`in-out-cubic`
import typings.arcgisJsApi.arcgisJsApiStrings.`in-out-expo`
import typings.arcgisJsApi.arcgisJsApiStrings.`out-cubic`
import typings.arcgisJsApi.arcgisJsApiStrings.`out-expo`
import typings.arcgisJsApi.arcgisJsApiStrings.linear
import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoToOptions3D extends Object {
  
  /**
    * Indicates if the transition to the new view should be animated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#GoToOptions3D)
    */
  var animate: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the exact duration (in milliseconds) of the animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#GoToOptions3D)
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * The easing function to use for the animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#GoToOptions3D)
    */
  var easing: js.UndefOr[
    linear | `in-cubic` | `out-cubic` | `in-out-cubic` | `in-expo` | `out-expo` | `in-out-expo` | `in-out-coast-quadratic` | EasingFunction
  ] = js.native
  
  /**
    * The maximum allowed duration (in milliseconds) of the animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#GoToOptions3D)
    */
  var maxDuration: js.UndefOr[Double] = js.native
  
  /**
    * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#GoToOptions3D)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  
  /**
    * Increases or decreases the animation speed by the specified factor.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#GoToOptions3D)
    */
  var speedFactor: js.UndefOr[Double] = js.native
}
object GoToOptions3D {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): GoToOptions3D = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[GoToOptions3D]
  }
  
  @scala.inline
  implicit class GoToOptions3DMutableBuilder[Self <: GoToOptions3D] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEasing(
      value: linear | `in-cubic` | `out-cubic` | `in-out-cubic` | `in-expo` | `out-expo` | `in-out-expo` | `in-out-coast-quadratic` | EasingFunction
    ): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingFunction2(value: (/* t */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setMaxDuration(value: Double): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setSpeedFactor(value: Double): Self = StObject.set(x, "speedFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedFactorUndefined: Self = StObject.set(x, "speedFactor", js.undefined)
  }
}
