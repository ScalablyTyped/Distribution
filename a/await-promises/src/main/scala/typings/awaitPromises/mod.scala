package typings.awaitPromises

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("await-promises", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("await-promises", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with AwaitPromises {
    
    /* CompleteClass */
    override def collect(): Unit = js.native
    
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
  
  inline def wait_(func: js.Function0[MaybePromise[Any]]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")(func.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait AwaitPromises extends StObject {
    
    def collect(): Unit
    
    def stop(): Unit
  }
  object AwaitPromises {
    
    inline def apply(collect: () => Unit, stop: () => Unit): AwaitPromises = {
      val __obj = js.Dynamic.literal(collect = js.Any.fromFunction0(collect), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[AwaitPromises]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AwaitPromises] (val x: Self) extends AnyVal {
      
      inline def setCollect(value: () => Unit): Self = StObject.set(x, "collect", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  type MaybePromise[T] = T | js.Promise[T]
}
