package typings.awsDashSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsResourcegroupstaggingapiMod {
  type AmazonResourceType = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InternalServiceException
    - typings.awsDashSdk.awsDashSdkStrings.InvalidParameterException
    - java.lang.String
  */
  type ErrorCode = _ErrorCode | String
  type ErrorMessage = String
  type FailedResourcesMap = StringDictionary[FailureInfo]
  type PaginationToken = String
  type ResourceARN = String
  type ResourceARNList = js.Array[ResourceARN]
  type ResourceTagMappingList = js.Array[ResourceTagMapping]
  type ResourceTypeFilterList = js.Array[AmazonResourceType]
  type ResourcesPerPage = Double
  type StatusCode = Double
  type TagFilterList = js.Array[TagFilter]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagKeyListForUntag = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagMap = StringDictionary[TagValue]
  type TagValue = String
  type TagValueList = js.Array[TagValue]
  type TagValuesOutputList = js.Array[TagValue]
  type TagsPerPage = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-01-26`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
