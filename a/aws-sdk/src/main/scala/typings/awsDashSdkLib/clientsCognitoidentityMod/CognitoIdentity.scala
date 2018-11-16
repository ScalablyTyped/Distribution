package typings
package awsDashSdkLib.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoIdentity
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CognitoIdentity: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.ClientConfiguration = js.native
  /**
     * Creates a new identity pool. The identity pool is a store of user identity information that is specific to your AWS account. The limit on identity pools is 60 per account. The keys for SupportedLoginProviders are as follows:   Facebook: graph.facebook.com    Google: accounts.google.com    Amazon: www.amazon.com    Twitter: api.twitter.com    Digits: www.digits.com    You must use AWS Developer credentials to call this API.
     */
  def createIdentityPool(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPool, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new identity pool. The identity pool is a store of user identity information that is specific to your AWS account. The limit on identity pools is 60 per account. The keys for SupportedLoginProviders are as follows:   Facebook: graph.facebook.com    Google: accounts.google.com    Amazon: www.amazon.com    Twitter: api.twitter.com    Digits: www.digits.com    You must use AWS Developer credentials to call this API.
     */
  def createIdentityPool(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPool, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPool, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new identity pool. The identity pool is a store of user identity information that is specific to your AWS account. The limit on identity pools is 60 per account. The keys for SupportedLoginProviders are as follows:   Facebook: graph.facebook.com    Google: accounts.google.com    Amazon: www.amazon.com    Twitter: api.twitter.com    Digits: www.digits.com    You must use AWS Developer credentials to call this API.
     */
  def createIdentityPool(params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.CreateIdentityPoolInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPool, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new identity pool. The identity pool is a store of user identity information that is specific to your AWS account. The limit on identity pools is 60 per account. The keys for SupportedLoginProviders are as follows:   Facebook: graph.facebook.com    Google: accounts.google.com    Amazon: www.amazon.com    Twitter: api.twitter.com    Digits: www.digits.com    You must use AWS Developer credentials to call this API.
     */
  def createIdentityPool(
    params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.CreateIdentityPoolInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPool, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPool, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes identities from an identity pool. You can specify a list of 1-60 identities that you want to delete. You must use AWS Developer credentials to call this API.
     */
  def deleteIdentities(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.DeleteIdentitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes identities from an identity pool. You can specify a list of 1-60 identities that you want to delete. You must use AWS Developer credentials to call this API.
     */
  def deleteIdentities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.DeleteIdentitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.DeleteIdentitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes identities from an identity pool. You can specify a list of 1-60 identities that you want to delete. You must use AWS Developer credentials to call this API.
     */
  def deleteIdentities(params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.DeleteIdentitiesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.DeleteIdentitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes identities from an identity pool. You can specify a list of 1-60 identities that you want to delete. You must use AWS Developer credentials to call this API.
     */
  def deleteIdentities(
    params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.DeleteIdentitiesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.DeleteIdentitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.DeleteIdentitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a user pool. Once a pool is deleted, users will not be able to authenticate with the pool. You must use AWS Developer credentials to call this API.
     */
  def deleteIdentityPool(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a user pool. Once a pool is deleted, users will not be able to authenticate with the pool. You must use AWS Developer credentials to call this API.
     */
  def deleteIdentityPool(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a user pool. Once a pool is deleted, users will not be able to authenticate with the pool. You must use AWS Developer credentials to call this API.
     */
  def deleteIdentityPool(params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.DeleteIdentityPoolInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a user pool. Once a pool is deleted, users will not be able to authenticate with the pool. You must use AWS Developer credentials to call this API.
     */
  def deleteIdentityPool(
    params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.DeleteIdentityPoolInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Returns metadata related to the given identity, including when the identity was created and any associated linked logins. You must use AWS Developer credentials to call this API.
     */
  def describeIdentity(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns metadata related to the given identity, including when the identity was created and any associated linked logins. You must use AWS Developer credentials to call this API.
     */
  def describeIdentity(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityDescription, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns metadata related to the given identity, including when the identity was created and any associated linked logins. You must use AWS Developer credentials to call this API.
     */
  def describeIdentity(params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.DescribeIdentityInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns metadata related to the given identity, including when the identity was created and any associated linked logins. You must use AWS Developer credentials to call this API.
     */
  def describeIdentity(
    params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.DescribeIdentityInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityDescription, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityDescription, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets details about a particular identity pool, including the pool name, ID description, creation date, and current number of users. You must use AWS Developer credentials to call this API.
     */
  def describeIdentityPool(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPool, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets details about a particular identity pool, including the pool name, ID description, creation date, and current number of users. You must use AWS Developer credentials to call this API.
     */
  def describeIdentityPool(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPool, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPool, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets details about a particular identity pool, including the pool name, ID description, creation date, and current number of users. You must use AWS Developer credentials to call this API.
     */
  def describeIdentityPool(params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.DescribeIdentityPoolInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPool, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets details about a particular identity pool, including the pool name, ID description, creation date, and current number of users. You must use AWS Developer credentials to call this API.
     */
  def describeIdentityPool(
    params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.DescribeIdentityPoolInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPool, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPool, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns credentials for the provided identity ID. Any provided logins will be validated against supported login providers. If the token is for cognito-identity.amazonaws.com, it will be passed through to AWS Security Token Service with the appropriate role for the token. This is a public API. You do not need any credentials to call this API.
     */
  def getCredentialsForIdentity(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetCredentialsForIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns credentials for the provided identity ID. Any provided logins will be validated against supported login providers. If the token is for cognito-identity.amazonaws.com, it will be passed through to AWS Security Token Service with the appropriate role for the token. This is a public API. You do not need any credentials to call this API.
     */
  def getCredentialsForIdentity(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetCredentialsForIdentityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetCredentialsForIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns credentials for the provided identity ID. Any provided logins will be validated against supported login providers. If the token is for cognito-identity.amazonaws.com, it will be passed through to AWS Security Token Service with the appropriate role for the token. This is a public API. You do not need any credentials to call this API.
     */
  def getCredentialsForIdentity(params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetCredentialsForIdentityInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetCredentialsForIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns credentials for the provided identity ID. Any provided logins will be validated against supported login providers. If the token is for cognito-identity.amazonaws.com, it will be passed through to AWS Security Token Service with the appropriate role for the token. This is a public API. You do not need any credentials to call this API.
     */
  def getCredentialsForIdentity(
    params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetCredentialsForIdentityInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetCredentialsForIdentityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetCredentialsForIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Generates (or retrieves) a Cognito ID. Supplying multiple logins will create an implicit linked account. This is a public API. You do not need any credentials to call this API.
     */
  def getId(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetIdResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Generates (or retrieves) a Cognito ID. Supplying multiple logins will create an implicit linked account. This is a public API. You do not need any credentials to call this API.
     */
  def getId(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetIdResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetIdResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Generates (or retrieves) a Cognito ID. Supplying multiple logins will create an implicit linked account. This is a public API. You do not need any credentials to call this API.
     */
  def getId(params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetIdInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetIdResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Generates (or retrieves) a Cognito ID. Supplying multiple logins will create an implicit linked account. This is a public API. You do not need any credentials to call this API.
     */
  def getId(
    params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetIdInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetIdResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetIdResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the roles for an identity pool. You must use AWS Developer credentials to call this API.
     */
  def getIdentityPoolRoles(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetIdentityPoolRolesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the roles for an identity pool. You must use AWS Developer credentials to call this API.
     */
  def getIdentityPoolRoles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetIdentityPoolRolesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetIdentityPoolRolesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the roles for an identity pool. You must use AWS Developer credentials to call this API.
     */
  def getIdentityPoolRoles(params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetIdentityPoolRolesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetIdentityPoolRolesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the roles for an identity pool. You must use AWS Developer credentials to call this API.
     */
  def getIdentityPoolRoles(
    params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetIdentityPoolRolesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetIdentityPoolRolesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetIdentityPoolRolesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets an OpenID token, using a known Cognito ID. This known Cognito ID is returned by GetId. You can optionally add additional logins for the identity. Supplying multiple logins creates an implicit link. The OpenId token is valid for 15 minutes. This is a public API. You do not need any credentials to call this API.
     */
  def getOpenIdToken(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetOpenIdTokenResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets an OpenID token, using a known Cognito ID. This known Cognito ID is returned by GetId. You can optionally add additional logins for the identity. Supplying multiple logins creates an implicit link. The OpenId token is valid for 15 minutes. This is a public API. You do not need any credentials to call this API.
     */
  def getOpenIdToken(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetOpenIdTokenResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetOpenIdTokenResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets an OpenID token, using a known Cognito ID. This known Cognito ID is returned by GetId. You can optionally add additional logins for the identity. Supplying multiple logins creates an implicit link. The OpenId token is valid for 15 minutes. This is a public API. You do not need any credentials to call this API.
     */
  def getOpenIdToken(params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetOpenIdTokenInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetOpenIdTokenResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets an OpenID token, using a known Cognito ID. This known Cognito ID is returned by GetId. You can optionally add additional logins for the identity. Supplying multiple logins creates an implicit link. The OpenId token is valid for 15 minutes. This is a public API. You do not need any credentials to call this API.
     */
  def getOpenIdToken(
    params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetOpenIdTokenInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetOpenIdTokenResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetOpenIdTokenResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers (or retrieves) a Cognito IdentityId and an OpenID Connect token for a user authenticated by your backend authentication process. Supplying multiple logins will create an implicit linked account. You can only specify one developer provider as part of the Logins map, which is linked to the identity pool. The developer provider is the "domain" by which Cognito will refer to your users. You can use GetOpenIdTokenForDeveloperIdentity to create a new identity and to link new logins (that is, user credentials issued by a public provider or developer provider) to an existing identity. When you want to create a new identity, the IdentityId should be null. When you want to associate a new login with an existing authenticated/unauthenticated identity, you can do so by providing the existing IdentityId. This API will create the identity in the specified IdentityPoolId. You must use AWS Developer credentials to call this API.
     */
  def getOpenIdTokenForDeveloperIdentity(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetOpenIdTokenForDeveloperIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers (or retrieves) a Cognito IdentityId and an OpenID Connect token for a user authenticated by your backend authentication process. Supplying multiple logins will create an implicit linked account. You can only specify one developer provider as part of the Logins map, which is linked to the identity pool. The developer provider is the "domain" by which Cognito will refer to your users. You can use GetOpenIdTokenForDeveloperIdentity to create a new identity and to link new logins (that is, user credentials issued by a public provider or developer provider) to an existing identity. When you want to create a new identity, the IdentityId should be null. When you want to associate a new login with an existing authenticated/unauthenticated identity, you can do so by providing the existing IdentityId. This API will create the identity in the specified IdentityPoolId. You must use AWS Developer credentials to call this API.
     */
  def getOpenIdTokenForDeveloperIdentity(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetOpenIdTokenForDeveloperIdentityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetOpenIdTokenForDeveloperIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers (or retrieves) a Cognito IdentityId and an OpenID Connect token for a user authenticated by your backend authentication process. Supplying multiple logins will create an implicit linked account. You can only specify one developer provider as part of the Logins map, which is linked to the identity pool. The developer provider is the "domain" by which Cognito will refer to your users. You can use GetOpenIdTokenForDeveloperIdentity to create a new identity and to link new logins (that is, user credentials issued by a public provider or developer provider) to an existing identity. When you want to create a new identity, the IdentityId should be null. When you want to associate a new login with an existing authenticated/unauthenticated identity, you can do so by providing the existing IdentityId. This API will create the identity in the specified IdentityPoolId. You must use AWS Developer credentials to call this API.
     */
  def getOpenIdTokenForDeveloperIdentity(
    params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetOpenIdTokenForDeveloperIdentityInput
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetOpenIdTokenForDeveloperIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers (or retrieves) a Cognito IdentityId and an OpenID Connect token for a user authenticated by your backend authentication process. Supplying multiple logins will create an implicit linked account. You can only specify one developer provider as part of the Logins map, which is linked to the identity pool. The developer provider is the "domain" by which Cognito will refer to your users. You can use GetOpenIdTokenForDeveloperIdentity to create a new identity and to link new logins (that is, user credentials issued by a public provider or developer provider) to an existing identity. When you want to create a new identity, the IdentityId should be null. When you want to associate a new login with an existing authenticated/unauthenticated identity, you can do so by providing the existing IdentityId. This API will create the identity in the specified IdentityPoolId. You must use AWS Developer credentials to call this API.
     */
  def getOpenIdTokenForDeveloperIdentity(
    params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetOpenIdTokenForDeveloperIdentityInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetOpenIdTokenForDeveloperIdentityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetOpenIdTokenForDeveloperIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the identities in a pool. You must use AWS Developer credentials to call this API.
     */
  def listIdentities(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.ListIdentitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the identities in a pool. You must use AWS Developer credentials to call this API.
     */
  def listIdentities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.ListIdentitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.ListIdentitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the identities in a pool. You must use AWS Developer credentials to call this API.
     */
  def listIdentities(params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.ListIdentitiesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.ListIdentitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the identities in a pool. You must use AWS Developer credentials to call this API.
     */
  def listIdentities(
    params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.ListIdentitiesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.ListIdentitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.ListIdentitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all of the Cognito identity pools registered for your account. You must use AWS Developer credentials to call this API.
     */
  def listIdentityPools(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.ListIdentityPoolsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all of the Cognito identity pools registered for your account. You must use AWS Developer credentials to call this API.
     */
  def listIdentityPools(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.ListIdentityPoolsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.ListIdentityPoolsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all of the Cognito identity pools registered for your account. You must use AWS Developer credentials to call this API.
     */
  def listIdentityPools(params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.ListIdentityPoolsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.ListIdentityPoolsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all of the Cognito identity pools registered for your account. You must use AWS Developer credentials to call this API.
     */
  def listIdentityPools(
    params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.ListIdentityPoolsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.ListIdentityPoolsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.ListIdentityPoolsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the IdentityID associated with a DeveloperUserIdentifier or the list of DeveloperUserIdentifiers associated with an IdentityId for an existing identity. Either IdentityID or DeveloperUserIdentifier must not be null. If you supply only one of these values, the other value will be searched in the database and returned as a part of the response. If you supply both, DeveloperUserIdentifier will be matched against IdentityID. If the values are verified against the database, the response returns both values and is the same as the request. Otherwise a ResourceConflictException is thrown. You must use AWS Developer credentials to call this API.
     */
  def lookupDeveloperIdentity(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.LookupDeveloperIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the IdentityID associated with a DeveloperUserIdentifier or the list of DeveloperUserIdentifiers associated with an IdentityId for an existing identity. Either IdentityID or DeveloperUserIdentifier must not be null. If you supply only one of these values, the other value will be searched in the database and returned as a part of the response. If you supply both, DeveloperUserIdentifier will be matched against IdentityID. If the values are verified against the database, the response returns both values and is the same as the request. Otherwise a ResourceConflictException is thrown. You must use AWS Developer credentials to call this API.
     */
  def lookupDeveloperIdentity(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.LookupDeveloperIdentityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.LookupDeveloperIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the IdentityID associated with a DeveloperUserIdentifier or the list of DeveloperUserIdentifiers associated with an IdentityId for an existing identity. Either IdentityID or DeveloperUserIdentifier must not be null. If you supply only one of these values, the other value will be searched in the database and returned as a part of the response. If you supply both, DeveloperUserIdentifier will be matched against IdentityID. If the values are verified against the database, the response returns both values and is the same as the request. Otherwise a ResourceConflictException is thrown. You must use AWS Developer credentials to call this API.
     */
  def lookupDeveloperIdentity(params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.LookupDeveloperIdentityInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.LookupDeveloperIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the IdentityID associated with a DeveloperUserIdentifier or the list of DeveloperUserIdentifiers associated with an IdentityId for an existing identity. Either IdentityID or DeveloperUserIdentifier must not be null. If you supply only one of these values, the other value will be searched in the database and returned as a part of the response. If you supply both, DeveloperUserIdentifier will be matched against IdentityID. If the values are verified against the database, the response returns both values and is the same as the request. Otherwise a ResourceConflictException is thrown. You must use AWS Developer credentials to call this API.
     */
  def lookupDeveloperIdentity(
    params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.LookupDeveloperIdentityInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.LookupDeveloperIdentityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.LookupDeveloperIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Merges two users having different IdentityIds, existing in the same identity pool, and identified by the same developer provider. You can use this action to request that discrete users be merged and identified as a single user in the Cognito environment. Cognito associates the given source user (SourceUserIdentifier) with the IdentityId of the DestinationUserIdentifier. Only developer-authenticated users can be merged. If the users to be merged are associated with the same public provider, but as two different users, an exception will be thrown. You must use AWS Developer credentials to call this API.
     */
  def mergeDeveloperIdentities(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.MergeDeveloperIdentitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Merges two users having different IdentityIds, existing in the same identity pool, and identified by the same developer provider. You can use this action to request that discrete users be merged and identified as a single user in the Cognito environment. Cognito associates the given source user (SourceUserIdentifier) with the IdentityId of the DestinationUserIdentifier. Only developer-authenticated users can be merged. If the users to be merged are associated with the same public provider, but as two different users, an exception will be thrown. You must use AWS Developer credentials to call this API.
     */
  def mergeDeveloperIdentities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.MergeDeveloperIdentitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.MergeDeveloperIdentitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Merges two users having different IdentityIds, existing in the same identity pool, and identified by the same developer provider. You can use this action to request that discrete users be merged and identified as a single user in the Cognito environment. Cognito associates the given source user (SourceUserIdentifier) with the IdentityId of the DestinationUserIdentifier. Only developer-authenticated users can be merged. If the users to be merged are associated with the same public provider, but as two different users, an exception will be thrown. You must use AWS Developer credentials to call this API.
     */
  def mergeDeveloperIdentities(params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.MergeDeveloperIdentitiesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.MergeDeveloperIdentitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Merges two users having different IdentityIds, existing in the same identity pool, and identified by the same developer provider. You can use this action to request that discrete users be merged and identified as a single user in the Cognito environment. Cognito associates the given source user (SourceUserIdentifier) with the IdentityId of the DestinationUserIdentifier. Only developer-authenticated users can be merged. If the users to be merged are associated with the same public provider, but as two different users, an exception will be thrown. You must use AWS Developer credentials to call this API.
     */
  def mergeDeveloperIdentities(
    params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.MergeDeveloperIdentitiesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.MergeDeveloperIdentitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.MergeDeveloperIdentitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets the roles for an identity pool. These roles are used when making calls to GetCredentialsForIdentity action. You must use AWS Developer credentials to call this API.
     */
  def setIdentityPoolRoles(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the roles for an identity pool. These roles are used when making calls to GetCredentialsForIdentity action. You must use AWS Developer credentials to call this API.
     */
  def setIdentityPoolRoles(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the roles for an identity pool. These roles are used when making calls to GetCredentialsForIdentity action. You must use AWS Developer credentials to call this API.
     */
  def setIdentityPoolRoles(params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.SetIdentityPoolRolesInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the roles for an identity pool. These roles are used when making calls to GetCredentialsForIdentity action. You must use AWS Developer credentials to call this API.
     */
  def setIdentityPoolRoles(
    params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.SetIdentityPoolRolesInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Unlinks a DeveloperUserIdentifier from an existing identity. Unlinked developer users will be considered new identities next time they are seen. If, for a given Cognito identity, you remove all federated identities as well as the developer user identifier, the Cognito identity becomes inaccessible. You must use AWS Developer credentials to call this API.
     */
  def unlinkDeveloperIdentity(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Unlinks a DeveloperUserIdentifier from an existing identity. Unlinked developer users will be considered new identities next time they are seen. If, for a given Cognito identity, you remove all federated identities as well as the developer user identifier, the Cognito identity becomes inaccessible. You must use AWS Developer credentials to call this API.
     */
  def unlinkDeveloperIdentity(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Unlinks a DeveloperUserIdentifier from an existing identity. Unlinked developer users will be considered new identities next time they are seen. If, for a given Cognito identity, you remove all federated identities as well as the developer user identifier, the Cognito identity becomes inaccessible. You must use AWS Developer credentials to call this API.
     */
  def unlinkDeveloperIdentity(params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.UnlinkDeveloperIdentityInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Unlinks a DeveloperUserIdentifier from an existing identity. Unlinked developer users will be considered new identities next time they are seen. If, for a given Cognito identity, you remove all federated identities as well as the developer user identifier, the Cognito identity becomes inaccessible. You must use AWS Developer credentials to call this API.
     */
  def unlinkDeveloperIdentity(
    params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.UnlinkDeveloperIdentityInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Unlinks a federated identity from an existing account. Unlinked logins will be considered new identities next time they are seen. Removing the last linked login will make this identity inaccessible. This is a public API. You do not need any credentials to call this API.
     */
  def unlinkIdentity(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Unlinks a federated identity from an existing account. Unlinked logins will be considered new identities next time they are seen. Removing the last linked login will make this identity inaccessible. This is a public API. You do not need any credentials to call this API.
     */
  def unlinkIdentity(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Unlinks a federated identity from an existing account. Unlinked logins will be considered new identities next time they are seen. Removing the last linked login will make this identity inaccessible. This is a public API. You do not need any credentials to call this API.
     */
  def unlinkIdentity(params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.UnlinkIdentityInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Unlinks a federated identity from an existing account. Unlinked logins will be considered new identities next time they are seen. Removing the last linked login will make this identity inaccessible. This is a public API. You do not need any credentials to call this API.
     */
  def unlinkIdentity(
    params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.UnlinkIdentityInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a user pool. You must use AWS Developer credentials to call this API.
     */
  def updateIdentityPool(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPool, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a user pool. You must use AWS Developer credentials to call this API.
     */
  def updateIdentityPool(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPool, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPool, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a user pool. You must use AWS Developer credentials to call this API.
     */
  def updateIdentityPool(params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPool): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPool, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a user pool. You must use AWS Developer credentials to call this API.
     */
  def updateIdentityPool(
    params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPool,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPool, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPool, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

