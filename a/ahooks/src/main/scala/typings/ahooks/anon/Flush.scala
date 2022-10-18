package typings.ahooks.anon

import typings.ahooks.libUseThrottleFnMod.noop
import typings.lodash.mod.DebouncedFunc
import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flush[T /* <: noop */] extends StObject {
  
  def cancel(): Unit
  
  def flush(): js.UndefOr[ReturnType[T]]
  
  var run: DebouncedFunc[js.Function1[/* args */ Parameters[T], ReturnType[T]]]
}
object Flush {
  
  inline def apply[T /* <: noop */](
    cancel: () => Unit,
    flush: () => js.UndefOr[ReturnType[T]],
    run: DebouncedFunc[js.Function1[/* args */ Parameters[T], ReturnType[T]]]
  ): Flush[T] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), flush = js.Any.fromFunction0(flush), run = run.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flush[T]]
  }
  
  extension [Self <: Flush[?], T /* <: noop */](x: Self & Flush[T]) {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setFlush(value: () => js.UndefOr[ReturnType[T]]): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    
    inline def setRun(value: DebouncedFunc[js.Function1[/* args */ Parameters[T], ReturnType[T]]]): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
  }
}
