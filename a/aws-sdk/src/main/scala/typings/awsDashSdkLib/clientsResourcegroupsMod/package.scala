package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsResourcegroupsMod {
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type GroupArn = java.lang.String
  type GroupDescription = java.lang.String
  type GroupFilterList = js.Array[GroupFilter]
  type GroupFilterName = awsDashSdkLib.awsDashSdkLibStrings.`resource-type` | java.lang.String
  type GroupFilterValue = java.lang.String
  type GroupFilterValues = js.Array[GroupFilterValue]
  type GroupIdentifierList = js.Array[GroupIdentifier]
  type GroupList = js.Array[Group]
  type GroupName = java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type Query = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CLOUDFORMATION_STACK_INACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.CLOUDFORMATION_STACK_NOT_EXISTING
    - java.lang.String
  */
  type QueryErrorCode = _QueryErrorCode | java.lang.String
  type QueryErrorList = js.Array[QueryError]
  type QueryErrorMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TAG_FILTERS_1_0
    - awsDashSdkLib.awsDashSdkLibStrings.CLOUDFORMATION_STACK_1_0
    - java.lang.String
  */
  type QueryType = _QueryType | java.lang.String
  type ResourceArn = java.lang.String
  type ResourceFilterList = js.Array[ResourceFilter]
  type ResourceFilterName = awsDashSdkLib.awsDashSdkLibStrings.`resource-type` | java.lang.String
  type ResourceFilterValue = java.lang.String
  type ResourceFilterValues = js.Array[ResourceFilterValue]
  type ResourceIdentifierList = js.Array[ResourceIdentifier]
  type ResourceType = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagValue = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[TagValue]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-11-27`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
