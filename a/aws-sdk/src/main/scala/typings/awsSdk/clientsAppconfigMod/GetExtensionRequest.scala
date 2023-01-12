package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExtensionRequest extends StObject {
  
  /**
    * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
    */
  var ExtensionIdentifier: Identifier
  
  /**
    * The extension version number. If no version number was defined, AppConfig uses the highest version.
    */
  var VersionNumber: js.UndefOr[Integer] = js.undefined
}
object GetExtensionRequest {
  
  inline def apply(ExtensionIdentifier: Identifier): GetExtensionRequest = {
    val __obj = js.Dynamic.literal(ExtensionIdentifier = ExtensionIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExtensionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetExtensionRequest] (val x: Self) extends AnyVal {
    
    inline def setExtensionIdentifier(value: Identifier): Self = StObject.set(x, "ExtensionIdentifier", value.asInstanceOf[js.Any])
    
    inline def setVersionNumber(value: Integer): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
