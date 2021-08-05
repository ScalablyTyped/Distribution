package typings.angularCore

import typings.angularCore.queryDefinitionMod.NgQueryDefinition
import typings.angularCore.queryDefinitionMod.QueryTiming
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timingStrategyMod {
  
  trait TimingResult extends StObject {
    
    var message: js.UndefOr[String] = js.undefined
    
    var timing: QueryTiming | Null
  }
  object TimingResult {
    
    inline def apply(): TimingResult = {
      val __obj = js.Dynamic.literal(timing = null)
      __obj.asInstanceOf[TimingResult]
    }
    
    extension [Self <: TimingResult](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setTiming(value: QueryTiming): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
      
      inline def setTimingNull: Self = StObject.set(x, "timing", null)
    }
  }
  
  trait TimingStrategy extends StObject {
    
    /** Detects the timing result for a given query. */
    def detectTiming(query: NgQueryDefinition): TimingResult
    
    /** Sets up the given strategy. Throws if the strategy could not be set up. */
    def setup(): Unit
  }
  object TimingStrategy {
    
    inline def apply(detectTiming: NgQueryDefinition => TimingResult, setup: () => Unit): TimingStrategy = {
      val __obj = js.Dynamic.literal(detectTiming = js.Any.fromFunction1(detectTiming), setup = js.Any.fromFunction0(setup))
      __obj.asInstanceOf[TimingStrategy]
    }
    
    extension [Self <: TimingStrategy](x: Self) {
      
      inline def setDetectTiming(value: NgQueryDefinition => TimingResult): Self = StObject.set(x, "detectTiming", js.Any.fromFunction1(value))
      
      inline def setSetup(value: () => Unit): Self = StObject.set(x, "setup", js.Any.fromFunction0(value))
    }
  }
}
