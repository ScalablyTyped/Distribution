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
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.CREATED
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_FAILED
    - java.lang.String
  */
  type EnvironmentLifecycleStatus = _EnvironmentLifecycleStatus | java.lang.String
  type EnvironmentList = js.Array[Environment]
  type EnvironmentMembersList = js.Array[EnvironmentMember]
  type EnvironmentName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.error__
    - typings.awsDashSdk.awsDashSdkStrings.creating__
    - typings.awsDashSdk.awsDashSdkStrings.connecting__
    - typings.awsDashSdk.awsDashSdkStrings.ready__
    - typings.awsDashSdk.awsDashSdkStrings.stopping__
    - typings.awsDashSdk.awsDashSdkStrings.stopped__
    - typings.awsDashSdk.awsDashSdkStrings.deleting__
    - java.lang.String
  */
  type EnvironmentStatus = _EnvironmentStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ssh_
    - typings.awsDashSdk.awsDashSdkStrings.ec2_
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
    - typings.awsDashSdk.awsDashSdkStrings.owner__
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
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
