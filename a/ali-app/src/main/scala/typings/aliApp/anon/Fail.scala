package typings.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fail extends StObject {
  
  var fail: js.UndefOr[js.Function1[/* res */ Error, Unit]] = js.undefined
  
  var result: HitKeywords
}
object Fail {
  
  inline def apply(result: HitKeywords): Fail = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fail] (val x: Self) extends AnyVal {
    
    inline def setFail(value: /* res */ Error => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setResult(value: HitKeywords): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
