package typings.atlaskitTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsDelayedFunctionMod {
  
  @JSImport("@atlaskit/tree/dist/types/utils/delayed-function", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DelayedFunction {
    def this(delay: Double) = this()
    
    /* CompleteClass */
    var delay: Double = js.native
    
    /* CompleteClass */
    override def start(fn: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
  
  trait DelayedFunction extends StObject {
    
    var delay: Double
    
    var fn: js.UndefOr[js.Function] = js.undefined
    
    def start(fn: js.Function): Unit
    
    def stop(): Unit
    
    var timeoutId: js.UndefOr[Double] = js.undefined
  }
  object DelayedFunction {
    
    inline def apply(delay: Double, start: js.Function => Unit, stop: () => Unit): DelayedFunction = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], start = js.Any.fromFunction1(start), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[DelayedFunction]
    }
    
    extension [Self <: DelayedFunction](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setFn(value: js.Function): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      inline def setStart(value: js.Function => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      inline def setTimeoutId(value: Double): Self = StObject.set(x, "timeoutId", value.asInstanceOf[js.Any])
      
      inline def setTimeoutIdUndefined: Self = StObject.set(x, "timeoutId", js.undefined)
    }
  }
}
