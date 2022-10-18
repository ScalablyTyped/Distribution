package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.CREATED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ApplicationConfigurationName = java.lang.String

type Boolean = scala.Boolean

type CreateMigrationWorkflowRequestApplicationConfigurationIdString = java.lang.String

type CreateMigrationWorkflowRequestDescriptionString = java.lang.String

type CreateMigrationWorkflowRequestNameString = java.lang.String

type CreateMigrationWorkflowRequestTemplateIdString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STRING
  - typings.awsSdk.awsSdkStrings.INTEGER
  - typings.awsSdk.awsSdkStrings.STRINGLIST
  - typings.awsSdk.awsSdkStrings.STRINGMAP
  - java.lang.String
*/
type DataType = _DataType | java.lang.String

type GetWorkflowStepResponseOutputsList = js.Array[WorkflowStepOutput]

type IPAddress = java.lang.String

type Integer = Double

type MaxResults = Double

type MigrationWorkflowDescription = java.lang.String

type MigrationWorkflowId = java.lang.String

type MigrationWorkflowName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.NOT_STARTED
  - typings.awsSdk.awsSdkStrings.CREATION_FAILED
  - typings.awsSdk.awsSdkStrings.STARTING
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.WORKFLOW_FAILED
  - typings.awsSdk.awsSdkStrings.PAUSED
  - typings.awsSdk.awsSdkStrings.PAUSING
  - typings.awsSdk.awsSdkStrings.PAUSING_FAILED
  - typings.awsSdk.awsSdkStrings.USER_ATTENTION_REQUIRED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETION_FAILED
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type MigrationWorkflowStatusEnum = _MigrationWorkflowStatusEnum | java.lang.String

type MigrationWorkflowSummaryList = js.Array[MigrationWorkflowSummary]

type NextToken = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWS_MANAGED
  - typings.awsSdk.awsSdkStrings.CUSTOM
  - java.lang.String
*/
type Owner = _Owner | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HEALTHY
  - typings.awsSdk.awsSdkStrings.UNHEALTHY
  - java.lang.String
*/
type PluginHealth = _PluginHealth | java.lang.String

type PluginId = java.lang.String

type PluginSummaries = js.Array[PluginSummary]

type PluginVersion = java.lang.String

type ResourceArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWS
  - typings.awsSdk.awsSdkStrings.ONPREMISE
  - java.lang.String
*/
type RunEnvironment = _RunEnvironment | java.lang.String

type S3Bucket = java.lang.String

type S3Key = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MANUAL
  - typings.awsSdk.awsSdkStrings.AUTOMATED
  - java.lang.String
*/
type StepActionType = _StepActionType | java.lang.String

type StepDescription = java.lang.String

type StepGroupDescription = java.lang.String

type StepGroupId = java.lang.String

type StepGroupName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWAITING_DEPENDENCIES
  - typings.awsSdk.awsSdkStrings.READY
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.PAUSED
  - typings.awsSdk.awsSdkStrings.PAUSING
  - typings.awsSdk.awsSdkStrings.USER_ATTENTION_REQUIRED
  - java.lang.String
*/
type StepGroupStatus = _StepGroupStatus | java.lang.String

type StepId = java.lang.String

type StepInputParameters = StringDictionary[StepInput]

type StepInputParametersKey = java.lang.String

type StepName = java.lang.String

type StepOutputList = js.Array[StepOutput]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWAITING_DEPENDENCIES
  - typings.awsSdk.awsSdkStrings.READY
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.PAUSED
  - typings.awsSdk.awsSdkStrings.USER_ATTENTION_REQUIRED
  - java.lang.String
*/
type StepStatus = _StepStatus | java.lang.String

type String = java.lang.String

type StringList = js.Array[StringListMember]

type StringListMember = java.lang.String

type StringMap = StringDictionary[StringMapValue]

type StringMapKey = java.lang.String

type StringMapValue = java.lang.String

type StringValue = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SINGLE
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type TargetType = _TargetType | java.lang.String

type TemplateId = java.lang.String

type TemplateInputList = js.Array[TemplateInput]

type TemplateInputName = java.lang.String

type TemplateName = java.lang.String

type TemplateStatus = CREATED | java.lang.String

type TemplateStepGroupSummaryList = js.Array[TemplateStepGroupSummary]

type TemplateStepSummaryList = js.Array[TemplateStepSummary]

type TemplateSummaryList = js.Array[TemplateSummary]

type Timestamp = js.Date

type ToolsList = js.Array[Tool]

type UpdateMigrationWorkflowRequestDescriptionString = java.lang.String

type UpdateMigrationWorkflowRequestNameString = java.lang.String

type WorkflowStepGroupsSummaryList = js.Array[WorkflowStepGroupSummary]

type WorkflowStepOutputList = js.Array[WorkflowStepOutput]

type WorkflowStepOutputName = java.lang.String

type WorkflowStepsSummaryList = js.Array[WorkflowStepSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2021-08-28`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
