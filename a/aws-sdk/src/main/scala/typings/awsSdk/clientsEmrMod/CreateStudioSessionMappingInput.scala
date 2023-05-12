package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStudioSessionMappingInput extends StObject {
  
  /**
    * The globally unique identifier (GUID) of the user or group from the IAM Identity Center Identity Store. For more information, see UserId and GroupId in the IAM Identity Center Identity Store API Reference. Either IdentityName or IdentityId must be specified, but not both.
    */
  var IdentityId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The name of the user or group. For more information, see UserName and DisplayName in the IAM Identity Center Identity Store API Reference. Either IdentityName or IdentityId must be specified, but not both.
    */
  var IdentityName: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * Specifies whether the identity to map to the Amazon EMR Studio is a user or a group.
    */
  var IdentityType: typings.awsSdk.clientsEmrMod.IdentityType
  
  /**
    * The Amazon Resource Name (ARN) for the session policy that will be applied to the user or group. You should specify the ARN for the session policy that you want to apply, not the ARN of your user role. For more information, see Create an Amazon EMR Studio User Role with Session Policies.
    */
  var SessionPolicyArn: XmlStringMaxLen256
  
  /**
    * The ID of the Amazon EMR Studio to which the user or group will be mapped.
    */
  var StudioId: XmlStringMaxLen256
}
object CreateStudioSessionMappingInput {
  
  inline def apply(IdentityType: IdentityType, SessionPolicyArn: XmlStringMaxLen256, StudioId: XmlStringMaxLen256): CreateStudioSessionMappingInput = {
    val __obj = js.Dynamic.literal(IdentityType = IdentityType.asInstanceOf[js.Any], SessionPolicyArn = SessionPolicyArn.asInstanceOf[js.Any], StudioId = StudioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStudioSessionMappingInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateStudioSessionMappingInput] (val x: Self) extends AnyVal {
    
    inline def setIdentityId(value: XmlStringMaxLen256): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    inline def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
    
    inline def setIdentityName(value: XmlStringMaxLen256): Self = StObject.set(x, "IdentityName", value.asInstanceOf[js.Any])
    
    inline def setIdentityNameUndefined: Self = StObject.set(x, "IdentityName", js.undefined)
    
    inline def setIdentityType(value: IdentityType): Self = StObject.set(x, "IdentityType", value.asInstanceOf[js.Any])
    
    inline def setSessionPolicyArn(value: XmlStringMaxLen256): Self = StObject.set(x, "SessionPolicyArn", value.asInstanceOf[js.Any])
    
    inline def setStudioId(value: XmlStringMaxLen256): Self = StObject.set(x, "StudioId", value.asInstanceOf[js.Any])
  }
}
