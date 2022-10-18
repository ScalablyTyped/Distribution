package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpNamespaceChange extends StObject {
  
  /**
    * An updated description for the HTTP namespace.
    */
  var Description: ResourceDescription
}
object HttpNamespaceChange {
  
  inline def apply(Description: ResourceDescription): HttpNamespaceChange = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpNamespaceChange]
  }
  
  extension [Self <: HttpNamespaceChange](x: Self) {
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
  }
}
