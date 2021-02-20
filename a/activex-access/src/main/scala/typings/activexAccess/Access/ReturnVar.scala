package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnVar extends StObject {
  
  @JSName("Access.ReturnVar_typekey")
  var AccessDotReturnVar_typekey: ReturnVar = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  val Name: String = js.native
  
  val Value: String | Double = js.native
  
  val _Value: String | Double = js.native
}
object ReturnVar {
  
  @scala.inline
  def apply(
    AccessDotReturnVar_typekey: ReturnVar,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Value: String | Double,
    _Value: String | Double
  ): ReturnVar = {
    val __obj = js.Dynamic.literal(IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], _Value = _Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.ReturnVar_typekey")(AccessDotReturnVar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnVar]
  }
  
  @scala.inline
  implicit class ReturnVarMutableBuilder[Self <: ReturnVar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessDotReturnVar_typekey(value: ReturnVar): Self = StObject.set(x, "Access.ReturnVar_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String | Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_Value(value: String | Double): Self = StObject.set(x, "_Value", value.asInstanceOf[js.Any])
  }
}
