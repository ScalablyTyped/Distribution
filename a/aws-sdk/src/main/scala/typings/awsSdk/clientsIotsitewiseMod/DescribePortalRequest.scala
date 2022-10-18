package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePortalRequest extends StObject {
  
  /**
    * The ID of the portal.
    */
  var portalId: ID
}
object DescribePortalRequest {
  
  inline def apply(portalId: ID): DescribePortalRequest = {
    val __obj = js.Dynamic.literal(portalId = portalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePortalRequest]
  }
  
  extension [Self <: DescribePortalRequest](x: Self) {
    
    inline def setPortalId(value: ID): Self = StObject.set(x, "portalId", value.asInstanceOf[js.Any])
  }
}
