package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsApigatewayv2Mod {
  type Arn = java.lang.String
  type AuthorizationScopes = js.Array[StringWithLengthBetween1And64]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.AWS_IAM
    - awsDashSdkLib.awsDashSdkLibStrings.CUSTOM
    - java.lang.String
  */
  type AuthorizationType = _AuthorizationType | java.lang.String
  type AuthorizerType = awsDashSdkLib.awsDashSdkLibStrings.REQUEST | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INTERNET
    - awsDashSdkLib.awsDashSdkLibStrings.VPC_LINK
    - java.lang.String
  */
  type ConnectionType = _ConnectionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CONVERT_TO_BINARY
    - awsDashSdkLib.awsDashSdkLibStrings.CONVERT_TO_TEXT
    - java.lang.String
  */
  type ContentHandlingStrategy = _ContentHandlingStrategy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.DEPLOYED
    - java.lang.String
  */
  type DeploymentStatus = _DeploymentStatus | java.lang.String
  type DomainNameConfigurations = js.Array[DomainNameConfiguration]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - java.lang.String
  */
  type DomainNameStatus = _DomainNameStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.REGIONAL
    - awsDashSdkLib.awsDashSdkLibStrings.EDGE
    - java.lang.String
  */
  type EndpointType = _EndpointType | java.lang.String
  type Id = java.lang.String
  type IdentitySourceList = js.Array[__string]
  type IntegerWithLengthBetween0And3600 = scala.Double
  type IntegerWithLengthBetween50And29000 = scala.Double
  type IntegrationParameters = org.scalablytyped.runtime.StringDictionary[StringWithLengthBetween1And512]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AWS
    - awsDashSdkLib.awsDashSdkLibStrings.HTTP
    - awsDashSdkLib.awsDashSdkLibStrings.MOCK
    - awsDashSdkLib.awsDashSdkLibStrings.HTTP_PROXY
    - awsDashSdkLib.awsDashSdkLibStrings.AWS_PROXY
    - java.lang.String
  */
  type IntegrationType = _IntegrationType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.INFO
    - awsDashSdkLib.awsDashSdkLibStrings.`false`
    - java.lang.String
  */
  type LoggingLevel = _LoggingLevel | java.lang.String
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.WHEN_NO_MATCH
    - awsDashSdkLib.awsDashSdkLibStrings.NEVER
    - awsDashSdkLib.awsDashSdkLibStrings.WHEN_NO_TEMPLATES
    - java.lang.String
  */
  type PassthroughBehavior = _PassthroughBehavior | java.lang.String
  type ProtocolType = awsDashSdkLib.awsDashSdkLibStrings.WEBSOCKET | java.lang.String
  type ProviderArnList = js.Array[Arn]
  type RouteModels = org.scalablytyped.runtime.StringDictionary[StringWithLengthBetween1And128]
  type RouteParameters = org.scalablytyped.runtime.StringDictionary[ParameterConstraints]
  type RouteSettingsMap = org.scalablytyped.runtime.StringDictionary[RouteSettings]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TLS_1_0
    - awsDashSdkLib.awsDashSdkLibStrings.TLS_1_2
    - java.lang.String
  */
  type SecurityPolicy = _SecurityPolicy | java.lang.String
  type SelectionExpression = java.lang.String
  type SelectionKey = java.lang.String
  type StageVariablesMap = org.scalablytyped.runtime.StringDictionary[StringWithLengthBetween0And2048]
  type StringWithLengthBetween0And1024 = java.lang.String
  type StringWithLengthBetween0And2048 = java.lang.String
  type StringWithLengthBetween0And32K = java.lang.String
  type StringWithLengthBetween1And1024 = java.lang.String
  type StringWithLengthBetween1And128 = java.lang.String
  type StringWithLengthBetween1And1600 = java.lang.String
  type StringWithLengthBetween1And256 = java.lang.String
  type StringWithLengthBetween1And512 = java.lang.String
  type StringWithLengthBetween1And64 = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[StringWithLengthBetween1And1600]
  type TemplateMap = org.scalablytyped.runtime.StringDictionary[StringWithLengthBetween0And32K]
  type UriWithLengthBetween1And2048 = java.lang.String
  type __boolean = scala.Boolean
  type __double = scala.Double
  type __integer = scala.Double
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
  type __mapOf__string = org.scalablytyped.runtime.StringDictionary[__string]
  type __string = java.lang.String
  type __timestampIso8601 = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-11-29`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
