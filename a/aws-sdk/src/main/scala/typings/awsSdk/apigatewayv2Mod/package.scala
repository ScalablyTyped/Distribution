package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apigatewayv2Mod {
  type Arn = java.lang.String
  type AuthorizationScopes = js.Array[typings.awsSdk.apigatewayv2Mod.StringWithLengthBetween1And64]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.AWS_IAM
    - typings.awsSdk.awsSdkStrings.CUSTOM
    - typings.awsSdk.awsSdkStrings.JWT
    - java.lang.String
  */
  type AuthorizationType = typings.awsSdk.apigatewayv2Mod._AuthorizationType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.REQUEST
    - typings.awsSdk.awsSdkStrings.JWT
    - java.lang.String
  */
  type AuthorizerType = typings.awsSdk.apigatewayv2Mod._AuthorizerType | java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.apigatewayv2Mod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INTERNET
    - typings.awsSdk.awsSdkStrings.VPC_LINK
    - java.lang.String
  */
  type ConnectionType = typings.awsSdk.apigatewayv2Mod._ConnectionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CONVERT_TO_BINARY
    - typings.awsSdk.awsSdkStrings.CONVERT_TO_TEXT
    - java.lang.String
  */
  type ContentHandlingStrategy = typings.awsSdk.apigatewayv2Mod._ContentHandlingStrategy | java.lang.String
  type CorsHeaderList = js.Array[typings.awsSdk.apigatewayv2Mod.string]
  type CorsMethodList = js.Array[typings.awsSdk.apigatewayv2Mod.StringWithLengthBetween1And64]
  type CorsOriginList = js.Array[typings.awsSdk.apigatewayv2Mod.string]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.DEPLOYED
    - java.lang.String
  */
  type DeploymentStatus = typings.awsSdk.apigatewayv2Mod._DeploymentStatus | java.lang.String
  type DomainNameConfigurations = js.Array[typings.awsSdk.apigatewayv2Mod.DomainNameConfiguration]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - typings.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type DomainNameStatus = typings.awsSdk.apigatewayv2Mod._DomainNameStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.REGIONAL
    - typings.awsSdk.awsSdkStrings.EDGE
    - java.lang.String
  */
  type EndpointType = typings.awsSdk.apigatewayv2Mod._EndpointType | java.lang.String
  type ExportedApi = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.apigatewayv2Mod.Blob | java.lang.String
  type Id = java.lang.String
  type IdentitySourceList = js.Array[typings.awsSdk.apigatewayv2Mod.string]
  type IntegerWithLengthBetween0And3600 = scala.Double
  type IntegerWithLengthBetween50And30000 = scala.Double
  type IntegerWithLengthBetweenMinus1And86400 = scala.Double
  type IntegrationParameters = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.apigatewayv2Mod.StringWithLengthBetween1And512]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AWS
    - typings.awsSdk.awsSdkStrings.HTTP
    - typings.awsSdk.awsSdkStrings.MOCK
    - typings.awsSdk.awsSdkStrings.HTTP_PROXY
    - typings.awsSdk.awsSdkStrings.AWS_PROXY
    - java.lang.String
  */
  type IntegrationType = typings.awsSdk.apigatewayv2Mod._IntegrationType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ERROR
    - typings.awsSdk.awsSdkStrings.INFO
    - typings.awsSdk.awsSdkStrings.OFF
    - java.lang.String
  */
  type LoggingLevel = typings.awsSdk.apigatewayv2Mod._LoggingLevel | java.lang.String
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.WHEN_NO_MATCH
    - typings.awsSdk.awsSdkStrings.NEVER
    - typings.awsSdk.awsSdkStrings.WHEN_NO_TEMPLATES
    - java.lang.String
  */
  type PassthroughBehavior = typings.awsSdk.apigatewayv2Mod._PassthroughBehavior | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.WEBSOCKET
    - typings.awsSdk.awsSdkStrings.HTTP
    - java.lang.String
  */
  type ProtocolType = typings.awsSdk.apigatewayv2Mod._ProtocolType | java.lang.String
  type RouteModels = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.apigatewayv2Mod.StringWithLengthBetween1And128]
  type RouteParameters = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.apigatewayv2Mod.ParameterConstraints]
  type RouteSettingsMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.apigatewayv2Mod.RouteSettings]
  type SecurityGroupIdList = js.Array[typings.awsSdk.apigatewayv2Mod.string]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TLS_1_0
    - typings.awsSdk.awsSdkStrings.TLS_1_2
    - java.lang.String
  */
  type SecurityPolicy = typings.awsSdk.apigatewayv2Mod._SecurityPolicy | java.lang.String
  type SelectionExpression = java.lang.String
  type SelectionKey = java.lang.String
  type StageVariablesMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.apigatewayv2Mod.StringWithLengthBetween0And2048]
  type StringWithLengthBetween0And1024 = java.lang.String
  type StringWithLengthBetween0And2048 = java.lang.String
  type StringWithLengthBetween0And32K = java.lang.String
  type StringWithLengthBetween1And1024 = java.lang.String
  type StringWithLengthBetween1And128 = java.lang.String
  type StringWithLengthBetween1And1600 = java.lang.String
  type StringWithLengthBetween1And256 = java.lang.String
  type StringWithLengthBetween1And512 = java.lang.String
  type StringWithLengthBetween1And64 = java.lang.String
  type SubnetIdList = js.Array[typings.awsSdk.apigatewayv2Mod.string]
  type Tags = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.apigatewayv2Mod.StringWithLengthBetween1And1600]
  type TemplateMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.apigatewayv2Mod.StringWithLengthBetween0And32K]
  type UriWithLengthBetween1And2048 = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type VpcLinkStatus = typings.awsSdk.apigatewayv2Mod._VpcLinkStatus | java.lang.String
  type VpcLinkVersion = typings.awsSdk.awsSdkStrings.V2 | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-11-29`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.apigatewayv2Mod._apiVersion | java.lang.String
  type boolean = scala.Boolean
  type double = scala.Double
  type integer = scala.Double
  type listOfApi = js.Array[typings.awsSdk.apigatewayv2Mod.Api]
  type listOfApiMapping = js.Array[typings.awsSdk.apigatewayv2Mod.ApiMapping]
  type listOfAuthorizer = js.Array[typings.awsSdk.apigatewayv2Mod.Authorizer]
  type listOfDeployment = js.Array[typings.awsSdk.apigatewayv2Mod.Deployment]
  type listOfDomainName = js.Array[typings.awsSdk.apigatewayv2Mod.DomainName]
  type listOfIntegration = js.Array[typings.awsSdk.apigatewayv2Mod.Integration]
  type listOfIntegrationResponse = js.Array[typings.awsSdk.apigatewayv2Mod.IntegrationResponse]
  type listOfModel = js.Array[typings.awsSdk.apigatewayv2Mod.Model]
  type listOfRoute = js.Array[typings.awsSdk.apigatewayv2Mod.Route]
  type listOfRouteResponse = js.Array[typings.awsSdk.apigatewayv2Mod.RouteResponse]
  type listOfStage = js.Array[typings.awsSdk.apigatewayv2Mod.Stage]
  type listOfString = js.Array[typings.awsSdk.apigatewayv2Mod.string]
  type listOfVpcLink = js.Array[typings.awsSdk.apigatewayv2Mod.VpcLink]
  type string = java.lang.String
  type timestampIso8601 = typings.std.Date
}
