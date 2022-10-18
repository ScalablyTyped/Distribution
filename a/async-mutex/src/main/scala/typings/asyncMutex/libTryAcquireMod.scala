package typings.asyncMutex

import typings.asyncMutex.libMutexInterfaceMod.MutexInterface
import typings.asyncMutex.libSemaphoreInterfaceMod.SemaphoreInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTryAcquireMod {
  
  @JSImport("async-mutex/lib/tryAcquire", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tryAcquire(mutex: MutexInterface): MutexInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("tryAcquire")(mutex.asInstanceOf[js.Any]).asInstanceOf[MutexInterface]
  inline def tryAcquire(mutex: MutexInterface, alreadyAcquiredError: js.Error): MutexInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("tryAcquire")(mutex.asInstanceOf[js.Any], alreadyAcquiredError.asInstanceOf[js.Any])).asInstanceOf[MutexInterface]
  inline def tryAcquire(semaphore: SemaphoreInterface): SemaphoreInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("tryAcquire")(semaphore.asInstanceOf[js.Any]).asInstanceOf[SemaphoreInterface]
  inline def tryAcquire(semaphore: SemaphoreInterface, alreadyAcquiredError: js.Error): SemaphoreInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("tryAcquire")(semaphore.asInstanceOf[js.Any], alreadyAcquiredError.asInstanceOf[js.Any])).asInstanceOf[SemaphoreInterface]
}
