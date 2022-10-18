package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.BETWEEN
import typings.awsSdk.awsSdkStrings.LAMBDA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ARN = java.lang.String

type AccessKeyId = java.lang.String

type AccessToken = java.lang.String

type AccountName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.None_
  - typings.awsSdk.awsSdkStrings.SingleFile
  - java.lang.String
*/
type AggregationType = _AggregationType | java.lang.String

type AmplitudeConnectorOperator = BETWEEN | java.lang.String

type ApiKey = java.lang.String

type ApiSecretKey = java.lang.String

type ApiToken = java.lang.String

type ApiVersion_ = java.lang.String

type ApplicationHostUrl = java.lang.String

type ApplicationKey = java.lang.String

type ApplicationServicePath = java.lang.String

type ApplicationType = java.lang.String

type AuthCode = java.lang.String

type AuthCodeUrl = java.lang.String

type AuthCodeUrlList = js.Array[AuthCodeUrl]

type AuthParameterList = js.Array[AuthParameter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OAUTH2
  - typings.awsSdk.awsSdkStrings.APIKEY
  - typings.awsSdk.awsSdkStrings.BASIC
  - typings.awsSdk.awsSdkStrings.CUSTOM
  - java.lang.String
*/
type AuthenticationType = _AuthenticationType | java.lang.String

type Boolean = scala.Boolean

type BucketName = java.lang.String

type BucketPrefix = java.lang.String

type ClientCredentialsArn = java.lang.String

type ClientId = java.lang.String

type ClientNumber = java.lang.String

type ClientSecret = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Public_
  - typings.awsSdk.awsSdkStrings.Private_
  - java.lang.String
*/
type ConnectionMode = _ConnectionMode | java.lang.String

type ConnectorConfigurationsMap = StringDictionary[ConnectorConfiguration]

type ConnectorDescription = java.lang.String

type ConnectorEntityFieldList = js.Array[ConnectorEntityField]

type ConnectorEntityList = js.Array[ConnectorEntity]

type ConnectorEntityMap = StringDictionary[ConnectorEntityList]

type ConnectorLabel = java.lang.String

type ConnectorList = js.Array[ConnectorDetail]

type ConnectorMode = java.lang.String

type ConnectorModeList = js.Array[ConnectorMode]

type ConnectorName = java.lang.String

type ConnectorOwner = java.lang.String

type ConnectorProfileArn = java.lang.String

type ConnectorProfileDetailList = js.Array[ConnectorProfile]

type ConnectorProfileName = java.lang.String

type ConnectorProfileNameList = js.Array[ConnectorProfileName]

type ConnectorProvisioningType = LAMBDA | java.lang.String

type ConnectorRuntimeSettingDataType = java.lang.String

type ConnectorRuntimeSettingList = js.Array[ConnectorRuntimeSetting]

type ConnectorRuntimeSettingScope = java.lang.String

type ConnectorSuppliedValue = java.lang.String

type ConnectorSuppliedValueList = js.Array[ConnectorSuppliedValue]

type ConnectorSuppliedValueOptionList = js.Array[ConnectorSuppliedValue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Salesforce_
  - typings.awsSdk.awsSdkStrings.Singular
  - typings.awsSdk.awsSdkStrings.Slack_
  - typings.awsSdk.awsSdkStrings.Redshift_
  - typings.awsSdk.awsSdkStrings.S3
  - typings.awsSdk.awsSdkStrings.Marketo
  - typings.awsSdk.awsSdkStrings.Googleanalytics
  - typings.awsSdk.awsSdkStrings.Zendesk_
  - typings.awsSdk.awsSdkStrings.Servicenow_
  - typings.awsSdk.awsSdkStrings.Datadog
  - typings.awsSdk.awsSdkStrings.Trendmicro
  - typings.awsSdk.awsSdkStrings.Snowflake_
  - typings.awsSdk.awsSdkStrings.Dynatrace
  - typings.awsSdk.awsSdkStrings.Infornexus
  - typings.awsSdk.awsSdkStrings.Amplitude
  - typings.awsSdk.awsSdkStrings.Veeva
  - typings.awsSdk.awsSdkStrings.EventBridge
  - typings.awsSdk.awsSdkStrings.LookoutMetrics
  - typings.awsSdk.awsSdkStrings.Upsolver
  - typings.awsSdk.awsSdkStrings.Honeycode
  - typings.awsSdk.awsSdkStrings.CustomerProfiles
  - typings.awsSdk.awsSdkStrings.SAPOData
  - typings.awsSdk.awsSdkStrings.CustomConnector
  - java.lang.String
*/
type ConnectorType = _ConnectorType | java.lang.String

type ConnectorTypeList = js.Array[ConnectorType]

type ConnectorVersion = java.lang.String

type CreatedBy = java.lang.String

type CredentialsMap = StringDictionary[CredentialsMapValue]

type CredentialsMapKey = java.lang.String

type CredentialsMapValue = java.lang.String

type CustomAuthConfigList = js.Array[CustomAuthConfig]

type CustomAuthenticationType = java.lang.String

type CustomProperties = StringDictionary[CustomPropertyValue]

type CustomPropertyKey = java.lang.String

type CustomPropertyValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Incremental_
  - typings.awsSdk.awsSdkStrings.Complete_
  - java.lang.String
*/
type DataPullMode = _DataPullMode | java.lang.String

type DatabaseUrl = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROJECTION
  - typings.awsSdk.awsSdkStrings.BETWEEN
  - typings.awsSdk.awsSdkStrings.EQUAL_TO
  - typings.awsSdk.awsSdkStrings.ADDITION
  - typings.awsSdk.awsSdkStrings.MULTIPLICATION
  - typings.awsSdk.awsSdkStrings.DIVISION
  - typings.awsSdk.awsSdkStrings.SUBTRACTION
  - typings.awsSdk.awsSdkStrings.MASK_ALL
  - typings.awsSdk.awsSdkStrings.MASK_FIRST_N
  - typings.awsSdk.awsSdkStrings.MASK_LAST_N
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NULL
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_ZERO
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NEGATIVE
  - typings.awsSdk.awsSdkStrings.VALIDATE_NUMERIC
  - typings.awsSdk.awsSdkStrings.NO_OP
  - java.lang.String
*/
type DatadogConnectorOperator = _DatadogConnectorOperator | java.lang.String

type Date = js.Date

type DatetimeTypeFieldName = java.lang.String

type Description = java.lang.String

type DestinationField = java.lang.String

type DestinationFlowConfigList = js.Array[DestinationFlowConfig]

type DocumentType = java.lang.String

type DomainName = java.lang.String

type Double = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROJECTION
  - typings.awsSdk.awsSdkStrings.BETWEEN
  - typings.awsSdk.awsSdkStrings.EQUAL_TO
  - typings.awsSdk.awsSdkStrings.ADDITION
  - typings.awsSdk.awsSdkStrings.MULTIPLICATION
  - typings.awsSdk.awsSdkStrings.DIVISION
  - typings.awsSdk.awsSdkStrings.SUBTRACTION
  - typings.awsSdk.awsSdkStrings.MASK_ALL
  - typings.awsSdk.awsSdkStrings.MASK_FIRST_N
  - typings.awsSdk.awsSdkStrings.MASK_LAST_N
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NULL
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_ZERO
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NEGATIVE
  - typings.awsSdk.awsSdkStrings.VALIDATE_NUMERIC
  - typings.awsSdk.awsSdkStrings.NO_OP
  - java.lang.String
*/
type DynatraceConnectorOperator = _DynatraceConnectorOperator | java.lang.String

type EntitiesPath = java.lang.String

type EntityName = java.lang.String

type ExecutionId = java.lang.String

type ExecutionMessage = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Successful_
  - typings.awsSdk.awsSdkStrings.Error_
  - java.lang.String
*/
type ExecutionStatus = _ExecutionStatus | java.lang.String

type FieldType = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CSV
  - typings.awsSdk.awsSdkStrings.JSON
  - typings.awsSdk.awsSdkStrings.PARQUET
  - java.lang.String
*/
type FileType = _FileType | java.lang.String

type FilterOperatorList = js.Array[Operator]

type FlowArn = java.lang.String

type FlowDescription = java.lang.String

type FlowErrorDeactivationThreshold = scala.Double

type FlowExecutionList = js.Array[ExecutionRecord]

type FlowList = js.Array[FlowDefinition]

type FlowName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Active_
  - typings.awsSdk.awsSdkStrings.Deprecated_
  - typings.awsSdk.awsSdkStrings.Deleted_
  - typings.awsSdk.awsSdkStrings.Draft_
  - typings.awsSdk.awsSdkStrings.Errored_
  - typings.awsSdk.awsSdkStrings.Suspended_
  - java.lang.String
*/
type FlowStatus = _FlowStatus | java.lang.String

type FlowStatusMessage = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROJECTION
  - typings.awsSdk.awsSdkStrings.BETWEEN
  - java.lang.String
*/
type GoogleAnalyticsConnectorOperator = _GoogleAnalyticsConnectorOperator | java.lang.String

type Group = java.lang.String

type IdFieldNameList = js.Array[Name]

type Identifier = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROJECTION
  - typings.awsSdk.awsSdkStrings.BETWEEN
  - typings.awsSdk.awsSdkStrings.EQUAL_TO
  - typings.awsSdk.awsSdkStrings.ADDITION
  - typings.awsSdk.awsSdkStrings.MULTIPLICATION
  - typings.awsSdk.awsSdkStrings.DIVISION
  - typings.awsSdk.awsSdkStrings.SUBTRACTION
  - typings.awsSdk.awsSdkStrings.MASK_ALL
  - typings.awsSdk.awsSdkStrings.MASK_FIRST_N
  - typings.awsSdk.awsSdkStrings.MASK_LAST_N
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NULL
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_ZERO
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NEGATIVE
  - typings.awsSdk.awsSdkStrings.VALIDATE_NUMERIC
  - typings.awsSdk.awsSdkStrings.NO_OP
  - java.lang.String
*/
type InforNexusConnectorOperator = _InforNexusConnectorOperator | java.lang.String

type InstanceUrl = java.lang.String

type JavaBoolean = scala.Boolean

type KMSArn = java.lang.String

type Key = java.lang.String

type Label = java.lang.String

type LogoURL = java.lang.String

type LogonLanguage = java.lang.String

type Long = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROJECTION
  - typings.awsSdk.awsSdkStrings.LESS_THAN
  - typings.awsSdk.awsSdkStrings.GREATER_THAN
  - typings.awsSdk.awsSdkStrings.BETWEEN
  - typings.awsSdk.awsSdkStrings.ADDITION
  - typings.awsSdk.awsSdkStrings.MULTIPLICATION
  - typings.awsSdk.awsSdkStrings.DIVISION
  - typings.awsSdk.awsSdkStrings.SUBTRACTION
  - typings.awsSdk.awsSdkStrings.MASK_ALL
  - typings.awsSdk.awsSdkStrings.MASK_FIRST_N
  - typings.awsSdk.awsSdkStrings.MASK_LAST_N
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NULL
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_ZERO
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NEGATIVE
  - typings.awsSdk.awsSdkStrings.VALIDATE_NUMERIC
  - typings.awsSdk.awsSdkStrings.NO_OP
  - java.lang.String
*/
type MarketoConnectorOperator = _MarketoConnectorOperator | java.lang.String

type MaxResults = scala.Double

type MostRecentExecutionMessage = java.lang.String

type Name = java.lang.String

type NextToken = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TOKEN_URL
  - typings.awsSdk.awsSdkStrings.AUTH_URL
  - java.lang.String
*/
type OAuth2CustomPropType = _OAuth2CustomPropType | java.lang.String

type OAuth2CustomPropertiesList = js.Array[OAuth2CustomParameter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CLIENT_CREDENTIALS
  - typings.awsSdk.awsSdkStrings.AUTHORIZATION_CODE
  - java.lang.String
*/
type OAuth2GrantType = _OAuth2GrantType | java.lang.String

type OAuth2GrantTypeSupportedList = js.Array[OAuth2GrantType]

type OAuthScope = java.lang.String

type OAuthScopeList = js.Array[OAuthScope]

type Object = java.lang.String

type ObjectTypeName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROJECTION
  - typings.awsSdk.awsSdkStrings.LESS_THAN
  - typings.awsSdk.awsSdkStrings.GREATER_THAN
  - typings.awsSdk.awsSdkStrings.CONTAINS
  - typings.awsSdk.awsSdkStrings.BETWEEN
  - typings.awsSdk.awsSdkStrings.LESS_THAN_OR_EQUAL_TO
  - typings.awsSdk.awsSdkStrings.GREATER_THAN_OR_EQUAL_TO
  - typings.awsSdk.awsSdkStrings.EQUAL_TO
  - typings.awsSdk.awsSdkStrings.NOT_EQUAL_TO
  - typings.awsSdk.awsSdkStrings.ADDITION
  - typings.awsSdk.awsSdkStrings.MULTIPLICATION
  - typings.awsSdk.awsSdkStrings.DIVISION
  - typings.awsSdk.awsSdkStrings.SUBTRACTION
  - typings.awsSdk.awsSdkStrings.MASK_ALL
  - typings.awsSdk.awsSdkStrings.MASK_FIRST_N
  - typings.awsSdk.awsSdkStrings.MASK_LAST_N
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NULL
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_ZERO
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NEGATIVE
  - typings.awsSdk.awsSdkStrings.VALIDATE_NUMERIC
  - typings.awsSdk.awsSdkStrings.NO_OP
  - java.lang.String
*/
type Operator = _Operator | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VALUE
  - typings.awsSdk.awsSdkStrings.VALUES
  - typings.awsSdk.awsSdkStrings.DATA_TYPE
  - typings.awsSdk.awsSdkStrings.UPPER_BOUND
  - typings.awsSdk.awsSdkStrings.LOWER_BOUND
  - typings.awsSdk.awsSdkStrings.SOURCE_DATA_TYPE
  - typings.awsSdk.awsSdkStrings.DESTINATION_DATA_TYPE
  - typings.awsSdk.awsSdkStrings.VALIDATION_ACTION
  - typings.awsSdk.awsSdkStrings.MASK_VALUE
  - typings.awsSdk.awsSdkStrings.MASK_LENGTH
  - typings.awsSdk.awsSdkStrings.TRUNCATE_LENGTH
  - typings.awsSdk.awsSdkStrings.MATH_OPERATION_FIELDS_ORDER
  - typings.awsSdk.awsSdkStrings.CONCAT_FORMAT
  - typings.awsSdk.awsSdkStrings.SUBFIELD_CATEGORY_MAP
  - typings.awsSdk.awsSdkStrings.EXCLUDE_SOURCE_FIELDS_LIST
  - typings.awsSdk.awsSdkStrings.INCLUDE_NEW_FIELDS
  - java.lang.String
*/
type OperatorPropertiesKeys = _OperatorPropertiesKeys | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROJECTION
  - typings.awsSdk.awsSdkStrings.LESS_THAN
  - typings.awsSdk.awsSdkStrings.GREATER_THAN
  - typings.awsSdk.awsSdkStrings.CONTAINS
  - typings.awsSdk.awsSdkStrings.BETWEEN
  - typings.awsSdk.awsSdkStrings.LESS_THAN_OR_EQUAL_TO
  - typings.awsSdk.awsSdkStrings.GREATER_THAN_OR_EQUAL_TO
  - typings.awsSdk.awsSdkStrings.EQUAL_TO
  - typings.awsSdk.awsSdkStrings.NOT_EQUAL_TO
  - typings.awsSdk.awsSdkStrings.ADDITION
  - typings.awsSdk.awsSdkStrings.MULTIPLICATION
  - typings.awsSdk.awsSdkStrings.DIVISION
  - typings.awsSdk.awsSdkStrings.SUBTRACTION
  - typings.awsSdk.awsSdkStrings.MASK_ALL
  - typings.awsSdk.awsSdkStrings.MASK_FIRST_N
  - typings.awsSdk.awsSdkStrings.MASK_LAST_N
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NULL
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_ZERO
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NEGATIVE
  - typings.awsSdk.awsSdkStrings.VALIDATE_NUMERIC
  - typings.awsSdk.awsSdkStrings.NO_OP
  - java.lang.String
*/
type Operators = _Operators | java.lang.String

type Password = java.lang.String

type PortNumber = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.YEAR
  - typings.awsSdk.awsSdkStrings.MONTH
  - typings.awsSdk.awsSdkStrings.DAY
  - typings.awsSdk.awsSdkStrings.HOUR
  - typings.awsSdk.awsSdkStrings.MINUTE
  - java.lang.String
*/
type PrefixFormat = _PrefixFormat | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FILENAME
  - typings.awsSdk.awsSdkStrings.PATH
  - typings.awsSdk.awsSdkStrings.PATH_AND_FILENAME
  - java.lang.String
*/
type PrefixType = _PrefixType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CONNECTOR_AUTHENTICATION
  - typings.awsSdk.awsSdkStrings.CONNECTOR_SERVER
  - typings.awsSdk.awsSdkStrings.INTERNAL_SERVER
  - typings.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.VALIDATION
  - java.lang.String
*/
type PrivateConnectionProvisioningFailureCause = _PrivateConnectionProvisioningFailureCause | java.lang.String

type PrivateConnectionProvisioningFailureMessage = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.CREATED
  - java.lang.String
*/
type PrivateConnectionProvisioningStatus = _PrivateConnectionProvisioningStatus | java.lang.String

type PrivateLinkServiceName = java.lang.String

type ProfilePropertiesMap = StringDictionary[ProfilePropertyValue]

type ProfilePropertyKey = java.lang.String

type ProfilePropertyValue = java.lang.String

type Property = java.lang.String

type RedirectUri = java.lang.String

type RefreshToken = java.lang.String

type Region = java.lang.String

type RegionList = js.Array[Region]

type RegisteredBy = java.lang.String

type RoleArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROJECTION
  - typings.awsSdk.awsSdkStrings.LESS_THAN
  - typings.awsSdk.awsSdkStrings.GREATER_THAN
  - typings.awsSdk.awsSdkStrings.BETWEEN
  - typings.awsSdk.awsSdkStrings.LESS_THAN_OR_EQUAL_TO
  - typings.awsSdk.awsSdkStrings.GREATER_THAN_OR_EQUAL_TO
  - typings.awsSdk.awsSdkStrings.EQUAL_TO
  - typings.awsSdk.awsSdkStrings.NOT_EQUAL_TO
  - typings.awsSdk.awsSdkStrings.ADDITION
  - typings.awsSdk.awsSdkStrings.MULTIPLICATION
  - typings.awsSdk.awsSdkStrings.DIVISION
  - typings.awsSdk.awsSdkStrings.SUBTRACTION
  - typings.awsSdk.awsSdkStrings.MASK_ALL
  - typings.awsSdk.awsSdkStrings.MASK_FIRST_N
  - typings.awsSdk.awsSdkStrings.MASK_LAST_N
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NULL
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_ZERO
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NEGATIVE
  - typings.awsSdk.awsSdkStrings.VALIDATE_NUMERIC
  - typings.awsSdk.awsSdkStrings.NO_OP
  - java.lang.String
*/
type S3ConnectorOperator = _S3ConnectorOperator | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CSV
  - typings.awsSdk.awsSdkStrings.JSON
  - java.lang.String
*/
type S3InputFileType = _S3InputFileType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROJECTION
  - typings.awsSdk.awsSdkStrings.LESS_THAN
  - typings.awsSdk.awsSdkStrings.CONTAINS
  - typings.awsSdk.awsSdkStrings.GREATER_THAN
  - typings.awsSdk.awsSdkStrings.BETWEEN
  - typings.awsSdk.awsSdkStrings.LESS_THAN_OR_EQUAL_TO
  - typings.awsSdk.awsSdkStrings.GREATER_THAN_OR_EQUAL_TO
  - typings.awsSdk.awsSdkStrings.EQUAL_TO
  - typings.awsSdk.awsSdkStrings.NOT_EQUAL_TO
  - typings.awsSdk.awsSdkStrings.ADDITION
  - typings.awsSdk.awsSdkStrings.MULTIPLICATION
  - typings.awsSdk.awsSdkStrings.DIVISION
  - typings.awsSdk.awsSdkStrings.SUBTRACTION
  - typings.awsSdk.awsSdkStrings.MASK_ALL
  - typings.awsSdk.awsSdkStrings.MASK_FIRST_N
  - typings.awsSdk.awsSdkStrings.MASK_LAST_N
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NULL
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_ZERO
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NEGATIVE
  - typings.awsSdk.awsSdkStrings.VALIDATE_NUMERIC
  - typings.awsSdk.awsSdkStrings.NO_OP
  - java.lang.String
*/
type SAPODataConnectorOperator = _SAPODataConnectorOperator | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROJECTION
  - typings.awsSdk.awsSdkStrings.LESS_THAN
  - typings.awsSdk.awsSdkStrings.CONTAINS
  - typings.awsSdk.awsSdkStrings.GREATER_THAN
  - typings.awsSdk.awsSdkStrings.BETWEEN
  - typings.awsSdk.awsSdkStrings.LESS_THAN_OR_EQUAL_TO
  - typings.awsSdk.awsSdkStrings.GREATER_THAN_OR_EQUAL_TO
  - typings.awsSdk.awsSdkStrings.EQUAL_TO
  - typings.awsSdk.awsSdkStrings.NOT_EQUAL_TO
  - typings.awsSdk.awsSdkStrings.ADDITION
  - typings.awsSdk.awsSdkStrings.MULTIPLICATION
  - typings.awsSdk.awsSdkStrings.DIVISION
  - typings.awsSdk.awsSdkStrings.SUBTRACTION
  - typings.awsSdk.awsSdkStrings.MASK_ALL
  - typings.awsSdk.awsSdkStrings.MASK_FIRST_N
  - typings.awsSdk.awsSdkStrings.MASK_LAST_N
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NULL
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_ZERO
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NEGATIVE
  - typings.awsSdk.awsSdkStrings.VALIDATE_NUMERIC
  - typings.awsSdk.awsSdkStrings.NO_OP
  - java.lang.String
*/
type SalesforceConnectorOperator = _SalesforceConnectorOperator | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AUTOMATIC
  - typings.awsSdk.awsSdkStrings.BULKV2
  - typings.awsSdk.awsSdkStrings.REST_SYNC
  - java.lang.String
*/
type SalesforceDataTransferApi = _SalesforceDataTransferApi | java.lang.String

type SalesforceDataTransferApiList = js.Array[SalesforceDataTransferApi]

type ScheduleExpression = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BYMINUTE
  - typings.awsSdk.awsSdkStrings.HOURLY
  - typings.awsSdk.awsSdkStrings.DAILY
  - typings.awsSdk.awsSdkStrings.WEEKLY
  - typings.awsSdk.awsSdkStrings.MONTHLY
  - typings.awsSdk.awsSdkStrings.ONCE
  - java.lang.String
*/
type ScheduleFrequencyType = _ScheduleFrequencyType | java.lang.String

type ScheduleOffset = scala.Double

type SchedulingFrequencyTypeList = js.Array[ScheduleFrequencyType]

type SecretKey = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROJECTION
  - typings.awsSdk.awsSdkStrings.CONTAINS
  - typings.awsSdk.awsSdkStrings.LESS_THAN
  - typings.awsSdk.awsSdkStrings.GREATER_THAN
  - typings.awsSdk.awsSdkStrings.BETWEEN
  - typings.awsSdk.awsSdkStrings.LESS_THAN_OR_EQUAL_TO
  - typings.awsSdk.awsSdkStrings.GREATER_THAN_OR_EQUAL_TO
  - typings.awsSdk.awsSdkStrings.EQUAL_TO
  - typings.awsSdk.awsSdkStrings.NOT_EQUAL_TO
  - typings.awsSdk.awsSdkStrings.ADDITION
  - typings.awsSdk.awsSdkStrings.MULTIPLICATION
  - typings.awsSdk.awsSdkStrings.DIVISION
  - typings.awsSdk.awsSdkStrings.SUBTRACTION
  - typings.awsSdk.awsSdkStrings.MASK_ALL
  - typings.awsSdk.awsSdkStrings.MASK_FIRST_N
  - typings.awsSdk.awsSdkStrings.MASK_LAST_N
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NULL
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_ZERO
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NEGATIVE
  - typings.awsSdk.awsSdkStrings.VALIDATE_NUMERIC
  - typings.awsSdk.awsSdkStrings.NO_OP
  - java.lang.String
*/
type ServiceNowConnectorOperator = _ServiceNowConnectorOperator | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROJECTION
  - typings.awsSdk.awsSdkStrings.EQUAL_TO
  - typings.awsSdk.awsSdkStrings.ADDITION
  - typings.awsSdk.awsSdkStrings.MULTIPLICATION
  - typings.awsSdk.awsSdkStrings.DIVISION
  - typings.awsSdk.awsSdkStrings.SUBTRACTION
  - typings.awsSdk.awsSdkStrings.MASK_ALL
  - typings.awsSdk.awsSdkStrings.MASK_FIRST_N
  - typings.awsSdk.awsSdkStrings.MASK_LAST_N
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NULL
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_ZERO
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NEGATIVE
  - typings.awsSdk.awsSdkStrings.VALIDATE_NUMERIC
  - typings.awsSdk.awsSdkStrings.NO_OP
  - java.lang.String
*/
type SingularConnectorOperator = _SingularConnectorOperator | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROJECTION
  - typings.awsSdk.awsSdkStrings.LESS_THAN
  - typings.awsSdk.awsSdkStrings.GREATER_THAN
  - typings.awsSdk.awsSdkStrings.BETWEEN
  - typings.awsSdk.awsSdkStrings.LESS_THAN_OR_EQUAL_TO
  - typings.awsSdk.awsSdkStrings.GREATER_THAN_OR_EQUAL_TO
  - typings.awsSdk.awsSdkStrings.EQUAL_TO
  - typings.awsSdk.awsSdkStrings.ADDITION
  - typings.awsSdk.awsSdkStrings.MULTIPLICATION
  - typings.awsSdk.awsSdkStrings.DIVISION
  - typings.awsSdk.awsSdkStrings.SUBTRACTION
  - typings.awsSdk.awsSdkStrings.MASK_ALL
  - typings.awsSdk.awsSdkStrings.MASK_FIRST_N
  - typings.awsSdk.awsSdkStrings.MASK_LAST_N
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NULL
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_ZERO
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NEGATIVE
  - typings.awsSdk.awsSdkStrings.VALIDATE_NUMERIC
  - typings.awsSdk.awsSdkStrings.NO_OP
  - java.lang.String
*/
type SlackConnectorOperator = _SlackConnectorOperator | java.lang.String

type SourceFields = js.Array[String]

type Stage = java.lang.String

type String = java.lang.String

type SupportedApiVersion = java.lang.String

type SupportedApiVersionList = js.Array[SupportedApiVersion]

type SupportedOperatorList = js.Array[Operators]

type SupportedValueList = js.Array[Value]

type SupportedWriteOperationList = js.Array[WriteOperationType]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type TaskPropertiesMap = StringDictionary[Property]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Arithmetic
  - typings.awsSdk.awsSdkStrings.Filter_
  - typings.awsSdk.awsSdkStrings.Map_
  - typings.awsSdk.awsSdkStrings.Map_all
  - typings.awsSdk.awsSdkStrings.Mask_
  - typings.awsSdk.awsSdkStrings.Merge_
  - typings.awsSdk.awsSdkStrings.Passthrough__
  - typings.awsSdk.awsSdkStrings.Truncate
  - typings.awsSdk.awsSdkStrings.Validate
  - java.lang.String
*/
type TaskType = _TaskType | java.lang.String

type Tasks = js.Array[Task]

type Timezone = java.lang.String

type TokenUrl = java.lang.String

type TokenUrlCustomProperties = StringDictionary[CustomPropertyValue]

type TokenUrlList = js.Array[TokenUrl]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROJECTION
  - typings.awsSdk.awsSdkStrings.EQUAL_TO
  - typings.awsSdk.awsSdkStrings.ADDITION
  - typings.awsSdk.awsSdkStrings.MULTIPLICATION
  - typings.awsSdk.awsSdkStrings.DIVISION
  - typings.awsSdk.awsSdkStrings.SUBTRACTION
  - typings.awsSdk.awsSdkStrings.MASK_ALL
  - typings.awsSdk.awsSdkStrings.MASK_FIRST_N
  - typings.awsSdk.awsSdkStrings.MASK_LAST_N
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NULL
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_ZERO
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NEGATIVE
  - typings.awsSdk.awsSdkStrings.VALIDATE_NUMERIC
  - typings.awsSdk.awsSdkStrings.NO_OP
  - java.lang.String
*/
type TrendmicroConnectorOperator = _TrendmicroConnectorOperator | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Scheduled_
  - typings.awsSdk.awsSdkStrings.Event_
  - typings.awsSdk.awsSdkStrings.OnDemand
  - java.lang.String
*/
type TriggerType = _TriggerType | java.lang.String

type TriggerTypeList = js.Array[TriggerType]

type UpdatedBy = java.lang.String

type UpsolverBucketName = java.lang.String

type Username = java.lang.String

type Value = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROJECTION
  - typings.awsSdk.awsSdkStrings.LESS_THAN
  - typings.awsSdk.awsSdkStrings.GREATER_THAN
  - typings.awsSdk.awsSdkStrings.CONTAINS
  - typings.awsSdk.awsSdkStrings.BETWEEN
  - typings.awsSdk.awsSdkStrings.LESS_THAN_OR_EQUAL_TO
  - typings.awsSdk.awsSdkStrings.GREATER_THAN_OR_EQUAL_TO
  - typings.awsSdk.awsSdkStrings.EQUAL_TO
  - typings.awsSdk.awsSdkStrings.NOT_EQUAL_TO
  - typings.awsSdk.awsSdkStrings.ADDITION
  - typings.awsSdk.awsSdkStrings.MULTIPLICATION
  - typings.awsSdk.awsSdkStrings.DIVISION
  - typings.awsSdk.awsSdkStrings.SUBTRACTION
  - typings.awsSdk.awsSdkStrings.MASK_ALL
  - typings.awsSdk.awsSdkStrings.MASK_FIRST_N
  - typings.awsSdk.awsSdkStrings.MASK_LAST_N
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NULL
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_ZERO
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NEGATIVE
  - typings.awsSdk.awsSdkStrings.VALIDATE_NUMERIC
  - typings.awsSdk.awsSdkStrings.NO_OP
  - java.lang.String
*/
type VeevaConnectorOperator = _VeevaConnectorOperator | java.lang.String

type Warehouse = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INSERT
  - typings.awsSdk.awsSdkStrings.UPSERT
  - typings.awsSdk.awsSdkStrings.UPDATE
  - typings.awsSdk.awsSdkStrings.DELETE
  - java.lang.String
*/
type WriteOperationType = _WriteOperationType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROJECTION
  - typings.awsSdk.awsSdkStrings.GREATER_THAN
  - typings.awsSdk.awsSdkStrings.ADDITION
  - typings.awsSdk.awsSdkStrings.MULTIPLICATION
  - typings.awsSdk.awsSdkStrings.DIVISION
  - typings.awsSdk.awsSdkStrings.SUBTRACTION
  - typings.awsSdk.awsSdkStrings.MASK_ALL
  - typings.awsSdk.awsSdkStrings.MASK_FIRST_N
  - typings.awsSdk.awsSdkStrings.MASK_LAST_N
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NULL
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_ZERO
  - typings.awsSdk.awsSdkStrings.VALIDATE_NON_NEGATIVE
  - typings.awsSdk.awsSdkStrings.VALIDATE_NUMERIC
  - typings.awsSdk.awsSdkStrings.NO_OP
  - java.lang.String
*/
type ZendeskConnectorOperator = _ZendeskConnectorOperator | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-08-23`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
