package typings.antDesignProUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancel[U] extends StObject {
  
  def cancel(): Unit
  
  def run(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): js.Promise[js.UndefOr[U]]
}
object Cancel {
  
  inline def apply[U](cancel: () => Unit, run: Any => js.Promise[js.UndefOr[U]]): Cancel[U] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[Cancel[U]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cancel[?], U] (val x: Self & Cancel[U]) extends AnyVal {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setRun(value: Any => js.Promise[js.UndefOr[U]]): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
  }
}
