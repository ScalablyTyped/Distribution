package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionAssociationSummary extends StObject {
  
  /**
    * The system-generated Amazon Resource Name (ARN) for the extension.
    */
  var ExtensionArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The extension association ID. This ID is used to call other ExtensionAssociation API actions such as GetExtensionAssociation or DeleteExtensionAssociation.
    */
  var Id: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The ARNs of applications, configuration profiles, or environments defined in the association.
    */
  var ResourceArn: js.UndefOr[Arn] = js.undefined
}
object ExtensionAssociationSummary {
  
  inline def apply(): ExtensionAssociationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensionAssociationSummary]
  }
  
  extension [Self <: ExtensionAssociationSummary](x: Self) {
    
    inline def setExtensionArn(value: Arn): Self = StObject.set(x, "ExtensionArn", value.asInstanceOf[js.Any])
    
    inline def setExtensionArnUndefined: Self = StObject.set(x, "ExtensionArn", js.undefined)
    
    inline def setId(value: Identifier): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
  }
}
