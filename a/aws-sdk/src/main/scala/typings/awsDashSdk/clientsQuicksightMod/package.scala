package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsQuicksightMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.US
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type ActionList = js.Array[String]
  type ActiveIAMPolicyAssignmentList = js.Array[ActiveIAMPolicyAssignment]
  type AliasName = java.lang.String
  type Arn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DRAFT
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type AssignmentStatus = _AssignmentStatus | java.lang.String
  type AwsAccountId = java.lang.String
  type Boolean = scala.Boolean
  type CalculatedColumnList = js.Array[CalculatedColumn]
  type Catalog = java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClusterId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STRING
    - typings.awsDashSdk.awsDashSdkStrings.INTEGER
    - typings.awsDashSdk.awsDashSdkStrings.DECIMAL
    - typings.awsDashSdk.awsDashSdkStrings.DATETIME
    - java.lang.String
  */
  type ColumnDataType = _ColumnDataType | java.lang.String
  type ColumnGroupColumnSchemaList = js.Array[ColumnGroupColumnSchema]
  type ColumnGroupList = js.Array[ColumnGroup]
  type ColumnGroupName = java.lang.String
  type ColumnGroupSchemaList = js.Array[ColumnGroupSchema]
  type ColumnId = java.lang.String
  type ColumnList = js.Array[ColumnName]
  type ColumnName = java.lang.String
  type ColumnSchemaList = js.Array[ColumnSchema]
  type ColumnTagList = js.Array[ColumnTag]
  type CustomSqlName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type DashboardBehavior = _DashboardBehavior | java.lang.String
  type DashboardErrorList = js.Array[DashboardError]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DATA_SET_NOT_FOUND
    - typings.awsDashSdk.awsDashSdkStrings.INTERNAL_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.PARAMETER_VALUE_INCOMPATIBLE
    - typings.awsDashSdk.awsDashSdkStrings.PARAMETER_TYPE_INVALID
    - typings.awsDashSdk.awsDashSdkStrings.PARAMETER_NOT_FOUND
    - typings.awsDashSdk.awsDashSdkStrings.COLUMN_TYPE_MISMATCH
    - typings.awsDashSdk.awsDashSdkStrings.COLUMN_GEOGRAPHIC_ROLE_MISMATCH
    - typings.awsDashSdk.awsDashSdkStrings.COLUMN_REPLACEMENT_MISSING
    - java.lang.String
  */
  type DashboardErrorType = _DashboardErrorType | java.lang.String
  type DashboardName = java.lang.String
  type DashboardSummaryList = js.Array[DashboardSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EXPANDED
    - typings.awsDashSdk.awsDashSdkStrings.COLLAPSED
    - java.lang.String
  */
  type DashboardUIState = _DashboardUIState | java.lang.String
  type DashboardVersionSummaryList = js.Array[DashboardVersionSummary]
  type DataSetConfigurationList = js.Array[DataSetConfiguration]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SPICE
    - typings.awsDashSdk.awsDashSdkStrings.DIRECT_QUERY
    - java.lang.String
  */
  type DataSetImportMode = _DataSetImportMode | java.lang.String
  type DataSetName = java.lang.String
  type DataSetReferenceList = js.Array[DataSetReference]
  type DataSetSummaryList = js.Array[DataSetSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TIMEOUT
    - typings.awsDashSdk.awsDashSdkStrings.ENGINE_VERSION_NOT_SUPPORTED
    - typings.awsDashSdk.awsDashSdkStrings.UNKNOWN_HOST
    - typings.awsDashSdk.awsDashSdkStrings.GENERIC_SQL_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.CONFLICT
    - typings.awsDashSdk.awsDashSdkStrings.UNKNOWN
    - java.lang.String
  */
  type DataSourceErrorInfoType = _DataSourceErrorInfoType | java.lang.String
  type DataSourceList = js.Array[DataSource]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ADOBE_ANALYTICS
    - typings.awsDashSdk.awsDashSdkStrings.AMAZON_ELASTICSEARCH
    - typings.awsDashSdk.awsDashSdkStrings.ATHENA
    - typings.awsDashSdk.awsDashSdkStrings.AURORA
    - typings.awsDashSdk.awsDashSdkStrings.AURORA_POSTGRESQL
    - typings.awsDashSdk.awsDashSdkStrings.AWS_IOT_ANALYTICS
    - typings.awsDashSdk.awsDashSdkStrings.GITHUB
    - typings.awsDashSdk.awsDashSdkStrings.JIRA
    - typings.awsDashSdk.awsDashSdkStrings.MARIADB
    - typings.awsDashSdk.awsDashSdkStrings.MYSQL
    - typings.awsDashSdk.awsDashSdkStrings.POSTGRESQL
    - typings.awsDashSdk.awsDashSdkStrings.PRESTO
    - typings.awsDashSdk.awsDashSdkStrings.REDSHIFT
    - typings.awsDashSdk.awsDashSdkStrings.S3
    - typings.awsDashSdk.awsDashSdkStrings.SALESFORCE
    - typings.awsDashSdk.awsDashSdkStrings.SERVICENOW
    - typings.awsDashSdk.awsDashSdkStrings.SNOWFLAKE
    - typings.awsDashSdk.awsDashSdkStrings.SPARK
    - typings.awsDashSdk.awsDashSdkStrings.SQLSERVER
    - typings.awsDashSdk.awsDashSdkStrings.TERADATA
    - typings.awsDashSdk.awsDashSdkStrings.TWITTER
    - java.lang.String
  */
  type DataSourceType = _DataSourceType | java.lang.String
  type Database = java.lang.String
  type DateTimeParameterList = js.Array[DateTimeParameter]
  type DecimalParameterList = js.Array[DecimalParameter]
  type Delimiter = java.lang.String
  type Domain = java.lang.String
  type Double = scala.Double
  type DoubleList = js.Array[Double]
  type EmbeddingUrl = java.lang.String
  type Expression = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CSV
    - typings.awsDashSdk.awsDashSdkStrings.TSV
    - typings.awsDashSdk.awsDashSdkStrings.CLF
    - typings.awsDashSdk.awsDashSdkStrings.ELF
    - typings.awsDashSdk.awsDashSdkStrings.XLSX
    - typings.awsDashSdk.awsDashSdkStrings.JSON
    - java.lang.String
  */
  type FileFormat = _FileFormat | java.lang.String
  type GeoSpatialCountryCode = US | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.COUNTRY
    - typings.awsDashSdk.awsDashSdkStrings.STATE
    - typings.awsDashSdk.awsDashSdkStrings.COUNTY
    - typings.awsDashSdk.awsDashSdkStrings.CITY
    - typings.awsDashSdk.awsDashSdkStrings.POSTCODE
    - typings.awsDashSdk.awsDashSdkStrings.LONGITUDE
    - typings.awsDashSdk.awsDashSdkStrings.LATITUDE
    - java.lang.String
  */
  type GeoSpatialDataRole = _GeoSpatialDataRole | java.lang.String
  type GroupDescription = java.lang.String
  type GroupList = js.Array[Group]
  type GroupMemberList = js.Array[GroupMember]
  type GroupMemberName = java.lang.String
  type GroupName = java.lang.String
  type Host = java.lang.String
  type IAMPolicyAssignmentName = java.lang.String
  type IAMPolicyAssignmentSummaryList = js.Array[IAMPolicyAssignmentSummary]
  type IdentityMap = StringDictionary[IdentityNameList]
  type IdentityName = java.lang.String
  type IdentityNameList = js.Array[IdentityName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IAM
    - typings.awsDashSdk.awsDashSdkStrings.QUICKSIGHT
    - java.lang.String
  */
  type IdentityType = _IdentityType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FAILURE_TO_ASSUME_ROLE
    - typings.awsDashSdk.awsDashSdkStrings.INGESTION_SUPERSEDED
    - typings.awsDashSdk.awsDashSdkStrings.INGESTION_CANCELED
    - typings.awsDashSdk.awsDashSdkStrings.DATA_SET_DELETED
    - typings.awsDashSdk.awsDashSdkStrings.DATA_SET_NOT_SPICE
    - typings.awsDashSdk.awsDashSdkStrings.S3_UPLOADED_FILE_DELETED
    - typings.awsDashSdk.awsDashSdkStrings.S3_MANIFEST_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.DATA_TOLERANCE_EXCEPTION
    - typings.awsDashSdk.awsDashSdkStrings.SPICE_TABLE_NOT_FOUND
    - typings.awsDashSdk.awsDashSdkStrings.DATA_SET_SIZE_LIMIT_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.ROW_SIZE_LIMIT_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.ACCOUNT_CAPACITY_LIMIT_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.CUSTOMER_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.DATA_SOURCE_NOT_FOUND
    - typings.awsDashSdk.awsDashSdkStrings.IAM_ROLE_NOT_AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.CONNECTION_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.SQL_TABLE_NOT_FOUND
    - typings.awsDashSdk.awsDashSdkStrings.PERMISSION_DENIED
    - typings.awsDashSdk.awsDashSdkStrings.SSL_CERTIFICATE_VALIDATION_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.OAUTH_TOKEN_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.SOURCE_API_LIMIT_EXCEEDED_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.PASSWORD_AUTHENTICATION_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.SQL_SCHEMA_MISMATCH_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.INVALID_DATE_FORMAT
    - typings.awsDashSdk.awsDashSdkStrings.INVALID_DATAPREP_SYNTAX
    - typings.awsDashSdk.awsDashSdkStrings.SOURCE_RESOURCE_LIMIT_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.SQL_INVALID_PARAMETER_VALUE
    - typings.awsDashSdk.awsDashSdkStrings.QUERY_TIMEOUT
    - typings.awsDashSdk.awsDashSdkStrings.SQL_NUMERIC_OVERFLOW
    - typings.awsDashSdk.awsDashSdkStrings.UNRESOLVABLE_HOST
    - typings.awsDashSdk.awsDashSdkStrings.UNROUTABLE_HOST
    - typings.awsDashSdk.awsDashSdkStrings.SQL_EXCEPTION
    - typings.awsDashSdk.awsDashSdkStrings.S3_FILE_INACCESSIBLE
    - typings.awsDashSdk.awsDashSdkStrings.IOT_FILE_NOT_FOUND
    - typings.awsDashSdk.awsDashSdkStrings.IOT_DATA_SET_FILE_EMPTY
    - typings.awsDashSdk.awsDashSdkStrings.INVALID_DATA_SOURCE_CONFIG
    - typings.awsDashSdk.awsDashSdkStrings.DATA_SOURCE_AUTH_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DATA_SOURCE_CONNECTION_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.FAILURE_TO_PROCESS_JSON_FILE
    - typings.awsDashSdk.awsDashSdkStrings.INTERNAL_SERVICE_ERROR
    - java.lang.String
  */
  type IngestionErrorType = _IngestionErrorType | java.lang.String
  type IngestionId = java.lang.String
  type IngestionMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MANUAL
    - typings.awsDashSdk.awsDashSdkStrings.SCHEDULED
    - java.lang.String
  */
  type IngestionRequestSource = _IngestionRequestSource | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INITIAL_INGESTION
    - typings.awsDashSdk.awsDashSdkStrings.EDIT
    - typings.awsDashSdk.awsDashSdkStrings.INCREMENTAL_REFRESH
    - typings.awsDashSdk.awsDashSdkStrings.FULL_REFRESH
    - java.lang.String
  */
  type IngestionRequestType = _IngestionRequestType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INITIALIZED
    - typings.awsDashSdk.awsDashSdkStrings.QUEUED
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.CANCELLED
    - java.lang.String
  */
  type IngestionStatus = _IngestionStatus | java.lang.String
  type Ingestions = js.Array[Ingestion]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STRING
    - typings.awsDashSdk.awsDashSdkStrings.INTEGER
    - typings.awsDashSdk.awsDashSdkStrings.DECIMAL
    - typings.awsDashSdk.awsDashSdkStrings.DATETIME
    - typings.awsDashSdk.awsDashSdkStrings.BIT
    - typings.awsDashSdk.awsDashSdkStrings.BOOLEAN
    - typings.awsDashSdk.awsDashSdkStrings.JSON
    - java.lang.String
  */
  type InputColumnDataType = _InputColumnDataType | java.lang.String
  type InputColumnList = js.Array[InputColumn]
  type InstanceId = java.lang.String
  type IntegerParameterList = js.Array[IntegerParameter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INNER
    - typings.awsDashSdk.awsDashSdkStrings.OUTER
    - typings.awsDashSdk.awsDashSdkStrings.LEFT
    - typings.awsDashSdk.awsDashSdkStrings.RIGHT
    - java.lang.String
  */
  type JoinType = _JoinType | java.lang.String
  type LogicalTableAlias = java.lang.String
  type LogicalTableId = java.lang.String
  type LogicalTableMap = StringDictionary[LogicalTable]
  type Long = scala.Double
  type LongList = js.Array[Long]
  type MaxResults = scala.Double
  type Namespace = java.lang.String
  type NonEmptyString = java.lang.String
  type OnClause = java.lang.String
  type OptionalPort = scala.Double
  type OutputColumnList = js.Array[OutputColumn]
  type Password = java.lang.String
  type PhysicalTableId = java.lang.String
  type PhysicalTableMap = StringDictionary[PhysicalTable]
  type Port = scala.Double
  type PositiveInteger = scala.Double
  type Principal = java.lang.String
  type ProjectedColumnList = js.Array[String]
  type Query = java.lang.String
  type RelationalTableName = java.lang.String
  type RelationalTableSchema = java.lang.String
  type ResourceId = java.lang.String
  type ResourceName = java.lang.String
  type ResourcePermissionList = js.Array[ResourcePermission]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATION_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.CREATION_SUCCESSFUL
    - typings.awsDashSdk.awsDashSdkStrings.CREATION_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_SUCCESSFUL
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_FAILED
    - java.lang.String
  */
  type ResourceStatus = _ResourceStatus | java.lang.String
  type RestrictiveResourceId = java.lang.String
  type RoleSessionName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.GRANT_ACCESS
    - typings.awsDashSdk.awsDashSdkStrings.DENY_ACCESS
    - java.lang.String
  */
  type RowLevelPermissionPolicy = _RowLevelPermissionPolicy | java.lang.String
  type S3Bucket = java.lang.String
  type S3Key = java.lang.String
  type SessionLifetimeInMinutes = scala.Double
  type SiteBaseUrl = java.lang.String
  type SqlQuery = java.lang.String
  type StatusCode = scala.Double
  type String = java.lang.String
  type StringList = js.Array[String]
  type StringParameterList = js.Array[StringParameter]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type TemplateAliasList = js.Array[TemplateAlias]
  type TemplateErrorList = js.Array[TemplateError]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DATA_SET_NOT_FOUND
    - typings.awsDashSdk.awsDashSdkStrings.INTERNAL_FAILURE
    - java.lang.String
  */
  type TemplateErrorType = _TemplateErrorType | java.lang.String
  type TemplateName = java.lang.String
  type TemplateSummaryList = js.Array[TemplateSummary]
  type TemplateVersionSummaryList = js.Array[TemplateVersionSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DOUBLE_QUOTE
    - typings.awsDashSdk.awsDashSdkStrings.SINGLE_QUOTE
    - java.lang.String
  */
  type TextQualifier = _TextQualifier | java.lang.String
  type Timestamp = Date
  type TimestampList = js.Array[Timestamp]
  type TransformOperationList = js.Array[TransformOperation]
  type TypeCastFormat = java.lang.String
  type UpdateResourcePermissionList = js.Array[ResourcePermission]
  type UserList = js.Array[User]
  type UserName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ADMIN
    - typings.awsDashSdk.awsDashSdkStrings.AUTHOR
    - typings.awsDashSdk.awsDashSdkStrings.READER
    - typings.awsDashSdk.awsDashSdkStrings.RESTRICTED_AUTHOR
    - typings.awsDashSdk.awsDashSdkStrings.RESTRICTED_READER
    - java.lang.String
  */
  type UserRole = _UserRole | java.lang.String
  type Username = java.lang.String
  type VersionDescription = java.lang.String
  type VersionNumber = scala.Double
  type Warehouse = java.lang.String
  type WorkGroup = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-04-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type long = scala.Double
  type timestamp = Date
}
