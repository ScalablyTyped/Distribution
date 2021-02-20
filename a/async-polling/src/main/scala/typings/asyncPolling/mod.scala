package typings.asyncPolling

import typings.asyncPolling.anon.On
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("async-polling", JSImport.Namespace)
  @js.native
  def apply[Result](
    pollingFunc: js.Function1[
      /* end */ js.Function2[/* err */ js.UndefOr[Error], /* result */ js.UndefOr[Result], _], 
      _
    ],
    delay: Double
  ): On = js.native
  
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
    
    @scala.inline
    def end: typings.asyncPolling.asyncPollingStrings.end = "end".asInstanceOf[typings.asyncPolling.asyncPollingStrings.end]
    
    @scala.inline
    def error: typings.asyncPolling.asyncPollingStrings.error = "error".asInstanceOf[typings.asyncPolling.asyncPollingStrings.error]
    
    @scala.inline
    def result: typings.asyncPolling.asyncPollingStrings.result = "result".asInstanceOf[typings.asyncPolling.asyncPollingStrings.result]
    
    @scala.inline
    def run: typings.asyncPolling.asyncPollingStrings.run = "run".asInstanceOf[typings.asyncPolling.asyncPollingStrings.run]
    
    @scala.inline
    def schedule: typings.asyncPolling.asyncPollingStrings.schedule = "schedule".asInstanceOf[typings.asyncPolling.asyncPollingStrings.schedule]
    
    @scala.inline
    def start: typings.asyncPolling.asyncPollingStrings.start = "start".asInstanceOf[typings.asyncPolling.asyncPollingStrings.start]
    
    @scala.inline
    def stop: typings.asyncPolling.asyncPollingStrings.stop = "stop".asInstanceOf[typings.asyncPolling.asyncPollingStrings.stop]
  }
}
