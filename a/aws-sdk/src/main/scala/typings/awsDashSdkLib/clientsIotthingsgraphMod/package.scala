package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsIotthingsgraphMod {
  type Arn = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DefinitionLanguage = awsDashSdkLib.awsDashSdkLibStrings.GRAPHQL | java.lang.String
  type DefinitionText = java.lang.String
  type DependencyRevisions = js.Array[DependencyRevision]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.GREENGRASS
    - awsDashSdkLib.awsDashSdkLibStrings.CLOUD
    - java.lang.String
  */
  type DeploymentTarget = _DeploymentTarget | java.lang.String
  type DeprecateExistingEntities = scala.Boolean
  type Enabled = scala.Boolean
  type EntityDescriptions = js.Array[EntityDescription]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NAME
    - awsDashSdkLib.awsDashSdkLibStrings.NAMESPACE
    - awsDashSdkLib.awsDashSdkLibStrings.SEMANTIC_TYPE_PATH
    - awsDashSdkLib.awsDashSdkLibStrings.REFERENCED_ENTITY_ID
    - java.lang.String
  */
  type EntityFilterName = _EntityFilterName | java.lang.String
  type EntityFilterValue = java.lang.String
  type EntityFilterValues = js.Array[EntityFilterValue]
  type EntityFilters = js.Array[EntityFilter]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DEVICE
    - awsDashSdkLib.awsDashSdkLibStrings.SERVICE
    - awsDashSdkLib.awsDashSdkLibStrings.DEVICE_MODEL
    - awsDashSdkLib.awsDashSdkLibStrings.CAPABILITY
    - awsDashSdkLib.awsDashSdkLibStrings.STATE
    - awsDashSdkLib.awsDashSdkLibStrings.ACTION
    - awsDashSdkLib.awsDashSdkLibStrings.EVENT
    - awsDashSdkLib.awsDashSdkLibStrings.PROPERTY
    - awsDashSdkLib.awsDashSdkLibStrings.MAPPING
    - awsDashSdkLib.awsDashSdkLibStrings.ENUM
    - java.lang.String
  */
  type EntityType = _EntityType | java.lang.String
  type EntityTypes = js.Array[EntityType]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EXECUTION_STARTED
    - awsDashSdkLib.awsDashSdkLibStrings.EXECUTION_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.EXECUTION_ABORTED
    - awsDashSdkLib.awsDashSdkLibStrings.EXECUTION_SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.STEP_STARTED
    - awsDashSdkLib.awsDashSdkLibStrings.STEP_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.STEP_SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVITY_SCHEDULED
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVITY_STARTED
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVITY_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVITY_SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.START_FLOW_EXECUTION_TASK
    - awsDashSdkLib.awsDashSdkLibStrings.SCHEDULE_NEXT_READY_STEPS_TASK
    - awsDashSdkLib.awsDashSdkLibStrings.THING_ACTION_TASK
    - awsDashSdkLib.awsDashSdkLibStrings.THING_ACTION_TASK_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.THING_ACTION_TASK_SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.ACKNOWLEDGE_TASK_MESSAGE
    - java.lang.String
  */
  type FlowExecutionEventType = _FlowExecutionEventType | java.lang.String
  type FlowExecutionId = java.lang.String
  type FlowExecutionMessageId = java.lang.String
  type FlowExecutionMessagePayload = java.lang.String
  type FlowExecutionMessages = js.Array[FlowExecutionMessage]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.ABORTED
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type FlowExecutionStatus = _FlowExecutionStatus | java.lang.String
  type FlowExecutionSummaries = js.Array[FlowExecutionSummary]
  type FlowTemplateFilterName = awsDashSdkLib.awsDashSdkLibStrings.DEVICE_MODEL_ID | java.lang.String
  type FlowTemplateFilterValue = java.lang.String
  type FlowTemplateFilterValues = js.Array[FlowTemplateFilterValue]
  type FlowTemplateFilters = js.Array[FlowTemplateFilter]
  type FlowTemplateSummaries = js.Array[FlowTemplateSummary]
  type GreengrassDeploymentId = java.lang.String
  type GreengrassGroupId = java.lang.String
  type GreengrassGroupVersionId = java.lang.String
  type GroupName = java.lang.String
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type NamespaceDeletionStatus = _NamespaceDeletionStatus | java.lang.String
  type NamespaceDeletionStatusErrorCodes = awsDashSdkLib.awsDashSdkLibStrings.VALIDATION_FAILED | java.lang.String
  type NamespaceName = java.lang.String
  type NextToken = java.lang.String
  type ResourceArn = java.lang.String
  type RoleArn = java.lang.String
  type S3BucketName = java.lang.String
  type String = java.lang.String
  type StringList = js.Array[String]
  type SyncWithPublicNamespace = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_DEPLOYED
    - awsDashSdkLib.awsDashSdkLibStrings.BOOTSTRAP
    - awsDashSdkLib.awsDashSdkLibStrings.DEPLOY_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.DEPLOYED_IN_TARGET
    - awsDashSdkLib.awsDashSdkLibStrings.UNDEPLOY_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_DELETE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED_IN_TARGET
    - java.lang.String
  */
  type SystemInstanceDeploymentStatus = _SystemInstanceDeploymentStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SYSTEM_TEMPLATE_ID
    - awsDashSdkLib.awsDashSdkLibStrings.STATUS
    - awsDashSdkLib.awsDashSdkLibStrings.GREENGRASS_GROUP_NAME
    - java.lang.String
  */
  type SystemInstanceFilterName = _SystemInstanceFilterName | java.lang.String
  type SystemInstanceFilterValue = java.lang.String
  type SystemInstanceFilterValues = js.Array[SystemInstanceFilterValue]
  type SystemInstanceFilters = js.Array[SystemInstanceFilter]
  type SystemInstanceSummaries = js.Array[SystemInstanceSummary]
  type SystemTemplateFilterName = awsDashSdkLib.awsDashSdkLibStrings.FLOW_TEMPLATE_ID | java.lang.String
  type SystemTemplateFilterValue = java.lang.String
  type SystemTemplateFilterValues = js.Array[SystemTemplateFilterValue]
  type SystemTemplateFilters = js.Array[SystemTemplateFilter]
  type SystemTemplateSummaries = js.Array[SystemTemplateSummary]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type ThingArn = java.lang.String
  type ThingName = java.lang.String
  type Things = js.Array[Thing]
  type Timestamp = stdLib.Date
  type UploadId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type UploadStatus = _UploadStatus | java.lang.String
  type Urn = java.lang.String
  type Urns = js.Array[Urn]
  type Version = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-09-06`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
