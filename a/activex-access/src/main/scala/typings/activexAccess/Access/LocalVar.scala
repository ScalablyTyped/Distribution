package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalVar extends StObject {
  
  @JSName("Access.LocalVar_typekey")
  var AccessDotLocalVar_typekey: LocalVar = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  val Name: String = js.native
  
  var Value: js.Any = js.native
  
  var _Value: js.Any = js.native
}
object LocalVar {
  
  @scala.inline
  def apply(
    AccessDotLocalVar_typekey: LocalVar,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Value: js.Any,
    _Value: js.Any
  ): LocalVar = {
    val __obj = js.Dynamic.literal(IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], _Value = _Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.LocalVar_typekey")(AccessDotLocalVar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalVar]
  }
  
  @scala.inline
  implicit class LocalVarMutableBuilder[Self <: LocalVar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessDotLocalVar_typekey(value: LocalVar): Self = StObject.set(x, "Access.LocalVar_typekey", value.asInstanceOf[js.Any])
    
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
