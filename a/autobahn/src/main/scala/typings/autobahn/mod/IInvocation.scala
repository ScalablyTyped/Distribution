package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInvocation extends StObject {
  
  var caller: js.UndefOr[Double] = js.undefined
  
  var procedure: String
  
  var progress: js.UndefOr[js.Function2[/* args */ js.Array[Any], /* kwargs */ Any, Unit]] = js.undefined
}
object IInvocation {
  
  inline def apply(procedure: String): IInvocation = {
    val __obj = js.Dynamic.literal(procedure = procedure.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IInvocation] (val x: Self) extends AnyVal {
    
    inline def setCaller(value: Double): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
    
    inline def setCallerUndefined: Self = StObject.set(x, "caller", js.undefined)
    
    inline def setProcedure(value: String): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: (/* args */ js.Array[Any], /* kwargs */ Any) => Unit): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
  }
}
