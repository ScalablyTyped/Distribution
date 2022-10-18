package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.APPFLOW_INTEGRATION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AttributeSourceIdMap = StringDictionary[uuid]

type Attributes = StringDictionary[string1To255]

type Batches = js.Array[Batch]

type BucketName = String

type BucketPrefix = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RECENCY
  - typings.awsSdk.awsSdkStrings.SOURCE
  - java.lang.String
*/
type ConflictResolvingModel = _ConflictResolvingModel | String

type ConnectorProfileName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Incremental_
  - typings.awsSdk.awsSdkStrings.Complete_
  - java.lang.String
*/
type DataPullMode = _DataPullMode | String

type Date = js.Date

type DatetimeTypeFieldName = String

type DestinationField = String

type DomainList = js.Array[ListDomainItem]

type Double = scala.Double

type Double0To1 = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STRING
  - typings.awsSdk.awsSdkStrings.NUMBER
  - typings.awsSdk.awsSdkStrings.PHONE_NUMBER
  - typings.awsSdk.awsSdkStrings.EMAIL_ADDRESS
  - typings.awsSdk.awsSdkStrings.NAME
  - java.lang.String
*/
type FieldContentType = _FieldContentType | String

type FieldMap = StringDictionary[ObjectTypeField]

type FieldNameList = js.Array[name]

type FlowDescription = String

type FlowName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MALE
  - typings.awsSdk.awsSdkStrings.FEMALE
  - typings.awsSdk.awsSdkStrings.UNSPECIFIED
  - java.lang.String
*/
type Gender = _Gender | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.PREPROCESSING
  - typings.awsSdk.awsSdkStrings.FIND_MATCHING
  - typings.awsSdk.awsSdkStrings.MERGING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.PARTIAL_SUCCESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type IdentityResolutionJobStatus = _IdentityResolutionJobStatus | String

type IdentityResolutionJobsList = js.Array[IdentityResolutionJob]

type IntegrationList = js.Array[ListIntegrationItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUNDAY
  - typings.awsSdk.awsSdkStrings.MONDAY
  - typings.awsSdk.awsSdkStrings.TUESDAY
  - typings.awsSdk.awsSdkStrings.WEDNESDAY
  - typings.awsSdk.awsSdkStrings.THURSDAY
  - typings.awsSdk.awsSdkStrings.FRIDAY
  - typings.awsSdk.awsSdkStrings.SATURDAY
  - java.lang.String
*/
type JobScheduleDayOfTheWeek = _JobScheduleDayOfTheWeek | String

type JobScheduleTime = String

type KeyMap = StringDictionary[ObjectTypeKeyList]

type KmsArn = String

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
type MarketoConnectorOperator = _MarketoConnectorOperator | String

type MatchesList = js.Array[MatchItem]

type MatchingAttributes = js.Array[string1To255]

type MatchingAttributesList = js.Array[MatchingAttributes]

type Object = String

type ObjectTypeKeyList = js.Array[ObjectTypeKey]

type ObjectTypeNames = StringDictionary[typeName]

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
type OperatorPropertiesKeys = _OperatorPropertiesKeys | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INDIVIDUAL
  - typings.awsSdk.awsSdkStrings.BUSINESS
  - typings.awsSdk.awsSdkStrings.OTHER
  - java.lang.String
*/
type PartyType = _PartyType | String

type ProfileIdList = js.Array[uuid]

type ProfileIdToBeMergedList = js.Array[uuid]

type ProfileList = js.Array[Profile]

type ProfileObjectList = js.Array[ListProfileObjectsItem]

type ProfileObjectTypeList = js.Array[ListProfileObjectTypeItem]

type ProfileObjectTypeTemplateList = js.Array[ListProfileObjectTypeTemplateItem]

type Property = String

type RoleArn = String

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
type S3ConnectorOperator = _S3ConnectorOperator | String

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
type SalesforceConnectorOperator = _SalesforceConnectorOperator | String

type ScheduleExpression = String

type ScheduleOffset = scala.Double

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
type ServiceNowConnectorOperator = _ServiceNowConnectorOperator | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Salesforce_
  - typings.awsSdk.awsSdkStrings.Marketo
  - typings.awsSdk.awsSdkStrings.Zendesk_
  - typings.awsSdk.awsSdkStrings.Servicenow_
  - typings.awsSdk.awsSdkStrings.S3
  - java.lang.String
*/
type SourceConnectorType = _SourceConnectorType | String

type SourceFields = js.Array[stringTo2048]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROFILE
  - typings.awsSdk.awsSdkStrings.ASSET
  - typings.awsSdk.awsSdkStrings.CASE
  - typings.awsSdk.awsSdkStrings.UNIQUE
  - typings.awsSdk.awsSdkStrings.SECONDARY
  - typings.awsSdk.awsSdkStrings.LOOKUP_ONLY
  - typings.awsSdk.awsSdkStrings.NEW_ONLY
  - typings.awsSdk.awsSdkStrings.ORDER
  - java.lang.String
*/
type StandardIdentifier = _StandardIdentifier | String

type StandardIdentifierList = js.Array[StandardIdentifier]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_STARTED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETE
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.SPLIT
  - typings.awsSdk.awsSdkStrings.RETRY
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
type Status = _Status | String

type TagArn = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = String

type TaskPropertiesMap = StringDictionary[Property]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Arithmetic
  - typings.awsSdk.awsSdkStrings.Filter_
  - typings.awsSdk.awsSdkStrings.Map_
  - typings.awsSdk.awsSdkStrings.Mask_
  - typings.awsSdk.awsSdkStrings.Merge_
  - typings.awsSdk.awsSdkStrings.Truncate
  - typings.awsSdk.awsSdkStrings.Validate
  - java.lang.String
*/
type TaskType = _TaskType | String

type Tasks = js.Array[Task]

type Timezone = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Scheduled_
  - typings.awsSdk.awsSdkStrings.Event_
  - typings.awsSdk.awsSdkStrings.OnDemand
  - java.lang.String
*/
type TriggerType = _TriggerType | String

type UpdateAttributes = StringDictionary[string0To255]

type WorkflowList = js.Array[ListWorkflowsItem]

type WorkflowStepsList = js.Array[WorkflowStepItem]

type WorkflowType = APPFLOW_INTEGRATION | String

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
type ZendeskConnectorOperator = _ZendeskConnectorOperator | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-08-15`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type encryptionKey = String

type expirationDaysInteger = scala.Double

type long = scala.Double

type matchesNumber = scala.Double

type maxSize100 = scala.Double

type message = String

type name = String

type optionalBoolean = Boolean

type requestValueList = js.Array[string1To255]

type s3BucketName = String

type s3KeyName = String

type s3KeyNameCustomerOutputConfig = String

type sqsQueueUrl = String

type string0To1000 = String

type string0To255 = String

type string1To1000 = String

type string1To255 = String

type stringTo2048 = String

type stringifiedJson = String

type text = String

type timestamp = js.Date

type token = String

type typeName = String

type uuid = String
