package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comment2
  extends StObject
     with BaseNode
     with Node2 {
  
  var value: String | Null
}
object Comment2 {
  
  inline def apply(sourceSpan: ParseSourceSpan, visit: (Visitor, Any) => Any): Comment2 = {
    val __obj = js.Dynamic.literal(sourceSpan = sourceSpan.asInstanceOf[js.Any], visit = js.Any.fromFunction2(visit), value = null)
    __obj.asInstanceOf[Comment2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Comment2] (val x: Self) extends AnyVal {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
