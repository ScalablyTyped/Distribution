package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStudioSessionMappingInput extends StObject {
  
  /**
    * The globally unique identifier (GUID) of the user or group. For more information, see UserId and GroupId in the Amazon Web Services SSO Identity Store API Reference. Either IdentityName or IdentityId must be specified.
    */
  var IdentityId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The name of the user or group to update. For more information, see UserName and DisplayName in the Amazon Web Services SSO Identity Store API Reference. Either IdentityName or IdentityId must be specified.
    */
  var IdentityName: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * Specifies whether the identity to update is a user or a group.
    */
  var IdentityType: typings.awsSdk.clientsEmrMod.IdentityType
  
  /**
    * The Amazon Resource Name (ARN) of the session policy to associate with the specified user or group.
    */
  var SessionPolicyArn: XmlStringMaxLen256
  
  /**
    * The ID of the Amazon EMR Studio.
    */
  var StudioId: XmlStringMaxLen256
}
object UpdateStudioSessionMappingInput {
  
  inline def apply(IdentityType: IdentityType, SessionPolicyArn: XmlStringMaxLen256, StudioId: XmlStringMaxLen256): UpdateStudioSessionMappingInput = {
    val __obj = js.Dynamic.literal(IdentityType = IdentityType.asInstanceOf[js.Any], SessionPolicyArn = SessionPolicyArn.asInstanceOf[js.Any], StudioId = StudioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStudioSessionMappingInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateStudioSessionMappingInput] (val x: Self) extends AnyVal {
    
    inline def setIdentityId(value: XmlStringMaxLen256): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    inline def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
    
    inline def setIdentityName(value: XmlStringMaxLen256): Self = StObject.set(x, "IdentityName", value.asInstanceOf[js.Any])
    
    inline def setIdentityNameUndefined: Self = StObject.set(x, "IdentityName", js.undefined)
    
    inline def setIdentityType(value: IdentityType): Self = StObject.set(x, "IdentityType", value.asInstanceOf[js.Any])
    
    inline def setSessionPolicyArn(value: XmlStringMaxLen256): Self = StObject.set(x, "SessionPolicyArn", value.asInstanceOf[js.Any])
    
    inline def setStudioId(value: XmlStringMaxLen256): Self = StObject.set(x, "StudioId", value.asInstanceOf[js.Any])
  }
}
