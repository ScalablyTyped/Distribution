package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsOpsworkscmMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AWSOpsWorksCMResourceArn = java.lang.String
  type AccountAttributes = js.Array[AccountAttribute]
  type AttributeName = java.lang.String
  type AttributeValue = java.lang.String
  type BackupId = java.lang.String
  type BackupRetentionCountDefinition = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.OK
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - java.lang.String
  */
  type BackupStatus = _BackupStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AUTOMATED
    - typings.awsDashSdk.awsDashSdkStrings.MANUAL
    - java.lang.String
  */
  type BackupType = _BackupType | java.lang.String
  type Backups = js.Array[Backup]
  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CustomCertificate = java.lang.String
  type CustomDomain = java.lang.String
  type CustomPrivateKey = java.lang.String
  type EngineAttributeName = java.lang.String
  type EngineAttributeValue = java.lang.String
  type EngineAttributes = js.Array[EngineAttribute]
  type InstanceProfileArn = java.lang.String
  type Integer = Double
  type KeyPair = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SUCCESS
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type MaintenanceStatus = _MaintenanceStatus | java.lang.String
  type MaxResults = Double
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SUCCESS
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - java.lang.String
  */
  type NodeAssociationStatus = _NodeAssociationStatus | java.lang.String
  type NodeAssociationStatusToken = java.lang.String
  type NodeName = java.lang.String
  type ServerEvents = js.Array[ServerEvent]
  type ServerName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BACKING_UP
    - typings.awsDashSdk.awsDashSdkStrings.CONNECTION_LOST
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.MODIFYING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.HEALTHY
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.RESTORING
    - typings.awsDashSdk.awsDashSdkStrings.SETUP
    - typings.awsDashSdk.awsDashSdkStrings.UNDER_MAINTENANCE
    - typings.awsDashSdk.awsDashSdkStrings.UNHEALTHY
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATED
    - java.lang.String
  */
  type ServerStatus = _ServerStatus | java.lang.String
  type Servers = js.Array[Server]
  type ServiceRoleArn = java.lang.String
  type String = java.lang.String
  type Strings = js.Array[String]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type TimeWindowDefinition = java.lang.String
  type Timestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2016-11-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
