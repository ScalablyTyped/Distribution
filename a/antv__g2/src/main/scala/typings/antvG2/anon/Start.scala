package typings.antvG2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Start extends StObject {
  
  var end: X
  
  var start: X
}
object Start {
  
  inline def apply(end: X, start: X): Start = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Start]
  }
  
  extension [Self <: Start](x: Self) {
    
    inline def setEnd(value: X): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: X): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
