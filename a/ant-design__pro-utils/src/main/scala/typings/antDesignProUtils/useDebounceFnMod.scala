package typings.antDesignProUtils

import typings.react.mod.DependencyList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDebounceFnMod {
  
  @JSImport("@ant-design/pro-utils/lib/hooks/useDebounceFn", JSImport.Default)
  @js.native
  def default[T /* <: js.Array[_] */](fn: js.Function1[/* args */ T, js.Promise[_]], deps: Double): ReturnValue[T] = js.native
  @JSImport("@ant-design/pro-utils/lib/hooks/useDebounceFn", JSImport.Default)
  @js.native
  def default[T /* <: js.Array[_] */](fn: js.Function1[/* args */ T, js.Promise[_]], deps: Double, wait: Double): ReturnValue[T] = js.native
  @JSImport("@ant-design/pro-utils/lib/hooks/useDebounceFn", JSImport.Default)
  @js.native
  def default[T /* <: js.Array[_] */](fn: js.Function1[/* args */ T, js.Promise[_]], deps: DependencyList): ReturnValue[T] = js.native
  @JSImport("@ant-design/pro-utils/lib/hooks/useDebounceFn", JSImport.Default)
  @js.native
  def default[T /* <: js.Array[_] */](fn: js.Function1[/* args */ T, js.Promise[_]], deps: DependencyList, wait: Double): ReturnValue[T] = js.native
  
  @js.native
  trait ReturnValue[T /* <: js.Array[_] */] extends StObject {
    
    def cancel(): Unit = js.native
    
    def run(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
    ): Unit = js.native
  }
  object ReturnValue {
    
    @scala.inline
    def apply[T /* <: js.Array[_] */](cancel: () => Unit, run: T => Unit): ReturnValue[T] = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), run = js.Any.fromFunction1(run))
      __obj.asInstanceOf[ReturnValue[T]]
    }
    
    @scala.inline
    implicit class ReturnValueMutableBuilder[Self <: ReturnValue[_], T /* <: js.Array[_] */] (val x: Self with ReturnValue[T]) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRun(value: T => Unit): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
    }
  }
}
