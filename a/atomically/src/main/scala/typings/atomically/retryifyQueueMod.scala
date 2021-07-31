package typings.atomically

import typings.node.NodeJS.Timeout
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retryifyQueueMod {
  
  object default {
    
    @JSImport("atomically/dist/utils/retryify_queue", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def add(fn: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
    
    @JSImport("atomically/dist/utils/retryify_queue", "default.interval")
    @js.native
    def interval: Double = js.native
    
    @JSImport("atomically/dist/utils/retryify_queue", "default.intervalId")
    @js.native
    def intervalId: js.UndefOr[Timeout] = js.native
    @scala.inline
    def intervalId_=(x: js.UndefOr[Timeout]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalId")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def interval_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interval")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/retryify_queue", "default.limit")
    @js.native
    def limit: Double = js.native
    @scala.inline
    def limit_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("limit")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/retryify_queue", "default.queueActive")
    @js.native
    def queueActive: Set[js.Function] = js.native
    @scala.inline
    def queueActive_=(x: Set[js.Function]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queueActive")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/retryify_queue", "default.queueWaiting")
    @js.native
    def queueWaiting: Set[js.Function] = js.native
    @scala.inline
    def queueWaiting_=(x: Set[js.Function]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queueWaiting")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def remove(fn: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
    
    @scala.inline
    def schedule(): js.Promise[js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("schedule")().asInstanceOf[js.Promise[js.Function]]
    
    @scala.inline
    def tick(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tick")().asInstanceOf[Unit]
  }
}
