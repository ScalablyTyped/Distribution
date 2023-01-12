package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePortalResponse extends StObject {
  
  /**
    * The status of the portal, which contains a state (UPDATING after successfully calling this operation) and any error message.
    */
  var portalStatus: PortalStatus
}
object UpdatePortalResponse {
  
  inline def apply(portalStatus: PortalStatus): UpdatePortalResponse = {
    val __obj = js.Dynamic.literal(portalStatus = portalStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePortalResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePortalResponse] (val x: Self) extends AnyVal {
    
    inline def setPortalStatus(value: PortalStatus): Self = StObject.set(x, "portalStatus", value.asInstanceOf[js.Any])
  }
}
