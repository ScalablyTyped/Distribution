package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicDnsNamespaceChange extends StObject {
  
  /**
    * An updated description for the public DNS namespace.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * Properties to be updated in the public DNS namespace.
    */
  var Properties: js.UndefOr[PublicDnsNamespacePropertiesChange] = js.undefined
}
object PublicDnsNamespaceChange {
  
  inline def apply(): PublicDnsNamespaceChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicDnsNamespaceChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicDnsNamespaceChange] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setProperties(value: PublicDnsNamespacePropertiesChange): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
  }
}
