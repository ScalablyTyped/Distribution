package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideApplyToOptions extends StObject {
  
  /**
    * Indicates whether to animate the slide transition.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#applyTo)
    */
  var animate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the exact duration (in milliseconds) of the animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#applyTo)
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * The easing function to use for the animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#applyTo)
    */
  var easing: js.UndefOr[String | EasingFunction] = js.undefined
  
  /**
    * The maximum allowed duration (in milliseconds) of the animation.
    *
    * @default 8000
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#applyTo)
    */
  var maxDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Signal object that can be used to abort the asynchronous task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#applyTo)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * Increases or decreases the animation speed by the specified factor.
    *
    * @default 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#applyTo)
    */
  var speedFactor: js.UndefOr[Double] = js.undefined
}
object SlideApplyToOptions {
  
  inline def apply(): SlideApplyToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideApplyToOptions]
  }
  
  extension [Self <: SlideApplyToOptions](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: String | EasingFunction): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingFunction2(value: (/* t */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easing", js.Any.fromFunction2(value))
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setMaxDuration(value: Double): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    
    inline def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setSpeedFactor(value: Double): Self = StObject.set(x, "speedFactor", value.asInstanceOf[js.Any])
    
    inline def setSpeedFactorUndefined: Self = StObject.set(x, "speedFactor", js.undefined)
  }
}
