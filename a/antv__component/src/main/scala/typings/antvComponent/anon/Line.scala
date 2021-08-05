package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Line extends StObject {
  
  var line: Length
  
  var point: Display
  
  var text: Content
}
object Line {
  
  inline def apply(line: Length, point: Display, text: Content): Line = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
  
  extension [Self <: Line](x: Self) {
    
    inline def setLine(value: Length): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: Display): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setText(value: Content): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
