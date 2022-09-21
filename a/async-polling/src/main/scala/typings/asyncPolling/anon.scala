package typings.asyncPolling

import typings.asyncPolling.mod.EventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait On extends StObject {
    
    def on(eventName: EventName, listener: js.Function): Any
    
    def run(): Any
    
    def stop(): Any
  }
  object On {
    
    inline def apply(on: (EventName, js.Function) => Any, run: () => Any, stop: () => Any): On = {
      val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on), run = js.Any.fromFunction0(run), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[On]
    }
    
    extension [Self <: On](x: Self) {
      
      inline def setOn(value: (EventName, js.Function) => Any): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setRun(value: () => Any): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => Any): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
}
