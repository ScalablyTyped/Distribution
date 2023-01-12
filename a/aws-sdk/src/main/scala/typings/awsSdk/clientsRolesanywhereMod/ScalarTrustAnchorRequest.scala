package typings.awsSdk.clientsRolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalarTrustAnchorRequest extends StObject {
  
  /**
    * The unique identifier of the trust anchor.
    */
  var trustAnchorId: Uuid
}
object ScalarTrustAnchorRequest {
  
  inline def apply(trustAnchorId: Uuid): ScalarTrustAnchorRequest = {
    val __obj = js.Dynamic.literal(trustAnchorId = trustAnchorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalarTrustAnchorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScalarTrustAnchorRequest] (val x: Self) extends AnyVal {
    
    inline def setTrustAnchorId(value: Uuid): Self = StObject.set(x, "trustAnchorId", value.asInstanceOf[js.Any])
  }
}
