package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsDatasyncMod {
  type ActivationKey = java.lang.String
  type AgentArn = java.lang.String
  type AgentArnList = js.Array[AgentArn]
  type AgentList = js.Array[AgentListEntry]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ONLINE
    - awsDashSdkLib.awsDashSdkLibStrings.OFFLINE
    - java.lang.String
  */
  type AgentStatus = _AgentStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.BEST_EFFORT
    - java.lang.String
  */
  type Atime = _Atime | java.lang.String
  type BytesPerSecond = scala.Double
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type Duration = scala.Double
  type Ec2SecurityGroupArn = java.lang.String
  type Ec2SecurityGroupArnList = js.Array[Ec2SecurityGroupArn]
  type Ec2SubnetArn = java.lang.String
  type EfsFilesystemArn = java.lang.String
  type FilterList = js.Array[FilterRule]
  type FilterType = awsDashSdkLib.awsDashSdkLibStrings.SIMPLE_PATTERN | java.lang.String
  type FilterValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.INT_VALUE
    - awsDashSdkLib.awsDashSdkLibStrings.NAME
    - awsDashSdkLib.awsDashSdkLibStrings.BOTH
    - java.lang.String
  */
  type Gid = _Gid | java.lang.String
  type IamRoleArn = java.lang.String
  type LocationArn = java.lang.String
  type LocationList = js.Array[LocationListEntry]
  type LocationUri = java.lang.String
  type LogGroupArn = java.lang.String
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.PRESERVE
    - java.lang.String
  */
  type Mtime = _Mtime | java.lang.String
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AUTOMATIC
    - awsDashSdkLib.awsDashSdkLibStrings.NFS3
    - awsDashSdkLib.awsDashSdkLibStrings.NFS4_0
    - awsDashSdkLib.awsDashSdkLibStrings.NFS4_1
    - java.lang.String
  */
  type NfsVersion = _NfsVersion | java.lang.String
  type NonEmptySubdirectory = java.lang.String
  type PLSecurityGroupArnList = js.Array[Ec2SecurityGroupArn]
  type PLSubnetArnList = js.Array[Ec2SubnetArn]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCESS
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - java.lang.String
  */
  type PhaseStatus = _PhaseStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.BEST_EFFORT
    - awsDashSdkLib.awsDashSdkLibStrings.PRESERVE
    - java.lang.String
  */
  type PosixPermissions = _PosixPermissions | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PRESERVE
    - awsDashSdkLib.awsDashSdkLibStrings.REMOVE
    - java.lang.String
  */
  type PreserveDeletedFiles = _PreserveDeletedFiles | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.PRESERVE
    - java.lang.String
  */
  type PreserveDevices = _PreserveDevices | java.lang.String
  type S3BucketArn = java.lang.String
  type ServerHostname = java.lang.String
  type Subdirectory = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[TagListEntry]
  type TagValue = java.lang.String
  type TaggableResourceArn = java.lang.String
  type TaskArn = java.lang.String
  type TaskExecutionArn = java.lang.String
  type TaskExecutionList = js.Array[TaskExecutionListEntry]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.LAUNCHING
    - awsDashSdkLib.awsDashSdkLibStrings.PREPARING
    - awsDashSdkLib.awsDashSdkLibStrings.TRANSFERRING
    - awsDashSdkLib.awsDashSdkLibStrings.VERIFYING
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCESS
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - java.lang.String
  */
  type TaskExecutionStatus = _TaskExecutionStatus | java.lang.String
  type TaskList = js.Array[TaskListEntry]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.UNAVAILABLE
    - java.lang.String
  */
  type TaskStatus = _TaskStatus | java.lang.String
  type Time = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.INT_VALUE
    - awsDashSdkLib.awsDashSdkLibStrings.NAME
    - awsDashSdkLib.awsDashSdkLibStrings.BOTH
    - java.lang.String
  */
  type Uid = _Uid | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.POINT_IN_TIME_CONSISTENT
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - java.lang.String
  */
  type VerifyMode = _VerifyMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-11-09`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type long = scala.Double
}
