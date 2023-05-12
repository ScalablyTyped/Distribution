package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TlsCertificateData extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the certificate.
    */
  var CertificateArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The serial number of the certificate.
    */
  var CertificateSerial: js.UndefOr[CollectionMemberString] = js.undefined
  
  /**
    * The status of the certificate.
    */
  var Status: js.UndefOr[CollectionMemberString] = js.undefined
  
  /**
    * Contains details about the certificate status, including information about certificate errors.
    */
  var StatusMessage: js.UndefOr[StatusReason] = js.undefined
}
object TlsCertificateData {
  
  inline def apply(): TlsCertificateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TlsCertificateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TlsCertificateData] (val x: Self) extends AnyVal {
    
    inline def setCertificateArn(value: ResourceArn): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    inline def setCertificateSerial(value: CollectionMemberString): Self = StObject.set(x, "CertificateSerial", value.asInstanceOf[js.Any])
    
    inline def setCertificateSerialUndefined: Self = StObject.set(x, "CertificateSerial", js.undefined)
    
    inline def setStatus(value: CollectionMemberString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: StatusReason): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
