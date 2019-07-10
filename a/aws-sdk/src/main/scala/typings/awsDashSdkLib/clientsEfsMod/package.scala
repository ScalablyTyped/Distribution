package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsEfsMod {
  type AwsAccountId = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CreationToken = java.lang.String
  type Encrypted = scala.Boolean
  type FileSystemDescriptions = js.Array[FileSystemDescription]
  type FileSystemId = java.lang.String
  type FileSystemNullableSizeValue = scala.Double
  type FileSystemSizeValue = scala.Double
  type IpAddress = java.lang.String
  type KmsKeyId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.creating
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - awsDashSdkLib.awsDashSdkLibStrings.updating
    - awsDashSdkLib.awsDashSdkLibStrings.deleting
    - awsDashSdkLib.awsDashSdkLibStrings.deleted
    - java.lang.String
  */
  type LifeCycleState = _LifeCycleState | java.lang.String
  type LifecyclePolicies = js.Array[LifecyclePolicy]
  type Marker = java.lang.String
  type MaxItems = scala.Double
  type MountTargetCount = scala.Double
  type MountTargetDescriptions = js.Array[MountTargetDescription]
  type MountTargetId = java.lang.String
  type NetworkInterfaceId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.generalPurpose
    - awsDashSdkLib.awsDashSdkLibStrings.maxIO
    - java.lang.String
  */
  type PerformanceMode = _PerformanceMode | java.lang.String
  type ProvisionedThroughputInMibps = scala.Double
  type SecurityGroup = java.lang.String
  type SecurityGroups = js.Array[SecurityGroup]
  type SubnetId = java.lang.String
  type TagKey = java.lang.String
  type TagKeys = js.Array[TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[Tag]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.bursting
    - awsDashSdkLib.awsDashSdkLibStrings.provisioned
    - java.lang.String
  */
  type ThroughputMode = _ThroughputMode | java.lang.String
  type Timestamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AFTER_14_DAYS
    - awsDashSdkLib.awsDashSdkLibStrings.AFTER_30_DAYS
    - awsDashSdkLib.awsDashSdkLibStrings.AFTER_60_DAYS
    - awsDashSdkLib.awsDashSdkLibStrings.AFTER_90_DAYS
    - java.lang.String
  */
  type TransitionToIARules = _TransitionToIARules | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-02-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
