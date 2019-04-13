package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCloud9Mod {
  type AutomaticStopTimeMinutes = scala.Double
  type BoundedEnvironmentIdList = js.Array[EnvironmentId]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  type EnvironmentDescription = java.lang.String
  type EnvironmentId = java.lang.String
  type EnvironmentIdList = js.Array[EnvironmentId]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE_FAILED
    - java.lang.String
  */
  type EnvironmentLifecycleStatus = _EnvironmentLifecycleStatus | java.lang.String
  type EnvironmentList = js.Array[Environment]
  type EnvironmentMembersList = js.Array[EnvironmentMember]
  type EnvironmentName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.error
    - awsDashSdkLib.awsDashSdkLibStrings.creating
    - awsDashSdkLib.awsDashSdkLibStrings.connecting
    - awsDashSdkLib.awsDashSdkLibStrings.ready
    - awsDashSdkLib.awsDashSdkLibStrings.stopping
    - awsDashSdkLib.awsDashSdkLibStrings.stopped
    - awsDashSdkLib.awsDashSdkLibStrings.deleting
    - java.lang.String
  */
  type EnvironmentStatus = _EnvironmentStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ssh
    - awsDashSdkLib.awsDashSdkLibStrings.ec2
    - java.lang.String
  */
  type EnvironmentType = _EnvironmentType | java.lang.String
  type InstanceType = java.lang.String
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`read-write`
    - awsDashSdkLib.awsDashSdkLibStrings.`read-only`
    - java.lang.String
  */
  type MemberPermissions = _MemberPermissions | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.owner
    - awsDashSdkLib.awsDashSdkLibStrings.`read-write`
    - awsDashSdkLib.awsDashSdkLibStrings.`read-only`
    - java.lang.String
  */
  type Permissions = _Permissions | java.lang.String
  type PermissionsList = js.Array[Permissions]
  type String = java.lang.String
  type SubnetId = java.lang.String
  type Timestamp = stdLib.Date
  type UserArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-09-23`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
