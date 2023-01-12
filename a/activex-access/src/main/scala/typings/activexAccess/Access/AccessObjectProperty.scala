package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessObjectProperty extends StObject {
  
  /* private */ @JSName("Access.AccessObjectProperty_typekey")
  var AccessDotAccessObjectProperty_typekey: AccessObjectProperty
  
  def IsMemberSafe(dispid: Double): Boolean
  
  val Name: String
  
  var Value: Any
  
  val _Value: Any
}
object AccessObjectProperty {
  
  inline def apply(
    AccessDotAccessObjectProperty_typekey: AccessObjectProperty,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Value: Any,
    _Value: Any
  ): AccessObjectProperty = {
    val __obj = js.Dynamic.literal(IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], _Value = _Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.AccessObjectProperty_typekey")(AccessDotAccessObjectProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessObjectProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessObjectProperty] (val x: Self) extends AnyVal {
    
    inline def setAccessDotAccessObjectProperty_typekey(value: AccessObjectProperty): Self = StObject.set(x, "Access.AccessObjectProperty_typekey", value.asInstanceOf[js.Any])
    
    inline def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def set_Value(value: Any): Self = StObject.set(x, "_Value", value.asInstanceOf[js.Any])
  }
}
