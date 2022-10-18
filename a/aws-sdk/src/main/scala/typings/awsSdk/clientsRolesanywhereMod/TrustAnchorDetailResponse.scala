package typings.awsSdk.clientsRolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrustAnchorDetailResponse extends StObject {
  
  /**
    * The state of the trust anchor after a read or write operation. 
    */
  var trustAnchor: TrustAnchorDetail
}
object TrustAnchorDetailResponse {
  
  inline def apply(trustAnchor: TrustAnchorDetail): TrustAnchorDetailResponse = {
    val __obj = js.Dynamic.literal(trustAnchor = trustAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustAnchorDetailResponse]
  }
  
  extension [Self <: TrustAnchorDetailResponse](x: Self) {
    
    inline def setTrustAnchor(value: TrustAnchorDetail): Self = StObject.set(x, "trustAnchor", value.asInstanceOf[js.Any])
  }
}
