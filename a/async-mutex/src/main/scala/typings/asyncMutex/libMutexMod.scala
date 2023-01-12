package typings.asyncMutex

import typings.asyncMutex.libMutexInterfaceMod.MutexInterface
import typings.asyncMutex.libMutexInterfaceMod.MutexInterface.Releaser
import typings.asyncMutex.libMutexInterfaceMod.MutexInterface.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMutexMod {
  
  @JSImport("async-mutex/lib/Mutex", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Mutex {
    def this(cancelError: js.Error) = this()
    
    /* private */ /* CompleteClass */
    var _semaphore: Any = js.native
    
    /* CompleteClass */
    override def acquire(): js.Promise[Releaser] = js.native
    
    /* CompleteClass */
    override def cancel(): Unit = js.native
    
    /* CompleteClass */
    override def isLocked(): Boolean = js.native
    
    /* CompleteClass */
    override def release(): Unit = js.native
    
    /* CompleteClass */
    override def runExclusive[T](callback: Worker[T]): js.Promise[T] = js.native
    
    /* CompleteClass */
    override def waitForUnlock(): js.Promise[Unit] = js.native
  }
  
  trait Mutex
    extends StObject
       with MutexInterface {
    
    /* private */ var _semaphore: Any
  }
  object Mutex {
    
    inline def apply(
      _semaphore: Any,
      acquire: () => js.Promise[Releaser],
      cancel: () => Unit,
      isLocked: () => Boolean,
      release: () => Unit,
      runExclusive: Worker[Any] => js.Promise[Any],
      waitForUnlock: () => js.Promise[Unit]
    ): Mutex = {
      val __obj = js.Dynamic.literal(_semaphore = _semaphore.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), isLocked = js.Any.fromFunction0(isLocked), release = js.Any.fromFunction0(release), runExclusive = js.Any.fromFunction1(runExclusive), waitForUnlock = js.Any.fromFunction0(waitForUnlock))
      __obj.asInstanceOf[Mutex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mutex] (val x: Self) extends AnyVal {
      
      inline def set_semaphore(value: Any): Self = StObject.set(x, "_semaphore", value.asInstanceOf[js.Any])
    }
  }
}
