package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.DESCRIBE
import typings.awsSdk.awsSdkStrings.LFTagPolicy
import typings.awsSdk.awsSdkStrings.REST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ApiDescription = java.lang.String

type Arn = java.lang.String

type AssetName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.S3_SNAPSHOT
  - typings.awsSdk.awsSdkStrings.REDSHIFT_DATA_SHARE
  - typings.awsSdk.awsSdkStrings.API_GATEWAY_API
  - typings.awsSdk.awsSdkStrings.S3_DATA_ACCESS
  - typings.awsSdk.awsSdkStrings.LAKE_FORMATION_DATA_PERMISSION
  - java.lang.String
*/
type AssetType = _AssetType | java.lang.String

type AwsAccountId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACCESS_DENIED_EXCEPTION
  - typings.awsSdk.awsSdkStrings.INTERNAL_SERVER_EXCEPTION
  - typings.awsSdk.awsSdkStrings.MALWARE_DETECTED
  - typings.awsSdk.awsSdkStrings.RESOURCE_NOT_FOUND_EXCEPTION
  - typings.awsSdk.awsSdkStrings.SERVICE_QUOTA_EXCEEDED_EXCEPTION
  - typings.awsSdk.awsSdkStrings.VALIDATION_EXCEPTION
  - typings.awsSdk.awsSdkStrings.MALWARE_SCAN_ENCRYPTED_FILE
  - java.lang.String
*/
type Code = _Code | java.lang.String

type DatabaseLFTagPolicyPermission = DESCRIBE | java.lang.String

type Description = java.lang.String

type Id = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`Assets per revision`
  - typings.awsSdk.awsSdkStrings.`Asset size in GB`
  - typings.awsSdk.awsSdkStrings.`Amazon Redshift datashare assets per revision`
  - typings.awsSdk.awsSdkStrings.`AWS Lake Formation data permission assets per revision`
  - typings.awsSdk.awsSdkStrings.`Amazon S3 data access assets per revision`
  - java.lang.String
*/
type JobErrorLimitName = _JobErrorLimitName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REVISION
  - typings.awsSdk.awsSdkStrings.ASSET
  - typings.awsSdk.awsSdkStrings.DATA_SET
  - java.lang.String
*/
type JobErrorResourceTypes = _JobErrorResourceTypes | java.lang.String

type KmsKeyArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DESCRIBE
  - typings.awsSdk.awsSdkStrings.SELECT
  - java.lang.String
*/
type LFPermission = _LFPermission | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TABLE
  - typings.awsSdk.awsSdkStrings.DATABASE
  - java.lang.String
*/
type LFResourceType = _LFResourceType | java.lang.String

type LakeFormationDataPermissionType = LFTagPolicy | java.lang.String

type ListOfAssetDestinationEntry = js.Array[AssetDestinationEntry]

type ListOfAssetEntry = js.Array[AssetEntry]

type ListOfAssetSourceEntry = js.Array[AssetSourceEntry]

type ListOfDataSetEntry = js.Array[DataSetEntry]

type ListOfDatabaseLFTagPolicyPermissions = js.Array[DatabaseLFTagPolicyPermission]

type ListOfEventActionEntry = js.Array[EventActionEntry]

type ListOfJobEntry = js.Array[JobEntry]

type ListOfJobError = js.Array[JobError]

type ListOfKmsKeysToGrant = js.Array[KmsKeyToGrant]

type ListOfLFPermissions = js.Array[LFPermission]

type ListOfLFTagValues = js.Array[String]

type ListOfLFTags = js.Array[LFTag]

type ListOfRedshiftDataShareAssetSourceEntry = js.Array[RedshiftDataShareAssetSourceEntry]

type ListOfRevisionDestinationEntry = js.Array[RevisionDestinationEntry]

type ListOfRevisionEntry = js.Array[RevisionEntry]

type ListOfString = js.Array[_String]

type ListOfTableTagPolicyLFPermissions = js.Array[TableTagPolicyLFPermission]

type MapOfString = StringDictionary[_String]

type MaxResults = Double

type Name = java.lang.String

type NextToken = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OWNED
  - typings.awsSdk.awsSdkStrings.ENTITLED
  - java.lang.String
*/
type Origin = _Origin | java.lang.String

type ProtocolType = REST | java.lang.String

type RoleArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.awsColonkms
  - typings.awsSdk.awsSdkStrings.AES256
  - java.lang.String
*/
type ServerSideEncryptionTypes = _ServerSideEncryptionTypes | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WAITING
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.TIMED_OUT
  - java.lang.String
*/
type State = _State | java.lang.String

type String = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DESCRIBE
  - typings.awsSdk.awsSdkStrings.SELECT
  - java.lang.String
*/
type TableTagPolicyLFPermission = _TableTagPolicyLFPermission | java.lang.String

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IMPORT_ASSETS_FROM_S3
  - typings.awsSdk.awsSdkStrings.IMPORT_ASSET_FROM_SIGNED_URL
  - typings.awsSdk.awsSdkStrings.EXPORT_ASSETS_TO_S3
  - typings.awsSdk.awsSdkStrings.EXPORT_ASSET_TO_SIGNED_URL
  - typings.awsSdk.awsSdkStrings.EXPORT_REVISIONS_TO_S3
  - typings.awsSdk.awsSdkStrings.IMPORT_ASSETS_FROM_REDSHIFT_DATA_SHARES
  - typings.awsSdk.awsSdkStrings.IMPORT_ASSET_FROM_API_GATEWAY_API
  - typings.awsSdk.awsSdkStrings.CREATE_S3_DATA_ACCESS_FROM_S3_BUCKET
  - typings.awsSdk.awsSdkStrings.IMPORT_ASSETS_FROM_LAKE_FORMATION_TAG_POLICY
  - java.lang.String
*/
type Type = _Type | java.lang.String

type _String = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-07-25`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String

type boolean = Boolean

type double = Double

type doubleMin0 = Double

type stringMin0Max16384 = java.lang.String

type stringMin10Max512 = java.lang.String

type stringMin24Max24PatternAZaZ094AZaZ092AZaZ093 = java.lang.String
