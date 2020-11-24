package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object appflowMod {
  
  type ARN = java.lang.String
  
  type AccessKeyId = java.lang.String
  
  type AccessToken = java.lang.String
  
  type AccountName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.None_
    - typings.awsSdk.awsSdkStrings.SingleFile
    - java.lang.String
  */
  type AggregationType = typings.awsSdk.appflowMod._AggregationType | java.lang.String
  
  type AmplitudeConnectorOperator = typings.awsSdk.awsSdkStrings.BETWEEN | java.lang.String
  
  type ApiKey = java.lang.String
  
  type ApiSecretKey = java.lang.String
  
  type ApiToken = java.lang.String
  
  type ApplicationKey = java.lang.String
  
  type AuthCode = java.lang.String
  
  type Boolean = scala.Boolean
  
  type BucketName = java.lang.String
  
  type BucketPrefix = java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.appflowMod.ClientApiVersions
  
  type ClientCredentialsArn = java.lang.String
  
  type ClientId = java.lang.String
  
  type ClientSecret = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Public_
    - typings.awsSdk.awsSdkStrings.Private_
    - java.lang.String
  */
  type ConnectionMode = typings.awsSdk.appflowMod._ConnectionMode | java.lang.String
  
  type ConnectorConfigurationsMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.appflowMod.ConnectorConfiguration]
  
  type ConnectorEntityFieldList = js.Array[typings.awsSdk.appflowMod.ConnectorEntityField]
  
  type ConnectorEntityList = js.Array[typings.awsSdk.appflowMod.ConnectorEntity]
  
  type ConnectorEntityMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.appflowMod.ConnectorEntityList]
  
  type ConnectorProfileArn = java.lang.String
  
  type ConnectorProfileDetailList = js.Array[typings.awsSdk.appflowMod.ConnectorProfile]
  
  type ConnectorProfileName = java.lang.String
  
  type ConnectorProfileNameList = js.Array[typings.awsSdk.appflowMod.ConnectorProfileName]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Salesforce_
    - typings.awsSdk.awsSdkStrings.Singular
    - typings.awsSdk.awsSdkStrings.Slack
    - typings.awsSdk.awsSdkStrings.Redshift_
    - typings.awsSdk.awsSdkStrings.S3
    - typings.awsSdk.awsSdkStrings.Marketo
    - typings.awsSdk.awsSdkStrings.Googleanalytics
    - typings.awsSdk.awsSdkStrings.Zendesk
    - typings.awsSdk.awsSdkStrings.Servicenow_
    - typings.awsSdk.awsSdkStrings.Datadog
    - typings.awsSdk.awsSdkStrings.Trendmicro
    - typings.awsSdk.awsSdkStrings.Snowflake_
    - typings.awsSdk.awsSdkStrings.Dynatrace
    - typings.awsSdk.awsSdkStrings.Infornexus
    - typings.awsSdk.awsSdkStrings.Amplitude
    - typings.awsSdk.awsSdkStrings.Veeva
    - typings.awsSdk.awsSdkStrings.EventBridge
    - java.lang.String
  */
  type ConnectorType = typings.awsSdk.appflowMod._ConnectorType | java.lang.String
  
  type ConnectorTypeList = js.Array[typings.awsSdk.appflowMod.ConnectorType]
  
  type CreatedBy = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Incremental
    - typings.awsSdk.awsSdkStrings.Complete_
    - java.lang.String
  */
  type DataPullMode = typings.awsSdk.appflowMod._DataPullMode | java.lang.String
  
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
  type DatadogConnectorOperator = typings.awsSdk.appflowMod._DatadogConnectorOperator | java.lang.String
  
  type Date = typings.std.Date
  
  type DatetimeTypeFieldName = java.lang.String
  
  type Description = java.lang.String
  
  type DestinationField = java.lang.String
  
  type DestinationFlowConfigList = js.Array[typings.awsSdk.appflowMod.DestinationFlowConfig]
  
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
  type DynatraceConnectorOperator = typings.awsSdk.appflowMod._DynatraceConnectorOperator | java.lang.String
  
  type EntitiesPath = java.lang.String
  
  type ExecutionId = java.lang.String
  
  type ExecutionMessage = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Successful_
    - typings.awsSdk.awsSdkStrings.Error_
    - java.lang.String
  */
  type ExecutionStatus = typings.awsSdk.appflowMod._ExecutionStatus | java.lang.String
  
  type FieldType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CSV
    - typings.awsSdk.awsSdkStrings.JSON
    - typings.awsSdk.awsSdkStrings.PARQUET
    - java.lang.String
  */
  type FileType = typings.awsSdk.appflowMod._FileType | java.lang.String
  
  type FilterOperatorList = js.Array[typings.awsSdk.appflowMod.Operator]
  
  type FlowArn = java.lang.String
  
  type FlowDescription = java.lang.String
  
  type FlowExecutionList = js.Array[typings.awsSdk.appflowMod.ExecutionRecord]
  
  type FlowList = js.Array[typings.awsSdk.appflowMod.FlowDefinition]
  
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
  type FlowStatus = typings.awsSdk.appflowMod._FlowStatus | java.lang.String
  
  type FlowStatusMessage = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PROJECTION
    - typings.awsSdk.awsSdkStrings.BETWEEN
    - java.lang.String
  */
  type GoogleAnalyticsConnectorOperator = typings.awsSdk.appflowMod._GoogleAnalyticsConnectorOperator | java.lang.String
  
  type Group = java.lang.String
  
  type IdFieldNameList = js.Array[typings.awsSdk.appflowMod.Name]
  
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
  type InforNexusConnectorOperator = typings.awsSdk.appflowMod._InforNexusConnectorOperator | java.lang.String
  
  type InstanceUrl = java.lang.String
  
  type KMSArn = java.lang.String
  
  type Key = java.lang.String
  
  type Label = java.lang.String
  
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
  type MarketoConnectorOperator = typings.awsSdk.appflowMod._MarketoConnectorOperator | java.lang.String
  
  type MaxResults = scala.Double
  
  type MostRecentExecutionMessage = java.lang.String
  
  type Name = java.lang.String
  
  type NextToken = java.lang.String
  
  type OAuthScope = java.lang.String
  
  type OAuthScopeList = js.Array[typings.awsSdk.appflowMod.OAuthScope]
  
  type Object = java.lang.String
  
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
  type Operator = typings.awsSdk.appflowMod._Operator | java.lang.String
  
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
    - java.lang.String
  */
  type OperatorPropertiesKeys = typings.awsSdk.appflowMod._OperatorPropertiesKeys | java.lang.String
  
  type Password = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.YEAR
    - typings.awsSdk.awsSdkStrings.MONTH
    - typings.awsSdk.awsSdkStrings.DAY
    - typings.awsSdk.awsSdkStrings.HOUR
    - typings.awsSdk.awsSdkStrings.MINUTE
    - java.lang.String
  */
  type PrefixFormat = typings.awsSdk.appflowMod._PrefixFormat | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FILENAME
    - typings.awsSdk.awsSdkStrings.PATH
    - typings.awsSdk.awsSdkStrings.PATH_AND_FILENAME
    - java.lang.String
  */
  type PrefixType = typings.awsSdk.appflowMod._PrefixType | java.lang.String
  
  type PrivateLinkServiceName = java.lang.String
  
  type Property = java.lang.String
  
  type RedirectUri = java.lang.String
  
  type RefreshToken = java.lang.String
  
  type Region = java.lang.String
  
  type RegionList = js.Array[typings.awsSdk.appflowMod.Region]
  
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
  type S3ConnectorOperator = typings.awsSdk.appflowMod._S3ConnectorOperator | java.lang.String
  
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
  type SalesforceConnectorOperator = typings.awsSdk.appflowMod._SalesforceConnectorOperator | java.lang.String
  
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
  type ScheduleFrequencyType = typings.awsSdk.appflowMod._ScheduleFrequencyType | java.lang.String
  
  type SchedulingFrequencyTypeList = js.Array[typings.awsSdk.appflowMod.ScheduleFrequencyType]
  
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
  type ServiceNowConnectorOperator = typings.awsSdk.appflowMod._ServiceNowConnectorOperator | java.lang.String
  
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
  type SingularConnectorOperator = typings.awsSdk.appflowMod._SingularConnectorOperator | java.lang.String
  
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
  type SlackConnectorOperator = typings.awsSdk.appflowMod._SlackConnectorOperator | java.lang.String
  
  type SourceFields = js.Array[typings.awsSdk.appflowMod.String]
  
  type Stage = java.lang.String
  
  type String = java.lang.String
  
  type SupportedValueList = js.Array[typings.awsSdk.appflowMod.Value]
  
  type SupportedWriteOperationList = js.Array[typings.awsSdk.appflowMod.WriteOperationType]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.appflowMod.TagKey]
  
  type TagMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.appflowMod.TagValue]
  
  type TagValue = java.lang.String
  
  type TaskPropertiesMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.appflowMod.Property]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Arithmetic
    - typings.awsSdk.awsSdkStrings.Filter_
    - typings.awsSdk.awsSdkStrings.Map
    - typings.awsSdk.awsSdkStrings.Mask_
    - typings.awsSdk.awsSdkStrings.Merge
    - typings.awsSdk.awsSdkStrings.Truncate
    - typings.awsSdk.awsSdkStrings.Validate
    - java.lang.String
  */
  type TaskType = typings.awsSdk.appflowMod._TaskType | java.lang.String
  
  type Tasks = js.Array[typings.awsSdk.appflowMod.Task]
  
  type Timezone = java.lang.String
  
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
  type TrendmicroConnectorOperator = typings.awsSdk.appflowMod._TrendmicroConnectorOperator | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Scheduled_
    - typings.awsSdk.awsSdkStrings.Event_
    - typings.awsSdk.awsSdkStrings.OnDemand
    - java.lang.String
  */
  type TriggerType = typings.awsSdk.appflowMod._TriggerType | java.lang.String
  
  type TriggerTypeList = js.Array[typings.awsSdk.appflowMod.TriggerType]
  
  type UpdatedBy = java.lang.String
  
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
  type VeevaConnectorOperator = typings.awsSdk.appflowMod._VeevaConnectorOperator | java.lang.String
  
  type Warehouse = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INSERT
    - typings.awsSdk.awsSdkStrings.UPSERT
    - typings.awsSdk.awsSdkStrings.UPDATE
    - java.lang.String
  */
  type WriteOperationType = typings.awsSdk.appflowMod._WriteOperationType | java.lang.String
  
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
  type ZendeskConnectorOperator = typings.awsSdk.appflowMod._ZendeskConnectorOperator | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2020-08-23`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.appflowMod._apiVersion | java.lang.String
}
