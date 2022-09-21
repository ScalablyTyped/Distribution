package typings.awsCrt

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventMod {
  
  @JSImport("aws-crt/dist/common/event", "BufferedEventEmitter")
  @js.native
  open class BufferedEventEmitter () extends EventEmitter {
    
    /**
      * Forces all written events to be buffered in memory. The buffered data will be
      * flushed when {@link BufferedEventEmitter.uncork} is called.
      */
    def cork(): Unit = js.native
    
    /* private */ var corked: Any = js.native
    
    /**
      * Synchronously calls each of the listeners registered for the event key supplied
      * in registration order. If the {@link BufferedEventEmitter} is currently corked,
      * the event will be buffered until {@link BufferedEventEmitter.uncork} is called.
      * @param event The name of the event
      * @param args Event payload
      */
    def emit(event: EventKey, args: Any*): Boolean = js.native
    
    /* private */ var eventQueue: Any = js.native
    
    /* private */ var lastQueuedEvent: Any = js.native
    
    /**
      * Flushes all data buffered since {@link BufferedEventEmitter.cork} was called.
      *
      * NOTE: It is HIGHLY recommended that uncorking should always be done via
      * ``` process.nextTick```, not during the ```EventEmitter.on()``` call.
      */
    def uncork(): Unit = js.native
  }
  
  type EventKey = String | js.Symbol
}
