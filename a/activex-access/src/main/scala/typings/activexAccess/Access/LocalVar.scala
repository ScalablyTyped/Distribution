package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalVar extends StObject {
  
  /* private */ @JSName("Access.LocalVar_typekey")
  var AccessDotLocalVar_typekey: LocalVar
  
  def IsMemberSafe(dispid: Double): Boolean
  
  val Name: String
  
  var Value: Any
  
  var _Value: Any
}
object LocalVar {
  
  inline def apply(
    AccessDotLocalVar_typekey: LocalVar,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Value: Any,
    _Value: Any
  ): LocalVar = {
    val __obj = js.Dynamic.literal(IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], _Value = _Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.LocalVar_typekey")(AccessDotLocalVar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalVar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalVar] (val x: Self) extends AnyVal {
    
    inline def setAccessDotLocalVar_typekey(value: LocalVar): Self = StObject.set(x, "Access.LocalVar_typekey", value.asInstanceOf[js.Any])
    
    inline def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def set_Value(value: Any): Self = StObject.set(x, "_Value", value.asInstanceOf[js.Any])
  }
}
