package typings.ahooks.anon

import typings.ahooks.libUseDebounceFnMod.noop
import typings.lodash.mod.DebouncedFunc
import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancel[T /* <: noop */] extends StObject {
  
  def cancel(): Unit
  
  def flush(): js.UndefOr[ReturnType[T]]
  
  var run: DebouncedFunc[js.Function1[/* args */ Parameters[T], ReturnType[T]]]
}
object Cancel {
  
  inline def apply[T /* <: noop */](
    cancel: () => Unit,
    flush: () => js.UndefOr[ReturnType[T]],
    run: DebouncedFunc[js.Function1[/* args */ Parameters[T], ReturnType[T]]]
  ): Cancel[T] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), flush = js.Any.fromFunction0(flush), run = run.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel[T]]
  }
  
  extension [Self <: Cancel[?], T /* <: noop */](x: Self & Cancel[T]) {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setFlush(value: () => js.UndefOr[ReturnType[T]]): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    
    inline def setRun(value: DebouncedFunc[js.Function1[/* args */ Parameters[T], ReturnType[T]]]): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
  }
}
