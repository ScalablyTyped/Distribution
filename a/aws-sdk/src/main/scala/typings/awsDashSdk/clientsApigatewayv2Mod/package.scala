package typings.awsDashSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.awsDashSdkStrings.REQUEST
import typings.awsDashSdk.awsDashSdkStrings.WEBSOCKET
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsApigatewayv2Mod {
  type Arn = String
  type AuthorizationScopes = js.Array[StringWithLengthBetween1And64]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.AWS_IAM
    - typings.awsDashSdk.awsDashSdkStrings.CUSTOM
    - java.lang.String
  */
  type AuthorizationType = _AuthorizationType | String
  type AuthorizerType = REQUEST | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INTERNET
    - typings.awsDashSdk.awsDashSdkStrings.VPC_LINK
    - java.lang.String
  */
  type ConnectionType = _ConnectionType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CONVERT_TO_BINARY
    - typings.awsDashSdk.awsDashSdkStrings.CONVERT_TO_TEXT
    - java.lang.String
  */
  type ContentHandlingStrategy = _ContentHandlingStrategy | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DEPLOYED
    - java.lang.String
  */
  type DeploymentStatus = _DeploymentStatus | String
  type DomainNameConfigurations = js.Array[DomainNameConfiguration]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - java.lang.String
  */
  type DomainNameStatus = _DomainNameStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.REGIONAL
    - typings.awsDashSdk.awsDashSdkStrings.EDGE
    - java.lang.String
  */
  type EndpointType = _EndpointType | String
  type Id = String
  type IdentitySourceList = js.Array[__string]
  type IntegerWithLengthBetween0And3600 = Double
  type IntegerWithLengthBetween50And29000 = Double
  type IntegrationParameters = StringDictionary[StringWithLengthBetween1And512]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AWS
    - typings.awsDashSdk.awsDashSdkStrings.HTTP
    - typings.awsDashSdk.awsDashSdkStrings.MOCK
    - typings.awsDashSdk.awsDashSdkStrings.HTTP_PROXY
    - typings.awsDashSdk.awsDashSdkStrings.AWS_PROXY
    - java.lang.String
  */
  type IntegrationType = _IntegrationType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - typings.awsDashSdk.awsDashSdkStrings.INFO
    - typings.awsDashSdk.awsDashSdkStrings.`false`
    - java.lang.String
  */
  type LoggingLevel = _LoggingLevel | String
  type NextToken = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.WHEN_NO_MATCH
    - typings.awsDashSdk.awsDashSdkStrings.NEVER
    - typings.awsDashSdk.awsDashSdkStrings.WHEN_NO_TEMPLATES
    - java.lang.String
  */
  type PassthroughBehavior = _PassthroughBehavior | String
  type ProtocolType = WEBSOCKET | String
  type ProviderArnList = js.Array[Arn]
  type RouteModels = StringDictionary[StringWithLengthBetween1And128]
  type RouteParameters = StringDictionary[ParameterConstraints]
  type RouteSettingsMap = StringDictionary[RouteSettings]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TLS_1_0
    - typings.awsDashSdk.awsDashSdkStrings.TLS_1_2
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
  type Tags = StringDictionary[StringWithLengthBetween1And1600]
  type TemplateMap = StringDictionary[StringWithLengthBetween0And32K]
  type UriWithLengthBetween1And2048 = String
  type __boolean = Boolean
  type __double = Double
  type __integer = Double
  type __listOfApi = js.Array[Api]
  type __listOfApiMapping = js.Array[ApiMapping]
  type __listOfAuthorizer = js.Array[Authorizer]
  type __listOfDeployment = js.Array[Deployment]
  type __listOfDomainName = js.Array[DomainName]
  type __listOfIntegration = js.Array[Integration]
  type __listOfIntegrationResponse = js.Array[IntegrationResponse]
  type __listOfModel = js.Array[Model]
  type __listOfRoute = js.Array[Route]
  type __listOfRouteResponse = js.Array[RouteResponse]
  type __listOfStage = js.Array[Stage]
  type __listOf__string = js.Array[__string]
  type __mapOf__string = StringDictionary[__string]
  type __string = String
  type __timestampIso8601 = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-11-29`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
