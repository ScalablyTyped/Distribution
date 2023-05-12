package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.DEFINITION
import typings.awsSdk.awsSdkStrings.GPU
import typings.awsSdk.awsSdkStrings.KMS
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Accelerators = GPU | java.lang.String

type ActivateReadSetJobList = js.Array[ActivateReadSetJobItem]

type ActivateReadSetSourceList = js.Array[ActivateReadSetSourceItem]

type ActivationJobId = java.lang.String

type AnnotationFieldMap = StringDictionary[AnnotationFieldMapValueString]

type AnnotationFieldMapKeyString = java.lang.String

type AnnotationFieldMapValueString = java.lang.String

type AnnotationImportItemDetails = js.Array[AnnotationImportItemDetail]

type AnnotationImportItemSources = js.Array[AnnotationImportItemSource]

type AnnotationImportJobItems = js.Array[AnnotationImportJobItem]

type AnnotationStoreItems = js.Array[AnnotationStoreItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GENERIC
  - typings.awsSdk.awsSdkStrings.CHR_POS
  - typings.awsSdk.awsSdkStrings.CHR_POS_REF_ALT
  - typings.awsSdk.awsSdkStrings.CHR_START_END_ONE_BASE
  - typings.awsSdk.awsSdkStrings.CHR_START_END_REF_ALT_ONE_BASE
  - typings.awsSdk.awsSdkStrings.CHR_START_END_ZERO_BASE
  - typings.awsSdk.awsSdkStrings.CHR_START_END_REF_ALT_ZERO_BASE
  - java.lang.String
*/
type AnnotationType = _AnnotationType | java.lang.String

type Arn = java.lang.String

type Boolean = scala.Boolean

type ClientToken = java.lang.String

type CommentChar = java.lang.String

type CompleteReadSetUploadPartList = js.Array[CompleteReadSetUploadPartListItem]

type CompleteReadSetUploadPartListItemPartNumberInteger = Double

type CompletionTime = js.Date

type CreateAnnotationStoreRequestNameString = java.lang.String

type CreateRunGroupRequestMaxCpusInteger = Double

type CreateRunGroupRequestMaxDurationInteger = Double

type CreateRunGroupRequestMaxGpusInteger = Double

type CreateRunGroupRequestMaxRunsInteger = Double

type CreateVariantStoreRequestNameString = java.lang.String

type CreateWorkflowRequestStorageCapacityInteger = Double

type CreationTime = js.Date

type Encoding = java.lang.String

type EncryptionType = KMS | java.lang.String

type EscapeChar = java.lang.String

type EscapeQuotes = scala.Boolean

type ExportJobId = java.lang.String

type ExportReadSetDetailList = js.Array[ExportReadSetDetail]

type ExportReadSetJobDetailList = js.Array[ExportReadSetJobDetail]

type FileInformationContentLengthLong = Double

type FileInformationPartSizeLong = Double

type FileInformationTotalPartsInteger = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FASTQ
  - typings.awsSdk.awsSdkStrings.BAM
  - typings.awsSdk.awsSdkStrings.CRAM
  - java.lang.String
*/
type FileType = _FileType | java.lang.String

type FormatToHeader = StringDictionary[FormatToHeaderValueString]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CHR
  - typings.awsSdk.awsSdkStrings.START
  - typings.awsSdk.awsSdkStrings.END
  - typings.awsSdk.awsSdkStrings.REF
  - typings.awsSdk.awsSdkStrings.ALT
  - typings.awsSdk.awsSdkStrings.POS
  - java.lang.String
*/
type FormatToHeaderKey = _FormatToHeaderKey | java.lang.String

type FormatToHeaderValueString = java.lang.String

type GeneratedFrom = java.lang.String

type GetReadSetRequestPartNumberInteger = Double

type GetReferenceRequestPartNumberInteger = Double

type GetRunGroupResponseMaxCpusInteger = Double

type GetRunGroupResponseMaxDurationInteger = Double

type GetRunGroupResponseMaxGpusInteger = Double

type GetRunGroupResponseMaxRunsInteger = Double

type GetRunResponsePriorityInteger = Double

type GetRunResponseStorageCapacityInteger = Double

type GetRunTaskResponseCpusInteger = Double

type GetRunTaskResponseGpusInteger = Double

type GetRunTaskResponseMemoryInteger = Double

type GetWorkflowResponseStorageCapacityInteger = Double

type Header = scala.Boolean

type ImportJobId = java.lang.String

type ImportReadSetJobList = js.Array[ImportReadSetJobItem]

type ImportReadSetSourceList = js.Array[ImportReadSetSourceItem]

type ImportReferenceJobList = js.Array[ImportReferenceJobItem]

type ImportReferenceSourceList = js.Array[ImportReferenceSourceItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUBMITTED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.COMPLETED_WITH_FAILURES
  - java.lang.String
*/
type JobStatus = _JobStatus | java.lang.String

type JobStatusMessage = java.lang.String

type JobStatusMsg = java.lang.String

type LineSep = java.lang.String

type ListAnnotationImportJobsRequestIdsList = js.Array[ResourceIdentifier]

type ListAnnotationImportJobsRequestMaxResultsInteger = Double

type ListAnnotationImportJobsRequestNextTokenString = java.lang.String

type ListAnnotationStoresRequestIdsList = js.Array[ResourceIdentifier]

type ListAnnotationStoresRequestMaxResultsInteger = Double

type ListAnnotationStoresRequestNextTokenString = java.lang.String

type ListMultipartReadSetUploadsRequestMaxResultsInteger = Double

type ListReadSetActivationJobsRequestMaxResultsInteger = Double

type ListReadSetExportJobsRequestMaxResultsInteger = Double

type ListReadSetImportJobsRequestMaxResultsInteger = Double

type ListReadSetUploadPartsRequestMaxResultsInteger = Double

type ListReadSetsRequestMaxResultsInteger = Double

type ListReferenceImportJobsRequestMaxResultsInteger = Double

type ListReferenceStoresRequestMaxResultsInteger = Double

type ListReferencesRequestMaxResultsInteger = Double

type ListRunGroupsRequestMaxResultsInteger = Double

type ListRunTasksRequestMaxResultsInteger = Double

type ListRunsRequestMaxResultsInteger = Double

type ListSequenceStoresRequestMaxResultsInteger = Double

type ListVariantImportJobsRequestIdsList = js.Array[ResourceIdentifier]

type ListVariantImportJobsRequestMaxResultsInteger = Double

type ListVariantImportJobsRequestNextTokenString = java.lang.String

type ListVariantStoresRequestIdsList = js.Array[ResourceIdentifier]

type ListVariantStoresRequestMaxResultsInteger = Double

type ListVariantStoresRequestNextTokenString = java.lang.String

type ListWorkflowsRequestMaxResultsInteger = Double

type Long = Double

type Md5 = java.lang.String

type MultipartReadSetUploadList = js.Array[MultipartReadSetUploadListItem]

type NextToken = java.lang.String

type PrimitiveBoolean = scala.Boolean

type Quote = java.lang.String

type QuoteAll = scala.Boolean

type Range = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_STARTED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.FINISHED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ReadSetActivationJobItemStatus = _ReadSetActivationJobItemStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUBMITTED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CANCELLING
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.COMPLETED_WITH_FAILURES
  - java.lang.String
*/
type ReadSetActivationJobStatus = _ReadSetActivationJobStatus | java.lang.String

type ReadSetArn = java.lang.String

type ReadSetBatchErrorList = js.Array[ReadSetBatchError]

type ReadSetDescription = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_STARTED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.FINISHED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ReadSetExportJobItemStatus = _ReadSetExportJobItemStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUBMITTED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CANCELLING
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.COMPLETED_WITH_FAILURES
  - java.lang.String
*/
type ReadSetExportJobStatus = _ReadSetExportJobStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SOURCE1
  - typings.awsSdk.awsSdkStrings.SOURCE2
  - typings.awsSdk.awsSdkStrings.INDEX
  - java.lang.String
*/
type ReadSetFile = _ReadSetFile | java.lang.String

type ReadSetId = java.lang.String

type ReadSetIdList = js.Array[ReadSetId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_STARTED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.FINISHED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ReadSetImportJobItemStatus = _ReadSetImportJobItemStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUBMITTED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CANCELLING
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.COMPLETED_WITH_FAILURES
  - java.lang.String
*/
type ReadSetImportJobStatus = _ReadSetImportJobStatus | java.lang.String

type ReadSetList = js.Array[ReadSetListItem]

type ReadSetName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SOURCE1
  - typings.awsSdk.awsSdkStrings.SOURCE2
  - java.lang.String
*/
type ReadSetPartSource = _ReadSetPartSource | java.lang.String

type ReadSetPartStreamingBlob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String | Readable

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ARCHIVED
  - typings.awsSdk.awsSdkStrings.ACTIVATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.PROCESSING_UPLOAD
  - typings.awsSdk.awsSdkStrings.UPLOAD_FAILED
  - java.lang.String
*/
type ReadSetStatus = _ReadSetStatus | java.lang.String

type ReadSetStatusMessage = java.lang.String

type ReadSetStreamingBlob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String | Readable

type ReadSetUploadPartList = js.Array[ReadSetUploadPartListItem]

type ReadSetUploadPartListItemPartNumberInteger = Double

type ReadSetUploadPartListItemPartSizeLong = Double

type ReferenceArn = java.lang.String

type ReferenceDescription = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SOURCE
  - typings.awsSdk.awsSdkStrings.INDEX
  - java.lang.String
*/
type ReferenceFile = _ReferenceFile | java.lang.String

type ReferenceId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_STARTED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.FINISHED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ReferenceImportJobItemStatus = _ReferenceImportJobItemStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUBMITTED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CANCELLING
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.COMPLETED_WITH_FAILURES
  - java.lang.String
*/
type ReferenceImportJobStatus = _ReferenceImportJobStatus | java.lang.String

type ReferenceList = js.Array[ReferenceListItem]

type ReferenceName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type ReferenceStatus = _ReferenceStatus | java.lang.String

type ReferenceStoreArn = java.lang.String

type ReferenceStoreDescription = java.lang.String

type ReferenceStoreDetailList = js.Array[ReferenceStoreDetail]

type ReferenceStoreId = java.lang.String

type ReferenceStoreName = java.lang.String

type ReferenceStreamingBlob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String | Readable

type ResourceId = java.lang.String

type ResourceIdentifier = java.lang.String

type RoleArn = java.lang.String

type RunArn = java.lang.String

type RunExport = DEFINITION | java.lang.String

type RunExportList = js.Array[RunExport]

type RunGroupArn = java.lang.String

type RunGroupId = java.lang.String

type RunGroupList = js.Array[RunGroupListItem]

type RunGroupListItemMaxCpusInteger = Double

type RunGroupListItemMaxDurationInteger = Double

type RunGroupListItemMaxGpusInteger = Double

type RunGroupListItemMaxRunsInteger = Double

type RunGroupListToken = java.lang.String

type RunGroupName = java.lang.String

type RunGroupRequestId = java.lang.String

type RunGroupTimestamp = js.Date

type RunId = java.lang.String

type RunLeftNormalization = scala.Boolean

type RunList = js.Array[RunListItem]

type RunListItemPriorityInteger = Double

type RunListItemStorageCapacityInteger = Double

type RunListToken = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OFF
  - typings.awsSdk.awsSdkStrings.FATAL
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type RunLogLevel = _RunLogLevel | java.lang.String

type RunName = java.lang.String

type RunOutputUri = java.lang.String

type RunRequestId = java.lang.String

type RunResourceDigest = java.lang.String

type RunResourceDigestKey = java.lang.String

type RunResourceDigests = StringDictionary[RunResourceDigest]

type RunRoleArn = java.lang.String

type RunStartedBy = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.STARTING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type RunStatus = _RunStatus | java.lang.String

type RunStatusMessage = java.lang.String

type RunTimestamp = js.Date

type S3Destination = java.lang.String

type S3Uri = java.lang.String

type SampleId = java.lang.String

type SchemaItem = StringDictionary[SchemaValueType]

type SchemaItemKeyString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LONG
  - typings.awsSdk.awsSdkStrings.INT
  - typings.awsSdk.awsSdkStrings.STRING
  - typings.awsSdk.awsSdkStrings.FLOAT
  - typings.awsSdk.awsSdkStrings.DOUBLE
  - typings.awsSdk.awsSdkStrings.BOOLEAN
  - java.lang.String
*/
type SchemaValueType = _SchemaValueType | java.lang.String

type Separator = java.lang.String

type SequenceStoreArn = java.lang.String

type SequenceStoreDescription = java.lang.String

type SequenceStoreDetailList = js.Array[SequenceStoreDetail]

type SequenceStoreId = java.lang.String

type SequenceStoreName = java.lang.String

type SseConfigKeyArnString = java.lang.String

type StartReadSetActivationJobRequestSourcesList = js.Array[StartReadSetActivationJobSourceItem]

type StartReadSetExportJobRequestSourcesList = js.Array[ExportReadSet]

type StartReadSetImportJobRequestSourcesList = js.Array[StartReadSetImportJobSourceItem]

type StartReferenceImportJobRequestSourcesList = js.Array[StartReferenceImportJobSourceItem]

type StartRunRequestPriorityInteger = Double

type StartRunRequestStorageCapacityInteger = Double

type StatusMessage = java.lang.String

type StoreDescription = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GFF
  - typings.awsSdk.awsSdkStrings.TSV
  - typings.awsSdk.awsSdkStrings.VCF
  - java.lang.String
*/
type StoreFormat = _StoreFormat | java.lang.String

type StoreName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type StoreStatus = _StoreStatus | java.lang.String

type String = java.lang.String

type SubjectId = java.lang.String

type SyntheticTimestampDateTime = js.Date

type TagArn = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagResourceRequestTagsMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type TaskId = java.lang.String

type TaskList = js.Array[TaskListItem]

type TaskListItemCpusInteger = Double

type TaskListItemGpusInteger = Double

type TaskListItemMemoryInteger = Double

type TaskListToken = java.lang.String

type TaskLogStream = java.lang.String

type TaskName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.STARTING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type TaskStatus = _TaskStatus | java.lang.String

type TaskStatusMessage = java.lang.String

type TaskTimestamp = js.Date

type TsvStoreOptionsSchemaList = js.Array[SchemaItem]

type UpdateRunGroupRequestMaxCpusInteger = Double

type UpdateRunGroupRequestMaxDurationInteger = Double

type UpdateRunGroupRequestMaxGpusInteger = Double

type UpdateRunGroupRequestMaxRunsInteger = Double

type UpdateTime = js.Date

type UploadId = java.lang.String

type UploadReadSetPartRequestPartNumberInteger = Double

type VariantImportItemDetails = js.Array[VariantImportItemDetail]

type VariantImportItemSources = js.Array[VariantImportItemSource]

type VariantImportJobItems = js.Array[VariantImportJobItem]

type VariantStoreItems = js.Array[VariantStoreItem]

type WorkflowArn = java.lang.String

type WorkflowDefinition = java.lang.String

type WorkflowDescription = java.lang.String

type WorkflowDigest = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WDL
  - typings.awsSdk.awsSdkStrings.NEXTFLOW
  - java.lang.String
*/
type WorkflowEngine = _WorkflowEngine | java.lang.String

type WorkflowExport = DEFINITION | java.lang.String

type WorkflowExportList = js.Array[WorkflowExport]

type WorkflowId = java.lang.String

type WorkflowList = js.Array[WorkflowListItem]

type WorkflowListToken = java.lang.String

type WorkflowMain = java.lang.String

type WorkflowMetadata = StringDictionary[WorkflowMetadataValue]

type WorkflowMetadataKey = java.lang.String

type WorkflowMetadataValue = java.lang.String

type WorkflowName = java.lang.String

type WorkflowParameterDescription = java.lang.String

type WorkflowParameterName = java.lang.String

type WorkflowParameterTemplate = StringDictionary[WorkflowParameter]

type WorkflowRequestId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type WorkflowStatus = _WorkflowStatus | java.lang.String

type WorkflowStatusMessage = java.lang.String

type WorkflowTimestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PRIVATE
  - typings.awsSdk.awsSdkStrings.READY2RUN
  - java.lang.String
*/
type WorkflowType = _WorkflowType | java.lang.String

type _Blob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2022-11-28`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
