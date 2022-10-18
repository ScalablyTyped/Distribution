package typings.asyncMutex

import typings.asyncMutex.libMutexInterfaceMod.MutexInterface.Releaser
import typings.asyncMutex.libMutexInterfaceMod.MutexInterface.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMutexInterfaceMod {
  
  trait MutexInterface extends StObject {
    
    def acquire(): js.Promise[Releaser]
    
    def cancel(): Unit
    
    def isLocked(): Boolean
    
    def release(): Unit
    
    def runExclusive[T](callback: Worker[T]): js.Promise[T]
    
    def waitForUnlock(): js.Promise[Unit]
  }
  object MutexInterface {
    
    inline def apply(
      acquire: () => js.Promise[Releaser],
      cancel: () => Unit,
      isLocked: () => Boolean,
      release: () => Unit,
      runExclusive: Worker[Any] => js.Promise[Any],
      waitForUnlock: () => js.Promise[Unit]
    ): MutexInterface = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), isLocked = js.Any.fromFunction0(isLocked), release = js.Any.fromFunction0(release), runExclusive = js.Any.fromFunction1(runExclusive), waitForUnlock = js.Any.fromFunction0(waitForUnlock))
      __obj.asInstanceOf[MutexInterface]
    }
    
    extension [Self <: MutexInterface](x: Self) {
      
      inline def setAcquire(value: () => js.Promise[Releaser]): Self = StObject.set(x, "acquire", js.Any.fromFunction0(value))
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setIsLocked(value: () => Boolean): Self = StObject.set(x, "isLocked", js.Any.fromFunction0(value))
      
      inline def setRelease(value: () => Unit): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
      
      inline def setRunExclusive(value: Worker[Any] => js.Promise[Any]): Self = StObject.set(x, "runExclusive", js.Any.fromFunction1(value))
      
      inline def setWaitForUnlock(value: () => js.Promise[Unit]): Self = StObject.set(x, "waitForUnlock", js.Any.fromFunction0(value))
    }
    
    type Releaser = js.Function0[Unit]
    
    type Worker[T] = js.Function0[js.Promise[T] | T]
  }
}
