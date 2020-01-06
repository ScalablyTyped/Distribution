package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsDmsMod {
  import typings.awsDashSdk.awsDashSdkStrings.`replication-instance`
  import typings.awsDashSdk.awsDashSdkStrings.beta_
  import typings.awsDashSdk.awsDashSdkStrings.json_
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type AccountQuotaList = js.Array[AccountQuota]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.default_
    - typings.awsDashSdk.awsDashSdkStrings.mongodb_cr
    - typings.awsDashSdk.awsDashSdkStrings.scram_sha_1
    - java.lang.String
  */
  type AuthMechanismValue = _AuthMechanismValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.no_
    - typings.awsDashSdk.awsDashSdkStrings.password__
    - java.lang.String
  */
  type AuthTypeValue = _AuthTypeValue | java.lang.String
  type AvailabilityZonesList = js.Array[String]
  type Boolean = scala.Boolean
  type BooleanOptional = scala.Boolean
  type CertificateList = js.Array[Certificate]
  type CertificateWallet = Buffer | Uint8Array | Blob | java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.none__
    - typings.awsDashSdk.awsDashSdkStrings.gzip__
    - java.lang.String
  */
  type CompressionTypeValue = _CompressionTypeValue | java.lang.String
  type ConnectionList = js.Array[Connection]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.csv_
    - typings.awsDashSdk.awsDashSdkStrings.parquet_
    - java.lang.String
  */
  type DataFormatValue = _DataFormatValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.none__
    - typings.awsDashSdk.awsDashSdkStrings.require__
    - typings.awsDashSdk.awsDashSdkStrings.`verify-ca`
    - typings.awsDashSdk.awsDashSdkStrings.`verify-full`
    - java.lang.String
  */
  type DmsSslModeValue = _DmsSslModeValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.plain
    - typings.awsDashSdk.awsDashSdkStrings.`plain-dictionary`
    - typings.awsDashSdk.awsDashSdkStrings.`rle-dictionary`
    - java.lang.String
  */
  type EncodingTypeValue = _EncodingTypeValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`sse-s3_`
    - typings.awsDashSdk.awsDashSdkStrings.`sse-kms_`
    - java.lang.String
  */
  type EncryptionModeValue = _EncryptionModeValue | java.lang.String
  type EndpointList = js.Array[Endpoint]
  type EventCategoriesList = js.Array[String]
  type EventCategoryGroupList = js.Array[EventCategoryGroup]
  type EventList = js.Array[Event]
  type EventSubscriptionsList = js.Array[EventSubscription]
  type FilterList = js.Array[Filter]
  type FilterValueList = js.Array[String]
  type Integer = Double
  type IntegerOptional = Double
  type KeyList = js.Array[String]
  type Long = Double
  type MessageFormatValue = json_ | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`full-load`
    - typings.awsDashSdk.awsDashSdkStrings.cdc
    - typings.awsDashSdk.awsDashSdkStrings.`full-load-and-cdc`
    - java.lang.String
  */
  type MigrationTypeValue = _MigrationTypeValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.none__
    - typings.awsDashSdk.awsDashSdkStrings.one
    - java.lang.String
  */
  type NestingLevelValue = _NestingLevelValue | java.lang.String
  type OrderableReplicationInstanceList = js.Array[OrderableReplicationInstance]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`parquet-1-0`
    - typings.awsDashSdk.awsDashSdkStrings.`parquet-2-0`
    - java.lang.String
  */
  type ParquetVersionValue = _ParquetVersionValue | java.lang.String
  type PendingMaintenanceActionDetails = js.Array[PendingMaintenanceAction]
  type PendingMaintenanceActions = js.Array[ResourcePendingMaintenanceActions]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.successful__
    - typings.awsDashSdk.awsDashSdkStrings.failed__
    - typings.awsDashSdk.awsDashSdkStrings.refreshing
    - java.lang.String
  */
  type RefreshSchemasStatusTypeValue = _RefreshSchemasStatusTypeValue | java.lang.String
  type ReleaseStatusValues = beta_ | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`data-reload`
    - typings.awsDashSdk.awsDashSdkStrings.`validate-only`
    - java.lang.String
  */
  type ReloadOptionValue = _ReloadOptionValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.source_
    - typings.awsDashSdk.awsDashSdkStrings.target_
    - java.lang.String
  */
  type ReplicationEndpointTypeValue = _ReplicationEndpointTypeValue | java.lang.String
  type ReplicationInstanceList = js.Array[ReplicationInstance]
  type ReplicationInstancePrivateIpAddressList = js.Array[String]
  type ReplicationInstancePublicIpAddressList = js.Array[String]
  type ReplicationInstanceTaskLogsList = js.Array[ReplicationInstanceTaskLog]
  type ReplicationSubnetGroups = js.Array[ReplicationSubnetGroup]
  type ReplicationTaskAssessmentResultList = js.Array[ReplicationTaskAssessmentResult]
  type ReplicationTaskList = js.Array[ReplicationTask]
  type SchemaList = js.Array[String]
  type SecretString = java.lang.String
  type SourceIdsList = js.Array[String]
  type SourceType = `replication-instance` | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`start-replication`
    - typings.awsDashSdk.awsDashSdkStrings.`resume-processing`
    - typings.awsDashSdk.awsDashSdkStrings.`reload-target`
    - java.lang.String
  */
  type StartReplicationTaskTypeValue = _StartReplicationTaskTypeValue | java.lang.String
  type String = java.lang.String
  type SubnetIdentifierList = js.Array[String]
  type SubnetList = js.Array[Subnet]
  type SupportedEndpointTypeList = js.Array[SupportedEndpointType]
  type TStamp = Date
  type TableListToReload = js.Array[TableToReload]
  type TableStatisticsList = js.Array[TableStatistics]
  type TagList = js.Array[Tag]
  type VpcSecurityGroupIdList = js.Array[String]
  type VpcSecurityGroupMembershipList = js.Array[VpcSecurityGroupMembership]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2016-01-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
