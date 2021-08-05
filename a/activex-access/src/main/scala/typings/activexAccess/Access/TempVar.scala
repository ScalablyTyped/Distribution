package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TempVar extends StObject {
  
  /* private */ @JSName("Access.TempVar_typekey")
  var AccessDotTempVar_typekey: TempVar
  
  def IsMemberSafe(dispid: Double): Boolean
  
  val Name: String
  
  var Value: Double | String | Boolean
  
  var _Value: Double | String | Boolean
}
object TempVar {
  
  inline def apply(
    AccessDotTempVar_typekey: TempVar,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Value: Double | String | Boolean,
    _Value: Double | String | Boolean
  ): TempVar = {
    val __obj = js.Dynamic.literal(IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], _Value = _Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.TempVar_typekey")(AccessDotTempVar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempVar]
  }
  
  extension [Self <: TempVar](x: Self) {
    
    inline def setAccessDotTempVar_typekey(value: TempVar): Self = StObject.set(x, "Access.TempVar_typekey", value.asInstanceOf[js.Any])
    
    inline def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double | String | Boolean): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def set_Value(value: Double | String | Boolean): Self = StObject.set(x, "_Value", value.asInstanceOf[js.Any])
  }
}
