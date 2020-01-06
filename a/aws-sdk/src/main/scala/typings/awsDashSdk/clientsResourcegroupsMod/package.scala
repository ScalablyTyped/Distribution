package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsResourcegroupsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.`resource-type`
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type GroupArn = String
  type GroupDescription = String
  type GroupFilterList = js.Array[GroupFilter]
  type GroupFilterName = `resource-type` | String
  type GroupFilterValue = String
  type GroupFilterValues = js.Array[GroupFilterValue]
  type GroupIdentifierList = js.Array[GroupIdentifier]
  type GroupList = js.Array[Group]
  type GroupName = String
  type MaxResults = Double
  type NextToken = String
  type Query = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CLOUDFORMATION_STACK_INACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.CLOUDFORMATION_STACK_NOT_EXISTING
    - java.lang.String
  */
  type QueryErrorCode = _QueryErrorCode | String
  type QueryErrorList = js.Array[QueryError]
  type QueryErrorMessage = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TAG_FILTERS_1_0
    - typings.awsDashSdk.awsDashSdkStrings.CLOUDFORMATION_STACK_1_0
    - java.lang.String
  */
  type QueryType = _QueryType | String
  type ResourceArn = String
  type ResourceFilterList = js.Array[ResourceFilter]
  type ResourceFilterName = `resource-type` | String
  type ResourceFilterValue = String
  type ResourceFilterValues = js.Array[ResourceFilterValue]
  type ResourceIdentifierList = js.Array[ResourceIdentifier]
  type ResourceType = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagValue = String
  type Tags = StringDictionary[TagValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-11-27`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
