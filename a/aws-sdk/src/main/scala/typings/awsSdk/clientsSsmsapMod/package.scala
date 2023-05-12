package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.ACTIVATED
import typings.awsSdk.awsSdkStrings.ADMIN
import typings.awsSdk.awsSdkStrings.HANA
import typings.awsSdk.awsSdkStrings.RESTORE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AppRegistryArn = java.lang.String

type ApplicationCredentialList = js.Array[ApplicationCredential]

type ApplicationId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVATED
  - typings.awsSdk.awsSdkStrings.STARTING
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.REGISTERING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type ApplicationStatus = _ApplicationStatus | java.lang.String

type ApplicationSummaryList = js.Array[ApplicationSummary]

type ApplicationType = HANA | java.lang.String

type Arn = java.lang.String

type ComponentId = java.lang.String

type ComponentIdList = js.Array[ComponentId]

type ComponentStatus = ACTIVATED | java.lang.String

type ComponentSummaryList = js.Array[ComponentSummary]

type ComponentType = HANA | java.lang.String

type CredentialType = ADMIN | java.lang.String

type DatabaseId = java.lang.String

type DatabaseIdList = js.Array[DatabaseId]

type DatabaseName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.STARTING
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.WARNING
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type DatabaseStatus = _DatabaseStatus | java.lang.String

type DatabaseSummaryList = js.Array[DatabaseSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SYSTEM
  - typings.awsSdk.awsSdkStrings.TENANT
  - java.lang.String
*/
type DatabaseType = _DatabaseType | java.lang.String

type FilterList = js.Array[Filter]

type FilterName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Equals_
  - typings.awsSdk.awsSdkStrings.GreaterThanOrEquals
  - typings.awsSdk.awsSdkStrings.LessThanOrEquals
  - java.lang.String
*/
type FilterOperator = _FilterOperator | java.lang.String

type FilterValue = java.lang.String

type HostList = js.Array[Host]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LEADER
  - typings.awsSdk.awsSdkStrings.WORKER
  - typings.awsSdk.awsSdkStrings.STANDBY
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type HostRole = _HostRole | java.lang.String

type InstanceId = java.lang.String

type InstanceList = js.Array[InstanceId]

type Integer = Double

type MaxResults = Double

type NextToken = java.lang.String

type OperationId = java.lang.String

type OperationIdList = js.Array[OperationId]

type OperationList = js.Array[Operation]

type OperationProperties = StringDictionary[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INPROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type OperationStatus = _OperationStatus | java.lang.String

type OperationType = java.lang.String

type PermissionActionType = RESTORE | java.lang.String

type ResourceId = java.lang.String

type ResourceType = java.lang.String

type SAPInstanceNumber = java.lang.String

type SID = java.lang.String

type SecretId = java.lang.String

type SsmSapArn = java.lang.String

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-05-10`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
