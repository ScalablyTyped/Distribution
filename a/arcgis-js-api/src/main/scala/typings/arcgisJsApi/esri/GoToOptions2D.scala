package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`ease-in-out`
import typings.arcgisJsApi.arcgisJsApiStrings.`ease-in`
import typings.arcgisJsApi.arcgisJsApiStrings.`ease-out`
import typings.arcgisJsApi.arcgisJsApiStrings.ease
import typings.arcgisJsApi.arcgisJsApiStrings.linear
import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoToOptions2D
  extends StObject
     with Object {
  
  /**
    * Indicates if the transition to the new view should be animated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#GoToOptions2D)
    */
  var animate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The duration of the animation in milliseconds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#GoToOptions2D)
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * The easing function used for the animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#GoToOptions2D)
    */
  var easing: js.UndefOr[linear | ease | `ease-in` | `ease-out` | `ease-in-out` | js.Function] = js.undefined
  
  /**
    * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#GoToOptions2D)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object GoToOptions2D {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): GoToOptions2D = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[GoToOptions2D]
  }
  
  extension [Self <: GoToOptions2D](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: linear | ease | `ease-in` | `ease-out` | `ease-in-out` | js.Function): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
