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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteExtensionAssociationRequest] (val x: Self) extends AnyVal {
    
    inline def setExtensionAssociationId(value: Id): Self = StObject.set(x, "ExtensionAssociationId", value.asInstanceOf[js.Any])
  }
}
