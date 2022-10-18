package typings.awsSdk.clientsRolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileDetail extends StObject {
  
  /**
    * The ISO-8601 timestamp when the profile was created. 
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Web Services account that created the profile.
    */
  var createdBy: js.UndefOr[String] = js.undefined
  
  /**
    *  The number of seconds the vended session credentials are valid for. 
    */
  var durationSeconds: js.UndefOr[Integer] = js.undefined
  
  /**
    * Indicates whether the profile is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of managed policy ARNs that apply to the vended session credentials. 
    */
  var managedPolicyArns: js.UndefOr[ManagedPolicyList] = js.undefined
  
  /**
    * The name of the profile.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The ARN of the profile.
    */
  var profileArn: js.UndefOr[ProfileArn] = js.undefined
  
  /**
    * The unique identifier of the profile.
    */
  var profileId: js.UndefOr[Uuid] = js.undefined
  
  /**
    * Specifies whether instance properties are required in CreateSession requests with this profile. 
    */
  var requireInstanceProperties: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of IAM roles that this profile can assume in a CreateSession operation.
    */
  var roleArns: js.UndefOr[RoleArnList] = js.undefined
  
  /**
    * A session policy that applies to the trust boundary of the vended session credentials. 
    */
  var sessionPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * The ISO-8601 timestamp when the profile was last updated. 
    */
  var updatedAt: js.UndefOr[js.Date] = js.undefined
}
object ProfileDetail {
  
  inline def apply(): ProfileDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileDetail]
  }
  
  extension [Self <: ProfileDetail](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCreatedBy(value: String): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setDurationSeconds(value: Integer): Self = StObject.set(x, "durationSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationSecondsUndefined: Self = StObject.set(x, "durationSeconds", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setManagedPolicyArns(value: ManagedPolicyList): Self = StObject.set(x, "managedPolicyArns", value.asInstanceOf[js.Any])
    
    inline def setManagedPolicyArnsUndefined: Self = StObject.set(x, "managedPolicyArns", js.undefined)
    
    inline def setManagedPolicyArnsVarargs(value: ManagedPolicyListMemberString*): Self = StObject.set(x, "managedPolicyArns", js.Array(value*))
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProfileArn(value: ProfileArn): Self = StObject.set(x, "profileArn", value.asInstanceOf[js.Any])
    
    inline def setProfileArnUndefined: Self = StObject.set(x, "profileArn", js.undefined)
    
    inline def setProfileId(value: Uuid): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setRequireInstanceProperties(value: Boolean): Self = StObject.set(x, "requireInstanceProperties", value.asInstanceOf[js.Any])
    
    inline def setRequireInstancePropertiesUndefined: Self = StObject.set(x, "requireInstanceProperties", js.undefined)
    
    inline def setRoleArns(value: RoleArnList): Self = StObject.set(x, "roleArns", value.asInstanceOf[js.Any])
    
    inline def setRoleArnsUndefined: Self = StObject.set(x, "roleArns", js.undefined)
    
    inline def setRoleArnsVarargs(value: RoleArn*): Self = StObject.set(x, "roleArns", js.Array(value*))
    
    inline def setSessionPolicy(value: String): Self = StObject.set(x, "sessionPolicy", value.asInstanceOf[js.Any])
    
    inline def setSessionPolicyUndefined: Self = StObject.set(x, "sessionPolicy", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
