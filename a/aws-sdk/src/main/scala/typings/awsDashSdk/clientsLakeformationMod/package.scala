package typings.awsDashSdk

import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsLakeformationMod {
  type BatchPermissionsFailureList = js.Array[BatchPermissionsFailureEntry]
  type BatchPermissionsRequestEntryList = js.Array[BatchPermissionsRequestEntry]
  type CatalogIdString = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ColumnNames = js.Array[NameString]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EQ
    - typings.awsDashSdk.awsDashSdkStrings.NE
    - typings.awsDashSdk.awsDashSdkStrings.LE
    - typings.awsDashSdk.awsDashSdkStrings.LT
    - typings.awsDashSdk.awsDashSdkStrings.GE
    - typings.awsDashSdk.awsDashSdkStrings.GT
    - typings.awsDashSdk.awsDashSdkStrings.CONTAINS
    - typings.awsDashSdk.awsDashSdkStrings.NOT_CONTAINS
    - typings.awsDashSdk.awsDashSdkStrings.BEGINS_WITH
    - typings.awsDashSdk.awsDashSdkStrings.IN
    - typings.awsDashSdk.awsDashSdkStrings.BETWEEN
    - java.lang.String
  */
  type ComparisonOperator = _ComparisonOperator | String
  type DataLakePrincipalList = js.Array[DataLakePrincipal]
  type DataLakePrincipalString = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CATALOG
    - typings.awsDashSdk.awsDashSdkStrings.DATABASE
    - typings.awsDashSdk.awsDashSdkStrings.TABLE
    - typings.awsDashSdk.awsDashSdkStrings.DATA_LOCATION
    - java.lang.String
  */
  type DataLakeResourceType = _DataLakeResourceType | String
  type DescriptionString = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RESOURCE_ARN
    - typings.awsDashSdk.awsDashSdkStrings.ROLE_ARN
    - typings.awsDashSdk.awsDashSdkStrings.LAST_MODIFIED
    - java.lang.String
  */
  type FieldNameString = _FieldNameString | String
  type FilterConditionList = js.Array[FilterCondition]
  type IAMRoleArn = String
  type Identifier = String
  type LastModifiedTimestamp = Date
  type NameString = String
  type NullableBoolean = Boolean
  type PageSize = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALL
    - typings.awsDashSdk.awsDashSdkStrings.SELECT
    - typings.awsDashSdk.awsDashSdkStrings.ALTER
    - typings.awsDashSdk.awsDashSdkStrings.DROP
    - typings.awsDashSdk.awsDashSdkStrings.DELETE
    - typings.awsDashSdk.awsDashSdkStrings.INSERT
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_DATABASE
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_TABLE
    - typings.awsDashSdk.awsDashSdkStrings.DATA_LOCATION_ACCESS
    - java.lang.String
  */
  type Permission = _Permission | String
  type PermissionList = js.Array[Permission]
  type PrincipalPermissionsList = js.Array[PrincipalPermissions]
  type PrincipalResourcePermissionsList = js.Array[PrincipalResourcePermissions]
  type ResourceArnString = String
  type ResourceInfoList = js.Array[ResourceInfo]
  type StringValue = String
  type StringValueList = js.Array[StringValue]
  type Token = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-03-31`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
