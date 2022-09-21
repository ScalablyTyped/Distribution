package typings.asyncMutex

import typings.asyncMutex.mutexInterfaceMod.MutexInterface
import typings.asyncMutex.mutexMod.default
import typings.asyncMutex.semaphoreInterfaceMod.SemaphoreInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("async-mutex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("async-mutex", "E_ALREADY_LOCKED")
  @js.native
  val E_ALREADY_LOCKED: js.Error = js.native
  
  @JSImport("async-mutex", "E_CANCELED")
  @js.native
  val E_CANCELED: js.Error = js.native
  
  @JSImport("async-mutex", "E_TIMEOUT")
  @js.native
  val E_TIMEOUT: js.Error = js.native
  
  @JSImport("async-mutex", "Mutex")
  @js.native
  open class Mutex () extends default {
    def this(cancelError: js.Error) = this()
  }
  
  @JSImport("async-mutex", "Semaphore")
  @js.native
  open class Semaphore protected ()
    extends typings.asyncMutex.semaphoreMod.default {
    def this(_value: Double) = this()
    def this(_value: Double, _cancelError: js.Error) = this()
  }
  
  inline def tryAcquire(mutex: MutexInterface): MutexInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("tryAcquire")(mutex.asInstanceOf[js.Any]).asInstanceOf[MutexInterface]
  inline def tryAcquire(mutex: MutexInterface, alreadyAcquiredError: js.Error): MutexInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("tryAcquire")(mutex.asInstanceOf[js.Any], alreadyAcquiredError.asInstanceOf[js.Any])).asInstanceOf[MutexInterface]
  inline def tryAcquire(semaphore: SemaphoreInterface): SemaphoreInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("tryAcquire")(semaphore.asInstanceOf[js.Any]).asInstanceOf[SemaphoreInterface]
  inline def tryAcquire(semaphore: SemaphoreInterface, alreadyAcquiredError: js.Error): SemaphoreInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("tryAcquire")(semaphore.asInstanceOf[js.Any], alreadyAcquiredError.asInstanceOf[js.Any])).asInstanceOf[SemaphoreInterface]
  
  inline def withTimeout(mutex: MutexInterface, timeout: Double): MutexInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("withTimeout")(mutex.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[MutexInterface]
  inline def withTimeout(mutex: MutexInterface, timeout: Double, timeoutError: js.Error): MutexInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("withTimeout")(mutex.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], timeoutError.asInstanceOf[js.Any])).asInstanceOf[MutexInterface]
  inline def withTimeout(semaphore: SemaphoreInterface, timeout: Double): SemaphoreInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("withTimeout")(semaphore.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[SemaphoreInterface]
  inline def withTimeout(semaphore: SemaphoreInterface, timeout: Double, timeoutError: js.Error): SemaphoreInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("withTimeout")(semaphore.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], timeoutError.asInstanceOf[js.Any])).asInstanceOf[SemaphoreInterface]
}
