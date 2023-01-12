package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.Loop
import typings.arcgisJsApi.arcgisJsApiStrings.None
import typings.arcgisJsApi.arcgisJsApiStrings.Oscillate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMAnimatedSymbolProperties extends StObject {
  
  /**
    * The time (in seconds) it take to play through the symbol's animation once.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMAnimatedSymbolProperties)
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether the animated symbol should play its animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMAnimatedSymbolProperties)
    */
  var playAnimation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The starting value for generating a random number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMAnimatedSymbolProperties)
    */
  var randomizeStartSeed: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether to generate a randomized start offset in seconds to apply to the symbol animation of each feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMAnimatedSymbolProperties)
    */
  var randomizeStartTime: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of seconds to delay before repeating an animation cycle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMAnimatedSymbolProperties)
    */
  var repeatDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * Determines how to repeat the animation of a symbol when the animation cycle ends.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMAnimatedSymbolProperties)
    */
  var repeatType: js.UndefOr[None | Loop | Oscillate] = js.undefined
  
  /**
    * Indicates whether the animated symbol should play back in reverse.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMAnimatedSymbolProperties)
    */
  var reverseAnimation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The time offset in seconds to use as the starting point of the symbol animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMAnimatedSymbolProperties)
    */
  var startTimeOffset: js.UndefOr[Double] = js.undefined
}
object CIMAnimatedSymbolProperties {
  
  inline def apply(): CIMAnimatedSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CIMAnimatedSymbolProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMAnimatedSymbolProperties] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setPlayAnimation(value: Boolean): Self = StObject.set(x, "playAnimation", value.asInstanceOf[js.Any])
    
    inline def setPlayAnimationUndefined: Self = StObject.set(x, "playAnimation", js.undefined)
    
    inline def setRandomizeStartSeed(value: Double): Self = StObject.set(x, "randomizeStartSeed", value.asInstanceOf[js.Any])
    
    inline def setRandomizeStartSeedUndefined: Self = StObject.set(x, "randomizeStartSeed", js.undefined)
    
    inline def setRandomizeStartTime(value: Boolean): Self = StObject.set(x, "randomizeStartTime", value.asInstanceOf[js.Any])
    
    inline def setRandomizeStartTimeUndefined: Self = StObject.set(x, "randomizeStartTime", js.undefined)
    
    inline def setRepeatDelay(value: Double): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
    
    inline def setRepeatDelayUndefined: Self = StObject.set(x, "repeatDelay", js.undefined)
    
    inline def setRepeatType(value: None | Loop | Oscillate): Self = StObject.set(x, "repeatType", value.asInstanceOf[js.Any])
    
    inline def setRepeatTypeUndefined: Self = StObject.set(x, "repeatType", js.undefined)
    
    inline def setReverseAnimation(value: Boolean): Self = StObject.set(x, "reverseAnimation", value.asInstanceOf[js.Any])
    
    inline def setReverseAnimationUndefined: Self = StObject.set(x, "reverseAnimation", js.undefined)
    
    inline def setStartTimeOffset(value: Double): Self = StObject.set(x, "startTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setStartTimeOffsetUndefined: Self = StObject.set(x, "startTimeOffset", js.undefined)
  }
}
