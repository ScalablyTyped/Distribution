package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsBatchMod {
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.N_TO_N
    - awsDashSdkLib.awsDashSdkLibStrings.SEQUENTIAL
    - java.lang.String
  */
  type ArrayJobDependency = _ArrayJobDependency | java.lang.String
  type ArrayJobStatusSummary = org.scalablytyped.runtime.StringDictionary[Integer]
  type AttemptDetails = js.Array[AttemptDetail]
  type Boolean = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - java.lang.String
  */
  type CEState = _CEState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.VALID
    - awsDashSdkLib.awsDashSdkLibStrings.INVALID
    - java.lang.String
  */
  type CEStatus = _CEStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.MANAGED
    - awsDashSdkLib.awsDashSdkLibStrings.UNMANAGED
    - java.lang.String
  */
  type CEType = _CEType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EC2
    - awsDashSdkLib.awsDashSdkLibStrings.SPOT
    - java.lang.String
  */
  type CRType = _CRType | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ComputeEnvironmentDetailList = js.Array[ComputeEnvironmentDetail]
  type ComputeEnvironmentOrders = js.Array[ComputeEnvironmentOrder]
  type EnvironmentVariables = js.Array[KeyValuePair]
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - java.lang.String
  */
  type JQState = _JQState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.VALID
    - awsDashSdkLib.awsDashSdkLibStrings.INVALID
    - java.lang.String
  */
  type JQStatus = _JQStatus | java.lang.String
  type JobDefinitionList = js.Array[JobDefinition]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.container
    - awsDashSdkLib.awsDashSdkLibStrings.multinode
    - java.lang.String
  */
  type JobDefinitionType = _JobDefinitionType | java.lang.String
  type JobDependencyList = js.Array[JobDependency]
  type JobDetailList = js.Array[JobDetail]
  type JobQueueDetailList = js.Array[JobQueueDetail]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SUBMITTED
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNABLE
    - awsDashSdkLib.awsDashSdkLibStrings.STARTING
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type JobStatus = _JobStatus | java.lang.String
  type JobSummaryList = js.Array[JobSummary]
  type Long = scala.Double
  type MountPoints = js.Array[MountPoint]
  type NetworkInterfaceList = js.Array[NetworkInterface]
  type NodePropertyOverrides = js.Array[NodePropertyOverride]
  type NodeRangeProperties = js.Array[NodeRangeProperty]
  type ParametersMap = org.scalablytyped.runtime.StringDictionary[String]
  type ResourceRequirements = js.Array[ResourceRequirement]
  type ResourceType = awsDashSdkLib.awsDashSdkLibStrings.GPU | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[String]
  type TagsMap = org.scalablytyped.runtime.StringDictionary[String]
  type Ulimits = js.Array[Ulimit]
  type Volumes = js.Array[Volume]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-08-10`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
