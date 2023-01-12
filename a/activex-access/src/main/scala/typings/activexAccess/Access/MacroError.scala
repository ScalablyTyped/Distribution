package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MacroError extends StObject {
  
  /* private */ @JSName("Access.MacroError_typekey")
  var AccessDotMacroError_typekey: MacroError
  
  val ActionName: String
  
  val Arguments: String
  
  val Condition: String
  
  val Description: String
  
  def IsMemberSafe(dispid: Double): Boolean
  
  val MacroName: String
  
  val Number: Double
}
object MacroError {
  
  inline def apply(
    AccessDotMacroError_typekey: MacroError,
    ActionName: String,
    Arguments: String,
    Condition: String,
    Description: String,
    IsMemberSafe: Double => Boolean,
    MacroName: String,
    Number: Double
  ): MacroError = {
    val __obj = js.Dynamic.literal(ActionName = ActionName.asInstanceOf[js.Any], Arguments = Arguments.asInstanceOf[js.Any], Condition = Condition.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), MacroName = MacroName.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.MacroError_typekey")(AccessDotMacroError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacroError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MacroError] (val x: Self) extends AnyVal {
    
    inline def setAccessDotMacroError_typekey(value: MacroError): Self = StObject.set(x, "Access.MacroError_typekey", value.asInstanceOf[js.Any])
    
    inline def setActionName(value: String): Self = StObject.set(x, "ActionName", value.asInstanceOf[js.Any])
    
    inline def setArguments(value: String): Self = StObject.set(x, "Arguments", value.asInstanceOf[js.Any])
    
    inline def setCondition(value: String): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    inline def setMacroName(value: String): Self = StObject.set(x, "MacroName", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "Number", value.asInstanceOf[js.Any])
  }
}
