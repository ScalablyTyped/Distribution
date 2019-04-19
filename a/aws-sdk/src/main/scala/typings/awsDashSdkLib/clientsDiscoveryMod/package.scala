package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsDiscoveryMod {
  type AgentConfigurationStatusList = js.Array[AgentConfigurationStatus]
  type AgentId = java.lang.String
  type AgentIds = js.Array[AgentId]
  type AgentNetworkInfoList = js.Array[AgentNetworkInfo]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HEALTHY
    - awsDashSdkLib.awsDashSdkLibStrings.UNHEALTHY
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN
    - awsDashSdkLib.awsDashSdkLibStrings.BLACKLISTED
    - awsDashSdkLib.awsDashSdkLibStrings.SHUTDOWN
    - java.lang.String
  */
  type AgentStatus = _AgentStatus | java.lang.String
  type AgentsInfo = js.Array[AgentInfo]
  type ApplicationId = java.lang.String
  type ApplicationIdsList = js.Array[ApplicationId]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_FOUND
    - awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_SERVER_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.OVER_LIMIT
    - java.lang.String
  */
  type BatchDeleteImportDataErrorCode = _BatchDeleteImportDataErrorCode | java.lang.String
  type BatchDeleteImportDataErrorDescription = java.lang.String
  type BatchDeleteImportDataErrorList = js.Array[BatchDeleteImportDataError]
  type Boolean = scala.Boolean
  type BoxedInteger = scala.Double
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  type Condition = java.lang.String
  type Configuration = org.scalablytyped.runtime.StringDictionary[String]
  type ConfigurationId = java.lang.String
  type ConfigurationIdList = js.Array[ConfigurationId]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SERVER
    - awsDashSdkLib.awsDashSdkLibStrings.PROCESS
    - awsDashSdkLib.awsDashSdkLibStrings.CONNECTION
    - awsDashSdkLib.awsDashSdkLibStrings.APPLICATION
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
    - awsDashSdkLib.awsDashSdkLibStrings.START_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.START_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.STOP_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.STOP_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.INACTIVE
    - java.lang.String
  */
  type ContinuousExportStatus = _ContinuousExportStatus | java.lang.String
  type DataSource = awsDashSdkLib.awsDashSdkLibStrings.AGENT | java.lang.String
  type DatabaseName = java.lang.String
  type DescribeConfigurationsAttribute = org.scalablytyped.runtime.StringDictionary[String]
  type DescribeConfigurationsAttributes = js.Array[DescribeConfigurationsAttribute]
  type DescribeContinuousExportsMaxResults = scala.Double
  type DescribeImportTasksFilterList = js.Array[ImportTaskFilter]
  type DescribeImportTasksMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CSV
    - awsDashSdkLib.awsDashSdkLibStrings.GRAPHML
    - java.lang.String
  */
  type ExportDataFormat = _ExportDataFormat | java.lang.String
  type ExportDataFormats = js.Array[ExportDataFormat]
  type ExportFilters = js.Array[ExportFilter]
  type ExportIds = js.Array[ConfigurationsExportId]
  type ExportRequestTime = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
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
    - awsDashSdkLib.awsDashSdkLibStrings.IMPORT_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.IMPORT_COMPLETE
    - awsDashSdkLib.awsDashSdkLibStrings.IMPORT_COMPLETE_WITH_ERRORS
    - awsDashSdkLib.awsDashSdkLibStrings.IMPORT_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.IMPORT_FAILED_SERVER_LIMIT_EXCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.IMPORT_FAILED_RECORD_LIMIT_EXCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE_COMPLETE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE_FAILED_LIMIT_EXCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_ERROR
    - java.lang.String
  */
  type ImportStatus = _ImportStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IMPORT_TASK_ID
    - awsDashSdkLib.awsDashSdkLibStrings.STATUS
    - awsDashSdkLib.awsDashSdkLibStrings.NAME
    - java.lang.String
  */
  type ImportTaskFilterName = _ImportTaskFilterName | java.lang.String
  type ImportTaskFilterValue = java.lang.String
  type ImportTaskFilterValueList = js.Array[ImportTaskFilterValue]
  type ImportTaskIdentifier = java.lang.String
  type ImportTaskList = js.Array[ImportTask]
  type ImportTaskName = java.lang.String
  type ImportURL = java.lang.String
  type Integer = scala.Double
  type Long = scala.Double
  type NeighborDetailsList = js.Array[NeighborConnectionDetail]
  type NextToken = java.lang.String
  type OrderByList = js.Array[OrderByElement]
  type S3Bucket = java.lang.String
  type S3PresignedUrl = java.lang.String
  type SchemaStorageConfig = org.scalablytyped.runtime.StringDictionary[String]
  type String = java.lang.String
  type StringMax255 = java.lang.String
  type TagFilters = js.Array[TagFilter]
  type TagKey = java.lang.String
  type TagSet = js.Array[Tag]
  type TagValue = java.lang.String
  type TimeStamp = stdLib.Date
  type ToDeleteIdentifierList = js.Array[ImportTaskIdentifier]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-11-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ASC
    - awsDashSdkLib.awsDashSdkLibStrings.DESC
    - java.lang.String
  */
  type orderString = _orderString | java.lang.String
}
