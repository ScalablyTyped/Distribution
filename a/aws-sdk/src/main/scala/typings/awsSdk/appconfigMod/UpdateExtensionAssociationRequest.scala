package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateExtensionAssociationRequest extends StObject {
  
  /**
    * The system-generated ID for the association.
    */
  var ExtensionAssociationId: Id
  
  /**
    * The parameter names and values defined in the extension.
    */
  var Parameters: js.UndefOr[ParameterValueMap] = js.undefined
}
object UpdateExtensionAssociationRequest {
  
  inline def apply(ExtensionAssociationId: Id): UpdateExtensionAssociationRequest = {
    val __obj = js.Dynamic.literal(ExtensionAssociationId = ExtensionAssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateExtensionAssociationRequest]
  }
  
  extension [Self <: UpdateExtensionAssociationRequest](x: Self) {
    
    inline def setExtensionAssociationId(value: Id): Self = StObject.set(x, "ExtensionAssociationId", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: ParameterValueMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
  }
}
