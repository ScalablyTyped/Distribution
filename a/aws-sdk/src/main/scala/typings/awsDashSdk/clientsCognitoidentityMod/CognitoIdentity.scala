package typings.awsDashSdk.clientsCognitoidentityMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoIdentity extends Service {
  @JSName("config")
  var config_CognitoIdentity: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a new identity pool. The identity pool is a store of user identity information that is specific to your AWS account. The limit on identity pools is 60 per account. The keys for SupportedLoginProviders are as follows:   Facebook: graph.facebook.com    Google: accounts.google.com    Amazon: www.amazon.com    Twitter: api.twitter.com    Digits: www.digits.com    You must use AWS Developer credentials to call this API.
    */
  def createIdentityPool(): Request[IdentityPool, AWSError] = js.native
  def createIdentityPool(callback: js.Function2[/* err */ AWSError, /* data */ IdentityPool, Unit]): Request[IdentityPool, AWSError] = js.native
  /**
    * Creates a new identity pool. The identity pool is a store of user identity information that is specific to your AWS account. The limit on identity pools is 60 per account. The keys for SupportedLoginProviders are as follows:   Facebook: graph.facebook.com    Google: accounts.google.com    Amazon: www.amazon.com    Twitter: api.twitter.com    Digits: www.digits.com    You must use AWS Developer credentials to call this API.
    */
  def createIdentityPool(params: CreateIdentityPoolInput): Request[IdentityPool, AWSError] = js.native
  def createIdentityPool(
    params: CreateIdentityPoolInput,
    callback: js.Function2[/* err */ AWSError, /* data */ IdentityPool, Unit]
  ): Request[IdentityPool, AWSError] = js.native
  /**
    * Deletes identities from an identity pool. You can specify a list of 1-60 identities that you want to delete. You must use AWS Developer credentials to call this API.
    */
  def deleteIdentities(): Request[DeleteIdentitiesResponse, AWSError] = js.native
  def deleteIdentities(callback: js.Function2[/* err */ AWSError, /* data */ DeleteIdentitiesResponse, Unit]): Request[DeleteIdentitiesResponse, AWSError] = js.native
  /**
    * Deletes identities from an identity pool. You can specify a list of 1-60 identities that you want to delete. You must use AWS Developer credentials to call this API.
    */
  def deleteIdentities(params: DeleteIdentitiesInput): Request[DeleteIdentitiesResponse, AWSError] = js.native
  def deleteIdentities(
    params: DeleteIdentitiesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteIdentitiesResponse, Unit]
  ): Request[DeleteIdentitiesResponse, AWSError] = js.native
  /**
    * Deletes an identity pool. Once a pool is deleted, users will not be able to authenticate with the pool. You must use AWS Developer credentials to call this API.
    */
  def deleteIdentityPool(): Request[js.Object, AWSError] = js.native
  def deleteIdentityPool(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an identity pool. Once a pool is deleted, users will not be able to authenticate with the pool. You must use AWS Developer credentials to call this API.
    */
  def deleteIdentityPool(params: DeleteIdentityPoolInput): Request[js.Object, AWSError] = js.native
  def deleteIdentityPool(
    params: DeleteIdentityPoolInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Returns metadata related to the given identity, including when the identity was created and any associated linked logins. You must use AWS Developer credentials to call this API.
    */
  def describeIdentity(): Request[IdentityDescription, AWSError] = js.native
  def describeIdentity(callback: js.Function2[/* err */ AWSError, /* data */ IdentityDescription, Unit]): Request[IdentityDescription, AWSError] = js.native
  /**
    * Returns metadata related to the given identity, including when the identity was created and any associated linked logins. You must use AWS Developer credentials to call this API.
    */
  def describeIdentity(params: DescribeIdentityInput): Request[IdentityDescription, AWSError] = js.native
  def describeIdentity(
    params: DescribeIdentityInput,
    callback: js.Function2[/* err */ AWSError, /* data */ IdentityDescription, Unit]
  ): Request[IdentityDescription, AWSError] = js.native
  /**
    * Gets details about a particular identity pool, including the pool name, ID description, creation date, and current number of users. You must use AWS Developer credentials to call this API.
    */
  def describeIdentityPool(): Request[IdentityPool, AWSError] = js.native
  def describeIdentityPool(callback: js.Function2[/* err */ AWSError, /* data */ IdentityPool, Unit]): Request[IdentityPool, AWSError] = js.native
  /**
    * Gets details about a particular identity pool, including the pool name, ID description, creation date, and current number of users. You must use AWS Developer credentials to call this API.
    */
  def describeIdentityPool(params: DescribeIdentityPoolInput): Request[IdentityPool, AWSError] = js.native
  def describeIdentityPool(
    params: DescribeIdentityPoolInput,
    callback: js.Function2[/* err */ AWSError, /* data */ IdentityPool, Unit]
  ): Request[IdentityPool, AWSError] = js.native
  /**
    * Returns credentials for the provided identity ID. Any provided logins will be validated against supported login providers. If the token is for cognito-identity.amazonaws.com, it will be passed through to AWS Security Token Service with the appropriate role for the token. This is a public API. You do not need any credentials to call this API.
    */
  def getCredentialsForIdentity(): Request[GetCredentialsForIdentityResponse, AWSError] = js.native
  def getCredentialsForIdentity(callback: js.Function2[/* err */ AWSError, /* data */ GetCredentialsForIdentityResponse, Unit]): Request[GetCredentialsForIdentityResponse, AWSError] = js.native
  /**
    * Returns credentials for the provided identity ID. Any provided logins will be validated against supported login providers. If the token is for cognito-identity.amazonaws.com, it will be passed through to AWS Security Token Service with the appropriate role for the token. This is a public API. You do not need any credentials to call this API.
    */
  def getCredentialsForIdentity(params: GetCredentialsForIdentityInput): Request[GetCredentialsForIdentityResponse, AWSError] = js.native
  def getCredentialsForIdentity(
    params: GetCredentialsForIdentityInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCredentialsForIdentityResponse, Unit]
  ): Request[GetCredentialsForIdentityResponse, AWSError] = js.native
  /**
    * Generates (or retrieves) a Cognito ID. Supplying multiple logins will create an implicit linked account. This is a public API. You do not need any credentials to call this API.
    */
  def getId(): Request[GetIdResponse, AWSError] = js.native
  def getId(callback: js.Function2[/* err */ AWSError, /* data */ GetIdResponse, Unit]): Request[GetIdResponse, AWSError] = js.native
  /**
    * Generates (or retrieves) a Cognito ID. Supplying multiple logins will create an implicit linked account. This is a public API. You do not need any credentials to call this API.
    */
  def getId(params: GetIdInput): Request[GetIdResponse, AWSError] = js.native
  def getId(params: GetIdInput, callback: js.Function2[/* err */ AWSError, /* data */ GetIdResponse, Unit]): Request[GetIdResponse, AWSError] = js.native
  /**
    * Gets the roles for an identity pool. You must use AWS Developer credentials to call this API.
    */
  def getIdentityPoolRoles(): Request[GetIdentityPoolRolesResponse, AWSError] = js.native
  def getIdentityPoolRoles(callback: js.Function2[/* err */ AWSError, /* data */ GetIdentityPoolRolesResponse, Unit]): Request[GetIdentityPoolRolesResponse, AWSError] = js.native
  /**
    * Gets the roles for an identity pool. You must use AWS Developer credentials to call this API.
    */
  def getIdentityPoolRoles(params: GetIdentityPoolRolesInput): Request[GetIdentityPoolRolesResponse, AWSError] = js.native
  def getIdentityPoolRoles(
    params: GetIdentityPoolRolesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIdentityPoolRolesResponse, Unit]
  ): Request[GetIdentityPoolRolesResponse, AWSError] = js.native
  /**
    * Gets an OpenID token, using a known Cognito ID. This known Cognito ID is returned by GetId. You can optionally add additional logins for the identity. Supplying multiple logins creates an implicit link. The OpenId token is valid for 10 minutes. This is a public API. You do not need any credentials to call this API.
    */
  def getOpenIdToken(): Request[GetOpenIdTokenResponse, AWSError] = js.native
  def getOpenIdToken(callback: js.Function2[/* err */ AWSError, /* data */ GetOpenIdTokenResponse, Unit]): Request[GetOpenIdTokenResponse, AWSError] = js.native
  /**
    * Gets an OpenID token, using a known Cognito ID. This known Cognito ID is returned by GetId. You can optionally add additional logins for the identity. Supplying multiple logins creates an implicit link. The OpenId token is valid for 10 minutes. This is a public API. You do not need any credentials to call this API.
    */
  def getOpenIdToken(params: GetOpenIdTokenInput): Request[GetOpenIdTokenResponse, AWSError] = js.native
  def getOpenIdToken(
    params: GetOpenIdTokenInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOpenIdTokenResponse, Unit]
  ): Request[GetOpenIdTokenResponse, AWSError] = js.native
  /**
    * Registers (or retrieves) a Cognito IdentityId and an OpenID Connect token for a user authenticated by your backend authentication process. Supplying multiple logins will create an implicit linked account. You can only specify one developer provider as part of the Logins map, which is linked to the identity pool. The developer provider is the "domain" by which Cognito will refer to your users. You can use GetOpenIdTokenForDeveloperIdentity to create a new identity and to link new logins (that is, user credentials issued by a public provider or developer provider) to an existing identity. When you want to create a new identity, the IdentityId should be null. When you want to associate a new login with an existing authenticated/unauthenticated identity, you can do so by providing the existing IdentityId. This API will create the identity in the specified IdentityPoolId. You must use AWS Developer credentials to call this API.
    */
  def getOpenIdTokenForDeveloperIdentity(): Request[GetOpenIdTokenForDeveloperIdentityResponse, AWSError] = js.native
  def getOpenIdTokenForDeveloperIdentity(
    callback: js.Function2[/* err */ AWSError, /* data */ GetOpenIdTokenForDeveloperIdentityResponse, Unit]
  ): Request[GetOpenIdTokenForDeveloperIdentityResponse, AWSError] = js.native
  /**
    * Registers (or retrieves) a Cognito IdentityId and an OpenID Connect token for a user authenticated by your backend authentication process. Supplying multiple logins will create an implicit linked account. You can only specify one developer provider as part of the Logins map, which is linked to the identity pool. The developer provider is the "domain" by which Cognito will refer to your users. You can use GetOpenIdTokenForDeveloperIdentity to create a new identity and to link new logins (that is, user credentials issued by a public provider or developer provider) to an existing identity. When you want to create a new identity, the IdentityId should be null. When you want to associate a new login with an existing authenticated/unauthenticated identity, you can do so by providing the existing IdentityId. This API will create the identity in the specified IdentityPoolId. You must use AWS Developer credentials to call this API.
    */
  def getOpenIdTokenForDeveloperIdentity(params: GetOpenIdTokenForDeveloperIdentityInput): Request[GetOpenIdTokenForDeveloperIdentityResponse, AWSError] = js.native
  def getOpenIdTokenForDeveloperIdentity(
    params: GetOpenIdTokenForDeveloperIdentityInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOpenIdTokenForDeveloperIdentityResponse, Unit]
  ): Request[GetOpenIdTokenForDeveloperIdentityResponse, AWSError] = js.native
  /**
    * Lists the identities in an identity pool. You must use AWS Developer credentials to call this API.
    */
  def listIdentities(): Request[ListIdentitiesResponse, AWSError] = js.native
  def listIdentities(callback: js.Function2[/* err */ AWSError, /* data */ ListIdentitiesResponse, Unit]): Request[ListIdentitiesResponse, AWSError] = js.native
  /**
    * Lists the identities in an identity pool. You must use AWS Developer credentials to call this API.
    */
  def listIdentities(params: ListIdentitiesInput): Request[ListIdentitiesResponse, AWSError] = js.native
  def listIdentities(
    params: ListIdentitiesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIdentitiesResponse, Unit]
  ): Request[ListIdentitiesResponse, AWSError] = js.native
  /**
    * Lists all of the Cognito identity pools registered for your account. You must use AWS Developer credentials to call this API.
    */
  def listIdentityPools(): Request[ListIdentityPoolsResponse, AWSError] = js.native
  def listIdentityPools(callback: js.Function2[/* err */ AWSError, /* data */ ListIdentityPoolsResponse, Unit]): Request[ListIdentityPoolsResponse, AWSError] = js.native
  /**
    * Lists all of the Cognito identity pools registered for your account. You must use AWS Developer credentials to call this API.
    */
  def listIdentityPools(params: ListIdentityPoolsInput): Request[ListIdentityPoolsResponse, AWSError] = js.native
  def listIdentityPools(
    params: ListIdentityPoolsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIdentityPoolsResponse, Unit]
  ): Request[ListIdentityPoolsResponse, AWSError] = js.native
  /**
    * Lists the tags that are assigned to an Amazon Cognito identity pool. A tag is a label that you can apply to identity pools to categorize and manage them in different ways, such as by purpose, owner, environment, or other criteria. You can use this action up to 10 times per second, per account.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags that are assigned to an Amazon Cognito identity pool. A tag is a label that you can apply to identity pools to categorize and manage them in different ways, such as by purpose, owner, environment, or other criteria. You can use this action up to 10 times per second, per account.
    */
  def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Retrieves the IdentityID associated with a DeveloperUserIdentifier or the list of DeveloperUserIdentifier values associated with an IdentityId for an existing identity. Either IdentityID or DeveloperUserIdentifier must not be null. If you supply only one of these values, the other value will be searched in the database and returned as a part of the response. If you supply both, DeveloperUserIdentifier will be matched against IdentityID. If the values are verified against the database, the response returns both values and is the same as the request. Otherwise a ResourceConflictException is thrown.  LookupDeveloperIdentity is intended for low-throughput control plane operations: for example, to enable customer service to locate an identity ID by username. If you are using it for higher-volume operations such as user authentication, your requests are likely to be throttled. GetOpenIdTokenForDeveloperIdentity is a better option for higher-volume operations for user authentication. You must use AWS Developer credentials to call this API.
    */
  def lookupDeveloperIdentity(): Request[LookupDeveloperIdentityResponse, AWSError] = js.native
  def lookupDeveloperIdentity(callback: js.Function2[/* err */ AWSError, /* data */ LookupDeveloperIdentityResponse, Unit]): Request[LookupDeveloperIdentityResponse, AWSError] = js.native
  /**
    * Retrieves the IdentityID associated with a DeveloperUserIdentifier or the list of DeveloperUserIdentifier values associated with an IdentityId for an existing identity. Either IdentityID or DeveloperUserIdentifier must not be null. If you supply only one of these values, the other value will be searched in the database and returned as a part of the response. If you supply both, DeveloperUserIdentifier will be matched against IdentityID. If the values are verified against the database, the response returns both values and is the same as the request. Otherwise a ResourceConflictException is thrown.  LookupDeveloperIdentity is intended for low-throughput control plane operations: for example, to enable customer service to locate an identity ID by username. If you are using it for higher-volume operations such as user authentication, your requests are likely to be throttled. GetOpenIdTokenForDeveloperIdentity is a better option for higher-volume operations for user authentication. You must use AWS Developer credentials to call this API.
    */
  def lookupDeveloperIdentity(params: LookupDeveloperIdentityInput): Request[LookupDeveloperIdentityResponse, AWSError] = js.native
  def lookupDeveloperIdentity(
    params: LookupDeveloperIdentityInput,
    callback: js.Function2[/* err */ AWSError, /* data */ LookupDeveloperIdentityResponse, Unit]
  ): Request[LookupDeveloperIdentityResponse, AWSError] = js.native
  /**
    * Merges two users having different IdentityIds, existing in the same identity pool, and identified by the same developer provider. You can use this action to request that discrete users be merged and identified as a single user in the Cognito environment. Cognito associates the given source user (SourceUserIdentifier) with the IdentityId of the DestinationUserIdentifier. Only developer-authenticated users can be merged. If the users to be merged are associated with the same public provider, but as two different users, an exception will be thrown. The number of linked logins is limited to 20. So, the number of linked logins for the source user, SourceUserIdentifier, and the destination user, DestinationUserIdentifier, together should not be larger than 20. Otherwise, an exception will be thrown. You must use AWS Developer credentials to call this API.
    */
  def mergeDeveloperIdentities(): Request[MergeDeveloperIdentitiesResponse, AWSError] = js.native
  def mergeDeveloperIdentities(callback: js.Function2[/* err */ AWSError, /* data */ MergeDeveloperIdentitiesResponse, Unit]): Request[MergeDeveloperIdentitiesResponse, AWSError] = js.native
  /**
    * Merges two users having different IdentityIds, existing in the same identity pool, and identified by the same developer provider. You can use this action to request that discrete users be merged and identified as a single user in the Cognito environment. Cognito associates the given source user (SourceUserIdentifier) with the IdentityId of the DestinationUserIdentifier. Only developer-authenticated users can be merged. If the users to be merged are associated with the same public provider, but as two different users, an exception will be thrown. The number of linked logins is limited to 20. So, the number of linked logins for the source user, SourceUserIdentifier, and the destination user, DestinationUserIdentifier, together should not be larger than 20. Otherwise, an exception will be thrown. You must use AWS Developer credentials to call this API.
    */
  def mergeDeveloperIdentities(params: MergeDeveloperIdentitiesInput): Request[MergeDeveloperIdentitiesResponse, AWSError] = js.native
  def mergeDeveloperIdentities(
    params: MergeDeveloperIdentitiesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ MergeDeveloperIdentitiesResponse, Unit]
  ): Request[MergeDeveloperIdentitiesResponse, AWSError] = js.native
  /**
    * Sets the roles for an identity pool. These roles are used when making calls to GetCredentialsForIdentity action. You must use AWS Developer credentials to call this API.
    */
  def setIdentityPoolRoles(): Request[js.Object, AWSError] = js.native
  def setIdentityPoolRoles(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets the roles for an identity pool. These roles are used when making calls to GetCredentialsForIdentity action. You must use AWS Developer credentials to call this API.
    */
  def setIdentityPoolRoles(params: SetIdentityPoolRolesInput): Request[js.Object, AWSError] = js.native
  def setIdentityPoolRoles(
    params: SetIdentityPoolRolesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Assigns a set of tags to an Amazon Cognito identity pool. A tag is a label that you can use to categorize and manage identity pools in different ways, such as by purpose, owner, environment, or other criteria. Each tag consists of a key and value, both of which you define. A key is a general category for more specific values. For example, if you have two versions of an identity pool, one for testing and another for production, you might assign an Environment tag key to both identity pools. The value of this key might be Test for one identity pool and Production for the other. Tags are useful for cost tracking and access control. You can activate your tags so that they appear on the Billing and Cost Management console, where you can track the costs associated with your identity pools. In an IAM policy, you can constrain permissions for identity pools based on specific tags or tag values. You can use this action up to 5 times per second, per account. An identity pool can have as many as 50 tags.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Assigns a set of tags to an Amazon Cognito identity pool. A tag is a label that you can use to categorize and manage identity pools in different ways, such as by purpose, owner, environment, or other criteria. Each tag consists of a key and value, both of which you define. A key is a general category for more specific values. For example, if you have two versions of an identity pool, one for testing and another for production, you might assign an Environment tag key to both identity pools. The value of this key might be Test for one identity pool and Production for the other. Tags are useful for cost tracking and access control. You can activate your tags so that they appear on the Billing and Cost Management console, where you can track the costs associated with your identity pools. In an IAM policy, you can constrain permissions for identity pools based on specific tags or tag values. You can use this action up to 5 times per second, per account. An identity pool can have as many as 50 tags.
    */
  def tagResource(params: TagResourceInput): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Unlinks a DeveloperUserIdentifier from an existing identity. Unlinked developer users will be considered new identities next time they are seen. If, for a given Cognito identity, you remove all federated identities as well as the developer user identifier, the Cognito identity becomes inaccessible. You must use AWS Developer credentials to call this API.
    */
  def unlinkDeveloperIdentity(): Request[js.Object, AWSError] = js.native
  def unlinkDeveloperIdentity(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Unlinks a DeveloperUserIdentifier from an existing identity. Unlinked developer users will be considered new identities next time they are seen. If, for a given Cognito identity, you remove all federated identities as well as the developer user identifier, the Cognito identity becomes inaccessible. You must use AWS Developer credentials to call this API.
    */
  def unlinkDeveloperIdentity(params: UnlinkDeveloperIdentityInput): Request[js.Object, AWSError] = js.native
  def unlinkDeveloperIdentity(
    params: UnlinkDeveloperIdentityInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Unlinks a federated identity from an existing account. Unlinked logins will be considered new identities next time they are seen. Removing the last linked login will make this identity inaccessible. This is a public API. You do not need any credentials to call this API.
    */
  def unlinkIdentity(): Request[js.Object, AWSError] = js.native
  def unlinkIdentity(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Unlinks a federated identity from an existing account. Unlinked logins will be considered new identities next time they are seen. Removing the last linked login will make this identity inaccessible. This is a public API. You do not need any credentials to call this API.
    */
  def unlinkIdentity(params: UnlinkIdentityInput): Request[js.Object, AWSError] = js.native
  def unlinkIdentity(
    params: UnlinkIdentityInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified tags from an Amazon Cognito identity pool. You can use this action up to 5 times per second, per account
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the specified tags from an Amazon Cognito identity pool. You can use this action up to 5 times per second, per account
    */
  def untagResource(params: UntagResourceInput): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Updates an identity pool. You must use AWS Developer credentials to call this API.
    */
  def updateIdentityPool(): Request[IdentityPool, AWSError] = js.native
  def updateIdentityPool(callback: js.Function2[/* err */ AWSError, /* data */ IdentityPool, Unit]): Request[IdentityPool, AWSError] = js.native
  /**
    * Updates an identity pool. You must use AWS Developer credentials to call this API.
    */
  def updateIdentityPool(params: IdentityPool): Request[IdentityPool, AWSError] = js.native
  def updateIdentityPool(params: IdentityPool, callback: js.Function2[/* err */ AWSError, /* data */ IdentityPool, Unit]): Request[IdentityPool, AWSError] = js.native
}

