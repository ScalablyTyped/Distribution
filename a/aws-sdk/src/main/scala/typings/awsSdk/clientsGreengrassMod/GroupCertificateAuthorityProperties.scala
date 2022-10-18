package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupCertificateAuthorityProperties extends StObject {
  
  /**
    * The ARN of the certificate authority for the group.
    */
  var GroupCertificateAuthorityArn: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the certificate authority for the group.
    */
  var GroupCertificateAuthorityId: js.UndefOr[string] = js.undefined
}
object GroupCertificateAuthorityProperties {
  
  inline def apply(): GroupCertificateAuthorityProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupCertificateAuthorityProperties]
  }
  
  extension [Self <: GroupCertificateAuthorityProperties](x: Self) {
    
    inline def setGroupCertificateAuthorityArn(value: string): Self = StObject.set(x, "GroupCertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    inline def setGroupCertificateAuthorityArnUndefined: Self = StObject.set(x, "GroupCertificateAuthorityArn", js.undefined)
    
    inline def setGroupCertificateAuthorityId(value: string): Self = StObject.set(x, "GroupCertificateAuthorityId", value.asInstanceOf[js.Any])
    
    inline def setGroupCertificateAuthorityIdUndefined: Self = StObject.set(x, "GroupCertificateAuthorityId", js.undefined)
  }
}
