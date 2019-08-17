package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCloud9Mod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AutomaticStopTimeMinutes = Double
  type BoundedEnvironmentIdList = js.Array[EnvironmentId]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  type EnvironmentDescription = java.lang.String
  type EnvironmentId = java.lang.String
  type EnvironmentIdList = js.Array[EnvironmentId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATED
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_FAILED
    - java.lang.String
  */
  type EnvironmentLifecycleStatus = _EnvironmentLifecycleStatus | java.lang.String
  type EnvironmentList = js.Array[Environment]
  type EnvironmentMembersList = js.Array[EnvironmentMember]
  type EnvironmentName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.error
    - typings.awsDashSdk.awsDashSdkStrings.creating
    - typings.awsDashSdk.awsDashSdkStrings.connecting
    - typings.awsDashSdk.awsDashSdkStrings.ready
    - typings.awsDashSdk.awsDashSdkStrings.stopping
    - typings.awsDashSdk.awsDashSdkStrings.stopped
    - typings.awsDashSdk.awsDashSdkStrings.deleting
    - java.lang.String
  */
  type EnvironmentStatus = _EnvironmentStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ssh
    - typings.awsDashSdk.awsDashSdkStrings.ec2
    - java.lang.String
  */
  type EnvironmentType = _EnvironmentType | java.lang.String
  type InstanceType = java.lang.String
  type MaxResults = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`read-write`
    - typings.awsDashSdk.awsDashSdkStrings.`read-only`
    - java.lang.String
  */
  type MemberPermissions = _MemberPermissions | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.owner
    - typings.awsDashSdk.awsDashSdkStrings.`read-write`
    - typings.awsDashSdk.awsDashSdkStrings.`read-only`
    - java.lang.String
  */
  type Permissions = _Permissions | java.lang.String
  type PermissionsList = js.Array[Permissions]
  type String = java.lang.String
  type SubnetId = java.lang.String
  type Timestamp = Date
  type UserArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-09-23`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
