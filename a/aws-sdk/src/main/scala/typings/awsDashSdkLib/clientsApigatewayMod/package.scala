package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsApigatewayMod {
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HEADER
    - awsDashSdkLib.awsDashSdkLibStrings.AUTHORIZER
    - java.lang.String
  */
  type ApiKeySourceType = _ApiKeySourceType | java.lang.String
  type ApiKeysFormat = awsDashSdkLib.awsDashSdkLibStrings.csv | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TOKEN
    - awsDashSdkLib.awsDashSdkLibStrings.REQUEST
    - awsDashSdkLib.awsDashSdkLibStrings.COGNITO_USER_POOLS
    - java.lang.String
  */
  type AuthorizerType = _AuthorizerType | java.lang.String
  type Boolean = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`0DOT5`
    - awsDashSdkLib.awsDashSdkLibStrings.`1DOT6`
    - awsDashSdkLib.awsDashSdkLibStrings.`6DOT1`
    - awsDashSdkLib.awsDashSdkLibStrings.`13DOT5`
    - awsDashSdkLib.awsDashSdkLibStrings.`28DOT4`
    - awsDashSdkLib.awsDashSdkLibStrings.`58DOT2`
    - awsDashSdkLib.awsDashSdkLibStrings.`118`
    - awsDashSdkLib.awsDashSdkLibStrings.`237`
    - java.lang.String
  */
  type CacheClusterSize = _CacheClusterSize | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.FLUSH_IN_PROGRESS
    - java.lang.String
  */
  type CacheClusterStatus = _CacheClusterStatus | java.lang.String
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
  type DocumentationPartLocationStatusCode = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.API
    - awsDashSdkLib.awsDashSdkLibStrings.AUTHORIZER
    - awsDashSdkLib.awsDashSdkLibStrings.MODEL
    - awsDashSdkLib.awsDashSdkLibStrings.RESOURCE
    - awsDashSdkLib.awsDashSdkLibStrings.METHOD
    - awsDashSdkLib.awsDashSdkLibStrings.PATH_PARAMETER
    - awsDashSdkLib.awsDashSdkLibStrings.QUERY_PARAMETER
    - awsDashSdkLib.awsDashSdkLibStrings.REQUEST_HEADER
    - awsDashSdkLib.awsDashSdkLibStrings.REQUEST_BODY
    - awsDashSdkLib.awsDashSdkLibStrings.RESPONSE
    - awsDashSdkLib.awsDashSdkLibStrings.RESPONSE_HEADER
    - awsDashSdkLib.awsDashSdkLibStrings.RESPONSE_BODY
    - java.lang.String
  */
  type DocumentationPartType = _DocumentationPartType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - java.lang.String
  */
  type DomainNameStatus = _DomainNameStatus | java.lang.String
  type Double = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.REGIONAL
    - awsDashSdkLib.awsDashSdkLibStrings.EDGE
    - awsDashSdkLib.awsDashSdkLibStrings.PRIVATE
    - java.lang.String
  */
  type EndpointType = _EndpointType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_4XX
    - awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_5XX
    - awsDashSdkLib.awsDashSdkLibStrings.RESOURCE_NOT_FOUND
    - awsDashSdkLib.awsDashSdkLibStrings.UNAUTHORIZED
    - awsDashSdkLib.awsDashSdkLibStrings.INVALID_API_KEY
    - awsDashSdkLib.awsDashSdkLibStrings.ACCESS_DENIED
    - awsDashSdkLib.awsDashSdkLibStrings.AUTHORIZER_FAILURE
    - awsDashSdkLib.awsDashSdkLibStrings.AUTHORIZER_CONFIGURATION_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.INVALID_SIGNATURE
    - awsDashSdkLib.awsDashSdkLibStrings.EXPIRED_TOKEN
    - awsDashSdkLib.awsDashSdkLibStrings.MISSING_AUTHENTICATION_TOKEN
    - awsDashSdkLib.awsDashSdkLibStrings.INTEGRATION_FAILURE
    - awsDashSdkLib.awsDashSdkLibStrings.INTEGRATION_TIMEOUT
    - awsDashSdkLib.awsDashSdkLibStrings.API_CONFIGURATION_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.UNSUPPORTED_MEDIA_TYPE
    - awsDashSdkLib.awsDashSdkLibStrings.BAD_REQUEST_PARAMETERS
    - awsDashSdkLib.awsDashSdkLibStrings.BAD_REQUEST_BODY
    - awsDashSdkLib.awsDashSdkLibStrings.REQUEST_TOO_LARGE
    - awsDashSdkLib.awsDashSdkLibStrings.THROTTLED
    - awsDashSdkLib.awsDashSdkLibStrings.QUOTA_EXCEEDED
    - java.lang.String
  */
  type GatewayResponseType = _GatewayResponseType | java.lang.String
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HTTP
    - awsDashSdkLib.awsDashSdkLibStrings.AWS
    - awsDashSdkLib.awsDashSdkLibStrings.MOCK
    - awsDashSdkLib.awsDashSdkLibStrings.HTTP_PROXY
    - awsDashSdkLib.awsDashSdkLibStrings.AWS_PROXY
    - java.lang.String
  */
  type IntegrationType = _IntegrationType | java.lang.String
  type ListOfARNs = js.Array[ProviderARN]
  type ListOfApiKey = js.Array[ApiKey]
  type ListOfApiStage = js.Array[ApiStage]
  type ListOfAuthorizer = js.Array[Authorizer]
  type ListOfBasePathMapping = js.Array[BasePathMapping]
  type ListOfClientCertificate = js.Array[ClientCertificate]
  type ListOfDeployment = js.Array[Deployment]
  type ListOfDocumentationPart = js.Array[DocumentationPart]
  type ListOfDocumentationVersion = js.Array[DocumentationVersion]
  type ListOfDomainName = js.Array[DomainName]
  type ListOfEndpointType = js.Array[EndpointType]
  type ListOfGatewayResponse = js.Array[GatewayResponse]
  type ListOfLong = js.Array[Long]
  type ListOfModel = js.Array[Model]
  type ListOfPatchOperation = js.Array[PatchOperation]
  type ListOfRequestValidator = js.Array[RequestValidator]
  type ListOfResource = js.Array[Resource]
  type ListOfRestApi = js.Array[RestApi]
  type ListOfSdkConfigurationProperty = js.Array[SdkConfigurationProperty]
  type ListOfSdkType = js.Array[SdkType]
  type ListOfStage = js.Array[Stage]
  type ListOfStageKeys = js.Array[StageKey]
  type ListOfString = js.Array[String]
  type ListOfUsage = js.Array[ListOfLong]
  type ListOfUsagePlan = js.Array[UsagePlan]
  type ListOfUsagePlanKey = js.Array[UsagePlanKey]
  type ListOfVpcLink = js.Array[VpcLink]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DOCUMENTED
    - awsDashSdkLib.awsDashSdkLibStrings.UNDOCUMENTED
    - java.lang.String
  */
  type LocationStatusType = _LocationStatusType | java.lang.String
  type Long = scala.Double
  type MapOfApiStageThrottleSettings = org.scalablytyped.runtime.StringDictionary[ThrottleSettings]
  type MapOfIntegrationResponse = org.scalablytyped.runtime.StringDictionary[IntegrationResponse]
  type MapOfKeyUsages = org.scalablytyped.runtime.StringDictionary[ListOfUsage]
  type MapOfMethod = org.scalablytyped.runtime.StringDictionary[Method]
  type MapOfMethodResponse = org.scalablytyped.runtime.StringDictionary[MethodResponse]
  type MapOfMethodSettings = org.scalablytyped.runtime.StringDictionary[MethodSetting]
  type MapOfMethodSnapshot = org.scalablytyped.runtime.StringDictionary[MethodSnapshot]
  type MapOfStringToBoolean = org.scalablytyped.runtime.StringDictionary[NullableBoolean]
  type MapOfStringToList = org.scalablytyped.runtime.StringDictionary[ListOfString]
  type MapOfStringToString = org.scalablytyped.runtime.StringDictionary[String]
  type NullableBoolean = scala.Boolean
  type NullableInteger = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.add
    - awsDashSdkLib.awsDashSdkLibStrings.remove
    - awsDashSdkLib.awsDashSdkLibStrings.replace
    - awsDashSdkLib.awsDashSdkLibStrings.move
    - awsDashSdkLib.awsDashSdkLibStrings.copy
    - awsDashSdkLib.awsDashSdkLibStrings.test
    - java.lang.String
  */
  type Op = _Op | java.lang.String
  type PathToMapOfMethodSnapshot = org.scalablytyped.runtime.StringDictionary[MapOfMethodSnapshot]
  type ProviderARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.merge
    - awsDashSdkLib.awsDashSdkLibStrings.overwrite
    - java.lang.String
  */
  type PutMode = _PutMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DAY
    - awsDashSdkLib.awsDashSdkLibStrings.WEEK
    - awsDashSdkLib.awsDashSdkLibStrings.MONTH
    - java.lang.String
  */
  type QuotaPeriodType = _QuotaPeriodType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TLS_1_0
    - awsDashSdkLib.awsDashSdkLibStrings.TLS_1_2
    - java.lang.String
  */
  type SecurityPolicy = _SecurityPolicy | java.lang.String
  type StatusCode = java.lang.String
  type String = java.lang.String
  type Timestamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.FAIL_WITH_403
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEED_WITH_RESPONSE_HEADER
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEED_WITHOUT_RESPONSE_HEADER
    - java.lang.String
  */
  type UnauthorizedCacheControlHeaderStrategy = _UnauthorizedCacheControlHeaderStrategy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type VpcLinkStatus = _VpcLinkStatus | java.lang.String
  type _Blob = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-07-09`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
