package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskTemplateDefaults extends StObject {
  
  /**
    * Default value for the field.
    */
  var DefaultFieldValues: js.UndefOr[TaskTemplateDefaultFieldValueList] = js.undefined
}
object TaskTemplateDefaults {
  
  inline def apply(): TaskTemplateDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskTemplateDefaults]
  }
  
  extension [Self <: TaskTemplateDefaults](x: Self) {
    
    inline def setDefaultFieldValues(value: TaskTemplateDefaultFieldValueList): Self = StObject.set(x, "DefaultFieldValues", value.asInstanceOf[js.Any])
    
    inline def setDefaultFieldValuesUndefined: Self = StObject.set(x, "DefaultFieldValues", js.undefined)
    
    inline def setDefaultFieldValuesVarargs(value: TaskTemplateDefaultFieldValue*): Self = StObject.set(x, "DefaultFieldValues", js.Array(value*))
  }
}
