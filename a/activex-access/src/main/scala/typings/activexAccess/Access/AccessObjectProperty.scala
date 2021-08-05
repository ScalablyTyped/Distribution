package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessObjectProperty extends StObject {
  
  /* private */ @JSName("Access.AccessObjectProperty_typekey")
  var AccessDotAccessObjectProperty_typekey: AccessObjectProperty
  
  def IsMemberSafe(dispid: Double): Boolean
  
  val Name: String
  
  var Value: js.Any
  
  val _Value: js.Any
}
object AccessObjectProperty {
  
  inline def apply(
    AccessDotAccessObjectProperty_typekey: AccessObjectProperty,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Value: js.Any,
    _Value: js.Any
  ): AccessObjectProperty = {
    val __obj = js.Dynamic.literal(IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], _Value = _Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.AccessObjectProperty_typekey")(AccessDotAccessObjectProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessObjectProperty]
  }
  
  extension [Self <: AccessObjectProperty](x: Self) {
    
    inline def setAccessDotAccessObjectProperty_typekey(value: AccessObjectProperty): Self = StObject.set(x, "Access.AccessObjectProperty_typekey", value.asInstanceOf[js.Any])
    
    inline def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def set_Value(value: js.Any): Self = StObject.set(x, "_Value", value.asInstanceOf[js.Any])
  }
}
