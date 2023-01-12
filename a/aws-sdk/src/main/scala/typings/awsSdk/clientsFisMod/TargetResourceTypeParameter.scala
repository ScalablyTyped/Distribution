package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetResourceTypeParameter extends StObject {
  
  /**
    * A description of the parameter.
    */
  var description: js.UndefOr[TargetResourceTypeParameterDescription] = js.undefined
  
  /**
    * Indicates whether the parameter is required.
    */
  var required: js.UndefOr[TargetResourceTypeParameterRequired] = js.undefined
}
object TargetResourceTypeParameter {
  
  inline def apply(): TargetResourceTypeParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetResourceTypeParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetResourceTypeParameter] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: TargetResourceTypeParameterDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setRequired(value: TargetResourceTypeParameterRequired): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
