package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsEfsMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AwsAccountId = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CreationToken = String
  type Encrypted = Boolean
  type FileSystemDescriptions = js.Array[FileSystemDescription]
  type FileSystemId = String
  type FileSystemNullableSizeValue = Double
  type FileSystemSizeValue = Double
  type IpAddress = String
  type KmsKeyId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.creating__
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - typings.awsDashSdk.awsDashSdkStrings.updating__
    - typings.awsDashSdk.awsDashSdkStrings.deleting__
    - typings.awsDashSdk.awsDashSdkStrings.deleted__
    - java.lang.String
  */
  type LifeCycleState = _LifeCycleState | String
  type LifecyclePolicies = js.Array[LifecyclePolicy]
  type Marker = String
  type MaxItems = Double
  type MountTargetCount = Double
  type MountTargetDescriptions = js.Array[MountTargetDescription]
  type MountTargetId = String
  type NetworkInterfaceId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.generalPurpose
    - typings.awsDashSdk.awsDashSdkStrings.maxIO
    - java.lang.String
  */
  type PerformanceMode = _PerformanceMode | String
  type ProvisionedThroughputInMibps = Double
  type SecurityGroup = String
  type SecurityGroups = js.Array[SecurityGroup]
  type SubnetId = String
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Array[Tag]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.bursting
    - typings.awsDashSdk.awsDashSdkStrings.provisioned_
    - java.lang.String
  */
  type ThroughputMode = _ThroughputMode | String
  type Timestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AFTER_7_DAYS
    - typings.awsDashSdk.awsDashSdkStrings.AFTER_14_DAYS
    - typings.awsDashSdk.awsDashSdkStrings.AFTER_30_DAYS
    - typings.awsDashSdk.awsDashSdkStrings.AFTER_60_DAYS
    - typings.awsDashSdk.awsDashSdkStrings.AFTER_90_DAYS
    - java.lang.String
  */
  type TransitionToIARules = _TransitionToIARules | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2015-02-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
