package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsResourcegroupstaggingapiMod {
  type AmazonResourceType = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.InternalServiceException
    - awsDashSdkLib.awsDashSdkLibStrings.InvalidParameterException
    - java.lang.String
  */
  type ErrorCode = _ErrorCode | java.lang.String
  type ErrorMessage = java.lang.String
  type FailedResourcesMap = org.scalablytyped.runtime.StringDictionary[FailureInfo]
  type PaginationToken = java.lang.String
  type ResourceARN = java.lang.String
  type ResourceARNList = js.Array[ResourceARN]
  type ResourceTagMappingList = js.Array[ResourceTagMapping]
  type ResourceTypeFilterList = js.Array[AmazonResourceType]
  type ResourcesPerPage = scala.Double
  type StatusCode = scala.Double
  type TagFilterList = js.Array[TagFilter]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagKeyListForUntag = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagMap = org.scalablytyped.runtime.StringDictionary[TagValue]
  type TagValue = java.lang.String
  type TagValueList = js.Array[TagValue]
  type TagValuesOutputList = js.Array[TagValue]
  type TagsPerPage = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-01-26`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
