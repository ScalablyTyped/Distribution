package typings.angularCompilerCli.anon

import typings.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstCompileResult extends StObject {
  
  def close(): Unit
  
  var firstCompileResult: js.Array[Diagnostic]
  
  def ready(cb: js.Function0[Unit]): Unit
}
object FirstCompileResult {
  
  inline def apply(close: () => Unit, firstCompileResult: js.Array[Diagnostic], ready: js.Function0[Unit] => Unit): FirstCompileResult = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), firstCompileResult = firstCompileResult.asInstanceOf[js.Any], ready = js.Any.fromFunction1(ready))
    __obj.asInstanceOf[FirstCompileResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirstCompileResult] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setFirstCompileResult(value: js.Array[Diagnostic]): Self = StObject.set(x, "firstCompileResult", value.asInstanceOf[js.Any])
    
    inline def setFirstCompileResultVarargs(value: Diagnostic*): Self = StObject.set(x, "firstCompileResult", js.Array(value*))
    
    inline def setReady(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction1(value))
  }
}
