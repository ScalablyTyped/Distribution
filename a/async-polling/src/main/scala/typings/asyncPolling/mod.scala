package typings.asyncPolling

import typings.asyncPolling.anon.On
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[Result](
    pollingFunc: js.Function1[
      /* end */ js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[Result], Any], 
      Any
    ],
    delay: Double
  ): On = (^.asInstanceOf[js.Dynamic].apply(pollingFunc.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[On]
  
  @JSImport("async-polling", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.asyncPolling.asyncPollingStrings.run
    - typings.asyncPolling.asyncPollingStrings.start
    - typings.asyncPolling.asyncPollingStrings.error
    - typings.asyncPolling.asyncPollingStrings.result
    - typings.asyncPolling.asyncPollingStrings.end
    - typings.asyncPolling.asyncPollingStrings.schedule
    - typings.asyncPolling.asyncPollingStrings.stop
  */
  trait EventName extends StObject
  object EventName {
    
    inline def end: typings.asyncPolling.asyncPollingStrings.end = "end".asInstanceOf[typings.asyncPolling.asyncPollingStrings.end]
    
    inline def error: typings.asyncPolling.asyncPollingStrings.error = "error".asInstanceOf[typings.asyncPolling.asyncPollingStrings.error]
    
    inline def result: typings.asyncPolling.asyncPollingStrings.result = "result".asInstanceOf[typings.asyncPolling.asyncPollingStrings.result]
    
    inline def run: typings.asyncPolling.asyncPollingStrings.run = "run".asInstanceOf[typings.asyncPolling.asyncPollingStrings.run]
    
    inline def schedule: typings.asyncPolling.asyncPollingStrings.schedule = "schedule".asInstanceOf[typings.asyncPolling.asyncPollingStrings.schedule]
    
    inline def start: typings.asyncPolling.asyncPollingStrings.start = "start".asInstanceOf[typings.asyncPolling.asyncPollingStrings.start]
    
    inline def stop: typings.asyncPolling.asyncPollingStrings.stop = "stop".asInstanceOf[typings.asyncPolling.asyncPollingStrings.stop]
  }
}
