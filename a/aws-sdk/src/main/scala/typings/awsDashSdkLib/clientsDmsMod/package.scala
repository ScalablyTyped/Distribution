package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsDmsMod {
  type AccountQuotaList = js.Array[AccountQuota]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.default
    - awsDashSdkLib.awsDashSdkLibStrings.mongodb_cr
    - awsDashSdkLib.awsDashSdkLibStrings.scram_sha_1
    - java.lang.String
  */
  type AuthMechanismValue = _AuthMechanismValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.no
    - awsDashSdkLib.awsDashSdkLibStrings.password
    - java.lang.String
  */
  type AuthTypeValue = _AuthTypeValue | java.lang.String
  type AvailabilityZonesList = js.Array[String]
  type Boolean = scala.Boolean
  type BooleanOptional = scala.Boolean
  type CertificateList = js.Array[Certificate]
  type CertificateWallet = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.none
    - awsDashSdkLib.awsDashSdkLibStrings.gzip
    - java.lang.String
  */
  type CompressionTypeValue = _CompressionTypeValue | java.lang.String
  type ConnectionList = js.Array[Connection]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.csv
    - awsDashSdkLib.awsDashSdkLibStrings.parquet
    - java.lang.String
  */
  type DataFormatValue = _DataFormatValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.none
    - awsDashSdkLib.awsDashSdkLibStrings.require
    - awsDashSdkLib.awsDashSdkLibStrings.`verify-ca`
    - awsDashSdkLib.awsDashSdkLibStrings.`verify-full`
    - java.lang.String
  */
  type DmsSslModeValue = _DmsSslModeValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.plain
    - awsDashSdkLib.awsDashSdkLibStrings.`plain-dictionary`
    - awsDashSdkLib.awsDashSdkLibStrings.`rle-dictionary`
    - java.lang.String
  */
  type EncodingTypeValue = _EncodingTypeValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`sse-s3`
    - awsDashSdkLib.awsDashSdkLibStrings.`sse-kms`
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
  type Integer = scala.Double
  type IntegerOptional = scala.Double
  type KeyList = js.Array[String]
  type Long = scala.Double
  type MessageFormatValue = awsDashSdkLib.awsDashSdkLibStrings.json | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`full-load`
    - awsDashSdkLib.awsDashSdkLibStrings.cdc
    - awsDashSdkLib.awsDashSdkLibStrings.`full-load-and-cdc`
    - java.lang.String
  */
  type MigrationTypeValue = _MigrationTypeValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.none
    - awsDashSdkLib.awsDashSdkLibStrings.one
    - java.lang.String
  */
  type NestingLevelValue = _NestingLevelValue | java.lang.String
  type OrderableReplicationInstanceList = js.Array[OrderableReplicationInstance]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`parquet-1-0`
    - awsDashSdkLib.awsDashSdkLibStrings.`parquet-2-0`
    - java.lang.String
  */
  type ParquetVersionValue = _ParquetVersionValue | java.lang.String
  type PendingMaintenanceActionDetails = js.Array[PendingMaintenanceAction]
  type PendingMaintenanceActions = js.Array[ResourcePendingMaintenanceActions]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.successful
    - awsDashSdkLib.awsDashSdkLibStrings.failed
    - awsDashSdkLib.awsDashSdkLibStrings.refreshing
    - java.lang.String
  */
  type RefreshSchemasStatusTypeValue = _RefreshSchemasStatusTypeValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`data-reload`
    - awsDashSdkLib.awsDashSdkLibStrings.`validate-only`
    - java.lang.String
  */
  type ReloadOptionValue = _ReloadOptionValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.source
    - awsDashSdkLib.awsDashSdkLibStrings.target
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
  type SourceType = awsDashSdkLib.awsDashSdkLibStrings.`replication-instance` | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`start-replication`
    - awsDashSdkLib.awsDashSdkLibStrings.`resume-processing`
    - awsDashSdkLib.awsDashSdkLibStrings.`reload-target`
    - java.lang.String
  */
  type StartReplicationTaskTypeValue = _StartReplicationTaskTypeValue | java.lang.String
  type String = java.lang.String
  type SubnetIdentifierList = js.Array[String]
  type SubnetList = js.Array[Subnet]
  type SupportedEndpointTypeList = js.Array[SupportedEndpointType]
  type TStamp = stdLib.Date
  type TableListToReload = js.Array[TableToReload]
  type TableStatisticsList = js.Array[TableStatistics]
  type TagList = js.Array[Tag]
  type VpcSecurityGroupIdList = js.Array[String]
  type VpcSecurityGroupMembershipList = js.Array[VpcSecurityGroupMembership]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-01-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
