package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalResource extends StObject {
  
  /**
    * The ID of the portal.
    */
  var id: ID
}
object PortalResource {
  
  inline def apply(id: ID): PortalResource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalResource]
  }
  
  extension [Self <: PortalResource](x: Self) {
    
    inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
