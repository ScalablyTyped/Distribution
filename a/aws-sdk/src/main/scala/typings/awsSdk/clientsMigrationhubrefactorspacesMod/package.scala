package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.API_GATEWAY
import typings.awsSdk.awsSdkStrings.TRANSIT_GATEWAY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = java.lang.String

type AdditionalDetails = StringDictionary[AdditionalDetailsValue]

type AdditionalDetailsKey = java.lang.String

type AdditionalDetailsValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REGIONAL
  - typings.awsSdk.awsSdkStrings.PRIVATE
  - java.lang.String
*/
type ApiGatewayEndpointType = _ApiGatewayEndpointType | java.lang.String

type ApiGatewayId = java.lang.String

type ApplicationId = java.lang.String

type ApplicationName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type ApplicationState = _ApplicationState | java.lang.String

type ApplicationSummaries = js.Array[ApplicationSummary]

type Boolean = scala.Boolean

type CidrBlock = java.lang.String

type CidrBlocks = js.Array[CidrBlock]

type ClientToken = java.lang.String

type Description = java.lang.String

type Ec2TagValue = java.lang.String

type EnvironmentId = java.lang.String

type EnvironmentName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type EnvironmentState = _EnvironmentState | java.lang.String

type EnvironmentSummaries = js.Array[EnvironmentSummary]

type EnvironmentVpcs = js.Array[EnvironmentVpc]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INVALID_RESOURCE_STATE
  - typings.awsSdk.awsSdkStrings.RESOURCE_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.RESOURCE_CREATION_FAILURE
  - typings.awsSdk.awsSdkStrings.RESOURCE_UPDATE_FAILURE
  - typings.awsSdk.awsSdkStrings.SERVICE_ENDPOINT_HEALTH_CHECK_FAILURE
  - typings.awsSdk.awsSdkStrings.RESOURCE_DELETION_FAILURE
  - typings.awsSdk.awsSdkStrings.RESOURCE_RETRIEVAL_FAILURE
  - typings.awsSdk.awsSdkStrings.RESOURCE_IN_USE
  - typings.awsSdk.awsSdkStrings.RESOURCE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.STATE_TRANSITION_FAILURE
  - typings.awsSdk.awsSdkStrings.REQUEST_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.NOT_AUTHORIZED
  - java.lang.String
*/
type ErrorCode = _ErrorCode | java.lang.String

type ErrorMessage = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENVIRONMENT
  - typings.awsSdk.awsSdkStrings.APPLICATION
  - typings.awsSdk.awsSdkStrings.ROUTE
  - typings.awsSdk.awsSdkStrings.SERVICE
  - typings.awsSdk.awsSdkStrings.TRANSIT_GATEWAY
  - typings.awsSdk.awsSdkStrings.TRANSIT_GATEWAY_ATTACHMENT
  - typings.awsSdk.awsSdkStrings.API_GATEWAY
  - typings.awsSdk.awsSdkStrings.NLB
  - typings.awsSdk.awsSdkStrings.TARGET_GROUP
  - typings.awsSdk.awsSdkStrings.LOAD_BALANCER_LISTENER
  - typings.awsSdk.awsSdkStrings.VPC_LINK
  - typings.awsSdk.awsSdkStrings.LAMBDA
  - typings.awsSdk.awsSdkStrings.VPC
  - typings.awsSdk.awsSdkStrings.SUBNET
  - typings.awsSdk.awsSdkStrings.ROUTE_TABLE
  - typings.awsSdk.awsSdkStrings.SECURITY_GROUP
  - typings.awsSdk.awsSdkStrings.VPC_ENDPOINT_SERVICE_CONFIGURATION
  - typings.awsSdk.awsSdkStrings.RESOURCE_SHARE
  - typings.awsSdk.awsSdkStrings.IAM_ROLE
  - java.lang.String
*/
type ErrorResourceType = _ErrorResourceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DELETE
  - typings.awsSdk.awsSdkStrings.GET
  - typings.awsSdk.awsSdkStrings.HEAD
  - typings.awsSdk.awsSdkStrings.OPTIONS
  - typings.awsSdk.awsSdkStrings.PATCH
  - typings.awsSdk.awsSdkStrings.POST
  - typings.awsSdk.awsSdkStrings.PUT
  - java.lang.String
*/
type HttpMethod = _HttpMethod | java.lang.String

type HttpMethods = js.Array[HttpMethod]

type LambdaArn = java.lang.String

type MaxResults = Double

type NetworkFabricType = TRANSIT_GATEWAY | java.lang.String

type NextToken = java.lang.String

type NlbArn = java.lang.String

type NlbName = java.lang.String

type PathResourceToId = StringDictionary[PathResourceToIdValue]

type PathResourceToIdKey = java.lang.String

type PathResourceToIdValue = java.lang.String

type PolicyString = java.lang.String

type ProxyType = API_GATEWAY | java.lang.String

type ResourceArn = java.lang.String

type ResourceIdentifier = java.lang.String

type ResourcePolicyIdentifier = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type RouteActivationState = _RouteActivationState | java.lang.String

type RouteId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type RouteState = _RouteState | java.lang.String

type RouteSummaries = js.Array[RouteSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEFAULT
  - typings.awsSdk.awsSdkStrings.URI_PATH
  - java.lang.String
*/
type RouteType = _RouteType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LAMBDA
  - typings.awsSdk.awsSdkStrings.URL
  - java.lang.String
*/
type ServiceEndpointType = _ServiceEndpointType | java.lang.String

type ServiceId = java.lang.String

type ServiceName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ServiceState = _ServiceState | java.lang.String

type ServiceSummaries = js.Array[ServiceSummary]

type StageName = java.lang.String

type String = java.lang.String

type TagKeys = js.Array[String]

type TagMap = StringDictionary[TagMapValueString]

type TagMapKeyString = java.lang.String

type TagMapValueString = java.lang.String

type Timestamp = js.Date

type TransitGatewayId = java.lang.String

type Uri = java.lang.String

type UriPath = java.lang.String

type VpcId = java.lang.String

type VpcLinkId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2021-10-26`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
