package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsEmrMod {
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATE_JOB_FLOW
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATE_CLUSTER
    - awsDashSdkLib.awsDashSdkLibStrings.CANCEL_AND_WAIT
    - awsDashSdkLib.awsDashSdkLibStrings.CONTINUE
    - java.lang.String
  */
  type ActionOnFailure = _ActionOnFailure | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CHANGE_IN_CAPACITY
    - awsDashSdkLib.awsDashSdkLibStrings.PERCENT_CHANGE_IN_CAPACITY
    - awsDashSdkLib.awsDashSdkLibStrings.EXACT_CAPACITY
    - java.lang.String
  */
  type AdjustmentType = _AdjustmentType | java.lang.String
  type ApplicationList = js.Array[Application]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.ATTACHING
    - awsDashSdkLib.awsDashSdkLibStrings.ATTACHED
    - awsDashSdkLib.awsDashSdkLibStrings.DETACHING
    - awsDashSdkLib.awsDashSdkLibStrings.DETACHED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type AutoScalingPolicyState = _AutoScalingPolicyState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.USER_REQUEST
    - awsDashSdkLib.awsDashSdkLibStrings.PROVISION_FAILURE
    - awsDashSdkLib.awsDashSdkLibStrings.CLEANUP_FAILURE
    - java.lang.String
  */
  type AutoScalingPolicyStateChangeReasonCode = _AutoScalingPolicyStateChangeReasonCode | java.lang.String
  type Boolean = scala.Boolean
  type BooleanObject = scala.Boolean
  type BootstrapActionConfigList = js.Array[BootstrapActionConfig]
  type BootstrapActionDetailList = js.Array[BootstrapActionDetail]
  type CancelStepsInfoList = js.Array[CancelStepsInfo]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SUBMITTED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type CancelStepsRequestStatus = _CancelStepsRequestStatus | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClusterId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.STARTING
    - awsDashSdkLib.awsDashSdkLibStrings.BOOTSTRAPPING
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.WAITING
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATING
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATED
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATED_WITH_ERRORS
    - java.lang.String
  */
  type ClusterState = _ClusterState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.VALIDATION_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_FAILURE
    - awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_FLEET_TIMEOUT
    - awsDashSdkLib.awsDashSdkLibStrings.BOOTSTRAP_FAILURE
    - awsDashSdkLib.awsDashSdkLibStrings.USER_REQUEST
    - awsDashSdkLib.awsDashSdkLibStrings.STEP_FAILURE
    - awsDashSdkLib.awsDashSdkLibStrings.ALL_STEPS_COMPLETED
    - java.lang.String
  */
  type ClusterStateChangeReasonCode = _ClusterStateChangeReasonCode | java.lang.String
  type ClusterStateList = js.Array[ClusterState]
  type ClusterSummaryList = js.Array[ClusterSummary]
  type CommandList = js.Array[Command]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.GREATER_THAN_OR_EQUAL
    - awsDashSdkLib.awsDashSdkLibStrings.GREATER_THAN
    - awsDashSdkLib.awsDashSdkLibStrings.LESS_THAN
    - awsDashSdkLib.awsDashSdkLibStrings.LESS_THAN_OR_EQUAL
    - java.lang.String
  */
  type ComparisonOperator = _ComparisonOperator | java.lang.String
  type ConfigurationList = js.Array[Configuration]
  type EC2InstanceIdsList = js.Array[InstanceId]
  type EC2InstanceIdsToTerminateList = js.Array[InstanceId]
  type EbsBlockDeviceConfigList = js.Array[EbsBlockDeviceConfig]
  type EbsBlockDeviceList = js.Array[EbsBlockDevice]
  type EbsVolumeList = js.Array[EbsVolume]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_FLEET
    - awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_GROUP
    - java.lang.String
  */
  type InstanceCollectionType = _InstanceCollectionType | java.lang.String
  type InstanceFleetConfigList = js.Array[InstanceFleetConfig]
  type InstanceFleetId = java.lang.String
  type InstanceFleetList = js.Array[InstanceFleet]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PROVISIONING
    - awsDashSdkLib.awsDashSdkLibStrings.BOOTSTRAPPING
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.RESIZING
    - awsDashSdkLib.awsDashSdkLibStrings.SUSPENDED
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATING
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATED
    - java.lang.String
  */
  type InstanceFleetState = _InstanceFleetState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.VALIDATION_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_FAILURE
    - awsDashSdkLib.awsDashSdkLibStrings.CLUSTER_TERMINATED
    - java.lang.String
  */
  type InstanceFleetStateChangeReasonCode = _InstanceFleetStateChangeReasonCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.MASTER
    - awsDashSdkLib.awsDashSdkLibStrings.CORE
    - awsDashSdkLib.awsDashSdkLibStrings.TASK
    - java.lang.String
  */
  type InstanceFleetType = _InstanceFleetType | java.lang.String
  type InstanceGroupConfigList = js.Array[InstanceGroupConfig]
  type InstanceGroupDetailList = js.Array[InstanceGroupDetail]
  type InstanceGroupId = java.lang.String
  type InstanceGroupIdsList = js.Array[XmlStringMaxLen256]
  type InstanceGroupList = js.Array[InstanceGroup]
  type InstanceGroupModifyConfigList = js.Array[InstanceGroupModifyConfig]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PROVISIONING
    - awsDashSdkLib.awsDashSdkLibStrings.BOOTSTRAPPING
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.RECONFIGURING
    - awsDashSdkLib.awsDashSdkLibStrings.RESIZING
    - awsDashSdkLib.awsDashSdkLibStrings.SUSPENDED
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATING
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATED
    - awsDashSdkLib.awsDashSdkLibStrings.ARRESTED
    - awsDashSdkLib.awsDashSdkLibStrings.SHUTTING_DOWN
    - awsDashSdkLib.awsDashSdkLibStrings.ENDED
    - java.lang.String
  */
  type InstanceGroupState = _InstanceGroupState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.VALIDATION_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_FAILURE
    - awsDashSdkLib.awsDashSdkLibStrings.CLUSTER_TERMINATED
    - java.lang.String
  */
  type InstanceGroupStateChangeReasonCode = _InstanceGroupStateChangeReasonCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.MASTER
    - awsDashSdkLib.awsDashSdkLibStrings.CORE
    - awsDashSdkLib.awsDashSdkLibStrings.TASK
    - java.lang.String
  */
  type InstanceGroupType = _InstanceGroupType | java.lang.String
  type InstanceGroupTypeList = js.Array[InstanceGroupType]
  type InstanceId = java.lang.String
  type InstanceList = js.Array[Instance]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.MASTER
    - awsDashSdkLib.awsDashSdkLibStrings.CORE
    - awsDashSdkLib.awsDashSdkLibStrings.TASK
    - java.lang.String
  */
  type InstanceRoleType = _InstanceRoleType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AWAITING_FULFILLMENT
    - awsDashSdkLib.awsDashSdkLibStrings.PROVISIONING
    - awsDashSdkLib.awsDashSdkLibStrings.BOOTSTRAPPING
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATED
    - java.lang.String
  */
  type InstanceState = _InstanceState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.VALIDATION_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_FAILURE
    - awsDashSdkLib.awsDashSdkLibStrings.BOOTSTRAP_FAILURE
    - awsDashSdkLib.awsDashSdkLibStrings.CLUSTER_TERMINATED
    - java.lang.String
  */
  type InstanceStateChangeReasonCode = _InstanceStateChangeReasonCode | java.lang.String
  type InstanceStateList = js.Array[InstanceState]
  type InstanceType = java.lang.String
  type InstanceTypeConfigList = js.Array[InstanceTypeConfig]
  type InstanceTypeSpecificationList = js.Array[InstanceTypeSpecification]
  type Integer = scala.Double
  type JobFlowDetailList = js.Array[JobFlowDetail]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.STARTING
    - awsDashSdkLib.awsDashSdkLibStrings.BOOTSTRAPPING
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.WAITING
    - awsDashSdkLib.awsDashSdkLibStrings.SHUTTING_DOWN
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATED
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type JobFlowExecutionState = _JobFlowExecutionState | java.lang.String
  type JobFlowExecutionStateList = js.Array[JobFlowExecutionState]
  type KeyValueList = js.Array[KeyValue]
  type Long = scala.Double
  type Marker = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ON_DEMAND
    - awsDashSdkLib.awsDashSdkLibStrings.SPOT
    - java.lang.String
  */
  type MarketType = _MarketType | java.lang.String
  type MetricDimensionList = js.Array[MetricDimension]
  type NewSupportedProductsList = js.Array[SupportedProductConfig]
  type NonNegativeDouble = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SECURITY
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - java.lang.String
  */
  type RepoUpgradeOnBoot = _RepoUpgradeOnBoot | java.lang.String
  type ResourceId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATE_AT_INSTANCE_HOUR
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATE_AT_TASK_COMPLETION
    - java.lang.String
  */
  type ScaleDownBehavior = _ScaleDownBehavior | java.lang.String
  type ScalingRuleList = js.Array[ScalingRule]
  type SecurityConfigurationList = js.Array[SecurityConfigurationSummary]
  type SecurityGroupsList = js.Array[XmlStringMaxLen256]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SWITCH_TO_ON_DEMAND
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATE_CLUSTER
    - java.lang.String
  */
  type SpotProvisioningTimeoutAction = _SpotProvisioningTimeoutAction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SAMPLE_COUNT
    - awsDashSdkLib.awsDashSdkLibStrings.AVERAGE
    - awsDashSdkLib.awsDashSdkLibStrings.SUM
    - awsDashSdkLib.awsDashSdkLibStrings.MINIMUM
    - awsDashSdkLib.awsDashSdkLibStrings.MAXIMUM
    - java.lang.String
  */
  type Statistic = _Statistic | java.lang.String
  type StepConfigList = js.Array[StepConfig]
  type StepDetailList = js.Array[StepDetail]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.CONTINUE
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.CANCELLED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.INTERRUPTED
    - java.lang.String
  */
  type StepExecutionState = _StepExecutionState | java.lang.String
  type StepId = java.lang.String
  type StepIdsList = js.Array[XmlStringMaxLen256]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.CANCEL_PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.CANCELLED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.INTERRUPTED
    - java.lang.String
  */
  type StepState = _StepState | java.lang.String
  type StepStateChangeReasonCode = awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
  type StepStateList = js.Array[StepState]
  type StepSummaryList = js.Array[StepSummary]
  type String = java.lang.String
  type StringList = js.Array[String]
  type StringMap = org.scalablytyped.runtime.StringDictionary[String]
  type SupportedProductsList = js.Array[XmlStringMaxLen256]
  type TagList = js.Array[Tag]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.SECONDS
    - awsDashSdkLib.awsDashSdkLibStrings.MICRO_SECONDS
    - awsDashSdkLib.awsDashSdkLibStrings.MILLI_SECONDS
    - awsDashSdkLib.awsDashSdkLibStrings.BYTES
    - awsDashSdkLib.awsDashSdkLibStrings.KILO_BYTES
    - awsDashSdkLib.awsDashSdkLibStrings.MEGA_BYTES
    - awsDashSdkLib.awsDashSdkLibStrings.GIGA_BYTES
    - awsDashSdkLib.awsDashSdkLibStrings.TERA_BYTES
    - awsDashSdkLib.awsDashSdkLibStrings.BITS
    - awsDashSdkLib.awsDashSdkLibStrings.KILO_BITS
    - awsDashSdkLib.awsDashSdkLibStrings.MEGA_BITS
    - awsDashSdkLib.awsDashSdkLibStrings.GIGA_BITS
    - awsDashSdkLib.awsDashSdkLibStrings.TERA_BITS
    - awsDashSdkLib.awsDashSdkLibStrings.PERCENT
    - awsDashSdkLib.awsDashSdkLibStrings.COUNT
    - awsDashSdkLib.awsDashSdkLibStrings.BYTES_PER_SECOND
    - awsDashSdkLib.awsDashSdkLibStrings.KILO_BYTES_PER_SECOND
    - awsDashSdkLib.awsDashSdkLibStrings.MEGA_BYTES_PER_SECOND
    - awsDashSdkLib.awsDashSdkLibStrings.GIGA_BYTES_PER_SECOND
    - awsDashSdkLib.awsDashSdkLibStrings.TERA_BYTES_PER_SECOND
    - awsDashSdkLib.awsDashSdkLibStrings.BITS_PER_SECOND
    - awsDashSdkLib.awsDashSdkLibStrings.KILO_BITS_PER_SECOND
    - awsDashSdkLib.awsDashSdkLibStrings.MEGA_BITS_PER_SECOND
    - awsDashSdkLib.awsDashSdkLibStrings.GIGA_BITS_PER_SECOND
    - awsDashSdkLib.awsDashSdkLibStrings.TERA_BITS_PER_SECOND
    - awsDashSdkLib.awsDashSdkLibStrings.COUNT_PER_SECOND
    - java.lang.String
  */
  type Unit = _Unit | java.lang.String
  type WholeNumber = scala.Double
  type XmlString = java.lang.String
  type XmlStringList = js.Array[XmlString]
  type XmlStringMaxLen256 = java.lang.String
  type XmlStringMaxLen256List = js.Array[XmlStringMaxLen256]
  type _Date = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2009-03-31`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
