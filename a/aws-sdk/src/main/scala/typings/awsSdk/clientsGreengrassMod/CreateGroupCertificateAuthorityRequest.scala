package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGroupCertificateAuthorityRequest extends StObject {
  
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string
}
object CreateGroupCertificateAuthorityRequest {
  
  inline def apply(GroupId: string): CreateGroupCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupCertificateAuthorityRequest]
  }
  
  extension [Self <: CreateGroupCertificateAuthorityRequest](x: Self) {
    
    inline def setAmznClientToken(value: string): Self = StObject.set(x, "AmznClientToken", value.asInstanceOf[js.Any])
    
    inline def setAmznClientTokenUndefined: Self = StObject.set(x, "AmznClientToken", js.undefined)
    
    inline def setGroupId(value: string): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
  }
}
