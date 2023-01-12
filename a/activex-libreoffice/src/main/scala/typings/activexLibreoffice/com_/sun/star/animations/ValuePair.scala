package typings.activexLibreoffice.com_.sun.star.animations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValuePair extends StObject {
  
  var First: Any
  
  var Second: Any
}
object ValuePair {
  
  inline def apply(First: Any, Second: Any): ValuePair = {
    val __obj = js.Dynamic.literal(First = First.asInstanceOf[js.Any], Second = Second.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValuePair]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValuePair] (val x: Self) extends AnyVal {
    
    inline def setFirst(value: Any): Self = StObject.set(x, "First", value.asInstanceOf[js.Any])
    
    inline def setSecond(value: Any): Self = StObject.set(x, "Second", value.asInstanceOf[js.Any])
  }
}
