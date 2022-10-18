package typings.awsSdk

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import typings.awsSdk.libServiceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientsSsooidcMod {
  
  @JSImport("aws-sdk/clients/ssooidc", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  open class ^ () extends SSOOIDC {
    def this(options: ClientConfiguration) = this()
  }
  
  type AccessToken = String
  
  type AuthCode = String
  
  trait Blob extends StObject
  
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.clientsSsooidcMod.apiVersion] = js.undefined
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
  
  type ClientId = String
  
  type ClientName = String
  
  type ClientSecret = String
  
  type ClientType = String
  
  trait CreateTokenRequest extends StObject {
    
    /**
      * The unique identifier string for each client. This value should come from the persisted result of the RegisterClient API.
      */
    var clientId: ClientId
    
    /**
      * A secret string generated for the client. This value should come from the persisted result of the RegisterClient API.
      */
    var clientSecret: ClientSecret
    
    /**
      * The authorization code received from the authorization service. This parameter is required to perform an authorization grant request to get access to a token.
      */
    var code: js.UndefOr[AuthCode] = js.undefined
    
    /**
      * Used only when calling this API for the device code grant type. This short-term code is used to identify this authentication attempt. This should come from an in-memory reference to the result of the StartDeviceAuthorization API.
      */
    var deviceCode: js.UndefOr[DeviceCode] = js.undefined
    
    /**
      * Supports grant types for the authorization code, refresh token, and device code request. For device code requests, specify the following value:  urn:ietf:params:oauth:grant-type:device_code   For information about how to obtain the device code, see the StartDeviceAuthorization topic.
      */
    var grantType: GrantType
    
    /**
      * The location of the application that will receive the authorization code. Users authorize the service to send the request to this location.
      */
    var redirectUri: js.UndefOr[URI] = js.undefined
    
    /**
      * Currently, refreshToken is not yet implemented and is not supported. For more information about the features and limitations of the current IAM Identity Center OIDC implementation, see Considerations for Using this Guide in the IAM Identity Center OIDC API Reference. The token used to obtain an access token in the event that the access token is invalid or expired.
      */
    var refreshToken: js.UndefOr[RefreshToken] = js.undefined
    
    /**
      * The list of scopes that is defined by the client. Upon authorization, this list is used to restrict permissions when granting an access token.
      */
    var scope: js.UndefOr[Scopes] = js.undefined
  }
  object CreateTokenRequest {
    
    inline def apply(clientId: ClientId, clientSecret: ClientSecret, grantType: GrantType): CreateTokenRequest = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], grantType = grantType.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateTokenRequest]
    }
    
    extension [Self <: CreateTokenRequest](x: Self) {
      
      inline def setClientId(value: ClientId): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: ClientSecret): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setCode(value: AuthCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setDeviceCode(value: DeviceCode): Self = StObject.set(x, "deviceCode", value.asInstanceOf[js.Any])
      
      inline def setDeviceCodeUndefined: Self = StObject.set(x, "deviceCode", js.undefined)
      
      inline def setGrantType(value: GrantType): Self = StObject.set(x, "grantType", value.asInstanceOf[js.Any])
      
      inline def setRedirectUri(value: URI): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
      
      inline def setRefreshToken(value: RefreshToken): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
      
      inline def setScope(value: Scopes): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: Scope*): Self = StObject.set(x, "scope", js.Array(value*))
    }
  }
  
  trait CreateTokenResponse extends StObject {
    
    /**
      * An opaque token to access IAM Identity Center resources assigned to a user.
      */
    var accessToken: js.UndefOr[AccessToken] = js.undefined
    
    /**
      * Indicates the time in seconds when an access token will expire.
      */
    var expiresIn: js.UndefOr[ExpirationInSeconds] = js.undefined
    
    /**
      * Currently, idToken is not yet implemented and is not supported. For more information about the features and limitations of the current IAM Identity Center OIDC implementation, see Considerations for Using this Guide in the IAM Identity Center OIDC API Reference. The identifier of the user that associated with the access token, if present.
      */
    var idToken: js.UndefOr[IdToken] = js.undefined
    
    /**
      * Currently, refreshToken is not yet implemented and is not supported. For more information about the features and limitations of the current IAM Identity Center OIDC implementation, see Considerations for Using this Guide in the IAM Identity Center OIDC API Reference. A token that, if present, can be used to refresh a previously issued access token that might have expired.
      */
    var refreshToken: js.UndefOr[RefreshToken] = js.undefined
    
    /**
      * Used to notify the client that the returned token is an access token. The supported type is BearerToken.
      */
    var tokenType: js.UndefOr[TokenType] = js.undefined
  }
  object CreateTokenResponse {
    
    inline def apply(): CreateTokenResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateTokenResponse]
    }
    
    extension [Self <: CreateTokenResponse](x: Self) {
      
      inline def setAccessToken(value: AccessToken): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      inline def setExpiresIn(value: ExpirationInSeconds): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      inline def setIdToken(value: IdToken): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
      
      inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
      
      inline def setRefreshToken(value: RefreshToken): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
      
      inline def setTokenType(value: TokenType): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setTokenTypeUndefined: Self = StObject.set(x, "tokenType", js.undefined)
    }
  }
  
  type DeviceCode = String
  
  type ExpirationInSeconds = Double
  
  type GrantType = String
  
  type IdToken = String
  
  type IntervalInSeconds = Double
  
  type LongTimeStampType = Double
  
  type RefreshToken = String
  
  trait RegisterClientRequest extends StObject {
    
    /**
      * The friendly name of the client.
      */
    var clientName: ClientName
    
    /**
      * The type of client. The service supports only public as a client type. Anything other than public will be rejected by the service.
      */
    var clientType: ClientType
    
    /**
      * The list of scopes that are defined by the client. Upon authorization, this list is used to restrict permissions when granting an access token.
      */
    var scopes: js.UndefOr[Scopes] = js.undefined
  }
  object RegisterClientRequest {
    
    inline def apply(clientName: ClientName, clientType: ClientType): RegisterClientRequest = {
      val __obj = js.Dynamic.literal(clientName = clientName.asInstanceOf[js.Any], clientType = clientType.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisterClientRequest]
    }
    
    extension [Self <: RegisterClientRequest](x: Self) {
      
      inline def setClientName(value: ClientName): Self = StObject.set(x, "clientName", value.asInstanceOf[js.Any])
      
      inline def setClientType(value: ClientType): Self = StObject.set(x, "clientType", value.asInstanceOf[js.Any])
      
      inline def setScopes(value: Scopes): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: Scope*): Self = StObject.set(x, "scopes", js.Array(value*))
    }
  }
  
  trait RegisterClientResponse extends StObject {
    
    /**
      * The endpoint where the client can request authorization.
      */
    var authorizationEndpoint: js.UndefOr[URI] = js.undefined
    
    /**
      * The unique identifier string for each client. This client uses this identifier to get authenticated by the service in subsequent calls.
      */
    var clientId: js.UndefOr[ClientId] = js.undefined
    
    /**
      * Indicates the time at which the clientId and clientSecret were issued.
      */
    var clientIdIssuedAt: js.UndefOr[LongTimeStampType] = js.undefined
    
    /**
      * A secret string generated for the client. The client will use this string to get authenticated by the service in subsequent calls.
      */
    var clientSecret: js.UndefOr[ClientSecret] = js.undefined
    
    /**
      * Indicates the time at which the clientId and clientSecret will become invalid.
      */
    var clientSecretExpiresAt: js.UndefOr[LongTimeStampType] = js.undefined
    
    /**
      * The endpoint where the client can get an access token.
      */
    var tokenEndpoint: js.UndefOr[URI] = js.undefined
  }
  object RegisterClientResponse {
    
    inline def apply(): RegisterClientResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegisterClientResponse]
    }
    
    extension [Self <: RegisterClientResponse](x: Self) {
      
      inline def setAuthorizationEndpoint(value: URI): Self = StObject.set(x, "authorizationEndpoint", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationEndpointUndefined: Self = StObject.set(x, "authorizationEndpoint", js.undefined)
      
      inline def setClientId(value: ClientId): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdIssuedAt(value: LongTimeStampType): Self = StObject.set(x, "clientIdIssuedAt", value.asInstanceOf[js.Any])
      
      inline def setClientIdIssuedAtUndefined: Self = StObject.set(x, "clientIdIssuedAt", js.undefined)
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setClientSecret(value: ClientSecret): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setClientSecretExpiresAt(value: LongTimeStampType): Self = StObject.set(x, "clientSecretExpiresAt", value.asInstanceOf[js.Any])
      
      inline def setClientSecretExpiresAtUndefined: Self = StObject.set(x, "clientSecretExpiresAt", js.undefined)
      
      inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      inline def setTokenEndpoint(value: URI): Self = StObject.set(x, "tokenEndpoint", value.asInstanceOf[js.Any])
      
      inline def setTokenEndpointUndefined: Self = StObject.set(x, "tokenEndpoint", js.undefined)
    }
  }
  
  @js.native
  trait SSOOIDC extends Service {
    
    @JSName("config")
    var config_SSOOIDC: ConfigBase & ClientConfiguration = js.native
    
    /**
      * Creates and returns an access token for the authorized client. The access token issued will be used to fetch short-term credentials for the assigned roles in the AWS account.
      */
    def createToken(): Request[CreateTokenResponse, AWSError] = js.native
    def createToken(callback: js.Function2[/* err */ AWSError, /* data */ CreateTokenResponse, Unit]): Request[CreateTokenResponse, AWSError] = js.native
    /**
      * Creates and returns an access token for the authorized client. The access token issued will be used to fetch short-term credentials for the assigned roles in the AWS account.
      */
    def createToken(params: CreateTokenRequest): Request[CreateTokenResponse, AWSError] = js.native
    def createToken(
      params: CreateTokenRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ CreateTokenResponse, Unit]
    ): Request[CreateTokenResponse, AWSError] = js.native
    
    /**
      * Registers a client with IAM Identity Center. This allows clients to initiate device authorization. The output should be persisted for reuse through many authentication requests.
      */
    def registerClient(): Request[RegisterClientResponse, AWSError] = js.native
    def registerClient(callback: js.Function2[/* err */ AWSError, /* data */ RegisterClientResponse, Unit]): Request[RegisterClientResponse, AWSError] = js.native
    /**
      * Registers a client with IAM Identity Center. This allows clients to initiate device authorization. The output should be persisted for reuse through many authentication requests.
      */
    def registerClient(params: RegisterClientRequest): Request[RegisterClientResponse, AWSError] = js.native
    def registerClient(
      params: RegisterClientRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ RegisterClientResponse, Unit]
    ): Request[RegisterClientResponse, AWSError] = js.native
    
    /**
      * Initiates device authorization by requesting a pair of verification codes from the authorization service.
      */
    def startDeviceAuthorization(): Request[StartDeviceAuthorizationResponse, AWSError] = js.native
    def startDeviceAuthorization(callback: js.Function2[/* err */ AWSError, /* data */ StartDeviceAuthorizationResponse, Unit]): Request[StartDeviceAuthorizationResponse, AWSError] = js.native
    /**
      * Initiates device authorization by requesting a pair of verification codes from the authorization service.
      */
    def startDeviceAuthorization(params: StartDeviceAuthorizationRequest): Request[StartDeviceAuthorizationResponse, AWSError] = js.native
    def startDeviceAuthorization(
      params: StartDeviceAuthorizationRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ StartDeviceAuthorizationResponse, Unit]
    ): Request[StartDeviceAuthorizationResponse, AWSError] = js.native
  }
  
  type Scope = String
  
  type Scopes = js.Array[Scope]
  
  trait StartDeviceAuthorizationRequest extends StObject {
    
    /**
      * The unique identifier string for the client that is registered with IAM Identity Center. This value should come from the persisted result of the RegisterClient API operation.
      */
    var clientId: ClientId
    
    /**
      * A secret string that is generated for the client. This value should come from the persisted result of the RegisterClient API operation.
      */
    var clientSecret: ClientSecret
    
    /**
      * The URL for the AWS access portal. For more information, see Using the AWS access portal in the IAM Identity Center User Guide.
      */
    var startUrl: URI
  }
  object StartDeviceAuthorizationRequest {
    
    inline def apply(clientId: ClientId, clientSecret: ClientSecret, startUrl: URI): StartDeviceAuthorizationRequest = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], startUrl = startUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartDeviceAuthorizationRequest]
    }
    
    extension [Self <: StartDeviceAuthorizationRequest](x: Self) {
      
      inline def setClientId(value: ClientId): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: ClientSecret): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setStartUrl(value: URI): Self = StObject.set(x, "startUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait StartDeviceAuthorizationResponse extends StObject {
    
    /**
      * The short-lived code that is used by the device when polling for a session token.
      */
    var deviceCode: js.UndefOr[DeviceCode] = js.undefined
    
    /**
      * Indicates the number of seconds in which the verification code will become invalid.
      */
    var expiresIn: js.UndefOr[ExpirationInSeconds] = js.undefined
    
    /**
      * Indicates the number of seconds the client must wait between attempts when polling for a session.
      */
    var interval: js.UndefOr[IntervalInSeconds] = js.undefined
    
    /**
      * A one-time user verification code. This is needed to authorize an in-use device.
      */
    var userCode: js.UndefOr[UserCode] = js.undefined
    
    /**
      * The URI of the verification page that takes the userCode to authorize the device.
      */
    var verificationUri: js.UndefOr[URI] = js.undefined
    
    /**
      * An alternate URL that the client can use to automatically launch a browser. This process skips the manual step in which the user visits the verification page and enters their code.
      */
    var verificationUriComplete: js.UndefOr[URI] = js.undefined
  }
  object StartDeviceAuthorizationResponse {
    
    inline def apply(): StartDeviceAuthorizationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartDeviceAuthorizationResponse]
    }
    
    extension [Self <: StartDeviceAuthorizationResponse](x: Self) {
      
      inline def setDeviceCode(value: DeviceCode): Self = StObject.set(x, "deviceCode", value.asInstanceOf[js.Any])
      
      inline def setDeviceCodeUndefined: Self = StObject.set(x, "deviceCode", js.undefined)
      
      inline def setExpiresIn(value: ExpirationInSeconds): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      inline def setInterval(value: IntervalInSeconds): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setUserCode(value: UserCode): Self = StObject.set(x, "userCode", value.asInstanceOf[js.Any])
      
      inline def setUserCodeUndefined: Self = StObject.set(x, "userCode", js.undefined)
      
      inline def setVerificationUri(value: URI): Self = StObject.set(x, "verificationUri", value.asInstanceOf[js.Any])
      
      inline def setVerificationUriComplete(value: URI): Self = StObject.set(x, "verificationUriComplete", value.asInstanceOf[js.Any])
      
      inline def setVerificationUriCompleteUndefined: Self = StObject.set(x, "verificationUriComplete", js.undefined)
      
      inline def setVerificationUriUndefined: Self = StObject.set(x, "verificationUri", js.undefined)
    }
  }
  
  type TokenType = String
  
  type URI = String
  
  type UserCode = String
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-06-10`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
