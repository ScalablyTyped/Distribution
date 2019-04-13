package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCloudhsmMod {
  type AZ = java.lang.String
  type AZList = js.Array[AZ]
  type Certificate = java.lang.String
  type CertificateFingerprint = java.lang.String
  type ClientArn = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientLabel = java.lang.String
  type ClientList = js.Array[ClientArn]
  type ClientToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`5DOT1`
    - awsDashSdkLib.awsDashSdkLibStrings.`5DOT3`
    - java.lang.String
  */
  type ClientVersion = _ClientVersion | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.READY
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - awsDashSdkLib.awsDashSdkLibStrings.DEGRADED
    - java.lang.String
  */
  type CloudHsmObjectState = _CloudHsmObjectState | java.lang.String
  type EniId = java.lang.String
  type ExternalId = java.lang.String
  type HapgArn = java.lang.String
  type HapgList = js.Array[HapgArn]
  type HsmArn = java.lang.String
  type HsmList = js.Array[HsmArn]
  type HsmSerialNumber = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - awsDashSdkLib.awsDashSdkLibStrings.SUSPENDED
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATING
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATED
    - awsDashSdkLib.awsDashSdkLibStrings.DEGRADED
    - java.lang.String
  */
  type HsmStatus = _HsmStatus | java.lang.String
  type IamRoleArn = java.lang.String
  type IpAddress = java.lang.String
  type Label = java.lang.String
  type PaginationToken = java.lang.String
  type PartitionArn = java.lang.String
  type PartitionList = js.Array[PartitionArn]
  type PartitionSerial = java.lang.String
  type PartitionSerialList = js.Array[PartitionSerial]
  type SshKey = java.lang.String
  type String = java.lang.String
  type SubnetId = java.lang.String
  type SubscriptionType = awsDashSdkLib.awsDashSdkLibStrings.PRODUCTION | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type Timestamp = java.lang.String
  type VpcId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2014-05-30`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
