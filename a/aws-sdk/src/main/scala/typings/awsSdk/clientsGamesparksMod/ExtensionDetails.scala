package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionDetails extends StObject {
  
  /**
    * The description of the extension.
    */
  var Description: js.UndefOr[ExtensionDescription] = js.undefined
  
  /**
    * The name of the extension.
    */
  var Name: js.UndefOr[ExtensionName] = js.undefined
  
  /**
    * The namespace (qualifier) of the extension.
    */
  var Namespace: js.UndefOr[ExtensionNamespace] = js.undefined
}
object ExtensionDetails {
  
  inline def apply(): ExtensionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtensionDetails] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: ExtensionDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: ExtensionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNamespace(value: ExtensionNamespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
  }
}
