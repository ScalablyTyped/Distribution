package typings.antDesignProProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Total extends StObject {
  
  var total: Range
}
object Total {
  
  inline def apply(total: Range): Total = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Total]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Total] (val x: Self) extends AnyVal {
    
    inline def setTotal(value: Range): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
