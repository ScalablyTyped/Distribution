package typings.antvG2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsePath extends StObject {
  
  var parsePath: js.Any
  
  var parsePoint: js.Any
  
  var parsePoints: js.Any
}
object ParsePath {
  
  inline def apply(parsePath: js.Any, parsePoint: js.Any, parsePoints: js.Any): ParsePath = {
    val __obj = js.Dynamic.literal(parsePath = parsePath.asInstanceOf[js.Any], parsePoint = parsePoint.asInstanceOf[js.Any], parsePoints = parsePoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsePath]
  }
  
  extension [Self <: ParsePath](x: Self) {
    
    inline def setParsePath(value: js.Any): Self = StObject.set(x, "parsePath", value.asInstanceOf[js.Any])
    
    inline def setParsePoint(value: js.Any): Self = StObject.set(x, "parsePoint", value.asInstanceOf[js.Any])
    
    inline def setParsePoints(value: js.Any): Self = StObject.set(x, "parsePoints", value.asInstanceOf[js.Any])
  }
}
