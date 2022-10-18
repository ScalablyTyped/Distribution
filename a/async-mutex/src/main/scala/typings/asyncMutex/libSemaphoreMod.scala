package typings.asyncMutex

import typings.asyncMutex.libSemaphoreInterfaceMod.SemaphoreInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSemaphoreMod {
  
  @JSImport("async-mutex/lib/Semaphore", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Semaphore {
    def this(_value: Double) = this()
    def this(_value: Double, _cancelError: js.Error) = this()
  }
  
  @js.native
  trait Semaphore
    extends StObject
       with SemaphoreInterface {
    
    /* private */ var _cancelError: Any = js.native
    
    /* private */ var _dispatch: Any = js.native
    
    /* private */ var _drainUnlockWaiters: Any = js.native
    
    /* private */ var _newReleaser: Any = js.native
    
    /* private */ var _value: Any = js.native
    
    /* private */ var _weightedQueues: Any = js.native
    
    /* private */ var _weightedWaiters: Any = js.native
  }
}
