package typings.asyncMutex

import typings.asyncMutex.semaphoreInterfaceMod.SemaphoreInterface.Releaser
import typings.asyncMutex.semaphoreInterfaceMod.SemaphoreInterface.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object semaphoreInterfaceMod {
  
  @js.native
  trait SemaphoreInterface extends StObject {
    
    def acquire(): js.Promise[js.Tuple2[Double, Releaser]] = js.native
    def acquire(weight: Double): js.Promise[js.Tuple2[Double, Releaser]] = js.native
    
    def cancel(): Unit = js.native
    
    def getValue(): Double = js.native
    
    def isLocked(): Boolean = js.native
    
    def release(): Unit = js.native
    def release(weight: Double): Unit = js.native
    
    def runExclusive[T](callback: Worker[T]): js.Promise[T] = js.native
    def runExclusive[T](callback: Worker[T], weight: Double): js.Promise[T] = js.native
    
    def setValue(value: Double): Unit = js.native
    
    def waitForUnlock(): js.Promise[Unit] = js.native
    def waitForUnlock(weight: Double): js.Promise[Unit] = js.native
  }
  object SemaphoreInterface {
    
    type Releaser = js.Function0[Unit]
    
    type Worker[T] = js.Function1[/* value */ Double, js.Promise[T] | T]
  }
}
