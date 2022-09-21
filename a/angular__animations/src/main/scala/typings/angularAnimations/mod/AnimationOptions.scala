package typings.angularAnimations.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationOptions extends StObject {
  
  /**
    * Sets a time-delay for initiating an animation action.
    * A number and optional time unit, such as "1s" or "10ms" for one second
    * and 10 milliseconds, respectively.The default unit is milliseconds.
    * Default value is 0, meaning no delay.
    */
  var delay: js.UndefOr[Double | String] = js.undefined
  
  /**
    * A set of developer-defined parameters that modify styling and timing
    * when an animation action starts. An array of key-value pairs, where the provided value
    * is used as a default.
    */
  var params: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object AnimationOptions {
  
  inline def apply(): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationOptions]
  }
  
  extension [Self <: AnimationOptions](x: Self) {
    
    inline def setDelay(value: Double | String): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setParams(value: StringDictionary[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
