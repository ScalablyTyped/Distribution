package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineType extends StObject {
  
  var line: Type
}
object LineType {
  
  inline def apply(line: Type): LineType = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineType]
  }
  
  extension [Self <: LineType](x: Self) {
    
    inline def setLine(value: Type): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
