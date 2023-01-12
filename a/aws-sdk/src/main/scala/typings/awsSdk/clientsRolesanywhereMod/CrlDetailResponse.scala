package typings.awsSdk.clientsRolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrlDetailResponse extends StObject {
  
  /**
    * The state of the certificate revocation list (CRL) after a read or write operation.
    */
  var crl: CrlDetail
}
object CrlDetailResponse {
  
  inline def apply(crl: CrlDetail): CrlDetailResponse = {
    val __obj = js.Dynamic.literal(crl = crl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrlDetailResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CrlDetailResponse] (val x: Self) extends AnyVal {
    
    inline def setCrl(value: CrlDetail): Self = StObject.set(x, "crl", value.asInstanceOf[js.Any])
  }
}
