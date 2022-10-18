package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkteamRequest extends StObject {
  
  /**
    * An updated description for the work team.
    */
  var Description: js.UndefOr[String200] = js.undefined
  
  /**
    * A list of MemberDefinition objects that contains objects that identify the workers that make up the work team.  Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces created using Amazon Cognito use CognitoMemberDefinition. For workforces created using your own OIDC identity provider (IdP) use OidcMemberDefinition. You should not provide input for both of these parameters in a single request. For workforces created using Amazon Cognito, private work teams correspond to Amazon Cognito user groups within the user pool used to create a workforce. All of the CognitoMemberDefinition objects that make up the member definition must have the same ClientId and UserPool values. To add a Amazon Cognito user group to an existing worker pool, see Adding groups to a User Pool. For more information about user pools, see Amazon Cognito User Pools. For workforces created using your own OIDC IdP, specify the user groups that you want to include in your private work team in OidcMemberDefinition by listing those groups in Groups. Be aware that user groups that are already in the work team must also be listed in Groups when you make this request to remain on the work team. If you do not include these user groups, they will no longer be associated with the work team you update. 
    */
  var MemberDefinitions: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MemberDefinitions] = js.undefined
  
  /**
    * Configures SNS topic notifications for available or expiring work items
    */
  var NotificationConfiguration: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NotificationConfiguration] = js.undefined
  
  /**
    * The name of the work team to update.
    */
  var WorkteamName: typings.awsSdk.clientsSagemakerMod.WorkteamName
}
object UpdateWorkteamRequest {
  
  inline def apply(WorkteamName: WorkteamName): UpdateWorkteamRequest = {
    val __obj = js.Dynamic.literal(WorkteamName = WorkteamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkteamRequest]
  }
  
  extension [Self <: UpdateWorkteamRequest](x: Self) {
    
    inline def setDescription(value: String200): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setMemberDefinitions(value: MemberDefinitions): Self = StObject.set(x, "MemberDefinitions", value.asInstanceOf[js.Any])
    
    inline def setMemberDefinitionsUndefined: Self = StObject.set(x, "MemberDefinitions", js.undefined)
    
    inline def setMemberDefinitionsVarargs(value: MemberDefinition*): Self = StObject.set(x, "MemberDefinitions", js.Array(value*))
    
    inline def setNotificationConfiguration(value: NotificationConfiguration): Self = StObject.set(x, "NotificationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfigurationUndefined: Self = StObject.set(x, "NotificationConfiguration", js.undefined)
    
    inline def setWorkteamName(value: WorkteamName): Self = StObject.set(x, "WorkteamName", value.asInstanceOf[js.Any])
  }
}
