package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGroupCertificateConfigurationRequest extends StObject {
  
  /**
    * The amount of time remaining before the certificate expires, in milliseconds.
    */
  var CertificateExpiryInMilliseconds: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string
}
object UpdateGroupCertificateConfigurationRequest {
  
  inline def apply(GroupId: string): UpdateGroupCertificateConfigurationRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGroupCertificateConfigurationRequest]
  }
  
  extension [Self <: UpdateGroupCertificateConfigurationRequest](x: Self) {
    
    inline def setCertificateExpiryInMilliseconds(value: string): Self = StObject.set(x, "CertificateExpiryInMilliseconds", value.asInstanceOf[js.Any])
    
    inline def setCertificateExpiryInMillisecondsUndefined: Self = StObject.set(x, "CertificateExpiryInMilliseconds", js.undefined)
    
    inline def setGroupId(value: string): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
  }
}
