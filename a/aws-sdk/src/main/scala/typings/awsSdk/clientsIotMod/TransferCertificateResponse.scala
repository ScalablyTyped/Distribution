package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferCertificateResponse extends StObject {
  
  /**
    * The ARN of the certificate.
    */
  var transferredCertificateArn: js.UndefOr[CertificateArn] = js.undefined
}
object TransferCertificateResponse {
  
  inline def apply(): TransferCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferCertificateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransferCertificateResponse] (val x: Self) extends AnyVal {
    
    inline def setTransferredCertificateArn(value: CertificateArn): Self = StObject.set(x, "transferredCertificateArn", value.asInstanceOf[js.Any])
    
    inline def setTransferredCertificateArnUndefined: Self = StObject.set(x, "transferredCertificateArn", js.undefined)
  }
}
