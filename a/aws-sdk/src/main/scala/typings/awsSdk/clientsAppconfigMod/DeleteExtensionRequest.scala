package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteExtensionRequest extends StObject {
  
  /**
    * The name, ID, or Amazon Resource Name (ARN) of the extension you want to delete.
    */
  var ExtensionIdentifier: Identifier
  
  /**
    * A specific version of an extension to delete. If omitted, the highest version is deleted.
    */
  var VersionNumber: js.UndefOr[Integer] = js.undefined
}
object DeleteExtensionRequest {
  
  inline def apply(ExtensionIdentifier: Identifier): DeleteExtensionRequest = {
    val __obj = js.Dynamic.literal(ExtensionIdentifier = ExtensionIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteExtensionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteExtensionRequest] (val x: Self) extends AnyVal {
    
    inline def setExtensionIdentifier(value: Identifier): Self = StObject.set(x, "ExtensionIdentifier", value.asInstanceOf[js.Any])
    
    inline def setVersionNumber(value: Integer): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
