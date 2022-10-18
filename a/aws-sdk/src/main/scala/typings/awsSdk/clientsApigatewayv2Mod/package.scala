package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.V2
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Arn = String

type AuthorizationScopes = js.Array[StringWithLengthBetween1And64]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.AWS_IAM
  - typings.awsSdk.awsSdkStrings.CUSTOM
  - typings.awsSdk.awsSdkStrings.JWT
  - java.lang.String
*/
type AuthorizationType = _AuthorizationType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REQUEST
  - typings.awsSdk.awsSdkStrings.JWT
  - java.lang.String
*/
type AuthorizerType = _AuthorizerType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INTERNET
  - typings.awsSdk.awsSdkStrings.VPC_LINK
  - java.lang.String
*/
type ConnectionType = _ConnectionType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CONVERT_TO_BINARY
  - typings.awsSdk.awsSdkStrings.CONVERT_TO_TEXT
  - java.lang.String
*/
type ContentHandlingStrategy = _ContentHandlingStrategy | String

type CorsHeaderList = js.Array[string]

type CorsMethodList = js.Array[StringWithLengthBetween1And64]

type CorsOriginList = js.Array[string]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.DEPLOYED
  - java.lang.String
*/
type DeploymentStatus = _DeploymentStatus | String

type DomainNameConfigurations = js.Array[DomainNameConfiguration]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.PENDING_CERTIFICATE_REIMPORT
  - typings.awsSdk.awsSdkStrings.PENDING_OWNERSHIP_VERIFICATION
  - java.lang.String
*/
type DomainNameStatus = _DomainNameStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REGIONAL
  - typings.awsSdk.awsSdkStrings.EDGE
  - java.lang.String
*/
type EndpointType = _EndpointType | String

type ExportedApi = Buffer | js.typedarray.Uint8Array | Blob | String

type Id = String

type IdentitySourceList = js.Array[string]

type IntegerWithLengthBetween0And3600 = Double

type IntegerWithLengthBetween50And30000 = Double

type IntegerWithLengthBetweenMinus1And86400 = Double

type IntegrationParameters = StringDictionary[StringWithLengthBetween1And512]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWS
  - typings.awsSdk.awsSdkStrings.HTTP
  - typings.awsSdk.awsSdkStrings.MOCK
  - typings.awsSdk.awsSdkStrings.HTTP_PROXY
  - typings.awsSdk.awsSdkStrings.AWS_PROXY
  - java.lang.String
*/
type IntegrationType = _IntegrationType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.INFO
  - typings.awsSdk.awsSdkStrings.OFF
  - java.lang.String
*/
type LoggingLevel = _LoggingLevel | String

type NextToken = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WHEN_NO_MATCH
  - typings.awsSdk.awsSdkStrings.NEVER
  - typings.awsSdk.awsSdkStrings.WHEN_NO_TEMPLATES
  - java.lang.String
*/
type PassthroughBehavior = _PassthroughBehavior | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WEBSOCKET
  - typings.awsSdk.awsSdkStrings.HTTP
  - java.lang.String
*/
type ProtocolType = _ProtocolType | String

type ResponseParameters = StringDictionary[IntegrationParameters]

type RouteModels = StringDictionary[StringWithLengthBetween1And128]

type RouteParameters = StringDictionary[ParameterConstraints]

type RouteSettingsMap = StringDictionary[RouteSettings]

type SecurityGroupIdList = js.Array[string]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TLS_1_0
  - typings.awsSdk.awsSdkStrings.TLS_1_2
  - java.lang.String
*/
type SecurityPolicy = _SecurityPolicy | String

type SelectionExpression = String

type SelectionKey = String

type StageVariablesMap = StringDictionary[StringWithLengthBetween0And2048]

type StringWithLengthBetween0And1024 = String

type StringWithLengthBetween0And2048 = String

type StringWithLengthBetween0And32K = String

type StringWithLengthBetween1And1024 = String

type StringWithLengthBetween1And128 = String

type StringWithLengthBetween1And1600 = String

type StringWithLengthBetween1And256 = String

type StringWithLengthBetween1And512 = String

type StringWithLengthBetween1And64 = String

type SubnetIdList = js.Array[string]

type Tags = StringDictionary[StringWithLengthBetween1And1600]

type TemplateMap = StringDictionary[StringWithLengthBetween0And32K]

type UriWithLengthBetween1And2048 = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type VpcLinkStatus = _VpcLinkStatus | String

type VpcLinkVersion = V2 | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-11-29`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type boolean = Boolean

type double = Double

type integer = Double

type listOfApi = js.Array[Api]

type listOfApiMapping = js.Array[ApiMapping]

type listOfAuthorizer = js.Array[Authorizer]

type listOfDeployment = js.Array[Deployment]

type listOfDomainName = js.Array[DomainName]

type listOfIntegration = js.Array[Integration]

type listOfIntegrationResponse = js.Array[IntegrationResponse]

type listOfModel = js.Array[Model]

type listOfRoute = js.Array[Route]

type listOfRouteResponse = js.Array[RouteResponse]

type listOfStage = js.Array[Stage]

type listOfString = js.Array[string]

type listOfVpcLink = js.Array[VpcLink]

type string = String

type timestampIso8601 = js.Date
