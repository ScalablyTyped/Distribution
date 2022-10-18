package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandshakeResource extends StObject {
  
  /**
    * When needed, contains an additional array of HandshakeResource objects.
    */
  var Resources: js.UndefOr[HandshakeResources] = js.undefined
  
  /**
    * The type of information being passed, specifying how the value is to be interpreted by the other party:    ACCOUNT - Specifies an Amazon Web Services account ID number.    ORGANIZATION - Specifies an organization ID number.    EMAIL - Specifies the email address that is associated with the account that receives the handshake.     OWNER_EMAIL - Specifies the email address associated with the management account. Included as information about an organization.     OWNER_NAME - Specifies the name associated with the management account. Included as information about an organization.     NOTES - Additional text provided by the handshake initiator and intended for the recipient to read.  
    */
  var Type: js.UndefOr[HandshakeResourceType] = js.undefined
  
  /**
    * The information that is passed to the other party in the handshake. The format of the value string must match the requirements of the specified type.
    */
  var Value: js.UndefOr[HandshakeResourceValue] = js.undefined
}
object HandshakeResource {
  
  inline def apply(): HandshakeResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandshakeResource]
  }
  
  extension [Self <: HandshakeResource](x: Self) {
    
    inline def setResources(value: HandshakeResources): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    inline def setResourcesVarargs(value: HandshakeResource*): Self = StObject.set(x, "Resources", js.Array(value*))
    
    inline def setType(value: HandshakeResourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValue(value: HandshakeResourceValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
