package typings.awsSdk.clientsRolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalarCrlRequest extends StObject {
  
  /**
    * The unique identifier of the certificate revocation list (CRL).
    */
  var crlId: Uuid
}
object ScalarCrlRequest {
  
  inline def apply(crlId: Uuid): ScalarCrlRequest = {
    val __obj = js.Dynamic.literal(crlId = crlId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalarCrlRequest]
  }
  
  extension [Self <: ScalarCrlRequest](x: Self) {
    
    inline def setCrlId(value: Uuid): Self = StObject.set(x, "crlId", value.asInstanceOf[js.Any])
  }
}
