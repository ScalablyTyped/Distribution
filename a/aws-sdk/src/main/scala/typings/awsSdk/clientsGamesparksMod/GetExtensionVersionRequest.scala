package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExtensionVersionRequest extends StObject {
  
  /**
    * The version of the extension.
    */
  var ExtensionVersion: typings.awsSdk.clientsGamesparksMod.ExtensionVersion
  
  /**
    * The name of the extension.
    */
  var Name: ExtensionName
  
  /**
    * The namespace (qualifier) of the extension.
    */
  var Namespace: ExtensionNamespace
}
object GetExtensionVersionRequest {
  
  inline def apply(ExtensionVersion: ExtensionVersion, Name: ExtensionName, Namespace: ExtensionNamespace): GetExtensionVersionRequest = {
    val __obj = js.Dynamic.literal(ExtensionVersion = ExtensionVersion.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExtensionVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetExtensionVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setExtensionVersion(value: ExtensionVersion): Self = StObject.set(x, "ExtensionVersion", value.asInstanceOf[js.Any])
    
    inline def setName(value: ExtensionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: ExtensionNamespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
  }
}
