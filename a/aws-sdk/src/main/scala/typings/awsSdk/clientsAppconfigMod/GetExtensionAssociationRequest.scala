package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExtensionAssociationRequest extends StObject {
  
  /**
    * The extension association ID to get.
    */
  var ExtensionAssociationId: Id
}
object GetExtensionAssociationRequest {
  
  inline def apply(ExtensionAssociationId: Id): GetExtensionAssociationRequest = {
    val __obj = js.Dynamic.literal(ExtensionAssociationId = ExtensionAssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExtensionAssociationRequest]
  }
  
  extension [Self <: GetExtensionAssociationRequest](x: Self) {
    
    inline def setExtensionAssociationId(value: Id): Self = StObject.set(x, "ExtensionAssociationId", value.asInstanceOf[js.Any])
  }
}
