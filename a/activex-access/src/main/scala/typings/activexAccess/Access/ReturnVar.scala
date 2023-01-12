package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnVar extends StObject {
  
  /* private */ @JSName("Access.ReturnVar_typekey")
  var AccessDotReturnVar_typekey: ReturnVar
  
  def IsMemberSafe(dispid: Double): Boolean
  
  val Name: String
  
  val Value: String | Double
  
  val _Value: String | Double
}
object ReturnVar {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: ReturnVar] (val x: Self) extends AnyVal {
    
    inline def setAccessDotReturnVar_typekey(value: ReturnVar): Self = StObject.set(x, "Access.ReturnVar_typekey", value.asInstanceOf[js.Any])
    
    inline def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def set_Value(value: String | Double): Self = StObject.set(x, "_Value", value.asInstanceOf[js.Any])
  }
}
