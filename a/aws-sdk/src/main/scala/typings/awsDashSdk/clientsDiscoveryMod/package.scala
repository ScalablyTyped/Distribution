package typings.awsDashSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.awsDashSdkStrings.AGENT
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsDiscoveryMod {
  type AgentConfigurationStatusList = js.Array[AgentConfigurationStatus]
  type AgentId = java.lang.String
  type AgentIds = js.Array[AgentId]
  type AgentNetworkInfoList = js.Array[AgentNetworkInfo]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HEALTHY
    - typings.awsDashSdk.awsDashSdkStrings.UNHEALTHY
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.UNKNOWN
    - typings.awsDashSdk.awsDashSdkStrings.BLACKLISTED
    - typings.awsDashSdk.awsDashSdkStrings.SHUTDOWN
    - java.lang.String
  */
  type AgentStatus = _AgentStatus | java.lang.String
  type AgentsInfo = js.Array[AgentInfo]
  type ApplicationId = java.lang.String
  type ApplicationIdsList = js.Array[ApplicationId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NOT_FOUND
    - typings.awsDashSdk.awsDashSdkStrings.INTERNAL_SERVER_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.OVER_LIMIT
    - java.lang.String
  */
  type BatchDeleteImportDataErrorCode = _BatchDeleteImportDataErrorCode | java.lang.String
  type BatchDeleteImportDataErrorDescription = java.lang.String
  type BatchDeleteImportDataErrorList = js.Array[BatchDeleteImportDataError]
  type Boolean = scala.Boolean
  type BoxedInteger = Double
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  type Condition = java.lang.String
  type Configuration = StringDictionary[String]
  type ConfigurationId = java.lang.String
  type ConfigurationIdList = js.Array[ConfigurationId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SERVER
    - typings.awsDashSdk.awsDashSdkStrings.PROCESS
    - typings.awsDashSdk.awsDashSdkStrings.CONNECTION
    - typings.awsDashSdk.awsDashSdkStrings.APPLICATION
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
    - typings.awsDashSdk.awsDashSdkStrings.START_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.START_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - typings.awsDashSdk.awsDashSdkStrings.STOP_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.STOP_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.INACTIVE
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
    - typings.awsDashSdk.awsDashSdkStrings.CSV
    - typings.awsDashSdk.awsDashSdkStrings.GRAPHML
    - java.lang.String
  */
  type ExportDataFormat = _ExportDataFormat | java.lang.String
  type ExportDataFormats = js.Array[ExportDataFormat]
  type ExportFilters = js.Array[ExportFilter]
  type ExportIds = js.Array[ConfigurationsExportId]
  type ExportRequestTime = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
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
    - typings.awsDashSdk.awsDashSdkStrings.IMPORT_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.IMPORT_COMPLETE
    - typings.awsDashSdk.awsDashSdkStrings.IMPORT_COMPLETE_WITH_ERRORS
    - typings.awsDashSdk.awsDashSdkStrings.IMPORT_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.IMPORT_FAILED_SERVER_LIMIT_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.IMPORT_FAILED_RECORD_LIMIT_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_COMPLETE
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_FAILED_LIMIT_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.INTERNAL_ERROR
    - java.lang.String
  */
  type ImportStatus = _ImportStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IMPORT_TASK_ID
    - typings.awsDashSdk.awsDashSdkStrings.STATUS
    - typings.awsDashSdk.awsDashSdkStrings.NAME
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
  type TimeStamp = Date
  type ToDeleteIdentifierList = js.Array[ImportTaskIdentifier]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2015-11-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ASC
    - typings.awsDashSdk.awsDashSdkStrings.DESC
    - java.lang.String
  */
  type orderString = _orderString | java.lang.String
}
