package typings.awsSdk.clientsDiscoveryMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.AGENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AgentConfigurationStatusList = js.Array[AgentConfigurationStatus]

type AgentId = java.lang.String

type AgentIds = js.Array[AgentId]

type AgentNetworkInfoList = js.Array[AgentNetworkInfo]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HEALTHY
  - typings.awsSdk.awsSdkStrings.UNHEALTHY
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - typings.awsSdk.awsSdkStrings.BLACKLISTED
  - typings.awsSdk.awsSdkStrings.SHUTDOWN
  - java.lang.String
*/
type AgentStatus = _AgentStatus | java.lang.String

type AgentsInfo = js.Array[AgentInfo]

type ApplicationDescription = java.lang.String

type ApplicationId = java.lang.String

type ApplicationIdsList = js.Array[ApplicationId]

type ApplicationName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_FOUND
  - typings.awsSdk.awsSdkStrings.INTERNAL_SERVER_ERROR
  - typings.awsSdk.awsSdkStrings.OVER_LIMIT
  - java.lang.String
*/
type BatchDeleteImportDataErrorCode = _BatchDeleteImportDataErrorCode | java.lang.String

type BatchDeleteImportDataErrorDescription = java.lang.String

type BatchDeleteImportDataErrorList = js.Array[BatchDeleteImportDataError]

type Boolean = scala.Boolean

type BoxedInteger = Double

type ClientRequestToken = java.lang.String

type Condition = java.lang.String

type Configuration = StringDictionary[String]

type ConfigurationId = java.lang.String

type ConfigurationIdList = js.Array[ConfigurationId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SERVER
  - typings.awsSdk.awsSdkStrings.PROCESS
  - typings.awsSdk.awsSdkStrings.CONNECTION
  - typings.awsSdk.awsSdkStrings.APPLICATION
  - java.lang.String
*/
type ConfigurationItemType = _ConfigurationItemType | java.lang.String

type ConfigurationTagSet = js.Array[ConfigurationTag]

type Configurations = js.Array[Configuration]

type ConfigurationsDownloadUrl = java.lang.String

type ConfigurationsExportId = java.lang.String

type ContinuousExportDescriptions = js.Array[ContinuousExportDescription]

type ContinuousExportIds = js.Array[ConfigurationsExportId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.START_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.START_FAILED
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.STOP_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.STOP_FAILED
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type ContinuousExportStatus = _ContinuousExportStatus | java.lang.String

type DataSource = AGENT | java.lang.String

type DatabaseName = java.lang.String

type DescribeConfigurationsAttribute = StringDictionary[String]

type DescribeConfigurationsAttributes = js.Array[DescribeConfigurationsAttribute]

type DescribeContinuousExportsMaxResults = Double

type DescribeImportTasksFilterList = js.Array[ImportTaskFilter]

type DescribeImportTasksMaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CSV
  - typings.awsSdk.awsSdkStrings.GRAPHML
  - java.lang.String
*/
type ExportDataFormat = _ExportDataFormat | java.lang.String

type ExportDataFormats = js.Array[ExportDataFormat]

type ExportFilters = js.Array[ExportFilter]

type ExportIds = js.Array[ConfigurationsExportId]

type ExportRequestTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - java.lang.String
*/
type ExportStatus = _ExportStatus | java.lang.String

type ExportStatusMessage = java.lang.String

type ExportsInfo = js.Array[ExportInfo]

type FilterName = java.lang.String

type FilterValue = java.lang.String

type FilterValues = js.Array[FilterValue]

type Filters = js.Array[Filter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IMPORT_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.IMPORT_COMPLETE
  - typings.awsSdk.awsSdkStrings.IMPORT_COMPLETE_WITH_ERRORS
  - typings.awsSdk.awsSdkStrings.IMPORT_FAILED
  - typings.awsSdk.awsSdkStrings.IMPORT_FAILED_SERVER_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.IMPORT_FAILED_RECORD_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELETE_COMPLETE
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - java.lang.String
*/
type ImportStatus = _ImportStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IMPORT_TASK_ID
  - typings.awsSdk.awsSdkStrings.STATUS
  - typings.awsSdk.awsSdkStrings.NAME
  - java.lang.String
*/
type ImportTaskFilterName = _ImportTaskFilterName | java.lang.String

type ImportTaskFilterValue = java.lang.String

type ImportTaskFilterValueList = js.Array[ImportTaskFilterValue]

type ImportTaskIdentifier = java.lang.String

type ImportTaskList = js.Array[ImportTask]

type ImportTaskName = java.lang.String

type ImportURL = java.lang.String

type Integer = Double

type Long = Double

type NeighborDetailsList = js.Array[NeighborConnectionDetail]

type NextToken = java.lang.String

type OrderByElementFieldName = java.lang.String

type OrderByList = js.Array[OrderByElement]

type S3Bucket = java.lang.String

type S3PresignedUrl = java.lang.String

type SchemaStorageConfig = StringDictionary[String]

type String = java.lang.String

type StringMax255 = java.lang.String

type TagFilters = js.Array[TagFilter]

type TagKey = java.lang.String

type TagSet = js.Array[Tag]

type TagValue = java.lang.String

type TimeStamp = js.Date

type ToDeleteIdentifierList = js.Array[ImportTaskIdentifier]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2015-11-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASC
  - typings.awsSdk.awsSdkStrings.DESC
  - java.lang.String
*/
type orderString = _orderString | java.lang.String
