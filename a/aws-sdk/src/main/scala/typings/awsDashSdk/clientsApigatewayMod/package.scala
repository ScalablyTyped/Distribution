package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsApigatewayMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.csv_
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HEADER
    - typings.awsDashSdk.awsDashSdkStrings.AUTHORIZER
    - java.lang.String
  */
  type ApiKeySourceType = _ApiKeySourceType | java.lang.String
  type ApiKeysFormat = csv_ | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TOKEN
    - typings.awsDashSdk.awsDashSdkStrings.REQUEST
    - typings.awsDashSdk.awsDashSdkStrings.COGNITO_USER_POOLS
    - java.lang.String
  */
  type AuthorizerType = _AuthorizerType | java.lang.String
  type Boolean = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`0Dot5`
    - typings.awsDashSdk.awsDashSdkStrings.`1Dot6`
    - typings.awsDashSdk.awsDashSdkStrings.`6Dot1`
    - typings.awsDashSdk.awsDashSdkStrings.`13Dot5`
    - typings.awsDashSdk.awsDashSdkStrings.`28Dot4`
    - typings.awsDashSdk.awsDashSdkStrings.`58Dot2`
    - typings.awsDashSdk.awsDashSdkStrings.`118`
    - typings.awsDashSdk.awsDashSdkStrings.`237`
    - java.lang.String
  */
  type CacheClusterSize = _CacheClusterSize | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.NOT_AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.FLUSH_IN_PROGRESS
    - java.lang.String
  */
  type CacheClusterStatus = _CacheClusterStatus | java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INTERNET
    - typings.awsDashSdk.awsDashSdkStrings.VPC_LINK
    - java.lang.String
  */
  type ConnectionType = _ConnectionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CONVERT_TO_BINARY
    - typings.awsDashSdk.awsDashSdkStrings.CONVERT_TO_TEXT
    - java.lang.String
  */
  type ContentHandlingStrategy = _ContentHandlingStrategy | java.lang.String
  type DocumentationPartLocationStatusCode = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.API
    - typings.awsDashSdk.awsDashSdkStrings.AUTHORIZER
    - typings.awsDashSdk.awsDashSdkStrings.MODEL
    - typings.awsDashSdk.awsDashSdkStrings.RESOURCE
    - typings.awsDashSdk.awsDashSdkStrings.METHOD
    - typings.awsDashSdk.awsDashSdkStrings.PATH_PARAMETER
    - typings.awsDashSdk.awsDashSdkStrings.QUERY_PARAMETER
    - typings.awsDashSdk.awsDashSdkStrings.REQUEST_HEADER
    - typings.awsDashSdk.awsDashSdkStrings.REQUEST_BODY
    - typings.awsDashSdk.awsDashSdkStrings.RESPONSE
    - typings.awsDashSdk.awsDashSdkStrings.RESPONSE_HEADER
    - typings.awsDashSdk.awsDashSdkStrings.RESPONSE_BODY
    - java.lang.String
  */
  type DocumentationPartType = _DocumentationPartType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - java.lang.String
  */
  type DomainNameStatus = _DomainNameStatus | java.lang.String
  type Double = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.REGIONAL
    - typings.awsDashSdk.awsDashSdkStrings.EDGE
    - typings.awsDashSdk.awsDashSdkStrings.PRIVATE
    - java.lang.String
  */
  type EndpointType = _EndpointType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DEFAULT_4XX
    - typings.awsDashSdk.awsDashSdkStrings.DEFAULT_5XX
    - typings.awsDashSdk.awsDashSdkStrings.RESOURCE_NOT_FOUND
    - typings.awsDashSdk.awsDashSdkStrings.UNAUTHORIZED
    - typings.awsDashSdk.awsDashSdkStrings.INVALID_API_KEY
    - typings.awsDashSdk.awsDashSdkStrings.ACCESS_DENIED
    - typings.awsDashSdk.awsDashSdkStrings.AUTHORIZER_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.AUTHORIZER_CONFIGURATION_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.INVALID_SIGNATURE
    - typings.awsDashSdk.awsDashSdkStrings.EXPIRED_TOKEN
    - typings.awsDashSdk.awsDashSdkStrings.MISSING_AUTHENTICATION_TOKEN
    - typings.awsDashSdk.awsDashSdkStrings.INTEGRATION_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.INTEGRATION_TIMEOUT
    - typings.awsDashSdk.awsDashSdkStrings.API_CONFIGURATION_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.UNSUPPORTED_MEDIA_TYPE
    - typings.awsDashSdk.awsDashSdkStrings.BAD_REQUEST_PARAMETERS
    - typings.awsDashSdk.awsDashSdkStrings.BAD_REQUEST_BODY
    - typings.awsDashSdk.awsDashSdkStrings.REQUEST_TOO_LARGE
    - typings.awsDashSdk.awsDashSdkStrings.THROTTLED
    - typings.awsDashSdk.awsDashSdkStrings.QUOTA_EXCEEDED
    - java.lang.String
  */
  type GatewayResponseType = _GatewayResponseType | java.lang.String
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HTTP
    - typings.awsDashSdk.awsDashSdkStrings.AWS
    - typings.awsDashSdk.awsDashSdkStrings.MOCK
    - typings.awsDashSdk.awsDashSdkStrings.HTTP_PROXY
    - typings.awsDashSdk.awsDashSdkStrings.AWS_PROXY
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
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENTED
    - typings.awsDashSdk.awsDashSdkStrings.UNDOCUMENTED
    - java.lang.String
  */
  type LocationStatusType = _LocationStatusType | java.lang.String
  type Long = scala.Double
  type MapOfApiStageThrottleSettings = StringDictionary[ThrottleSettings]
  type MapOfIntegrationResponse = StringDictionary[IntegrationResponse]
  type MapOfKeyUsages = StringDictionary[ListOfUsage]
  type MapOfMethod = StringDictionary[Method]
  type MapOfMethodResponse = StringDictionary[MethodResponse]
  type MapOfMethodSettings = StringDictionary[MethodSetting]
  type MapOfMethodSnapshot = StringDictionary[MethodSnapshot]
  type MapOfStringToBoolean = StringDictionary[NullableBoolean]
  type MapOfStringToList = StringDictionary[ListOfString]
  type MapOfStringToString = StringDictionary[String]
  type NullableBoolean = scala.Boolean
  type NullableInteger = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.add__
    - typings.awsDashSdk.awsDashSdkStrings.remove__
    - typings.awsDashSdk.awsDashSdkStrings.replace_
    - typings.awsDashSdk.awsDashSdkStrings.move
    - typings.awsDashSdk.awsDashSdkStrings.copy_
    - typings.awsDashSdk.awsDashSdkStrings.test__
    - java.lang.String
  */
  type Op = _Op | java.lang.String
  type PathToMapOfMethodSnapshot = StringDictionary[MapOfMethodSnapshot]
  type ProviderARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.merge
    - typings.awsDashSdk.awsDashSdkStrings.overwrite_
    - java.lang.String
  */
  type PutMode = _PutMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DAY
    - typings.awsDashSdk.awsDashSdkStrings.WEEK
    - typings.awsDashSdk.awsDashSdkStrings.MONTH
    - java.lang.String
  */
  type QuotaPeriodType = _QuotaPeriodType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TLS_1_0
    - typings.awsDashSdk.awsDashSdkStrings.TLS_1_2
    - java.lang.String
  */
  type SecurityPolicy = _SecurityPolicy | java.lang.String
  type StatusCode = java.lang.String
  type String = java.lang.String
  type Timestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FAIL_WITH_403
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEED_WITH_RESPONSE_HEADER
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEED_WITHOUT_RESPONSE_HEADER
    - java.lang.String
  */
  type UnauthorizedCacheControlHeaderStrategy = _UnauthorizedCacheControlHeaderStrategy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type VpcLinkStatus = _VpcLinkStatus | java.lang.String
  type _Blob = Buffer | Uint8Array | Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2015-07-09`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
