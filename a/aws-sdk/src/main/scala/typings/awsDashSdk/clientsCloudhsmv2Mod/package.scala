package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCloudhsmv2Mod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.DEFAULT
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type BackupId = java.lang.String
  type BackupPolicy = DEFAULT | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.READY
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - typings.awsDashSdk.awsDashSdkStrings.PENDING_DELETION
    - java.lang.String
  */
  type BackupState = _BackupState | java.lang.String
  type Backups = js.Array[Backup]
  type Boolean = scala.Boolean
  type Cert = java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClusterId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.UNINITIALIZED
    - typings.awsDashSdk.awsDashSdkStrings.INITIALIZE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.INITIALIZED
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - typings.awsDashSdk.awsDashSdkStrings.DEGRADED
    - java.lang.String
  */
  type ClusterState = _ClusterState | java.lang.String
  type Clusters = js.Array[Cluster]
  type EniId = java.lang.String
  type ExternalAz = java.lang.String
  type ExternalSubnetMapping = StringDictionary[SubnetId]
  type Field = java.lang.String
  type Filters = StringDictionary[Strings]
  type HsmId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DEGRADED
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - java.lang.String
  */
  type HsmState = _HsmState | java.lang.String
  type HsmType = java.lang.String
  type Hsms = js.Array[Hsm]
  type IpAddress = java.lang.String
  type MaxSize = Double
  type NextToken = java.lang.String
  type PreCoPassword = java.lang.String
  type Region = java.lang.String
  type SecurityGroup = java.lang.String
  type StateMessage = java.lang.String
  type String = java.lang.String
  type Strings = js.Array[String]
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[SubnetId]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type Timestamp = Date
  type VpcId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-04-28`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
