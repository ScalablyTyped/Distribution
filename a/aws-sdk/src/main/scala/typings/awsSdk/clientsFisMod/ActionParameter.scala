package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionParameter extends StObject {
  
  /**
    * The parameter description.
    */
  var description: js.UndefOr[ActionParameterDescription] = js.undefined
  
  /**
    * Indicates whether the parameter is required.
    */
  var required: js.UndefOr[ActionParameterRequired] = js.undefined
}
object ActionParameter {
  
  inline def apply(): ActionParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionParameter]
  }
  
  extension [Self <: ActionParameter](x: Self) {
    
    inline def setDescription(value: ActionParameterDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setRequired(value: ActionParameterRequired): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
