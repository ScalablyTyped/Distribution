package typings.antvGLite.anon

import typings.antvGLite.distTypesMod.TypeEasingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  easing :string,   easingFunction :@antv/g-lite.@antv/g-lite.TypeEasingFunction,   duration :number, onfinish (): void}> */
trait Partialeasingstringeasing extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[String] = js.undefined
  
  var easingFunction: js.UndefOr[TypeEasingFunction] = js.undefined
  
  var onfinish: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object Partialeasingstringeasing {
  
  inline def apply(): Partialeasingstringeasing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialeasingstringeasing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Partialeasingstringeasing] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingFunction(
      value: (/* t */ Double, /* params */ js.UndefOr[js.Array[String | Double]], /* duration */ js.UndefOr[Double]) => Double
    ): Self = StObject.set(x, "easingFunction", js.Any.fromFunction3(value))
    
    inline def setEasingFunctionUndefined: Self = StObject.set(x, "easingFunction", js.undefined)
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setOnfinish(value: () => Unit): Self = StObject.set(x, "onfinish", js.Any.fromFunction0(value))
    
    inline def setOnfinishUndefined: Self = StObject.set(x, "onfinish", js.undefined)
  }
}
