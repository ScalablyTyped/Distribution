package typings.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnhancedCustomShapeSegment extends StObject {
  
  var Command: Double
  
  var Count: Double
}
object EnhancedCustomShapeSegment {
  
  inline def apply(Command: Double, Count: Double): EnhancedCustomShapeSegment = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedCustomShapeSegment]
  }
  
  extension [Self <: EnhancedCustomShapeSegment](x: Self) {
    
    inline def setCommand(value: Double): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
  }
}
