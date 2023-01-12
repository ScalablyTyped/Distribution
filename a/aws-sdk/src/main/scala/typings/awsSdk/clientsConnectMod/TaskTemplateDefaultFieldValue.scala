package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskTemplateDefaultFieldValue extends StObject {
  
  /**
    * Default value for the field.
    */
  var DefaultValue: js.UndefOr[TaskTemplateFieldValue] = js.undefined
  
  /**
    * Identifier of a field. 
    */
  var Id: js.UndefOr[TaskTemplateFieldIdentifier] = js.undefined
}
object TaskTemplateDefaultFieldValue {
  
  inline def apply(): TaskTemplateDefaultFieldValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskTemplateDefaultFieldValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskTemplateDefaultFieldValue] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: TaskTemplateFieldValue): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "DefaultValue", js.undefined)
    
    inline def setId(value: TaskTemplateFieldIdentifier): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
