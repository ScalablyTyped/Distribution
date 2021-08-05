package typings.angularOdataResources.OData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  /* private */ def escapeIllegalChars(haystack: js.Any): js.Any
  
  def execute(): String
  
  def executeWithType(): js.Any
  
  def executeWithUndefinedType(): js.Any
  
  /* private */ def generateDate(date: js.Any): js.Any
  
  /* private */ var illegalChars: js.Any
  
  /* private */ var `type`: js.Any
  
  /* private */ var value: js.Any
}
object Value {
  
  inline def apply(
    escapeIllegalChars: js.Any => js.Any,
    execute: () => String,
    executeWithType: () => js.Any,
    executeWithUndefinedType: () => js.Any,
    generateDate: js.Any => js.Any,
    illegalChars: js.Any,
    `type`: js.Any,
    value: js.Any
  ): Value = {
    val __obj = js.Dynamic.literal(escapeIllegalChars = js.Any.fromFunction1(escapeIllegalChars), execute = js.Any.fromFunction0(execute), executeWithType = js.Any.fromFunction0(executeWithType), executeWithUndefinedType = js.Any.fromFunction0(executeWithUndefinedType), generateDate = js.Any.fromFunction1(generateDate), illegalChars = illegalChars.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setEscapeIllegalChars(value: js.Any => js.Any): Self = StObject.set(x, "escapeIllegalChars", js.Any.fromFunction1(value))
    
    inline def setExecute(value: () => String): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
    
    inline def setExecuteWithType(value: () => js.Any): Self = StObject.set(x, "executeWithType", js.Any.fromFunction0(value))
    
    inline def setExecuteWithUndefinedType(value: () => js.Any): Self = StObject.set(x, "executeWithUndefinedType", js.Any.fromFunction0(value))
    
    inline def setGenerateDate(value: js.Any => js.Any): Self = StObject.set(x, "generateDate", js.Any.fromFunction1(value))
    
    inline def setIllegalChars(value: js.Any): Self = StObject.set(x, "illegalChars", value.asInstanceOf[js.Any])
    
    inline def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
