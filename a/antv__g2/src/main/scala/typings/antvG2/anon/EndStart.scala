package typings.antvG2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndStart extends StObject {
  
  var end: Any
  
  var start: Any
}
object EndStart {
  
  inline def apply(end: Any, start: Any): EndStart = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndStart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndStart] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Any): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
