package typings.algoliaEvents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@algolia/events", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with EventEmitter
  /* static members */
  object default {
    
    @JSImport("@algolia/events", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@algolia/events", "default.defaultMaxListeners")
    @js.native
    def defaultMaxListeners: Double = js.native
    inline def defaultMaxListeners_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMaxListeners")(x.asInstanceOf[js.Any])
    
    inline def listenerCount(emitter: EventEmitter, `type`: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listenerCount")(emitter.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def listenerCount(emitter: EventEmitter, `type`: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listenerCount")(emitter.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @js.native
  trait EventEmitter extends StObject {
    
    def addListener(`type`: String, listener: Listener): this.type = js.native
    def addListener(`type`: Double, listener: Listener): this.type = js.native
    
    // getMaxListeners(): number;
    def emit(`type`: String, args: Any*): Boolean = js.native
    def emit(`type`: Double, args: Any*): Boolean = js.native
    
    def listenerCount(`type`: String): Double = js.native
    def listenerCount(`type`: Double): Double = js.native
    
    def listeners(`type`: String): js.Array[Listener] = js.native
    def listeners(`type`: Double): js.Array[Listener] = js.native
    
    def on(`type`: String, listener: Listener): this.type = js.native
    def on(`type`: Double, listener: Listener): this.type = js.native
    
    def once(`type`: String, listener: Listener): this.type = js.native
    def once(`type`: Double, listener: Listener): this.type = js.native
    
    // off(type: string | number, listener: Listener): this;
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(`type`: String): this.type = js.native
    def removeAllListeners(`type`: Double): this.type = js.native
    
    // prependListener(type: string | number, listener: Listener): this;
    // prependOnceListener(type: string | number, listener: Listener): this;
    def removeListener(`type`: String, listener: Listener): this.type = js.native
    def removeListener(`type`: Double, listener: Listener): this.type = js.native
    
    // eventNames(): Array<string | number>;
    def setMaxListeners(n: Double): this.type = js.native
  }
  
  @js.native
  trait Listener extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
}
