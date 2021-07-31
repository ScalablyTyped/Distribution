package typings.asyncPolling

import typings.asyncPolling.mod.EventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait On extends StObject {
    
    def on(eventName: EventName, listener: js.Function): js.Any
    
    def run(): js.Any
    
    def stop(): js.Any
  }
  object On {
    
    @scala.inline
    def apply(on: (EventName, js.Function) => js.Any, run: () => js.Any, stop: () => js.Any): On = {
      val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on), run = js.Any.fromFunction0(run), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[On]
    }
    
    @scala.inline
    implicit class OnMutableBuilder[Self <: On] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOn(value: (EventName, js.Function) => js.Any): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRun(value: () => js.Any): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStop(value: () => js.Any): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
}
