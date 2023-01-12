package typings.abstractThings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("abstract-things/events", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with EventEmitter {
    def this(options: EventEmitterOptions) = this()
  }
  
  @js.native
  trait EventEmitter extends StObject {
    
    def emit(
      event: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Unit = js.native
    
    def emitWithContext(
      ctx: EventEmitterContext,
      eventName: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Unit = js.native
    
    def hasListeners: Boolean = js.native
    
    def off(eventName: String, listener: Listener): Unit = js.native
    
    def offAny(listener: Listener): Unit = js.native
    
    def on(eventName: String, listener: Listener): Stoppable = js.native
    
    def onAny(listener: Listener): Stoppable = js.native
    
    def once(eventName: String, listener: Listener): Stoppable = js.native
    
    def triggerListenerChange(): Unit = js.native
    
    def when(eventName: String, limit: Limit, listener: Listener): Stoppable = js.native
  }
  
  type EventEmitterContext = Any | EventEmitter
  
  trait EventEmitterOptions extends StObject {
    
    var context: EventEmitterContext
  }
  object EventEmitterOptions {
    
    inline def apply(context: EventEmitterContext): EventEmitterOptions = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventEmitterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventEmitterOptions] (val x: Self) extends AnyVal {
      
      inline def setContext(value: EventEmitterContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
  
  type Limit = js.Function1[/* data */ Any, Unit]
  
  type Listener = js.Function1[/* args */ Any, Unit]
  
  trait Stoppable extends StObject {
    
    def stop(): Unit
  }
  object Stoppable {
    
    inline def apply(stop: () => Unit): Stoppable = {
      val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Stoppable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Stoppable] (val x: Self) extends AnyVal {
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
}
