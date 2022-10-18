package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcExecutionClusterApiMod.MessageFromWorker
import typings.angularCompilerCli.ngccSrcExecutionClusterApiMod.MessageToWorker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcExecutionClusterUtilsMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/execution/cluster/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/execution/cluster/utils", "Deferred")
  @js.native
  open class Deferred[T] () extends StObject {
    
    /** The `Promise` instance associated with this deferred. */
    var promise: js.Promise[T] = js.native
    
    /**
      * Rejects the associated promise with the specified reason.
      *
      * @param reason The rejection reason.
      */
    def reject(reason: Any): Unit = js.native
    
    /**
      * Resolve the associated promise with the specified value.
      * If the value is a rejection (constructed with `Promise.reject()`), the promise will be rejected
      * instead.
      *
      * @param value The value to resolve the promise with.
      */
    def resolve(value: T): Unit = js.native
  }
  
  inline def sendMessageToMaster(msg: MessageFromWorker): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendMessageToMaster")(msg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def sendMessageToWorker(workerId: Double, msg: MessageToWorker): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessageToWorker")(workerId.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
