package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInvocation extends StObject {
  
  var caller: js.UndefOr[Double] = js.native
  
  var procedure: String = js.native
  
  var progress: js.UndefOr[js.Function2[/* args */ js.Array[_], /* kwargs */ js.Any, Unit]] = js.native
}
object IInvocation {
  
  @scala.inline
  def apply(procedure: String): IInvocation = {
    val __obj = js.Dynamic.literal(procedure = procedure.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvocation]
  }
  
  @scala.inline
  implicit class IInvocationMutableBuilder[Self <: IInvocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaller(value: Double): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallerUndefined: Self = StObject.set(x, "caller", js.undefined)
    
    @scala.inline
    def setProcedure(value: String): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: (/* args */ js.Array[_], /* kwargs */ js.Any) => Unit): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
  }
}
