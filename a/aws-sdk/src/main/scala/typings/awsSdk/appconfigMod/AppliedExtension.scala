package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppliedExtension extends StObject {
  
  /**
    * The system-generated ID for the association.
    */
  var ExtensionAssociationId: js.UndefOr[Id] = js.undefined
  
  /**
    * The system-generated ID of the extension.
    */
  var ExtensionId: js.UndefOr[Id] = js.undefined
  
  /**
    * One or more parameters for the actions called by the extension.
    */
  var Parameters: js.UndefOr[ParameterValueMap] = js.undefined
  
  /**
    * The extension version number.
    */
  var VersionNumber: js.UndefOr[Integer] = js.undefined
}
object AppliedExtension {
  
  inline def apply(): AppliedExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppliedExtension]
  }
  
  extension [Self <: AppliedExtension](x: Self) {
    
    inline def setExtensionAssociationId(value: Id): Self = StObject.set(x, "ExtensionAssociationId", value.asInstanceOf[js.Any])
    
    inline def setExtensionAssociationIdUndefined: Self = StObject.set(x, "ExtensionAssociationId", js.undefined)
    
    inline def setExtensionId(value: Id): Self = StObject.set(x, "ExtensionId", value.asInstanceOf[js.Any])
    
    inline def setExtensionIdUndefined: Self = StObject.set(x, "ExtensionId", js.undefined)
    
    inline def setParameters(value: ParameterValueMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setVersionNumber(value: Integer): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
