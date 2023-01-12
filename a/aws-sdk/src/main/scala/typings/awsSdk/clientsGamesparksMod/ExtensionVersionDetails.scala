package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionVersionDetails extends StObject {
  
  /**
    * The name of the extension.
    */
  var Name: js.UndefOr[ExtensionName] = js.undefined
  
  /**
    * The namespace (qualifier) of the extension.
    */
  var Namespace: js.UndefOr[ExtensionNamespace] = js.undefined
  
  /**
    * The model that defines the interface for this extension version.
    */
  var Schema: js.UndefOr[ExtensionVersionSchema] = js.undefined
  
  /**
    * The version of the extension.
    */
  var Version: js.UndefOr[ExtensionVersion] = js.undefined
}
object ExtensionVersionDetails {
  
  inline def apply(): ExtensionVersionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensionVersionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtensionVersionDetails] (val x: Self) extends AnyVal {
    
    inline def setName(value: ExtensionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNamespace(value: ExtensionNamespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    inline def setSchema(value: ExtensionVersionSchema): Self = StObject.set(x, "Schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "Schema", js.undefined)
    
    inline def setVersion(value: ExtensionVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
