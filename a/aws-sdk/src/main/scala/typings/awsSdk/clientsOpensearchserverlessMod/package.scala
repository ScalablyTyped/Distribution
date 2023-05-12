package typings.awsSdk.clientsOpensearchserverlessMod

import typings.awsSdk.awsSdkStrings.data__
import typings.awsSdk.awsSdkStrings.saml_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessPolicySummaries = js.Array[AccessPolicySummary]

type AccessPolicyType = data__ | java.lang.String

type Arn = java.lang.String

type ClientToken = java.lang.String

type CollectionDetails = js.Array[CollectionDetail]

type CollectionErrorDetails = js.Array[CollectionErrorDetail]

type CollectionId = java.lang.String

type CollectionIds = js.Array[CollectionId]

type CollectionName = java.lang.String

type CollectionNames = js.Array[CollectionName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type CollectionStatus = _CollectionStatus | java.lang.String

type CollectionSummaries = js.Array[CollectionSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SEARCH
  - typings.awsSdk.awsSdkStrings.TIMESERIES
  - java.lang.String
*/
type CollectionType = _CollectionType | java.lang.String

type ConfigDescription = java.lang.String

type ConfigName = java.lang.String

type CreateCollectionRequestDescriptionString = java.lang.String

type IndexingCapacityValue = Double

type ListAccessPoliciesRequestMaxResultsInteger = Double

type ListAccessPoliciesRequestResourceList = js.Array[Resource]

type ListCollectionsRequestMaxResultsInteger = Double

type ListSecurityConfigsRequestMaxResultsInteger = Double

type ListSecurityPoliciesRequestMaxResultsInteger = Double

type ListSecurityPoliciesRequestResourceList = js.Array[Resource]

type ListVpcEndpointsRequestMaxResultsInteger = Double

type Long = Double

type PolicyDescription = java.lang.String

type PolicyDocument = java.lang.String

type PolicyName = java.lang.String

type PolicyVersion = java.lang.String

type Resource = java.lang.String

type SamlConfigOptionsSessionTimeoutInteger = Double

type SearchCapacityValue = Double

type SecurityConfigId = java.lang.String

type SecurityConfigSummaries = js.Array[SecurityConfigSummary]

type SecurityConfigType = saml_ | java.lang.String

type SecurityGroupId = java.lang.String

type SecurityGroupIds = js.Array[SecurityGroupId]

type SecurityPolicySummaries = js.Array[SecurityPolicySummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.encryption_
  - typings.awsSdk.awsSdkStrings.network_
  - java.lang.String
*/
type SecurityPolicyType = _SecurityPolicyType | java.lang.String

type String = java.lang.String

type SubnetId = java.lang.String

type SubnetIds = js.Array[SubnetId]

type TagKey = java.lang.String

type TagKeys = js.Array[TagKey]

type TagValue = java.lang.String

type Tags = js.Array[Tag]

type UpdateCollectionRequestDescriptionString = java.lang.String

type VpcEndpointDetails = js.Array[VpcEndpointDetail]

type VpcEndpointErrorDetails = js.Array[VpcEndpointErrorDetail]

type VpcEndpointId = java.lang.String

type VpcEndpointIds = js.Array[VpcEndpointId]

type VpcEndpointName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type VpcEndpointStatus = _VpcEndpointStatus | java.lang.String

type VpcEndpointSummaries = js.Array[VpcEndpointSummary]

type VpcId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2021-11-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String

type samlGroupAttribute = java.lang.String

type samlMetadata = java.lang.String

type samlUserAttribute = java.lang.String
