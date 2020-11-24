package typings.atomically

import typings.node.NodeJS.Timeout
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("atomically/dist/utils/retryify_queue", JSImport.Namespace)
@js.native
object retryifyQueueMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def add(fn: js.Function): Unit = js.native
    
    def init(): Unit = js.native
    
    var interval: Double = js.native
    
    var intervalId: js.UndefOr[Timeout] = js.native
    
    var limit: Double = js.native
    
    var queueActive: Set[js.Function] = js.native
    
    var queueWaiting: Set[js.Function] = js.native
    
    def remove(fn: js.Function): Unit = js.native
    
    def reset(): Unit = js.native
    
    def schedule(): js.Promise[js.Function] = js.native
    
    def tick(): Unit = js.native
  }
}
