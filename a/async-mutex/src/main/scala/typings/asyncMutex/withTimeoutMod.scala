package typings.asyncMutex

import typings.asyncMutex.mutexInterfaceMod.MutexInterface
import typings.asyncMutex.semaphoreInterfaceMod.SemaphoreInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withTimeoutMod {
  
  @JSImport("async-mutex/lib/withTimeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withTimeout(mutex: MutexInterface, timeout: Double): MutexInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("withTimeout")(mutex.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[MutexInterface]
  inline def withTimeout(mutex: MutexInterface, timeout: Double, timeoutError: js.Error): MutexInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("withTimeout")(mutex.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], timeoutError.asInstanceOf[js.Any])).asInstanceOf[MutexInterface]
  inline def withTimeout(semaphore: SemaphoreInterface, timeout: Double): SemaphoreInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("withTimeout")(semaphore.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[SemaphoreInterface]
  inline def withTimeout(semaphore: SemaphoreInterface, timeout: Double, timeoutError: js.Error): SemaphoreInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("withTimeout")(semaphore.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], timeoutError.asInstanceOf[js.Any])).asInstanceOf[SemaphoreInterface]
}
