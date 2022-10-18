package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterCertificateRequest extends StObject {
  
  /**
    * The identifier of the certificate.
    */
  var CertificateId: typings.awsSdk.clientsDirectoryserviceMod.CertificateId
  
  /**
    * The identifier of the directory.
    */
  var DirectoryId: typings.awsSdk.clientsDirectoryserviceMod.DirectoryId
}
object DeregisterCertificateRequest {
  
  inline def apply(CertificateId: CertificateId, DirectoryId: DirectoryId): DeregisterCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateId = CertificateId.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterCertificateRequest]
  }
  
  extension [Self <: DeregisterCertificateRequest](x: Self) {
    
    inline def setCertificateId(value: CertificateId): Self = StObject.set(x, "CertificateId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
  }
}
