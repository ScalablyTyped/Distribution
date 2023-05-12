package typings.awsSdk.clientsOpensearchserverlessMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenSearchServerless extends Service {
  
  /**
    * Returns attributes for one or more collections, including the collection endpoint and the OpenSearch Dashboards endpoint. For more information, see Creating and managing Amazon OpenSearch Serverless collections.
    */
  def batchGetCollection(): Request[BatchGetCollectionResponse, AWSError] = js.native
  def batchGetCollection(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetCollectionResponse, Unit]): Request[BatchGetCollectionResponse, AWSError] = js.native
  /**
    * Returns attributes for one or more collections, including the collection endpoint and the OpenSearch Dashboards endpoint. For more information, see Creating and managing Amazon OpenSearch Serverless collections.
    */
  def batchGetCollection(params: BatchGetCollectionRequest): Request[BatchGetCollectionResponse, AWSError] = js.native
  def batchGetCollection(
    params: BatchGetCollectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetCollectionResponse, Unit]
  ): Request[BatchGetCollectionResponse, AWSError] = js.native
  
  /**
    * Returns attributes for one or more VPC endpoints associated with the current account. For more information, see Access Amazon OpenSearch Serverless using an interface endpoint.
    */
  def batchGetVpcEndpoint(): Request[BatchGetVpcEndpointResponse, AWSError] = js.native
  def batchGetVpcEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetVpcEndpointResponse, Unit]): Request[BatchGetVpcEndpointResponse, AWSError] = js.native
  /**
    * Returns attributes for one or more VPC endpoints associated with the current account. For more information, see Access Amazon OpenSearch Serverless using an interface endpoint.
    */
  def batchGetVpcEndpoint(params: BatchGetVpcEndpointRequest): Request[BatchGetVpcEndpointResponse, AWSError] = js.native
  def batchGetVpcEndpoint(
    params: BatchGetVpcEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetVpcEndpointResponse, Unit]
  ): Request[BatchGetVpcEndpointResponse, AWSError] = js.native
  
  @JSName("config")
  var config_OpenSearchServerless: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a data access policy for OpenSearch Serverless. Access policies limit access to collections and the resources within them, and allow a user to access that data irrespective of the access mechanism or network source. For more information, see Data access control for Amazon OpenSearch Serverless.
    */
  def createAccessPolicy(): Request[CreateAccessPolicyResponse, AWSError] = js.native
  def createAccessPolicy(callback: js.Function2[/* err */ AWSError, /* data */ CreateAccessPolicyResponse, Unit]): Request[CreateAccessPolicyResponse, AWSError] = js.native
  /**
    * Creates a data access policy for OpenSearch Serverless. Access policies limit access to collections and the resources within them, and allow a user to access that data irrespective of the access mechanism or network source. For more information, see Data access control for Amazon OpenSearch Serverless.
    */
  def createAccessPolicy(params: CreateAccessPolicyRequest): Request[CreateAccessPolicyResponse, AWSError] = js.native
  def createAccessPolicy(
    params: CreateAccessPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAccessPolicyResponse, Unit]
  ): Request[CreateAccessPolicyResponse, AWSError] = js.native
  
  /**
    * Creates a new OpenSearch Serverless collection. For more information, see Creating and managing Amazon OpenSearch Serverless collections.
    */
  def createCollection(): Request[CreateCollectionResponse, AWSError] = js.native
  def createCollection(callback: js.Function2[/* err */ AWSError, /* data */ CreateCollectionResponse, Unit]): Request[CreateCollectionResponse, AWSError] = js.native
  /**
    * Creates a new OpenSearch Serverless collection. For more information, see Creating and managing Amazon OpenSearch Serverless collections.
    */
  def createCollection(params: CreateCollectionRequest): Request[CreateCollectionResponse, AWSError] = js.native
  def createCollection(
    params: CreateCollectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCollectionResponse, Unit]
  ): Request[CreateCollectionResponse, AWSError] = js.native
  
  /**
    * Specifies a security configuration for OpenSearch Serverless. For more information, see SAML authentication for Amazon OpenSearch Serverless. 
    */
  def createSecurityConfig(): Request[CreateSecurityConfigResponse, AWSError] = js.native
  def createSecurityConfig(callback: js.Function2[/* err */ AWSError, /* data */ CreateSecurityConfigResponse, Unit]): Request[CreateSecurityConfigResponse, AWSError] = js.native
  /**
    * Specifies a security configuration for OpenSearch Serverless. For more information, see SAML authentication for Amazon OpenSearch Serverless. 
    */
  def createSecurityConfig(params: CreateSecurityConfigRequest): Request[CreateSecurityConfigResponse, AWSError] = js.native
  def createSecurityConfig(
    params: CreateSecurityConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSecurityConfigResponse, Unit]
  ): Request[CreateSecurityConfigResponse, AWSError] = js.native
  
  /**
    * Creates a security policy to be used by one or more OpenSearch Serverless collections. Security policies provide access to a collection and its OpenSearch Dashboards endpoint from public networks or specific VPC endpoints. They also allow you to secure a collection with a KMS encryption key. For more information, see Network access for Amazon OpenSearch Serverless and Encryption at rest for Amazon OpenSearch Serverless.
    */
  def createSecurityPolicy(): Request[CreateSecurityPolicyResponse, AWSError] = js.native
  def createSecurityPolicy(callback: js.Function2[/* err */ AWSError, /* data */ CreateSecurityPolicyResponse, Unit]): Request[CreateSecurityPolicyResponse, AWSError] = js.native
  /**
    * Creates a security policy to be used by one or more OpenSearch Serverless collections. Security policies provide access to a collection and its OpenSearch Dashboards endpoint from public networks or specific VPC endpoints. They also allow you to secure a collection with a KMS encryption key. For more information, see Network access for Amazon OpenSearch Serverless and Encryption at rest for Amazon OpenSearch Serverless.
    */
  def createSecurityPolicy(params: CreateSecurityPolicyRequest): Request[CreateSecurityPolicyResponse, AWSError] = js.native
  def createSecurityPolicy(
    params: CreateSecurityPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSecurityPolicyResponse, Unit]
  ): Request[CreateSecurityPolicyResponse, AWSError] = js.native
  
  /**
    * Creates an OpenSearch Serverless-managed interface VPC endpoint. For more information, see Access Amazon OpenSearch Serverless using an interface endpoint.
    */
  def createVpcEndpoint(): Request[CreateVpcEndpointResponse, AWSError] = js.native
  def createVpcEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ CreateVpcEndpointResponse, Unit]): Request[CreateVpcEndpointResponse, AWSError] = js.native
  /**
    * Creates an OpenSearch Serverless-managed interface VPC endpoint. For more information, see Access Amazon OpenSearch Serverless using an interface endpoint.
    */
  def createVpcEndpoint(params: CreateVpcEndpointRequest): Request[CreateVpcEndpointResponse, AWSError] = js.native
  def createVpcEndpoint(
    params: CreateVpcEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVpcEndpointResponse, Unit]
  ): Request[CreateVpcEndpointResponse, AWSError] = js.native
  
  /**
    * Deletes an OpenSearch Serverless access policy. For more information, see Data access control for Amazon OpenSearch Serverless.
    */
  def deleteAccessPolicy(): Request[DeleteAccessPolicyResponse, AWSError] = js.native
  def deleteAccessPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccessPolicyResponse, Unit]): Request[DeleteAccessPolicyResponse, AWSError] = js.native
  /**
    * Deletes an OpenSearch Serverless access policy. For more information, see Data access control for Amazon OpenSearch Serverless.
    */
  def deleteAccessPolicy(params: DeleteAccessPolicyRequest): Request[DeleteAccessPolicyResponse, AWSError] = js.native
  def deleteAccessPolicy(
    params: DeleteAccessPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccessPolicyResponse, Unit]
  ): Request[DeleteAccessPolicyResponse, AWSError] = js.native
  
  /**
    * Deletes an OpenSearch Serverless collection. For more information, see Creating and managing Amazon OpenSearch Serverless collections.
    */
  def deleteCollection(): Request[DeleteCollectionResponse, AWSError] = js.native
  def deleteCollection(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCollectionResponse, Unit]): Request[DeleteCollectionResponse, AWSError] = js.native
  /**
    * Deletes an OpenSearch Serverless collection. For more information, see Creating and managing Amazon OpenSearch Serverless collections.
    */
  def deleteCollection(params: DeleteCollectionRequest): Request[DeleteCollectionResponse, AWSError] = js.native
  def deleteCollection(
    params: DeleteCollectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCollectionResponse, Unit]
  ): Request[DeleteCollectionResponse, AWSError] = js.native
  
  /**
    * Deletes a security configuration for OpenSearch Serverless. For more information, see SAML authentication for Amazon OpenSearch Serverless.
    */
  def deleteSecurityConfig(): Request[DeleteSecurityConfigResponse, AWSError] = js.native
  def deleteSecurityConfig(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSecurityConfigResponse, Unit]): Request[DeleteSecurityConfigResponse, AWSError] = js.native
  /**
    * Deletes a security configuration for OpenSearch Serverless. For more information, see SAML authentication for Amazon OpenSearch Serverless.
    */
  def deleteSecurityConfig(params: DeleteSecurityConfigRequest): Request[DeleteSecurityConfigResponse, AWSError] = js.native
  def deleteSecurityConfig(
    params: DeleteSecurityConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSecurityConfigResponse, Unit]
  ): Request[DeleteSecurityConfigResponse, AWSError] = js.native
  
  /**
    * Deletes an OpenSearch Serverless security policy.
    */
  def deleteSecurityPolicy(): Request[DeleteSecurityPolicyResponse, AWSError] = js.native
  def deleteSecurityPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSecurityPolicyResponse, Unit]): Request[DeleteSecurityPolicyResponse, AWSError] = js.native
  /**
    * Deletes an OpenSearch Serverless security policy.
    */
  def deleteSecurityPolicy(params: DeleteSecurityPolicyRequest): Request[DeleteSecurityPolicyResponse, AWSError] = js.native
  def deleteSecurityPolicy(
    params: DeleteSecurityPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSecurityPolicyResponse, Unit]
  ): Request[DeleteSecurityPolicyResponse, AWSError] = js.native
  
  /**
    * Deletes an OpenSearch Serverless-managed interface endpoint. For more information, see Access Amazon OpenSearch Serverless using an interface endpoint.
    */
  def deleteVpcEndpoint(): Request[DeleteVpcEndpointResponse, AWSError] = js.native
  def deleteVpcEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ DeleteVpcEndpointResponse, Unit]): Request[DeleteVpcEndpointResponse, AWSError] = js.native
  /**
    * Deletes an OpenSearch Serverless-managed interface endpoint. For more information, see Access Amazon OpenSearch Serverless using an interface endpoint.
    */
  def deleteVpcEndpoint(params: DeleteVpcEndpointRequest): Request[DeleteVpcEndpointResponse, AWSError] = js.native
  def deleteVpcEndpoint(
    params: DeleteVpcEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVpcEndpointResponse, Unit]
  ): Request[DeleteVpcEndpointResponse, AWSError] = js.native
  
  /**
    * Returns an OpenSearch Serverless access policy. For more information, see Data access control for Amazon OpenSearch Serverless.
    */
  def getAccessPolicy(): Request[GetAccessPolicyResponse, AWSError] = js.native
  def getAccessPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetAccessPolicyResponse, Unit]): Request[GetAccessPolicyResponse, AWSError] = js.native
  /**
    * Returns an OpenSearch Serverless access policy. For more information, see Data access control for Amazon OpenSearch Serverless.
    */
  def getAccessPolicy(params: GetAccessPolicyRequest): Request[GetAccessPolicyResponse, AWSError] = js.native
  def getAccessPolicy(
    params: GetAccessPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccessPolicyResponse, Unit]
  ): Request[GetAccessPolicyResponse, AWSError] = js.native
  
  /**
    * Returns account-level settings related to OpenSearch Serverless.
    */
  def getAccountSettings(): Request[GetAccountSettingsResponse, AWSError] = js.native
  def getAccountSettings(callback: js.Function2[/* err */ AWSError, /* data */ GetAccountSettingsResponse, Unit]): Request[GetAccountSettingsResponse, AWSError] = js.native
  /**
    * Returns account-level settings related to OpenSearch Serverless.
    */
  def getAccountSettings(params: GetAccountSettingsRequest): Request[GetAccountSettingsResponse, AWSError] = js.native
  def getAccountSettings(
    params: GetAccountSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccountSettingsResponse, Unit]
  ): Request[GetAccountSettingsResponse, AWSError] = js.native
  
  /**
    * Returns statistical information about your OpenSearch Serverless access policies, security configurations, and security policies.
    */
  def getPoliciesStats(): Request[GetPoliciesStatsResponse, AWSError] = js.native
  def getPoliciesStats(callback: js.Function2[/* err */ AWSError, /* data */ GetPoliciesStatsResponse, Unit]): Request[GetPoliciesStatsResponse, AWSError] = js.native
  /**
    * Returns statistical information about your OpenSearch Serverless access policies, security configurations, and security policies.
    */
  def getPoliciesStats(params: GetPoliciesStatsRequest): Request[GetPoliciesStatsResponse, AWSError] = js.native
  def getPoliciesStats(
    params: GetPoliciesStatsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPoliciesStatsResponse, Unit]
  ): Request[GetPoliciesStatsResponse, AWSError] = js.native
  
  /**
    * Returns information about an OpenSearch Serverless security configuration. For more information, see SAML authentication for Amazon OpenSearch Serverless.
    */
  def getSecurityConfig(): Request[GetSecurityConfigResponse, AWSError] = js.native
  def getSecurityConfig(callback: js.Function2[/* err */ AWSError, /* data */ GetSecurityConfigResponse, Unit]): Request[GetSecurityConfigResponse, AWSError] = js.native
  /**
    * Returns information about an OpenSearch Serverless security configuration. For more information, see SAML authentication for Amazon OpenSearch Serverless.
    */
  def getSecurityConfig(params: GetSecurityConfigRequest): Request[GetSecurityConfigResponse, AWSError] = js.native
  def getSecurityConfig(
    params: GetSecurityConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSecurityConfigResponse, Unit]
  ): Request[GetSecurityConfigResponse, AWSError] = js.native
  
  /**
    * Returns information about a configured OpenSearch Serverless security policy. For more information, see Network access for Amazon OpenSearch Serverless and Encryption at rest for Amazon OpenSearch Serverless.
    */
  def getSecurityPolicy(): Request[GetSecurityPolicyResponse, AWSError] = js.native
  def getSecurityPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetSecurityPolicyResponse, Unit]): Request[GetSecurityPolicyResponse, AWSError] = js.native
  /**
    * Returns information about a configured OpenSearch Serverless security policy. For more information, see Network access for Amazon OpenSearch Serverless and Encryption at rest for Amazon OpenSearch Serverless.
    */
  def getSecurityPolicy(params: GetSecurityPolicyRequest): Request[GetSecurityPolicyResponse, AWSError] = js.native
  def getSecurityPolicy(
    params: GetSecurityPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSecurityPolicyResponse, Unit]
  ): Request[GetSecurityPolicyResponse, AWSError] = js.native
  
  /**
    * Returns information about a list of OpenSearch Serverless access policies.
    */
  def listAccessPolicies(): Request[ListAccessPoliciesResponse, AWSError] = js.native
  def listAccessPolicies(callback: js.Function2[/* err */ AWSError, /* data */ ListAccessPoliciesResponse, Unit]): Request[ListAccessPoliciesResponse, AWSError] = js.native
  /**
    * Returns information about a list of OpenSearch Serverless access policies.
    */
  def listAccessPolicies(params: ListAccessPoliciesRequest): Request[ListAccessPoliciesResponse, AWSError] = js.native
  def listAccessPolicies(
    params: ListAccessPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccessPoliciesResponse, Unit]
  ): Request[ListAccessPoliciesResponse, AWSError] = js.native
  
  /**
    * Lists all OpenSearch Serverless collections. For more information, see Creating and managing Amazon OpenSearch Serverless collections.  Make sure to include an empty request body {} if you don't include any collection filters in the request. 
    */
  def listCollections(): Request[ListCollectionsResponse, AWSError] = js.native
  def listCollections(callback: js.Function2[/* err */ AWSError, /* data */ ListCollectionsResponse, Unit]): Request[ListCollectionsResponse, AWSError] = js.native
  /**
    * Lists all OpenSearch Serverless collections. For more information, see Creating and managing Amazon OpenSearch Serverless collections.  Make sure to include an empty request body {} if you don't include any collection filters in the request. 
    */
  def listCollections(params: ListCollectionsRequest): Request[ListCollectionsResponse, AWSError] = js.native
  def listCollections(
    params: ListCollectionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCollectionsResponse, Unit]
  ): Request[ListCollectionsResponse, AWSError] = js.native
  
  /**
    * Returns information about configured OpenSearch Serverless security configurations. For more information, see SAML authentication for Amazon OpenSearch Serverless.
    */
  def listSecurityConfigs(): Request[ListSecurityConfigsResponse, AWSError] = js.native
  def listSecurityConfigs(callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityConfigsResponse, Unit]): Request[ListSecurityConfigsResponse, AWSError] = js.native
  /**
    * Returns information about configured OpenSearch Serverless security configurations. For more information, see SAML authentication for Amazon OpenSearch Serverless.
    */
  def listSecurityConfigs(params: ListSecurityConfigsRequest): Request[ListSecurityConfigsResponse, AWSError] = js.native
  def listSecurityConfigs(
    params: ListSecurityConfigsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityConfigsResponse, Unit]
  ): Request[ListSecurityConfigsResponse, AWSError] = js.native
  
  /**
    * Returns information about configured OpenSearch Serverless security policies.
    */
  def listSecurityPolicies(): Request[ListSecurityPoliciesResponse, AWSError] = js.native
  def listSecurityPolicies(callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityPoliciesResponse, Unit]): Request[ListSecurityPoliciesResponse, AWSError] = js.native
  /**
    * Returns information about configured OpenSearch Serverless security policies.
    */
  def listSecurityPolicies(params: ListSecurityPoliciesRequest): Request[ListSecurityPoliciesResponse, AWSError] = js.native
  def listSecurityPolicies(
    params: ListSecurityPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityPoliciesResponse, Unit]
  ): Request[ListSecurityPoliciesResponse, AWSError] = js.native
  
  /**
    * Returns the tags for an OpenSearch Serverless resource. For more information, see Tagging Amazon OpenSearch Serverless collections.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns the tags for an OpenSearch Serverless resource. For more information, see Tagging Amazon OpenSearch Serverless collections.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Returns the OpenSearch Serverless-managed interface VPC endpoints associated with the current account. For more information, see Access Amazon OpenSearch Serverless using an interface endpoint.
    */
  def listVpcEndpoints(): Request[ListVpcEndpointsResponse, AWSError] = js.native
  def listVpcEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ ListVpcEndpointsResponse, Unit]): Request[ListVpcEndpointsResponse, AWSError] = js.native
  /**
    * Returns the OpenSearch Serverless-managed interface VPC endpoints associated with the current account. For more information, see Access Amazon OpenSearch Serverless using an interface endpoint.
    */
  def listVpcEndpoints(params: ListVpcEndpointsRequest): Request[ListVpcEndpointsResponse, AWSError] = js.native
  def listVpcEndpoints(
    params: ListVpcEndpointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVpcEndpointsResponse, Unit]
  ): Request[ListVpcEndpointsResponse, AWSError] = js.native
  
  /**
    * Associates tags with an OpenSearch Serverless resource. For more information, see Tagging Amazon OpenSearch Serverless collections.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Associates tags with an OpenSearch Serverless resource. For more information, see Tagging Amazon OpenSearch Serverless collections.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes a tag or set of tags from an OpenSearch Serverless resource. For more information, see Tagging Amazon OpenSearch Serverless collections.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes a tag or set of tags from an OpenSearch Serverless resource. For more information, see Tagging Amazon OpenSearch Serverless collections.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates an OpenSearch Serverless access policy. For more information, see Data access control for Amazon OpenSearch Serverless.
    */
  def updateAccessPolicy(): Request[UpdateAccessPolicyResponse, AWSError] = js.native
  def updateAccessPolicy(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccessPolicyResponse, Unit]): Request[UpdateAccessPolicyResponse, AWSError] = js.native
  /**
    * Updates an OpenSearch Serverless access policy. For more information, see Data access control for Amazon OpenSearch Serverless.
    */
  def updateAccessPolicy(params: UpdateAccessPolicyRequest): Request[UpdateAccessPolicyResponse, AWSError] = js.native
  def updateAccessPolicy(
    params: UpdateAccessPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccessPolicyResponse, Unit]
  ): Request[UpdateAccessPolicyResponse, AWSError] = js.native
  
  /**
    * Update the OpenSearch Serverless settings for the current Amazon Web Services account. For more information, see Managing capacity limits for Amazon OpenSearch Serverless.
    */
  def updateAccountSettings(): Request[UpdateAccountSettingsResponse, AWSError] = js.native
  def updateAccountSettings(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccountSettingsResponse, Unit]): Request[UpdateAccountSettingsResponse, AWSError] = js.native
  /**
    * Update the OpenSearch Serverless settings for the current Amazon Web Services account. For more information, see Managing capacity limits for Amazon OpenSearch Serverless.
    */
  def updateAccountSettings(params: UpdateAccountSettingsRequest): Request[UpdateAccountSettingsResponse, AWSError] = js.native
  def updateAccountSettings(
    params: UpdateAccountSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccountSettingsResponse, Unit]
  ): Request[UpdateAccountSettingsResponse, AWSError] = js.native
  
  /**
    * Updates an OpenSearch Serverless collection.
    */
  def updateCollection(): Request[UpdateCollectionResponse, AWSError] = js.native
  def updateCollection(callback: js.Function2[/* err */ AWSError, /* data */ UpdateCollectionResponse, Unit]): Request[UpdateCollectionResponse, AWSError] = js.native
  /**
    * Updates an OpenSearch Serverless collection.
    */
  def updateCollection(params: UpdateCollectionRequest): Request[UpdateCollectionResponse, AWSError] = js.native
  def updateCollection(
    params: UpdateCollectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCollectionResponse, Unit]
  ): Request[UpdateCollectionResponse, AWSError] = js.native
  
  /**
    * Updates a security configuration for OpenSearch Serverless. For more information, see SAML authentication for Amazon OpenSearch Serverless.
    */
  def updateSecurityConfig(): Request[UpdateSecurityConfigResponse, AWSError] = js.native
  def updateSecurityConfig(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSecurityConfigResponse, Unit]): Request[UpdateSecurityConfigResponse, AWSError] = js.native
  /**
    * Updates a security configuration for OpenSearch Serverless. For more information, see SAML authentication for Amazon OpenSearch Serverless.
    */
  def updateSecurityConfig(params: UpdateSecurityConfigRequest): Request[UpdateSecurityConfigResponse, AWSError] = js.native
  def updateSecurityConfig(
    params: UpdateSecurityConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSecurityConfigResponse, Unit]
  ): Request[UpdateSecurityConfigResponse, AWSError] = js.native
  
  /**
    * Updates an OpenSearch Serverless security policy. For more information, see Network access for Amazon OpenSearch Serverless and Encryption at rest for Amazon OpenSearch Serverless.
    */
  def updateSecurityPolicy(): Request[UpdateSecurityPolicyResponse, AWSError] = js.native
  def updateSecurityPolicy(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSecurityPolicyResponse, Unit]): Request[UpdateSecurityPolicyResponse, AWSError] = js.native
  /**
    * Updates an OpenSearch Serverless security policy. For more information, see Network access for Amazon OpenSearch Serverless and Encryption at rest for Amazon OpenSearch Serverless.
    */
  def updateSecurityPolicy(params: UpdateSecurityPolicyRequest): Request[UpdateSecurityPolicyResponse, AWSError] = js.native
  def updateSecurityPolicy(
    params: UpdateSecurityPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSecurityPolicyResponse, Unit]
  ): Request[UpdateSecurityPolicyResponse, AWSError] = js.native
  
  /**
    * Updates an OpenSearch Serverless-managed interface endpoint. For more information, see Access Amazon OpenSearch Serverless using an interface endpoint.
    */
  def updateVpcEndpoint(): Request[UpdateVpcEndpointResponse, AWSError] = js.native
  def updateVpcEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVpcEndpointResponse, Unit]): Request[UpdateVpcEndpointResponse, AWSError] = js.native
  /**
    * Updates an OpenSearch Serverless-managed interface endpoint. For more information, see Access Amazon OpenSearch Serverless using an interface endpoint.
    */
  def updateVpcEndpoint(params: UpdateVpcEndpointRequest): Request[UpdateVpcEndpointResponse, AWSError] = js.native
  def updateVpcEndpoint(
    params: UpdateVpcEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVpcEndpointResponse, Unit]
  ): Request[UpdateVpcEndpointResponse, AWSError] = js.native
}
