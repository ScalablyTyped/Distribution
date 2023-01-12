package typings.angularOdataResources.OData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  /* private */ def escapeIllegalChars(haystack: Any): Any
  
  def execute(): String
  
  def executeWithType(): Any
  
  def executeWithUndefinedType(): Any
  
  /* private */ def generateDate(date: Any): Any
  
  /* private */ var illegalChars: Any
  
  /* private */ var `type`: Any
  
  /* private */ var value: Any
}
object Value {
  
  inline def apply(
    escapeIllegalChars: Any => Any,
    execute: () => String,
    executeWithType: () => Any,
    executeWithUndefinedType: () => Any,
    generateDate: Any => Any,
    illegalChars: Any,
    `type`: Any,
    value: Any
  ): Value = {
    val __obj = js.Dynamic.literal(escapeIllegalChars = js.Any.fromFunction1(escapeIllegalChars), execute = js.Any.fromFunction0(execute), executeWithType = js.Any.fromFunction0(executeWithType), executeWithUndefinedType = js.Any.fromFunction0(executeWithUndefinedType), generateDate = js.Any.fromFunction1(generateDate), illegalChars = illegalChars.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    inline def setEscapeIllegalChars(value: Any => Any): Self = StObject.set(x, "escapeIllegalChars", js.Any.fromFunction1(value))
    
    inline def setExecute(value: () => String): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
    
    inline def setExecuteWithType(value: () => Any): Self = StObject.set(x, "executeWithType", js.Any.fromFunction0(value))
    
    inline def setExecuteWithUndefinedType(value: () => Any): Self = StObject.set(x, "executeWithUndefinedType", js.Any.fromFunction0(value))
    
    inline def setGenerateDate(value: Any => Any): Self = StObject.set(x, "generateDate", js.Any.fromFunction1(value))
    
    inline def setIllegalChars(value: Any): Self = StObject.set(x, "illegalChars", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
