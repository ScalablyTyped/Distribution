package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCloudhsmv2Mod {
  type BackupId = java.lang.String
  type BackupPolicy = awsDashSdkLib.awsDashSdkLibStrings.DEFAULT | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.READY
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_DELETION
    - java.lang.String
  */
  type BackupState = _BackupState | java.lang.String
  type Backups = js.Array[Backup]
  type Boolean = scala.Boolean
  type Cert = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClusterId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.UNINITIALIZED
    - awsDashSdkLib.awsDashSdkLibStrings.INITIALIZE_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.INITIALIZED
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.DEGRADED
    - java.lang.String
  */
  type ClusterState = _ClusterState | java.lang.String
  type Clusters = js.Array[Cluster]
  type EniId = java.lang.String
  type ExternalAz = java.lang.String
  type ExternalSubnetMapping = org.scalablytyped.runtime.StringDictionary[SubnetId]
  type Field = java.lang.String
  type Filters = org.scalablytyped.runtime.StringDictionary[Strings]
  type HsmId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.DEGRADED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - java.lang.String
  */
  type HsmState = _HsmState | java.lang.String
  type HsmType = java.lang.String
  type Hsms = js.Array[Hsm]
  type IpAddress = java.lang.String
  type MaxSize = scala.Double
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
  type Timestamp = stdLib.Date
  type VpcId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-04-28`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
