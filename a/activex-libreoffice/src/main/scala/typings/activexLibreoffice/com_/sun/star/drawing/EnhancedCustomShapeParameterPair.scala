package typings.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the coordinates used with EnhancedCustomShapes */
@js.native
trait EnhancedCustomShapeParameterPair extends StObject {
  
  var First: EnhancedCustomShapeParameter = js.native
  
  var Second: EnhancedCustomShapeParameter = js.native
}
object EnhancedCustomShapeParameterPair {
  
  @scala.inline
  def apply(First: EnhancedCustomShapeParameter, Second: EnhancedCustomShapeParameter): EnhancedCustomShapeParameterPair = {
    val __obj = js.Dynamic.literal(First = First.asInstanceOf[js.Any], Second = Second.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedCustomShapeParameterPair]
  }
  
  @scala.inline
  implicit class EnhancedCustomShapeParameterPairMutableBuilder[Self <: EnhancedCustomShapeParameterPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirst(value: EnhancedCustomShapeParameter): Self = StObject.set(x, "First", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: EnhancedCustomShapeParameter): Self = StObject.set(x, "Second", value.asInstanceOf[js.Any])
  }
}
