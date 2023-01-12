package typings.awsSdk.clientsRolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProfileRequest extends StObject {
  
  /**
    *  The number of seconds the vended session credentials are valid for. 
    */
  var durationSeconds: js.UndefOr[CreateProfileRequestDurationSecondsInteger] = js.undefined
  
  /**
    * Specifies whether the profile is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of managed policy ARNs that apply to the vended session credentials. 
    */
  var managedPolicyArns: js.UndefOr[ManagedPolicyList] = js.undefined
  
  /**
    * The name of the profile.
    */
  var name: ResourceName
  
  /**
    * Specifies whether instance properties are required in CreateSession requests with this profile. 
    */
  var requireInstanceProperties: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of IAM roles that this profile can assume in a CreateSession operation.
    */
  var roleArns: RoleArnList
  
  /**
    * A session policy that applies to the trust boundary of the vended session credentials. 
    */
  var sessionPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * The tags to attach to the profile.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateProfileRequest {
  
  inline def apply(name: ResourceName, roleArns: RoleArnList): CreateProfileRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], roleArns = roleArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setDurationSeconds(value: CreateProfileRequestDurationSecondsInteger): Self = StObject.set(x, "durationSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationSecondsUndefined: Self = StObject.set(x, "durationSeconds", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setManagedPolicyArns(value: ManagedPolicyList): Self = StObject.set(x, "managedPolicyArns", value.asInstanceOf[js.Any])
    
    inline def setManagedPolicyArnsUndefined: Self = StObject.set(x, "managedPolicyArns", js.undefined)
    
    inline def setManagedPolicyArnsVarargs(value: ManagedPolicyListMemberString*): Self = StObject.set(x, "managedPolicyArns", js.Array(value*))
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRequireInstanceProperties(value: Boolean): Self = StObject.set(x, "requireInstanceProperties", value.asInstanceOf[js.Any])
    
    inline def setRequireInstancePropertiesUndefined: Self = StObject.set(x, "requireInstanceProperties", js.undefined)
    
    inline def setRoleArns(value: RoleArnList): Self = StObject.set(x, "roleArns", value.asInstanceOf[js.Any])
    
    inline def setRoleArnsVarargs(value: RoleArn*): Self = StObject.set(x, "roleArns", js.Array(value*))
    
    inline def setSessionPolicy(value: String): Self = StObject.set(x, "sessionPolicy", value.asInstanceOf[js.Any])
    
    inline def setSessionPolicyUndefined: Self = StObject.set(x, "sessionPolicy", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
