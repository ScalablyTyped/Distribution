package typings.awsSdk

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import typings.awsSdk.libServiceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientsSsoMod {
  
  @JSImport("aws-sdk/clients/sso", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  open class ^ () extends SSO {
    def this(options: ClientConfiguration) = this()
  }
  
  type AccessKeyType = String
  
  type AccessTokenType = String
  
  type AccountIdType = String
  
  trait AccountInfo extends StObject {
    
    /**
      * The identifier of the AWS account that is assigned to the user.
      */
    var accountId: js.UndefOr[AccountIdType] = js.undefined
    
    /**
      * The display name of the AWS account that is assigned to the user.
      */
    var accountName: js.UndefOr[AccountNameType] = js.undefined
    
    /**
      * The email address of the AWS account that is assigned to the user.
      */
    var emailAddress: js.UndefOr[EmailAddressType] = js.undefined
  }
  object AccountInfo {
    
    inline def apply(): AccountInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountInfo]
    }
    
    extension [Self <: AccountInfo](x: Self) {
      
      inline def setAccountId(value: AccountIdType): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      inline def setAccountName(value: AccountNameType): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
      
      inline def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
      
      inline def setEmailAddress(value: EmailAddressType): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
      
      inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    }
  }
  
  type AccountListType = js.Array[AccountInfo]
  
  type AccountNameType = String
  
  trait Blob extends StObject
  
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.clientsSsoMod.apiVersion] = js.undefined
  }
  object ClientApiVersions {
    
    inline def apply(): ClientApiVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientApiVersions]
    }
    
    extension [Self <: ClientApiVersions](x: Self) {
      
      inline def setApiVersion(value: apiVersion): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    }
  }
  
  @js.native
  trait ClientConfiguration
    extends ServiceConfigurationOptions
       with ClientApiVersions
  
  type EmailAddressType = String
  
  type ExpirationTimestampType = Double
  
  trait GetRoleCredentialsRequest extends StObject {
    
    /**
      * The token issued by the CreateToken API call. For more information, see CreateToken in the IAM Identity Center OIDC API Reference Guide.
      */
    var accessToken: AccessTokenType
    
    /**
      * The identifier for the AWS account that is assigned to the user.
      */
    var accountId: AccountIdType
    
    /**
      * The friendly name of the role that is assigned to the user.
      */
    var roleName: RoleNameType
  }
  object GetRoleCredentialsRequest {
    
    inline def apply(accessToken: AccessTokenType, accountId: AccountIdType, roleName: RoleNameType): GetRoleCredentialsRequest = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], accountId = accountId.asInstanceOf[js.Any], roleName = roleName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRoleCredentialsRequest]
    }
    
    extension [Self <: GetRoleCredentialsRequest](x: Self) {
      
      inline def setAccessToken(value: AccessTokenType): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccountId(value: AccountIdType): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setRoleName(value: RoleNameType): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetRoleCredentialsResponse extends StObject {
    
    /**
      * The credentials for the role that is assigned to the user.
      */
    var roleCredentials: js.UndefOr[RoleCredentials] = js.undefined
  }
  object GetRoleCredentialsResponse {
    
    inline def apply(): GetRoleCredentialsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetRoleCredentialsResponse]
    }
    
    extension [Self <: GetRoleCredentialsResponse](x: Self) {
      
      inline def setRoleCredentials(value: RoleCredentials): Self = StObject.set(x, "roleCredentials", value.asInstanceOf[js.Any])
      
      inline def setRoleCredentialsUndefined: Self = StObject.set(x, "roleCredentials", js.undefined)
    }
  }
  
  trait ListAccountRolesRequest extends StObject {
    
    /**
      * The token issued by the CreateToken API call. For more information, see CreateToken in the IAM Identity Center OIDC API Reference Guide.
      */
    var accessToken: AccessTokenType
    
    /**
      * The identifier for the AWS account that is assigned to the user.
      */
    var accountId: AccountIdType
    
    /**
      * The number of items that clients can request per page.
      */
    var maxResults: js.UndefOr[MaxResultType] = js.undefined
    
    /**
      * The page token from the previous response output when you request subsequent pages.
      */
    var nextToken: js.UndefOr[NextTokenType] = js.undefined
  }
  object ListAccountRolesRequest {
    
    inline def apply(accessToken: AccessTokenType, accountId: AccountIdType): ListAccountRolesRequest = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], accountId = accountId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListAccountRolesRequest]
    }
    
    extension [Self <: ListAccountRolesRequest](x: Self) {
      
      inline def setAccessToken(value: AccessTokenType): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccountId(value: AccountIdType): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setMaxResults(value: MaxResultType): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      inline def setNextToken(value: NextTokenType): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    }
  }
  
  trait ListAccountRolesResponse extends StObject {
    
    /**
      * The page token client that is used to retrieve the list of accounts.
      */
    var nextToken: js.UndefOr[NextTokenType] = js.undefined
    
    /**
      * A paginated response with the list of roles and the next token if more results are available.
      */
    var roleList: js.UndefOr[RoleListType] = js.undefined
  }
  object ListAccountRolesResponse {
    
    inline def apply(): ListAccountRolesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListAccountRolesResponse]
    }
    
    extension [Self <: ListAccountRolesResponse](x: Self) {
      
      inline def setNextToken(value: NextTokenType): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
      
      inline def setRoleList(value: RoleListType): Self = StObject.set(x, "roleList", value.asInstanceOf[js.Any])
      
      inline def setRoleListUndefined: Self = StObject.set(x, "roleList", js.undefined)
      
      inline def setRoleListVarargs(value: RoleInfo*): Self = StObject.set(x, "roleList", js.Array(value*))
    }
  }
  
  trait ListAccountsRequest extends StObject {
    
    /**
      * The token issued by the CreateToken API call. For more information, see CreateToken in the IAM Identity Center OIDC API Reference Guide.
      */
    var accessToken: AccessTokenType
    
    /**
      * This is the number of items clients can request per page.
      */
    var maxResults: js.UndefOr[MaxResultType] = js.undefined
    
    /**
      * (Optional) When requesting subsequent pages, this is the page token from the previous response output.
      */
    var nextToken: js.UndefOr[NextTokenType] = js.undefined
  }
  object ListAccountsRequest {
    
    inline def apply(accessToken: AccessTokenType): ListAccountsRequest = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListAccountsRequest]
    }
    
    extension [Self <: ListAccountsRequest](x: Self) {
      
      inline def setAccessToken(value: AccessTokenType): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setMaxResults(value: MaxResultType): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      inline def setNextToken(value: NextTokenType): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    }
  }
  
  trait ListAccountsResponse extends StObject {
    
    /**
      * A paginated response with the list of account information and the next token if more results are available.
      */
    var accountList: js.UndefOr[AccountListType] = js.undefined
    
    /**
      * The page token client that is used to retrieve the list of accounts.
      */
    var nextToken: js.UndefOr[NextTokenType] = js.undefined
  }
  object ListAccountsResponse {
    
    inline def apply(): ListAccountsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListAccountsResponse]
    }
    
    extension [Self <: ListAccountsResponse](x: Self) {
      
      inline def setAccountList(value: AccountListType): Self = StObject.set(x, "accountList", value.asInstanceOf[js.Any])
      
      inline def setAccountListUndefined: Self = StObject.set(x, "accountList", js.undefined)
      
      inline def setAccountListVarargs(value: AccountInfo*): Self = StObject.set(x, "accountList", js.Array(value*))
      
      inline def setNextToken(value: NextTokenType): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    }
  }
  
  trait LogoutRequest extends StObject {
    
    /**
      * The token issued by the CreateToken API call. For more information, see CreateToken in the IAM Identity Center OIDC API Reference Guide.
      */
    var accessToken: AccessTokenType
  }
  object LogoutRequest {
    
    inline def apply(accessToken: AccessTokenType): LogoutRequest = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogoutRequest]
    }
    
    extension [Self <: LogoutRequest](x: Self) {
      
      inline def setAccessToken(value: AccessTokenType): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    }
  }
  
  type MaxResultType = Double
  
  type NextTokenType = String
  
  trait RoleCredentials extends StObject {
    
    /**
      * The identifier used for the temporary security credentials. For more information, see Using Temporary Security Credentials to Request Access to AWS Resources in the AWS IAM User Guide.
      */
    var accessKeyId: js.UndefOr[AccessKeyType] = js.undefined
    
    /**
      * The date on which temporary security credentials expire.
      */
    var expiration: js.UndefOr[ExpirationTimestampType] = js.undefined
    
    /**
      * The key that is used to sign the request. For more information, see Using Temporary Security Credentials to Request Access to AWS Resources in the AWS IAM User Guide.
      */
    var secretAccessKey: js.UndefOr[SecretAccessKeyType] = js.undefined
    
    /**
      * The token used for temporary credentials. For more information, see Using Temporary Security Credentials to Request Access to AWS Resources in the AWS IAM User Guide.
      */
    var sessionToken: js.UndefOr[SessionTokenType] = js.undefined
  }
  object RoleCredentials {
    
    inline def apply(): RoleCredentials = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoleCredentials]
    }
    
    extension [Self <: RoleCredentials](x: Self) {
      
      inline def setAccessKeyId(value: AccessKeyType): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
      
      inline def setExpiration(value: ExpirationTimestampType): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
      
      inline def setSecretAccessKey(value: SecretAccessKeyType): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
      
      inline def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
      
      inline def setSessionToken(value: SessionTokenType): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
      
      inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
    }
  }
  
  trait RoleInfo extends StObject {
    
    /**
      * The identifier of the AWS account assigned to the user.
      */
    var accountId: js.UndefOr[AccountIdType] = js.undefined
    
    /**
      * The friendly name of the role that is assigned to the user.
      */
    var roleName: js.UndefOr[RoleNameType] = js.undefined
  }
  object RoleInfo {
    
    inline def apply(): RoleInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoleInfo]
    }
    
    extension [Self <: RoleInfo](x: Self) {
      
      inline def setAccountId(value: AccountIdType): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      inline def setRoleName(value: RoleNameType): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
      
      inline def setRoleNameUndefined: Self = StObject.set(x, "roleName", js.undefined)
    }
  }
  
  type RoleListType = js.Array[RoleInfo]
  
  type RoleNameType = String
  
  @js.native
  trait SSO extends Service {
    
    @JSName("config")
    var config_SSO: ConfigBase & ClientConfiguration = js.native
    
    /**
      * Returns the STS short-term credentials for a given role name that is assigned to the user.
      */
    def getRoleCredentials(): Request[GetRoleCredentialsResponse, AWSError] = js.native
    def getRoleCredentials(callback: js.Function2[/* err */ AWSError, /* data */ GetRoleCredentialsResponse, Unit]): Request[GetRoleCredentialsResponse, AWSError] = js.native
    /**
      * Returns the STS short-term credentials for a given role name that is assigned to the user.
      */
    def getRoleCredentials(params: GetRoleCredentialsRequest): Request[GetRoleCredentialsResponse, AWSError] = js.native
    def getRoleCredentials(
      params: GetRoleCredentialsRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ GetRoleCredentialsResponse, Unit]
    ): Request[GetRoleCredentialsResponse, AWSError] = js.native
    
    /**
      * Lists all roles that are assigned to the user for a given AWS account.
      */
    def listAccountRoles(): Request[ListAccountRolesResponse, AWSError] = js.native
    def listAccountRoles(callback: js.Function2[/* err */ AWSError, /* data */ ListAccountRolesResponse, Unit]): Request[ListAccountRolesResponse, AWSError] = js.native
    /**
      * Lists all roles that are assigned to the user for a given AWS account.
      */
    def listAccountRoles(params: ListAccountRolesRequest): Request[ListAccountRolesResponse, AWSError] = js.native
    def listAccountRoles(
      params: ListAccountRolesRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ ListAccountRolesResponse, Unit]
    ): Request[ListAccountRolesResponse, AWSError] = js.native
    
    /**
      * Lists all AWS accounts assigned to the user. These AWS accounts are assigned by the administrator of the account. For more information, see Assign User Access in the IAM Identity Center User Guide. This operation returns a paginated response.
      */
    def listAccounts(): Request[ListAccountsResponse, AWSError] = js.native
    def listAccounts(callback: js.Function2[/* err */ AWSError, /* data */ ListAccountsResponse, Unit]): Request[ListAccountsResponse, AWSError] = js.native
    /**
      * Lists all AWS accounts assigned to the user. These AWS accounts are assigned by the administrator of the account. For more information, see Assign User Access in the IAM Identity Center User Guide. This operation returns a paginated response.
      */
    def listAccounts(params: ListAccountsRequest): Request[ListAccountsResponse, AWSError] = js.native
    def listAccounts(
      params: ListAccountsRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ ListAccountsResponse, Unit]
    ): Request[ListAccountsResponse, AWSError] = js.native
    
    /**
      * Removes the locally stored SSO tokens from the client-side cache and sends an API call to the IAM Identity Center service to invalidate the corresponding server-side IAM Identity Center sign in session.  If a user uses IAM Identity Center to access the AWS CLI, the user’s IAM Identity Center sign in session is used to obtain an IAM session, as specified in the corresponding IAM Identity Center permission set. More specifically, IAM Identity Center assumes an IAM role in the target account on behalf of the user, and the corresponding temporary AWS credentials are returned to the client. After user logout, any existing IAM role sessions that were created by using IAM Identity Center permission sets continue based on the duration configured in the permission set. For more information, see User authentications in the IAM Identity Center User Guide. 
      */
    def logout(): Request[js.Object, AWSError] = js.native
    def logout(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
    /**
      * Removes the locally stored SSO tokens from the client-side cache and sends an API call to the IAM Identity Center service to invalidate the corresponding server-side IAM Identity Center sign in session.  If a user uses IAM Identity Center to access the AWS CLI, the user’s IAM Identity Center sign in session is used to obtain an IAM session, as specified in the corresponding IAM Identity Center permission set. More specifically, IAM Identity Center assumes an IAM role in the target account on behalf of the user, and the corresponding temporary AWS credentials are returned to the client. After user logout, any existing IAM role sessions that were created by using IAM Identity Center permission sets continue based on the duration configured in the permission set. For more information, see User authentications in the IAM Identity Center User Guide. 
      */
    def logout(params: LogoutRequest): Request[js.Object, AWSError] = js.native
    def logout(params: LogoutRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  }
  
  type SecretAccessKeyType = String
  
  type SessionTokenType = String
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-06-10`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
