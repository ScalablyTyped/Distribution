package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsEmrMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.NONE
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATE_JOB_FLOW
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATE_CLUSTER
    - typings.awsDashSdk.awsDashSdkStrings.CANCEL_AND_WAIT
    - typings.awsDashSdk.awsDashSdkStrings.CONTINUE
    - java.lang.String
  */
  type ActionOnFailure = _ActionOnFailure | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CHANGE_IN_CAPACITY
    - typings.awsDashSdk.awsDashSdkStrings.PERCENT_CHANGE_IN_CAPACITY
    - typings.awsDashSdk.awsDashSdkStrings.EXACT_CAPACITY
    - java.lang.String
  */
  type AdjustmentType = _AdjustmentType | java.lang.String
  type ApplicationList = js.Array[Application]
  type ArnType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.ATTACHING
    - typings.awsDashSdk.awsDashSdkStrings.ATTACHED
    - typings.awsDashSdk.awsDashSdkStrings.DETACHING
    - typings.awsDashSdk.awsDashSdkStrings.DETACHED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type AutoScalingPolicyState = _AutoScalingPolicyState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.USER_REQUEST
    - typings.awsDashSdk.awsDashSdkStrings.PROVISION_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.CLEANUP_FAILURE
    - java.lang.String
  */
  type AutoScalingPolicyStateChangeReasonCode = _AutoScalingPolicyStateChangeReasonCode | java.lang.String
  type Boolean = scala.Boolean
  type BooleanObject = scala.Boolean
  type BootstrapActionConfigList = js.Array[BootstrapActionConfig]
  type BootstrapActionDetailList = js.Array[BootstrapActionDetail]
  type CancelStepsInfoList = js.Array[CancelStepsInfo]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SUBMITTED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type CancelStepsRequestStatus = _CancelStepsRequestStatus | java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClusterId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STARTING
    - typings.awsDashSdk.awsDashSdkStrings.BOOTSTRAPPING
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.WAITING
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATING
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATED
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATED_WITH_ERRORS
    - java.lang.String
  */
  type ClusterState = _ClusterState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INTERNAL_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.VALIDATION_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.INSTANCE_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.INSTANCE_FLEET_TIMEOUT
    - typings.awsDashSdk.awsDashSdkStrings.BOOTSTRAP_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.USER_REQUEST
    - typings.awsDashSdk.awsDashSdkStrings.STEP_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.ALL_STEPS_COMPLETED
    - java.lang.String
  */
  type ClusterStateChangeReasonCode = _ClusterStateChangeReasonCode | java.lang.String
  type ClusterStateList = js.Array[ClusterState]
  type ClusterSummaryList = js.Array[ClusterSummary]
  type CommandList = js.Array[Command]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.GREATER_THAN_OR_EQUAL
    - typings.awsDashSdk.awsDashSdkStrings.GREATER_THAN
    - typings.awsDashSdk.awsDashSdkStrings.LESS_THAN
    - typings.awsDashSdk.awsDashSdkStrings.LESS_THAN_OR_EQUAL
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
    - typings.awsDashSdk.awsDashSdkStrings.INSTANCE_FLEET
    - typings.awsDashSdk.awsDashSdkStrings.INSTANCE_GROUP
    - java.lang.String
  */
  type InstanceCollectionType = _InstanceCollectionType | java.lang.String
  type InstanceFleetConfigList = js.Array[InstanceFleetConfig]
  type InstanceFleetId = java.lang.String
  type InstanceFleetList = js.Array[InstanceFleet]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PROVISIONING
    - typings.awsDashSdk.awsDashSdkStrings.BOOTSTRAPPING
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.RESIZING
    - typings.awsDashSdk.awsDashSdkStrings.SUSPENDED
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATING
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATED
    - java.lang.String
  */
  type InstanceFleetState = _InstanceFleetState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INTERNAL_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.VALIDATION_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.INSTANCE_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.CLUSTER_TERMINATED
    - java.lang.String
  */
  type InstanceFleetStateChangeReasonCode = _InstanceFleetStateChangeReasonCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MASTER
    - typings.awsDashSdk.awsDashSdkStrings.CORE
    - typings.awsDashSdk.awsDashSdkStrings.TASK
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
    - typings.awsDashSdk.awsDashSdkStrings.PROVISIONING
    - typings.awsDashSdk.awsDashSdkStrings.BOOTSTRAPPING
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.RECONFIGURING
    - typings.awsDashSdk.awsDashSdkStrings.RESIZING
    - typings.awsDashSdk.awsDashSdkStrings.SUSPENDED
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATING
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATED
    - typings.awsDashSdk.awsDashSdkStrings.ARRESTED
    - typings.awsDashSdk.awsDashSdkStrings.SHUTTING_DOWN
    - typings.awsDashSdk.awsDashSdkStrings.ENDED
    - java.lang.String
  */
  type InstanceGroupState = _InstanceGroupState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INTERNAL_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.VALIDATION_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.INSTANCE_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.CLUSTER_TERMINATED
    - java.lang.String
  */
  type InstanceGroupStateChangeReasonCode = _InstanceGroupStateChangeReasonCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MASTER
    - typings.awsDashSdk.awsDashSdkStrings.CORE
    - typings.awsDashSdk.awsDashSdkStrings.TASK
    - java.lang.String
  */
  type InstanceGroupType = _InstanceGroupType | java.lang.String
  type InstanceGroupTypeList = js.Array[InstanceGroupType]
  type InstanceId = java.lang.String
  type InstanceList = js.Array[Instance]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MASTER
    - typings.awsDashSdk.awsDashSdkStrings.CORE
    - typings.awsDashSdk.awsDashSdkStrings.TASK
    - java.lang.String
  */
  type InstanceRoleType = _InstanceRoleType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AWAITING_FULFILLMENT
    - typings.awsDashSdk.awsDashSdkStrings.PROVISIONING
    - typings.awsDashSdk.awsDashSdkStrings.BOOTSTRAPPING
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATED
    - java.lang.String
  */
  type InstanceState = _InstanceState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INTERNAL_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.VALIDATION_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.INSTANCE_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.BOOTSTRAP_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.CLUSTER_TERMINATED
    - java.lang.String
  */
  type InstanceStateChangeReasonCode = _InstanceStateChangeReasonCode | java.lang.String
  type InstanceStateList = js.Array[InstanceState]
  type InstanceType = java.lang.String
  type InstanceTypeConfigList = js.Array[InstanceTypeConfig]
  type InstanceTypeSpecificationList = js.Array[InstanceTypeSpecification]
  type Integer = Double
  type JobFlowDetailList = js.Array[JobFlowDetail]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STARTING
    - typings.awsDashSdk.awsDashSdkStrings.BOOTSTRAPPING
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.WAITING
    - typings.awsDashSdk.awsDashSdkStrings.SHUTTING_DOWN
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATED
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type JobFlowExecutionState = _JobFlowExecutionState | java.lang.String
  type JobFlowExecutionStateList = js.Array[JobFlowExecutionState]
  type KeyValueList = js.Array[KeyValue]
  type Long = Double
  type Marker = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ON_DEMAND
    - typings.awsDashSdk.awsDashSdkStrings.SPOT
    - java.lang.String
  */
  type MarketType = _MarketType | java.lang.String
  type MetricDimensionList = js.Array[MetricDimension]
  type NewSupportedProductsList = js.Array[SupportedProductConfig]
  type NonNegativeDouble = Double
  type OptionalArnType = java.lang.String
  type Port = Double
  type PortRanges = js.Array[PortRange]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SECURITY
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - java.lang.String
  */
  type RepoUpgradeOnBoot = _RepoUpgradeOnBoot | java.lang.String
  type ResourceId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATE_AT_INSTANCE_HOUR
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATE_AT_TASK_COMPLETION
    - java.lang.String
  */
  type ScaleDownBehavior = _ScaleDownBehavior | java.lang.String
  type ScalingRuleList = js.Array[ScalingRule]
  type SecurityConfigurationList = js.Array[SecurityConfigurationSummary]
  type SecurityGroupsList = js.Array[XmlStringMaxLen256]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SWITCH_TO_ON_DEMAND
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATE_CLUSTER
    - java.lang.String
  */
  type SpotProvisioningTimeoutAction = _SpotProvisioningTimeoutAction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SAMPLE_COUNT
    - typings.awsDashSdk.awsDashSdkStrings.AVERAGE
    - typings.awsDashSdk.awsDashSdkStrings.SUM
    - typings.awsDashSdk.awsDashSdkStrings.MINIMUM
    - typings.awsDashSdk.awsDashSdkStrings.MAXIMUM
    - java.lang.String
  */
  type Statistic = _Statistic | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SEND_INTERRUPT
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATE_PROCESS
    - java.lang.String
  */
  type StepCancellationOption = _StepCancellationOption | java.lang.String
  type StepConfigList = js.Array[StepConfig]
  type StepDetailList = js.Array[StepDetail]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.CONTINUE
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.CANCELLED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.INTERRUPTED
    - java.lang.String
  */
  type StepExecutionState = _StepExecutionState | java.lang.String
  type StepId = java.lang.String
  type StepIdsList = js.Array[XmlStringMaxLen256]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.CANCEL_PENDING
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.CANCELLED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.INTERRUPTED
    - java.lang.String
  */
  type StepState = _StepState | java.lang.String
  type StepStateChangeReasonCode = NONE | java.lang.String
  type StepStateList = js.Array[StepState]
  type StepSummaryList = js.Array[StepSummary]
  type String = java.lang.String
  type StringList = js.Array[String]
  type StringMap = StringDictionary[String]
  type SupportedProductsList = js.Array[XmlStringMaxLen256]
  type TagList = js.Array[Tag]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.SECONDS
    - typings.awsDashSdk.awsDashSdkStrings.MICRO_SECONDS
    - typings.awsDashSdk.awsDashSdkStrings.MILLI_SECONDS
    - typings.awsDashSdk.awsDashSdkStrings.BYTES
    - typings.awsDashSdk.awsDashSdkStrings.KILO_BYTES
    - typings.awsDashSdk.awsDashSdkStrings.MEGA_BYTES
    - typings.awsDashSdk.awsDashSdkStrings.GIGA_BYTES
    - typings.awsDashSdk.awsDashSdkStrings.TERA_BYTES
    - typings.awsDashSdk.awsDashSdkStrings.BITS
    - typings.awsDashSdk.awsDashSdkStrings.KILO_BITS
    - typings.awsDashSdk.awsDashSdkStrings.MEGA_BITS
    - typings.awsDashSdk.awsDashSdkStrings.GIGA_BITS
    - typings.awsDashSdk.awsDashSdkStrings.TERA_BITS
    - typings.awsDashSdk.awsDashSdkStrings.PERCENT
    - typings.awsDashSdk.awsDashSdkStrings.COUNT
    - typings.awsDashSdk.awsDashSdkStrings.BYTES_PER_SECOND
    - typings.awsDashSdk.awsDashSdkStrings.KILO_BYTES_PER_SECOND
    - typings.awsDashSdk.awsDashSdkStrings.MEGA_BYTES_PER_SECOND
    - typings.awsDashSdk.awsDashSdkStrings.GIGA_BYTES_PER_SECOND
    - typings.awsDashSdk.awsDashSdkStrings.TERA_BYTES_PER_SECOND
    - typings.awsDashSdk.awsDashSdkStrings.BITS_PER_SECOND
    - typings.awsDashSdk.awsDashSdkStrings.KILO_BITS_PER_SECOND
    - typings.awsDashSdk.awsDashSdkStrings.MEGA_BITS_PER_SECOND
    - typings.awsDashSdk.awsDashSdkStrings.GIGA_BITS_PER_SECOND
    - typings.awsDashSdk.awsDashSdkStrings.TERA_BITS_PER_SECOND
    - typings.awsDashSdk.awsDashSdkStrings.COUNT_PER_SECOND
    - java.lang.String
  */
  type Unit = _Unit | java.lang.String
  type WholeNumber = Double
  type XmlString = java.lang.String
  type XmlStringList = js.Array[XmlString]
  type XmlStringMaxLen256 = java.lang.String
  type XmlStringMaxLen256List = js.Array[XmlStringMaxLen256]
  type _Date = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2009-03-31`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
