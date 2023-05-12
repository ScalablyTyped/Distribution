package typings.angularRouter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exact extends StObject {
  
  var exact: Boolean
}
object Exact {
  
  inline def apply(exact: Boolean): Exact = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Exact] (val x: Self) extends AnyVal {
    
    inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
  }
}
