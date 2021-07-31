package typings.antDesignProUtils

import typings.react.mod.DependencyList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDebounceFnMod {
  
  @JSImport("@ant-design/pro-utils/lib/hooks/useDebounceFn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T /* <: js.Array[js.Any] */](fn: js.Function1[/* args */ T, js.Promise[js.Any]], deps: Double): ReturnValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[ReturnValue[T]]
  @scala.inline
  def default[T /* <: js.Array[js.Any] */](fn: js.Function1[/* args */ T, js.Promise[js.Any]], deps: Double, wait: Double): ReturnValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[ReturnValue[T]]
  @scala.inline
  def default[T /* <: js.Array[js.Any] */](fn: js.Function1[/* args */ T, js.Promise[js.Any]], deps: DependencyList): ReturnValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[ReturnValue[T]]
  @scala.inline
  def default[T /* <: js.Array[js.Any] */](fn: js.Function1[/* args */ T, js.Promise[js.Any]], deps: DependencyList, wait: Double): ReturnValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[ReturnValue[T]]
  
  trait ReturnValue[T /* <: js.Array[js.Any] */] extends StObject {
    
    def cancel(): Unit
    
    def run(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
    ): Unit
  }
  object ReturnValue {
    
    @scala.inline
    def apply[T /* <: js.Array[js.Any] */](cancel: () => Unit, run: T => Unit): ReturnValue[T] = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), run = js.Any.fromFunction1(run))
      __obj.asInstanceOf[ReturnValue[T]]
    }
    
    @scala.inline
    implicit class ReturnValueMutableBuilder[Self <: ReturnValue[?], T /* <: js.Array[js.Any] */] (val x: Self & ReturnValue[T]) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRun(value: T => Unit): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
    }
  }
}
