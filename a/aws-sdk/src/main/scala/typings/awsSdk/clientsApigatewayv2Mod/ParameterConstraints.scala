package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterConstraints extends StObject {
  
  /**
    * Whether or not the parameter is required.
    */
  var Required: js.UndefOr[boolean] = js.undefined
}
object ParameterConstraints {
  
  inline def apply(): ParameterConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterConstraints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParameterConstraints] (val x: Self) extends AnyVal {
    
    inline def setRequired(value: boolean): Self = StObject.set(x, "Required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "Required", js.undefined)
  }
}
