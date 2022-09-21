package typings.ahooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useEventEmitterMod {
  
  @JSImport("ahooks/lib/useEventEmitter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](): EventEmitter[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[EventEmitter[T]]
  
  @JSImport("ahooks/lib/useEventEmitter", "EventEmitter")
  @js.native
  open class EventEmitter[T] () extends StObject {
    
    def emit(`val`: T): Unit = js.native
    
    /* private */ var subscriptions: Any = js.native
    
    def useSubscription(callback: Subscription[T]): Unit = js.native
  }
  
  type Subscription[T] = js.Function1[/* val */ T, Unit]
}
