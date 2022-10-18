package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionAssociation extends StObject {
  
  /**
    * The system-generated Amazon Resource Name (ARN) for the extension.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsAppconfigMod.Arn] = js.undefined
  
  /**
    * The ARN of the extension defined in the association.
    */
  var ExtensionArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The version number for the extension defined in the association.
    */
  var ExtensionVersionNumber: js.UndefOr[Integer] = js.undefined
  
  /**
    * The system-generated ID for the association.
    */
  var Id: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The parameter names and values defined in the association.
    */
  var Parameters: js.UndefOr[ParameterValueMap] = js.undefined
  
  /**
    * The ARNs of applications, configuration profiles, or environments defined in the association.
    */
  var ResourceArn: js.UndefOr[Arn] = js.undefined
}
object ExtensionAssociation {
  
  inline def apply(): ExtensionAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensionAssociation]
  }
  
  extension [Self <: ExtensionAssociation](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setExtensionArn(value: Arn): Self = StObject.set(x, "ExtensionArn", value.asInstanceOf[js.Any])
    
    inline def setExtensionArnUndefined: Self = StObject.set(x, "ExtensionArn", js.undefined)
    
    inline def setExtensionVersionNumber(value: Integer): Self = StObject.set(x, "ExtensionVersionNumber", value.asInstanceOf[js.Any])
    
    inline def setExtensionVersionNumberUndefined: Self = StObject.set(x, "ExtensionVersionNumber", js.undefined)
    
    inline def setId(value: Identifier): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setParameters(value: ParameterValueMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
  }
}
