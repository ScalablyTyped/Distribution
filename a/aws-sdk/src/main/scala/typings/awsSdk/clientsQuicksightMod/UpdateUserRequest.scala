package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserRequest extends StObject {
  
  /**
    * The ID for the Amazon Web Services account that the user is in. Currently, you use the ID for the Amazon Web Services account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The URL of the custom OpenID Connect (OIDC) provider that provides identity to let a user federate into Amazon QuickSight with an associated Identity and Access Management(IAM) role. This parameter should only be used when ExternalLoginFederationProviderType parameter is set to CUSTOM_OIDC.
    */
  var CustomFederationProviderUrl: js.UndefOr[String] = js.undefined
  
  /**
    * (Enterprise edition only) The name of the custom permissions profile that you want to assign to this user. Customized permissions allows you to control a user's access by restricting access the following operations:   Create and update data sources   Create and update datasets   Create and update email reports   Subscribe to email reports   A set of custom permissions includes any combination of these restrictions. Currently, you need to create the profile names for custom permission sets by using the Amazon QuickSight console. Then, you use the RegisterUser API operation to assign the named set of permissions to a Amazon QuickSight user.  Amazon QuickSight custom permissions are applied through IAM policies. Therefore, they override the permissions typically granted by assigning Amazon QuickSight users to one of the default security cohorts in Amazon QuickSight (admin, author, reader). This feature is available only to Amazon QuickSight Enterprise edition subscriptions.
    */
  var CustomPermissionsName: js.UndefOr[RoleName] = js.undefined
  
  /**
    * The email address of the user that you want to update.
    */
  var Email: String
  
  /**
    * The type of supported external login provider that provides identity to let a user federate into Amazon QuickSight with an associated Identity and Access Management(IAM) role. The type of supported external login provider can be one of the following.    COGNITO: Amazon Cognito. The provider URL is cognito-identity.amazonaws.com. When choosing the COGNITO provider type, don’t use the "CustomFederationProviderUrl" parameter which is only needed when the external provider is custom.    CUSTOM_OIDC: Custom OpenID Connect (OIDC) provider. When choosing CUSTOM_OIDC type, use the CustomFederationProviderUrl parameter to provide the custom OIDC provider URL.    NONE: This clears all the previously saved external login information for a user. Use the  DescribeUser  API operation to check the external login information.  
    */
  var ExternalLoginFederationProviderType: js.UndefOr[String] = js.undefined
  
  /**
    * The identity ID for a user in the external login provider.
    */
  var ExternalLoginId: js.UndefOr[String] = js.undefined
  
  /**
    * The namespace. Currently, you should set this to default.
    */
  var Namespace: typings.awsSdk.clientsQuicksightMod.Namespace
  
  /**
    * The Amazon QuickSight role of the user. The role can be one of the following default security cohorts:    READER: A user who has read-only access to dashboards.    AUTHOR: A user who can create data sources, datasets, analyses, and dashboards.    ADMIN: A user who is an author, who can also manage Amazon QuickSight settings.   The name of the Amazon QuickSight role is invisible to the user except for the console screens dealing with permissions.
    */
  var Role: UserRole
  
  /**
    * A flag that you use to indicate that you want to remove all custom permissions from this user. Using this parameter resets the user to the state it was in before a custom permissions profile was applied. This parameter defaults to NULL and it doesn't accept any other value.
    */
  var UnapplyCustomPermissions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon QuickSight user name that you want to update.
    */
  var UserName: UserName_
}
object UpdateUserRequest {
  
  inline def apply(
    AwsAccountId: AwsAccountId,
    Email: String,
    Namespace: Namespace,
    Role: UserRole,
    UserName: UserName_
  ): UpdateUserRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserRequest]
  }
  
  extension [Self <: UpdateUserRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setCustomFederationProviderUrl(value: String): Self = StObject.set(x, "CustomFederationProviderUrl", value.asInstanceOf[js.Any])
    
    inline def setCustomFederationProviderUrlUndefined: Self = StObject.set(x, "CustomFederationProviderUrl", js.undefined)
    
    inline def setCustomPermissionsName(value: RoleName): Self = StObject.set(x, "CustomPermissionsName", value.asInstanceOf[js.Any])
    
    inline def setCustomPermissionsNameUndefined: Self = StObject.set(x, "CustomPermissionsName", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setExternalLoginFederationProviderType(value: String): Self = StObject.set(x, "ExternalLoginFederationProviderType", value.asInstanceOf[js.Any])
    
    inline def setExternalLoginFederationProviderTypeUndefined: Self = StObject.set(x, "ExternalLoginFederationProviderType", js.undefined)
    
    inline def setExternalLoginId(value: String): Self = StObject.set(x, "ExternalLoginId", value.asInstanceOf[js.Any])
    
    inline def setExternalLoginIdUndefined: Self = StObject.set(x, "ExternalLoginId", js.undefined)
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setRole(value: UserRole): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setUnapplyCustomPermissions(value: Boolean): Self = StObject.set(x, "UnapplyCustomPermissions", value.asInstanceOf[js.Any])
    
    inline def setUnapplyCustomPermissionsUndefined: Self = StObject.set(x, "UnapplyCustomPermissions", js.undefined)
    
    inline def setUserName(value: UserName_): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
