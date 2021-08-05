package typings.antvEventEmitter

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@antv/event-emitter", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with EventEmitter
  
  @js.native
  trait EventEmitter extends StObject {
    
    /* private */ var _events: js.Any = js.native
    
    /**
      * 触发一个事件
      * @param evt
      * @param args
      */
    def emit(evt: String, args: js.Any*): Unit = js.native
    
    def getEvents(): Record[String, js.Array[EventType]] = js.native
    
    /**
      * 取消监听一个事件，或者一个channel
      * @param evt
      * @param callback
      */
    def off(): this.type = js.native
    def off(evt: String): this.type = js.native
    def off(evt: String, callback: js.Function): this.type = js.native
    def off(evt: Unit, callback: js.Function): this.type = js.native
    
    /**
      * 监听一个事件
      * @param evt
      * @param callback
      * @param once
      */
    def on(evt: String, callback: js.Function): this.type = js.native
    def on(evt: String, callback: js.Function, once: Boolean): this.type = js.native
    
    /**
      * 监听一个事件一次
      * @param evt
      * @param callback
      */
    def once(evt: String, callback: js.Function): this.type = js.native
  }
  
  trait EventType extends StObject {
    
    val callback: js.Function
    
    val once: Boolean
  }
  object EventType {
    
    inline def apply(callback: js.Function, once: Boolean): EventType = {
      val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], once = once.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventType]
    }
    
    extension [Self <: EventType](x: Self) {
      
      inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    }
  }
}
