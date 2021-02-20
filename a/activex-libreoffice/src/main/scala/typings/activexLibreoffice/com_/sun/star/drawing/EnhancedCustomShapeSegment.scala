package typings.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnhancedCustomShapeSegment extends StObject {
  
  var Command: Double = js.native
  
  var Count: Double = js.native
}
object EnhancedCustomShapeSegment {
  
  @scala.inline
  def apply(Command: Double, Count: Double): EnhancedCustomShapeSegment = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedCustomShapeSegment]
  }
  
  @scala.inline
  implicit class EnhancedCustomShapeSegmentMutableBuilder[Self <: EnhancedCustomShapeSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: Double): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
  }
}
