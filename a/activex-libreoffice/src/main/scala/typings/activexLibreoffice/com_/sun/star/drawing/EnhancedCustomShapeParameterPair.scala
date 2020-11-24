package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the coordinates used with EnhancedCustomShapes */
@js.native
trait EnhancedCustomShapeParameterPair extends js.Object {
  
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
  implicit class EnhancedCustomShapeParameterPairOps[Self <: EnhancedCustomShapeParameterPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFirst(value: EnhancedCustomShapeParameter): Self = this.set("First", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: EnhancedCustomShapeParameter): Self = this.set("Second", value.asInstanceOf[js.Any])
  }
}
