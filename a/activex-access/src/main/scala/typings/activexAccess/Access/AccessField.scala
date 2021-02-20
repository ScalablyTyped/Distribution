package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessField extends StObject {
  
  @JSName("Access.AccessField_typekey")
  var AccessDotAccessField_typekey: AccessField = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  var Value: js.Any = js.native
}
object AccessField {
  
  @scala.inline
  def apply(AccessDotAccessField_typekey: AccessField, IsMemberSafe: Double => Boolean, Value: js.Any): AccessField = {
    val __obj = js.Dynamic.literal(IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.AccessField_typekey")(AccessDotAccessField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessField]
  }
  
  @scala.inline
  implicit class AccessFieldMutableBuilder[Self <: AccessField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessDotAccessField_typekey(value: AccessField): Self = StObject.set(x, "Access.AccessField_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
