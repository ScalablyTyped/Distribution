package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGroupCertificateAuthorityResponse extends StObject {
  
  /**
    * The ARN of the certificate authority for the group.
    */
  var GroupCertificateAuthorityArn: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the certificate authority for the group.
    */
  var GroupCertificateAuthorityId: js.UndefOr[string] = js.undefined
  
  /**
    * The PEM encoded certificate for the group.
    */
  var PemEncodedCertificate: js.UndefOr[string] = js.undefined
}
object GetGroupCertificateAuthorityResponse {
  
  inline def apply(): GetGroupCertificateAuthorityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupCertificateAuthorityResponse]
  }
  
  extension [Self <: GetGroupCertificateAuthorityResponse](x: Self) {
    
    inline def setGroupCertificateAuthorityArn(value: string): Self = StObject.set(x, "GroupCertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    inline def setGroupCertificateAuthorityArnUndefined: Self = StObject.set(x, "GroupCertificateAuthorityArn", js.undefined)
    
    inline def setGroupCertificateAuthorityId(value: string): Self = StObject.set(x, "GroupCertificateAuthorityId", value.asInstanceOf[js.Any])
    
    inline def setGroupCertificateAuthorityIdUndefined: Self = StObject.set(x, "GroupCertificateAuthorityId", js.undefined)
    
    inline def setPemEncodedCertificate(value: string): Self = StObject.set(x, "PemEncodedCertificate", value.asInstanceOf[js.Any])
    
    inline def setPemEncodedCertificateUndefined: Self = StObject.set(x, "PemEncodedCertificate", js.undefined)
  }
}
