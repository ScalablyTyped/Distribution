package typings.ava

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Complete extends StObject {
    
    def complete(): Unit
    
    def error(err: js.Any): Unit
  }
  object Complete {
    
    @scala.inline
    def apply(complete: () => Unit, error: js.Any => Unit): Complete = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error))
      __obj.asInstanceOf[Complete]
    }
    
    @scala.inline
    implicit class CompleteMutableBuilder[Self <: Complete] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setError(value: js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    }
  }
}
