package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessObjectProperty extends StObject {
  
  @JSName("Access.AccessObjectProperty_typekey")
  var AccessDotAccessObjectProperty_typekey: AccessObjectProperty = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  val Name: String = js.native
  
  var Value: js.Any = js.native
  
  val _Value: js.Any = js.native
}
object AccessObjectProperty {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class AccessObjectPropertyMutableBuilder[Self <: AccessObjectProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessDotAccessObjectProperty_typekey(value: AccessObjectProperty): Self = StObject.set(x, "Access.AccessObjectProperty_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_Value(value: js.Any): Self = StObject.set(x, "_Value", value.asInstanceOf[js.Any])
  }
}
