package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientCertificateRevocationListStatus extends StObject {
  
  /**
    * The state of the client certificate revocation list.
    */
  var Code: js.UndefOr[ClientCertificateRevocationListStatusCode] = js.undefined
  
  /**
    * A message about the status of the client certificate revocation list, if applicable.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object ClientCertificateRevocationListStatus {
  
  inline def apply(): ClientCertificateRevocationListStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientCertificateRevocationListStatus]
  }
  
  extension [Self <: ClientCertificateRevocationListStatus](x: Self) {
    
    inline def setCode(value: ClientCertificateRevocationListStatusCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
