package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteExtensionAssociationRequest extends StObject {
  
  /**
    * The ID of the extension association to delete.
    */
  var ExtensionAssociationId: Id
}
object DeleteExtensionAssociationRequest {
  
  inline def apply(ExtensionAssociationId: Id): DeleteExtensionAssociationRequest = {
    val __obj = js.Dynamic.literal(ExtensionAssociationId = ExtensionAssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteExtensionAssociationRequest]
  }
  
  extension [Self <: DeleteExtensionAssociationRequest](x: Self) {
    
    inline def setExtensionAssociationId(value: Id): Self = StObject.set(x, "ExtensionAssociationId", value.asInstanceOf[js.Any])
  }
}
