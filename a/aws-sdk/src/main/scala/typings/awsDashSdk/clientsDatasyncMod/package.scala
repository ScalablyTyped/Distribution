package typings.awsDashSdk

import typings.awsDashSdk.awsDashSdkStrings.SIMPLE_PATTERN
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsDatasyncMod {
  type ActivationKey = String
  type AgentArn = String
  type AgentArnList = js.Array[AgentArn]
  type AgentList = js.Array[AgentListEntry]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ONLINE
    - typings.awsDashSdk.awsDashSdkStrings.OFFLINE
    - java.lang.String
  */
  type AgentStatus = _AgentStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.BEST_EFFORT
    - java.lang.String
  */
  type Atime = _Atime | String
  type BytesPerSecond = Double
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type Duration = Double
  type Ec2SecurityGroupArn = String
  type Ec2SecurityGroupArnList = js.Array[Ec2SecurityGroupArn]
  type Ec2SubnetArn = String
  type EfsFilesystemArn = String
  type FilterList = js.Array[FilterRule]
  type FilterType = SIMPLE_PATTERN | String
  type FilterValue = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.INT_VALUE
    - typings.awsDashSdk.awsDashSdkStrings.NAME
    - typings.awsDashSdk.awsDashSdkStrings.BOTH
    - java.lang.String
  */
  type Gid = _Gid | String
  type IamRoleArn = String
  type LocationArn = String
  type LocationList = js.Array[LocationListEntry]
  type LocationUri = String
  type LogGroupArn = String
  type MaxResults = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.PRESERVE
    - java.lang.String
  */
  type Mtime = _Mtime | String
  type NextToken = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AUTOMATIC
    - typings.awsDashSdk.awsDashSdkStrings.NFS3
    - typings.awsDashSdk.awsDashSdkStrings.NFS4_0
    - typings.awsDashSdk.awsDashSdkStrings.NFS4_1
    - java.lang.String
  */
  type NfsVersion = _NfsVersion | String
  type NonEmptySubdirectory = String
  type PLSecurityGroupArnList = js.Array[Ec2SecurityGroupArn]
  type PLSubnetArnList = js.Array[Ec2SubnetArn]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.SUCCESS
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - java.lang.String
  */
  type PhaseStatus = _PhaseStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.BEST_EFFORT
    - typings.awsDashSdk.awsDashSdkStrings.PRESERVE
    - java.lang.String
  */
  type PosixPermissions = _PosixPermissions | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PRESERVE
    - typings.awsDashSdk.awsDashSdkStrings.REMOVE
    - java.lang.String
  */
  type PreserveDeletedFiles = _PreserveDeletedFiles | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.PRESERVE
    - java.lang.String
  */
  type PreserveDevices = _PreserveDevices | String
  type S3BucketArn = String
  type ServerHostname = String
  type Subdirectory = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[TagListEntry]
  type TagValue = String
  type TaggableResourceArn = String
  type TaskArn = String
  type TaskExecutionArn = String
  type TaskExecutionList = js.Array[TaskExecutionListEntry]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.LAUNCHING
    - typings.awsDashSdk.awsDashSdkStrings.PREPARING
    - typings.awsDashSdk.awsDashSdkStrings.TRANSFERRING
    - typings.awsDashSdk.awsDashSdkStrings.VERIFYING
    - typings.awsDashSdk.awsDashSdkStrings.SUCCESS
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - java.lang.String
  */
  type TaskExecutionStatus = _TaskExecutionStatus | String
  type TaskList = js.Array[TaskListEntry]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.UNAVAILABLE
    - java.lang.String
  */
  type TaskStatus = _TaskStatus | String
  type Time = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.INT_VALUE
    - typings.awsDashSdk.awsDashSdkStrings.NAME
    - typings.awsDashSdk.awsDashSdkStrings.BOTH
    - java.lang.String
  */
  type Uid = _Uid | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.POINT_IN_TIME_CONSISTENT
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - java.lang.String
  */
  type VerifyMode = _VerifyMode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-11-09`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
  type long = Double
}
