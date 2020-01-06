package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsKendraMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.SHAREPOINT_ONLINE
  import typings.awsDashSdk.awsDashSdkStrings.TEXT_WITH_HIGHLIGHTS_VALUE
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type AdditionalResultAttributeList = js.Array[AdditionalResultAttribute]
  type AdditionalResultAttributeValueType = TEXT_WITH_HIGHLIGHTS_VALUE | java.lang.String
  type AttributeFilterList = js.Array[AttributeFilter]
  type BatchDeleteDocumentResponseFailedDocuments = js.Array[BatchDeleteDocumentResponseFailedDocument]
  type BatchPutDocumentResponseFailedDocuments = js.Array[BatchPutDocumentResponseFailedDocument]
  type Boolean = scala.Boolean
  type ChangeDetectingColumns = js.Array[ColumnName]
  type ClickFeedbackList = js.Array[ClickFeedback]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ColumnName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PDF
    - typings.awsDashSdk.awsDashSdkStrings.HTML
    - typings.awsDashSdk.awsDashSdkStrings.MS_WORD
    - typings.awsDashSdk.awsDashSdkStrings.PLAIN_TEXT
    - typings.awsDashSdk.awsDashSdkStrings.PPT
    - java.lang.String
  */
  type ContentType = _ContentType | java.lang.String
  type DataSourceDateFieldFormat = java.lang.String
  type DataSourceFieldName = java.lang.String
  type DataSourceId = java.lang.String
  type DataSourceInclusionsExclusionsStrings = js.Array[DataSourceInclusionsExclusionsStringsMember]
  type DataSourceInclusionsExclusionsStringsMember = java.lang.String
  type DataSourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - java.lang.String
  */
  type DataSourceStatus = _DataSourceStatus | java.lang.String
  type DataSourceSummaryList = js.Array[DataSourceSummary]
  type DataSourceSyncJobHistoryList = js.Array[DataSourceSyncJob]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.SYNCING
    - typings.awsDashSdk.awsDashSdkStrings.INCOMPLETE
    - typings.awsDashSdk.awsDashSdkStrings.STOPPING
    - typings.awsDashSdk.awsDashSdkStrings.ABORTED
    - java.lang.String
  */
  type DataSourceSyncJobStatus = _DataSourceSyncJobStatus | java.lang.String
  type DataSourceToIndexFieldMappingList = js.Array[DataSourceToIndexFieldMapping]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.S3
    - typings.awsDashSdk.awsDashSdkStrings.SHAREPOINT
    - typings.awsDashSdk.awsDashSdkStrings.DATABASE
    - java.lang.String
  */
  type DataSourceType = _DataSourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RDS_AURORA_MYSQL
    - typings.awsDashSdk.awsDashSdkStrings.RDS_AURORA_POSTGRESQL
    - typings.awsDashSdk.awsDashSdkStrings.RDS_MYSQL
    - typings.awsDashSdk.awsDashSdkStrings.RDS_POSTGRESQL
    - java.lang.String
  */
  type DatabaseEngineType = _DatabaseEngineType | java.lang.String
  type DatabaseHost = java.lang.String
  type DatabaseName = java.lang.String
  type DatabasePort = Double
  type Description = java.lang.String
  type DocumentAttributeKey = java.lang.String
  type DocumentAttributeKeyList = js.Array[DocumentAttributeKey]
  type DocumentAttributeList = js.Array[DocumentAttribute]
  type DocumentAttributeStringListValue = js.Array[String]
  type DocumentAttributeStringValue = java.lang.String
  type DocumentAttributeValueCountPairList = js.Array[DocumentAttributeValueCountPair]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STRING_VALUE
    - typings.awsDashSdk.awsDashSdkStrings.STRING_LIST_VALUE
    - typings.awsDashSdk.awsDashSdkStrings.LONG_VALUE
    - typings.awsDashSdk.awsDashSdkStrings.DATE_VALUE
    - java.lang.String
  */
  type DocumentAttributeValueType = _DocumentAttributeValueType | java.lang.String
  type DocumentId = java.lang.String
  type DocumentIdList = js.Array[DocumentId]
  type DocumentList = js.Array[Document]
  type DocumentMetadataBoolean = scala.Boolean
  type DocumentMetadataConfigurationList = js.Array[DocumentMetadataConfiguration]
  type DocumentMetadataConfigurationName = java.lang.String
  type Duration = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InternalError
    - typings.awsDashSdk.awsDashSdkStrings.InvalidRequest
    - java.lang.String
  */
  type ErrorCode = _ErrorCode | java.lang.String
  type ErrorMessage = java.lang.String
  type FacetList = js.Array[Facet]
  type FacetResultList = js.Array[FacetResult]
  type FaqId = java.lang.String
  type FaqName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type FaqStatus = _FaqStatus | java.lang.String
  type FaqSummaryItems = js.Array[FaqSummary]
  type HighlightList = js.Array[Highlight]
  type Importance = Double
  type IndexConfigurationSummaryList = js.Array[IndexConfigurationSummary]
  type IndexFieldName = java.lang.String
  type IndexId = java.lang.String
  type IndexName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.SYSTEM_UPDATING
    - java.lang.String
  */
  type IndexStatus = _IndexStatus | java.lang.String
  type IndexedQuestionAnswersCount = Double
  type IndexedTextDocumentsCount = Double
  type Integer = Double
  type KmsKeyId = java.lang.String
  type Long = Double
  type MaxResultsIntegerForListDataSourceSyncJobsRequest = Double
  type MaxResultsIntegerForListDataSourcesRequest = Double
  type MaxResultsIntegerForListFaqsRequest = Double
  type MaxResultsIntegerForListIndicesRequest = Double
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ASCENDING
    - typings.awsDashSdk.awsDashSdkStrings.DESCENDING
    - java.lang.String
  */
  type Order = _Order | java.lang.String
  type PrincipalList = js.Array[Principal]
  type PrincipalName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.USER
    - typings.awsDashSdk.awsDashSdkStrings.GROUP
    - java.lang.String
  */
  type PrincipalType = _PrincipalType | java.lang.String
  type QueryId = java.lang.String
  type QueryResultItemList = js.Array[QueryResultItem]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENT
    - typings.awsDashSdk.awsDashSdkStrings.QUESTION_ANSWER
    - typings.awsDashSdk.awsDashSdkStrings.ANSWER
    - java.lang.String
  */
  type QueryResultType = _QueryResultType | java.lang.String
  type QueryText = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALLOW
    - typings.awsDashSdk.awsDashSdkStrings.DENY
    - java.lang.String
  */
  type ReadAccessType = _ReadAccessType | java.lang.String
  type RelevanceFeedbackList = js.Array[RelevanceFeedback]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RELEVANT
    - typings.awsDashSdk.awsDashSdkStrings.NOT_RELEVANT
    - java.lang.String
  */
  type RelevanceType = _RelevanceType | java.lang.String
  type ResultId = java.lang.String
  type RoleArn = java.lang.String
  type S3BucketName = java.lang.String
  type S3ObjectKey = java.lang.String
  type ScanSchedule = java.lang.String
  type SecretArn = java.lang.String
  type SecurityGroupIdList = js.Array[VpcSecurityGroupId]
  type SharePointUrlList = js.Array[Url]
  type SharePointVersion = SHAREPOINT_ONLINE | java.lang.String
  type String = java.lang.String
  type SubnetId = java.lang.String
  type SubnetIdList = js.Array[SubnetId]
  type TableName = java.lang.String
  type Timestamp = Date
  type Title = java.lang.String
  type Url = java.lang.String
  type ValueImportanceMap = StringDictionary[Importance]
  type ValueImportanceMapKey = java.lang.String
  type VpcSecurityGroupId = java.lang.String
  type _Blob = Buffer | Uint8Array | Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2019-02-03`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
