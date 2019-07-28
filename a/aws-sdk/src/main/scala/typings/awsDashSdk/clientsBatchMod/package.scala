package typings.awsDashSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.awsDashSdkStrings.GPU
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsBatchMod {
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.N_TO_N
    - typings.awsDashSdk.awsDashSdkStrings.SEQUENTIAL
    - java.lang.String
  */
  type ArrayJobDependency = _ArrayJobDependency | java.lang.String
  type ArrayJobStatusSummary = StringDictionary[Integer]
  type AttemptDetails = js.Array[AttemptDetail]
  type Boolean = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type CEState = _CEState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - typings.awsDashSdk.awsDashSdkStrings.VALID
    - typings.awsDashSdk.awsDashSdkStrings.INVALID
    - java.lang.String
  */
  type CEStatus = _CEStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MANAGED
    - typings.awsDashSdk.awsDashSdkStrings.UNMANAGED
    - java.lang.String
  */
  type CEType = _CEType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EC2
    - typings.awsDashSdk.awsDashSdkStrings.SPOT
    - java.lang.String
  */
  type CRType = _CRType | java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ComputeEnvironmentDetailList = js.Array[ComputeEnvironmentDetail]
  type ComputeEnvironmentOrders = js.Array[ComputeEnvironmentOrder]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.READ
    - typings.awsDashSdk.awsDashSdkStrings.WRITE
    - typings.awsDashSdk.awsDashSdkStrings.MKNOD
    - java.lang.String
  */
  type DeviceCgroupPermission = _DeviceCgroupPermission | java.lang.String
  type DeviceCgroupPermissions = js.Array[DeviceCgroupPermission]
  type DevicesList = js.Array[Device]
  type EnvironmentVariables = js.Array[KeyValuePair]
  type Integer = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type JQState = _JQState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - typings.awsDashSdk.awsDashSdkStrings.VALID
    - typings.awsDashSdk.awsDashSdkStrings.INVALID
    - java.lang.String
  */
  type JQStatus = _JQStatus | java.lang.String
  type JobDefinitionList = js.Array[JobDefinition]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.container
    - typings.awsDashSdk.awsDashSdkStrings.multinode
    - java.lang.String
  */
  type JobDefinitionType = _JobDefinitionType | java.lang.String
  type JobDependencyList = js.Array[JobDependency]
  type JobDetailList = js.Array[JobDetail]
  type JobQueueDetailList = js.Array[JobQueueDetail]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SUBMITTED
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.RUNNABLE
    - typings.awsDashSdk.awsDashSdkStrings.STARTING
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type JobStatus = _JobStatus | java.lang.String
  type JobSummaryList = js.Array[JobSummary]
  type Long = Double
  type MountPoints = js.Array[MountPoint]
  type NetworkInterfaceList = js.Array[NetworkInterface]
  type NodePropertyOverrides = js.Array[NodePropertyOverride]
  type NodeRangeProperties = js.Array[NodeRangeProperty]
  type ParametersMap = StringDictionary[String]
  type ResourceRequirements = js.Array[ResourceRequirement]
  type ResourceType = GPU | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[String]
  type TagsMap = StringDictionary[String]
  type Ulimits = js.Array[Ulimit]
  type Volumes = js.Array[Volume]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2016-08-10`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
