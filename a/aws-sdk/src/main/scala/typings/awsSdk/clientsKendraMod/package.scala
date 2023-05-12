package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.HOME
import typings.awsSdk.awsSdkStrings.QUERY_LANGUAGE_INVALID_SYNTAX
import typings.awsSdk.awsSdkStrings.TEXT_WITH_HIGHLIGHTS_VALUE
import typings.awsSdk.awsSdkStrings.WINDOWS
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessControlConfigurationId = java.lang.String

type AccessControlConfigurationName = java.lang.String

type AccessControlConfigurationSummaryList = js.Array[AccessControlConfigurationSummary]

type AdditionalResultAttributeList = js.Array[AdditionalResultAttribute]

type AdditionalResultAttributeValueType = TEXT_WITH_HIGHLIGHTS_VALUE | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.wiki
  - typings.awsSdk.awsSdkStrings.blog
  - typings.awsSdk.awsSdkStrings.documentLibrary
  - java.lang.String
*/
type AlfrescoEntity = _AlfrescoEntity | java.lang.String

type AmazonResourceName = java.lang.String

type AssociateEntitiesToExperienceFailedEntityList = js.Array[FailedEntity]

type AssociateEntityList = js.Array[EntityConfiguration]

type AttributeFilterList = js.Array[AttributeFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type AttributeSuggestionsMode = _AttributeSuggestionsMode | java.lang.String

type BasicAuthenticationConfigurationList = js.Array[BasicAuthenticationConfiguration]

type BatchDeleteDocumentResponseFailedDocuments = js.Array[BatchDeleteDocumentResponseFailedDocument]

type BatchDeleteFeaturedResultsSetErrors = js.Array[BatchDeleteFeaturedResultsSetError]

type BatchGetDocumentStatusResponseErrors = js.Array[BatchGetDocumentStatusResponseError]

type BatchPutDocumentResponseFailedDocuments = js.Array[BatchPutDocumentResponseFailedDocument]

type Boolean = scala.Boolean

type ChangeDetectingColumns = js.Array[ColumnName]

type ClaimRegex = java.lang.String

type ClickFeedbackList = js.Array[ClickFeedback]

type ClientTokenName = java.lang.String

type ColumnName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GreaterThan
  - typings.awsSdk.awsSdkStrings.GreaterThanOrEquals
  - typings.awsSdk.awsSdkStrings.LessThan
  - typings.awsSdk.awsSdkStrings.LessThanOrEquals
  - typings.awsSdk.awsSdkStrings.Equals_
  - typings.awsSdk.awsSdkStrings.NotEquals
  - typings.awsSdk.awsSdkStrings.Contains_
  - typings.awsSdk.awsSdkStrings.NotContains
  - typings.awsSdk.awsSdkStrings.Exists
  - typings.awsSdk.awsSdkStrings.NotExists
  - typings.awsSdk.awsSdkStrings.BeginsWith
  - java.lang.String
*/
type ConditionOperator = _ConditionOperator | java.lang.String

type ConfluenceAttachmentFieldMappingsList = js.Array[ConfluenceAttachmentToIndexFieldMapping]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AUTHOR
  - typings.awsSdk.awsSdkStrings.CONTENT_TYPE
  - typings.awsSdk.awsSdkStrings.CREATED_DATE
  - typings.awsSdk.awsSdkStrings.DISPLAY_URL
  - typings.awsSdk.awsSdkStrings.FILE_SIZE
  - typings.awsSdk.awsSdkStrings.ITEM_TYPE
  - typings.awsSdk.awsSdkStrings.PARENT_ID
  - typings.awsSdk.awsSdkStrings.SPACE_KEY
  - typings.awsSdk.awsSdkStrings.SPACE_NAME
  - typings.awsSdk.awsSdkStrings.URL
  - typings.awsSdk.awsSdkStrings.VERSION
  - java.lang.String
*/
type ConfluenceAttachmentFieldName = _ConfluenceAttachmentFieldName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HTTP_BASIC
  - typings.awsSdk.awsSdkStrings.PAT
  - java.lang.String
*/
type ConfluenceAuthenticationType = _ConfluenceAuthenticationType | java.lang.String

type ConfluenceBlogFieldMappingsList = js.Array[ConfluenceBlogToIndexFieldMapping]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AUTHOR
  - typings.awsSdk.awsSdkStrings.DISPLAY_URL
  - typings.awsSdk.awsSdkStrings.ITEM_TYPE
  - typings.awsSdk.awsSdkStrings.LABELS
  - typings.awsSdk.awsSdkStrings.PUBLISH_DATE
  - typings.awsSdk.awsSdkStrings.SPACE_KEY
  - typings.awsSdk.awsSdkStrings.SPACE_NAME
  - typings.awsSdk.awsSdkStrings.URL
  - typings.awsSdk.awsSdkStrings.VERSION
  - java.lang.String
*/
type ConfluenceBlogFieldName = _ConfluenceBlogFieldName | java.lang.String

type ConfluencePageFieldMappingsList = js.Array[ConfluencePageToIndexFieldMapping]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AUTHOR
  - typings.awsSdk.awsSdkStrings.CONTENT_STATUS
  - typings.awsSdk.awsSdkStrings.CREATED_DATE
  - typings.awsSdk.awsSdkStrings.DISPLAY_URL
  - typings.awsSdk.awsSdkStrings.ITEM_TYPE
  - typings.awsSdk.awsSdkStrings.LABELS
  - typings.awsSdk.awsSdkStrings.MODIFIED_DATE
  - typings.awsSdk.awsSdkStrings.PARENT_ID
  - typings.awsSdk.awsSdkStrings.SPACE_KEY
  - typings.awsSdk.awsSdkStrings.SPACE_NAME
  - typings.awsSdk.awsSdkStrings.URL
  - typings.awsSdk.awsSdkStrings.VERSION
  - java.lang.String
*/
type ConfluencePageFieldName = _ConfluencePageFieldName | java.lang.String

type ConfluenceSpaceFieldMappingsList = js.Array[ConfluenceSpaceToIndexFieldMapping]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DISPLAY_URL
  - typings.awsSdk.awsSdkStrings.ITEM_TYPE
  - typings.awsSdk.awsSdkStrings.SPACE_KEY
  - typings.awsSdk.awsSdkStrings.URL
  - java.lang.String
*/
type ConfluenceSpaceFieldName = _ConfluenceSpaceFieldName | java.lang.String

type ConfluenceSpaceIdentifier = java.lang.String

type ConfluenceSpaceList = js.Array[ConfluenceSpaceIdentifier]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CLOUD
  - typings.awsSdk.awsSdkStrings.SERVER
  - java.lang.String
*/
type ConfluenceVersion = _ConfluenceVersion | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PDF
  - typings.awsSdk.awsSdkStrings.HTML
  - typings.awsSdk.awsSdkStrings.MS_WORD
  - typings.awsSdk.awsSdkStrings.PLAIN_TEXT
  - typings.awsSdk.awsSdkStrings.PPT
  - typings.awsSdk.awsSdkStrings.RTF
  - typings.awsSdk.awsSdkStrings.XML
  - typings.awsSdk.awsSdkStrings.XSLT
  - typings.awsSdk.awsSdkStrings.MS_EXCEL
  - typings.awsSdk.awsSdkStrings.CSV
  - typings.awsSdk.awsSdkStrings.JSON
  - typings.awsSdk.awsSdkStrings.MD
  - java.lang.String
*/
type ContentType = _ContentType | java.lang.String

type CorrectionList = js.Array[Correction]

type CrawlDepth = Double

type DataSourceDateFieldFormat = java.lang.String

type DataSourceFieldName = java.lang.String

type DataSourceGroups = js.Array[DataSourceGroup]

type DataSourceId = java.lang.String

type DataSourceIdList = js.Array[DataSourceId]

type DataSourceInclusionsExclusionsStrings = js.Array[DataSourceInclusionsExclusionsStringsMember]

type DataSourceInclusionsExclusionsStringsMember = java.lang.String

type DataSourceName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - java.lang.String
*/
type DataSourceStatus = _DataSourceStatus | java.lang.String

type DataSourceSummaryList = js.Array[DataSourceSummary]

type DataSourceSyncJobHistoryList = js.Array[DataSourceSyncJob]

type DataSourceSyncJobId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.SYNCING
  - typings.awsSdk.awsSdkStrings.INCOMPLETE
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.ABORTED
  - typings.awsSdk.awsSdkStrings.SYNCING_INDEXING
  - java.lang.String
*/
type DataSourceSyncJobStatus = _DataSourceSyncJobStatus | java.lang.String

type DataSourceToIndexFieldMappingList = js.Array[DataSourceToIndexFieldMapping]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.S3
  - typings.awsSdk.awsSdkStrings.SHAREPOINT
  - typings.awsSdk.awsSdkStrings.DATABASE
  - typings.awsSdk.awsSdkStrings.SALESFORCE
  - typings.awsSdk.awsSdkStrings.ONEDRIVE
  - typings.awsSdk.awsSdkStrings.SERVICENOW
  - typings.awsSdk.awsSdkStrings.CUSTOM
  - typings.awsSdk.awsSdkStrings.CONFLUENCE
  - typings.awsSdk.awsSdkStrings.GOOGLEDRIVE
  - typings.awsSdk.awsSdkStrings.WEBCRAWLER
  - typings.awsSdk.awsSdkStrings.WORKDOCS
  - typings.awsSdk.awsSdkStrings.FSX
  - typings.awsSdk.awsSdkStrings.SLACK
  - typings.awsSdk.awsSdkStrings.BOX
  - typings.awsSdk.awsSdkStrings.QUIP
  - typings.awsSdk.awsSdkStrings.JIRA
  - typings.awsSdk.awsSdkStrings.GITHUB
  - typings.awsSdk.awsSdkStrings.ALFRESCO
  - typings.awsSdk.awsSdkStrings.TEMPLATE
  - java.lang.String
*/
type DataSourceType = _DataSourceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RDS_AURORA_MYSQL
  - typings.awsSdk.awsSdkStrings.RDS_AURORA_POSTGRESQL
  - typings.awsSdk.awsSdkStrings.RDS_MYSQL
  - typings.awsSdk.awsSdkStrings.RDS_POSTGRESQL
  - java.lang.String
*/
type DatabaseEngineType = _DatabaseEngineType | java.lang.String

type DatabaseHost = java.lang.String

type DatabaseName = java.lang.String

type DatabasePort = Double

type Description = java.lang.String

type DisassociateEntityList = js.Array[EntityConfiguration]

type DocumentAttributeKey = java.lang.String

type DocumentAttributeKeyList = js.Array[DocumentAttributeKey]

type DocumentAttributeList = js.Array[DocumentAttribute]

type DocumentAttributeStringListValue = js.Array[String]

type DocumentAttributeStringValue = java.lang.String

type DocumentAttributeValueCountPairList = js.Array[DocumentAttributeValueCountPair]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STRING_VALUE
  - typings.awsSdk.awsSdkStrings.STRING_LIST_VALUE
  - typings.awsSdk.awsSdkStrings.LONG_VALUE
  - typings.awsSdk.awsSdkStrings.DATE_VALUE
  - java.lang.String
*/
type DocumentAttributeValueType = _DocumentAttributeValueType | java.lang.String

type DocumentId = java.lang.String

type DocumentIdList = js.Array[DocumentId]

type DocumentInfoList = js.Array[DocumentInfo]

type DocumentList = js.Array[Document]

type DocumentMetadataBoolean = scala.Boolean

type DocumentMetadataConfigurationList = js.Array[DocumentMetadataConfiguration]

type DocumentMetadataConfigurationName = java.lang.String

type DocumentRelevanceOverrideConfigurationList = js.Array[DocumentRelevanceConfiguration]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_FOUND
  - typings.awsSdk.awsSdkStrings.PROCESSING
  - typings.awsSdk.awsSdkStrings.INDEXED
  - typings.awsSdk.awsSdkStrings.UPDATED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
  - java.lang.String
*/
type DocumentStatus = _DocumentStatus | java.lang.String

type DocumentStatusList = js.Array[Status]

type Domain = java.lang.String

type Duration = java.lang.String

type Endpoint = java.lang.String

type EndpointType = HOME | java.lang.String

type EnterpriseId = java.lang.String

type EntityFilter = js.Array[AlfrescoEntity]

type EntityId = java.lang.String

type EntityIdsList = js.Array[EntityId]

type EntityPersonaConfigurationList = js.Array[EntityPersonaConfiguration]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USER
  - typings.awsSdk.awsSdkStrings.GROUP
  - java.lang.String
*/
type EntityType = _EntityType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.InternalError
  - typings.awsSdk.awsSdkStrings.InvalidRequest
  - java.lang.String
*/
type ErrorCode = _ErrorCode | java.lang.String

type ErrorMessage = java.lang.String

type ExcludeMimeTypesList = js.Array[MimeType]

type ExcludeSharedDrivesList = js.Array[SharedDriveId]

type ExcludeUserAccountsList = js.Array[UserAccount]

type ExperienceEndpoints = js.Array[ExperienceEndpoint]

type ExperienceEntitiesSummaryList = js.Array[ExperienceEntitiesSummary]

type ExperienceId = java.lang.String

type ExperienceName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ExperienceStatus = _ExperienceStatus | java.lang.String

type ExperiencesSummaryList = js.Array[ExperiencesSummary]

type FacetList = js.Array[Facet]

type FacetResultList = js.Array[FacetResult]

type FailedEntityList = js.Array[FailedEntity]

type FailureReason = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CSV
  - typings.awsSdk.awsSdkStrings.CSV_WITH_HEADER
  - typings.awsSdk.awsSdkStrings.JSON
  - java.lang.String
*/
type FaqFileFormat = _FaqFileFormat | java.lang.String

type FaqId = java.lang.String

type FaqIdsList = js.Array[FaqId]

type FaqName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type FaqStatus = _FaqStatus | java.lang.String

type FaqSummaryItems = js.Array[FaqSummary]

type FeaturedDocumentList = js.Array[FeaturedDocument]

type FeaturedDocumentMissingList = js.Array[FeaturedDocumentMissing]

type FeaturedDocumentWithMetadataList = js.Array[FeaturedDocumentWithMetadata]

type FeaturedResultsItemList = js.Array[FeaturedResultsItem]

type FeaturedResultsSetDescription = java.lang.String

type FeaturedResultsSetId = java.lang.String

type FeaturedResultsSetIdList = js.Array[FeaturedResultsSetId]

type FeaturedResultsSetName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type FeaturedResultsSetStatus = _FeaturedResultsSetStatus | java.lang.String

type FeaturedResultsSetSummaryItems = js.Array[FeaturedResultsSetSummary]

type FeedbackToken = java.lang.String

type FileSystemId = java.lang.String

type FolderId = java.lang.String

type FolderIdList = js.Array[FolderId]

type FsxFileSystemType = WINDOWS | java.lang.String

type GroupAttributeField = java.lang.String

type GroupId = java.lang.String

type GroupOrderingIdSummaries = js.Array[GroupOrderingIdSummary]

type Groups = js.Array[PrincipalName]

type HierarchicalPrincipalList = js.Array[HierarchicalPrincipal]

type HighlightList = js.Array[Highlight]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STANDARD
  - typings.awsSdk.awsSdkStrings.THESAURUS_SYNONYM
  - java.lang.String
*/
type HighlightType = _HighlightType | java.lang.String

type Host = java.lang.String

type IdentityAttributeName = java.lang.String

type Importance = Double

type IndexConfigurationSummaryList = js.Array[IndexConfigurationSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEVELOPER_EDITION
  - typings.awsSdk.awsSdkStrings.ENTERPRISE_EDITION
  - java.lang.String
*/
type IndexEdition = _IndexEdition | java.lang.String

type IndexFieldName = java.lang.String

type IndexId = java.lang.String

type IndexName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.SYSTEM_UPDATING
  - java.lang.String
*/
type IndexStatus = _IndexStatus | java.lang.String

type IndexedQuestionAnswersCount = Double

type IndexedTextBytes = Double

type IndexedTextDocumentsCount = Double

type InlineCustomDocumentEnrichmentConfigurationList = js.Array[InlineCustomDocumentEnrichmentConfiguration]

type Integer = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.THIS_MONTH
  - typings.awsSdk.awsSdkStrings.THIS_WEEK
  - typings.awsSdk.awsSdkStrings.ONE_WEEK_AGO
  - typings.awsSdk.awsSdkStrings.TWO_WEEKS_AGO
  - typings.awsSdk.awsSdkStrings.ONE_MONTH_AGO
  - typings.awsSdk.awsSdkStrings.TWO_MONTHS_AGO
  - java.lang.String
*/
type Interval = _Interval | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMMENTS
  - typings.awsSdk.awsSdkStrings.ATTACHMENTS
  - typings.awsSdk.awsSdkStrings.WORKLOGS
  - java.lang.String
*/
type IssueSubEntity = _IssueSubEntity | java.lang.String

type IssueSubEntityFilter = js.Array[IssueSubEntity]

type IssueType = js.Array[String]

type Issuer = java.lang.String

type JiraAccountUrl = java.lang.String

type JiraStatus = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.URL
  - typings.awsSdk.awsSdkStrings.SECRET_MANAGER
  - java.lang.String
*/
type KeyLocation = _KeyLocation | java.lang.String

type KmsKeyId = java.lang.String

type LambdaArn = java.lang.String

type LanguageCode = java.lang.String

type ListOfGroupSummaries = js.Array[GroupSummary]

type Long = Double

type LookBackPeriod = Double

type MaxContentSizePerPageInMegaBytes = Double

type MaxLinksPerPage = Double

type MaxResultsIntegerForListAccessControlConfigurationsRequest = Double

type MaxResultsIntegerForListDataSourceSyncJobsRequest = Double

type MaxResultsIntegerForListDataSourcesRequest = Double

type MaxResultsIntegerForListEntityPersonasRequest = Double

type MaxResultsIntegerForListExperiencesRequest = Double

type MaxResultsIntegerForListFaqsRequest = Double

type MaxResultsIntegerForListFeaturedResultsSetsRequest = Double

type MaxResultsIntegerForListIndicesRequest = Double

type MaxResultsIntegerForListPrincipalsRequest = Double

type MaxResultsIntegerForListQuerySuggestionsBlockLists = Double

type MaxResultsIntegerForListThesauriRequest = Double

type MaxUrlsPerMinuteCrawlRate = Double

type MemberGroups = js.Array[MemberGroup]

type MemberUsers = js.Array[MemberUser]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.QUERIES_BY_COUNT
  - typings.awsSdk.awsSdkStrings.QUERIES_BY_ZERO_CLICK_RATE
  - typings.awsSdk.awsSdkStrings.QUERIES_BY_ZERO_RESULT_RATE
  - typings.awsSdk.awsSdkStrings.DOCS_BY_CLICK_COUNT
  - typings.awsSdk.awsSdkStrings.AGG_QUERY_DOC_METRICS
  - typings.awsSdk.awsSdkStrings.TREND_QUERY_DOC_METRICS
  - java.lang.String
*/
type MetricType = _MetricType | java.lang.String

type MetricValue = java.lang.String

type MimeType = java.lang.String

type MinimumNumberOfQueryingUsers = Double

type MinimumQueryCount = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.LEARN_ONLY
  - java.lang.String
*/
type Mode = _Mode | java.lang.String

type NameType = java.lang.String

type NextToken = java.lang.String

type ObjectBoolean = scala.Boolean

type OneDriveUser = java.lang.String

type OneDriveUserList = js.Array[OneDriveUser]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASCENDING
  - typings.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type Order = _Order | java.lang.String

type OrganizationId = java.lang.String

type OrganizationName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OWNER
  - typings.awsSdk.awsSdkStrings.VIEWER
  - java.lang.String
*/
type Persona = _Persona | java.lang.String

type PersonasSummaryList = js.Array[PersonasSummary]

type Port = Double

type PrincipalList = js.Array[Principal]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.PROCESSING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type PrincipalMappingStatus = _PrincipalMappingStatus | java.lang.String

type PrincipalName = java.lang.String

type PrincipalOrderingId = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USER
  - typings.awsSdk.awsSdkStrings.GROUP
  - java.lang.String
*/
type PrincipalType = _PrincipalType | java.lang.String

type PrivateChannelFilter = js.Array[String]

type Project = js.Array[String]

type PublicChannelFilter = js.Array[String]

type QueryCapacityUnit = Double

type QueryId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DOUBLE_QUOTES
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type QueryIdentifiersEnclosingOption = _QueryIdentifiersEnclosingOption | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TABLE
  - typings.awsSdk.awsSdkStrings.TEXT
  - java.lang.String
*/
type QueryResultFormat = _QueryResultFormat | java.lang.String

type QueryResultItemList = js.Array[QueryResultItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DOCUMENT
  - typings.awsSdk.awsSdkStrings.QUESTION_ANSWER
  - typings.awsSdk.awsSdkStrings.ANSWER
  - java.lang.String
*/
type QueryResultType = _QueryResultType | java.lang.String

type QuerySuggestionsBlockListId = java.lang.String

type QuerySuggestionsBlockListName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.ACTIVE_BUT_UPDATE_FAILED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type QuerySuggestionsBlockListStatus = _QuerySuggestionsBlockListStatus | java.lang.String

type QuerySuggestionsBlockListSummaryItems = js.Array[QuerySuggestionsBlockListSummary]

type QuerySuggestionsId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type QuerySuggestionsStatus = _QuerySuggestionsStatus | java.lang.String

type QueryText = java.lang.String

type QueryTextList = js.Array[QueryText]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALLOW
  - typings.awsSdk.awsSdkStrings.DENY
  - java.lang.String
*/
type ReadAccessType = _ReadAccessType | java.lang.String

type RelevanceFeedbackList = js.Array[RelevanceFeedback]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RELEVANT
  - typings.awsSdk.awsSdkStrings.NOT_RELEVANT
  - java.lang.String
*/
type RelevanceType = _RelevanceType | java.lang.String

type RepositoryName = java.lang.String

type RepositoryNames = js.Array[RepositoryName]

type ResultId = java.lang.String

type RoleArn = java.lang.String

type S3BucketName = java.lang.String

type S3ObjectKey = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE_USER
  - typings.awsSdk.awsSdkStrings.STANDARD_USER
  - java.lang.String
*/
type SalesforceChatterFeedIncludeFilterType = _SalesforceChatterFeedIncludeFilterType | java.lang.String

type SalesforceChatterFeedIncludeFilterTypes = js.Array[SalesforceChatterFeedIncludeFilterType]

type SalesforceCustomKnowledgeArticleTypeConfigurationList = js.Array[SalesforceCustomKnowledgeArticleTypeConfiguration]

type SalesforceCustomKnowledgeArticleTypeName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DRAFT
  - typings.awsSdk.awsSdkStrings.PUBLISHED
  - typings.awsSdk.awsSdkStrings.ARCHIVED
  - java.lang.String
*/
type SalesforceKnowledgeArticleState = _SalesforceKnowledgeArticleState | java.lang.String

type SalesforceKnowledgeArticleStateList = js.Array[SalesforceKnowledgeArticleState]

type SalesforceStandardObjectConfigurationList = js.Array[SalesforceStandardObjectConfiguration]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACCOUNT
  - typings.awsSdk.awsSdkStrings.CAMPAIGN
  - typings.awsSdk.awsSdkStrings.CASE
  - typings.awsSdk.awsSdkStrings.CONTACT
  - typings.awsSdk.awsSdkStrings.CONTRACT
  - typings.awsSdk.awsSdkStrings.DOCUMENT
  - typings.awsSdk.awsSdkStrings.GROUP
  - typings.awsSdk.awsSdkStrings.IDEA
  - typings.awsSdk.awsSdkStrings.LEAD
  - typings.awsSdk.awsSdkStrings.OPPORTUNITY
  - typings.awsSdk.awsSdkStrings.PARTNER
  - typings.awsSdk.awsSdkStrings.PRICEBOOK
  - typings.awsSdk.awsSdkStrings.PRODUCT
  - typings.awsSdk.awsSdkStrings.PROFILE
  - typings.awsSdk.awsSdkStrings.SOLUTION
  - typings.awsSdk.awsSdkStrings.TASK
  - typings.awsSdk.awsSdkStrings.USER
  - java.lang.String
*/
type SalesforceStandardObjectName = _SalesforceStandardObjectName | java.lang.String

type ScanSchedule = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VERY_HIGH
  - typings.awsSdk.awsSdkStrings.HIGH
  - typings.awsSdk.awsSdkStrings.MEDIUM
  - typings.awsSdk.awsSdkStrings.LOW
  - typings.awsSdk.awsSdkStrings.NOT_AVAILABLE
  - java.lang.String
*/
type ScoreConfidence = _ScoreConfidence | java.lang.String

type SecretArn = java.lang.String

type SecurityGroupIdList = js.Array[VpcSecurityGroupId]

type SeedUrl = java.lang.String

type SeedUrlList = js.Array[SeedUrl]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HTTP_BASIC
  - typings.awsSdk.awsSdkStrings.OAUTH2
  - java.lang.String
*/
type ServiceNowAuthenticationType = _ServiceNowAuthenticationType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LONDON
  - typings.awsSdk.awsSdkStrings.OTHERS
  - java.lang.String
*/
type ServiceNowBuildVersionType = _ServiceNowBuildVersionType | java.lang.String

type ServiceNowHostUrl = java.lang.String

type ServiceNowKnowledgeArticleFilterQuery = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HTTP_BASIC
  - typings.awsSdk.awsSdkStrings.OAUTH2
  - java.lang.String
*/
type SharePointOnlineAuthenticationType = _SharePointOnlineAuthenticationType | java.lang.String

type SharePointUrlList = js.Array[Url]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SHAREPOINT_2013
  - typings.awsSdk.awsSdkStrings.SHAREPOINT_2016
  - typings.awsSdk.awsSdkStrings.SHAREPOINT_ONLINE
  - typings.awsSdk.awsSdkStrings.SHAREPOINT_2019
  - java.lang.String
*/
type SharePointVersion = _SharePointVersion | java.lang.String

type SharedDriveId = java.lang.String

type SinceCrawlDate = java.lang.String

type SiteId = java.lang.String

type SiteMap = java.lang.String

type SiteMapsList = js.Array[SiteMap]

type SiteUrl = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PUBLIC_CHANNEL
  - typings.awsSdk.awsSdkStrings.PRIVATE_CHANNEL
  - typings.awsSdk.awsSdkStrings.GROUP_MESSAGE
  - typings.awsSdk.awsSdkStrings.DIRECT_MESSAGE
  - java.lang.String
*/
type SlackEntity = _SlackEntity | java.lang.String

type SlackEntityList = js.Array[SlackEntity]

type SnapshotsDataHeaderFields = js.Array[String]

type SnapshotsDataRecord = js.Array[String]

type SnapshotsDataRecords = js.Array[SnapshotsDataRecord]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DESC
  - typings.awsSdk.awsSdkStrings.ASC
  - java.lang.String
*/
type SortOrder = _SortOrder | java.lang.String

type SourceDocuments = js.Array[SourceDocument]

type SpellCorrectedQueryList = js.Array[SpellCorrectedQuery]

type StorageCapacityUnit = Double

type String = java.lang.String

type StringList = js.Array[String]

type SubnetId = java.lang.String

type SubnetIdList = js.Array[SubnetId]

type SuggestableConfigList = js.Array[SuggestableConfig]

type SuggestedQueryText = java.lang.String

type SuggestionHighlightList = js.Array[SuggestionHighlight]

type SuggestionList = js.Array[Suggestion]

type SuggestionQueryText = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.QUERY
  - typings.awsSdk.awsSdkStrings.DOCUMENT_ATTRIBUTES
  - java.lang.String
*/
type SuggestionType = _SuggestionType | java.lang.String

type SuggestionTypes = js.Array[SuggestionType]

type TableCellList = js.Array[TableCell]

type TableName = java.lang.String

type TableRowList = js.Array[TableRow]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type TeamId = java.lang.String

type TenantDomain = java.lang.String

type ThesaurusId = java.lang.String

type ThesaurusName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.ACTIVE_BUT_UPDATE_FAILED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ThesaurusStatus = _ThesaurusStatus | java.lang.String

type ThesaurusSummaryItems = js.Array[ThesaurusSummary]

type Timestamp = js.Date

type Title = java.lang.String

type Token = java.lang.String

type TopDocumentAttributeValueCountPairsSize = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SAAS
  - typings.awsSdk.awsSdkStrings.ON_PREMISE
  - java.lang.String
*/
type Type = _Type | java.lang.String

type Url = java.lang.String

type UserAccount = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ATTRIBUTE_FILTER
  - typings.awsSdk.awsSdkStrings.USER_TOKEN
  - java.lang.String
*/
type UserContextPolicy = _UserContextPolicy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWS_SSO
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type UserGroupResolutionMode = _UserGroupResolutionMode | java.lang.String

type UserId = java.lang.String

type UserNameAttributeField = java.lang.String

type UserTokenConfigurationList = js.Array[UserTokenConfiguration]

type ValueImportanceMap = StringDictionary[Importance]

type ValueImportanceMapKey = java.lang.String

type VisitorId = java.lang.String

type VpcSecurityGroupId = java.lang.String

type WarningCode = QUERY_LANGUAGE_INVALID_SYNTAX | java.lang.String

type WarningList = js.Array[Warning]

type WarningMessage = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HOST_ONLY
  - typings.awsSdk.awsSdkStrings.SUBDOMAINS
  - typings.awsSdk.awsSdkStrings.EVERYTHING
  - java.lang.String
*/
type WebCrawlerMode = _WebCrawlerMode | java.lang.String

type _Blob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2019-02-03`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
