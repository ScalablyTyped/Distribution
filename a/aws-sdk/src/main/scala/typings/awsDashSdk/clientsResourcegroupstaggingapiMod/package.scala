package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsResourcegroupstaggingapiMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  type AmazonResourceType = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ComplianceStatus = Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InternalServiceException
    - typings.awsDashSdk.awsDashSdkStrings.InvalidParameterException
    - java.lang.String
  */
  type ErrorCode = _ErrorCode | String
  type ErrorMessage = String
  type ExcludeCompliantResources = Boolean
  type FailedResourcesMap = StringDictionary[FailureInfo]
  type GroupBy = js.Array[GroupByAttribute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TARGET_ID
    - typings.awsDashSdk.awsDashSdkStrings.REGION
    - typings.awsDashSdk.awsDashSdkStrings.RESOURCE_TYPE
    - java.lang.String
  */
  type GroupByAttribute = _GroupByAttribute | String
  type IncludeComplianceDetails = Boolean
  type LastUpdated = String
  type MaxResultsGetComplianceSummary = Double
  type NonCompliantResources = Double
  type PaginationToken = String
  type Region = String
  type RegionFilterList = js.Array[Region]
  type ResourceARN = String
  type ResourceARNList = js.Array[ResourceARN]
  type ResourceTagMappingList = js.Array[ResourceTagMapping]
  type ResourceTypeFilterList = js.Array[AmazonResourceType]
  type ResourcesPerPage = Double
  type S3Bucket = String
  type S3Location = String
  type Status = String
  type StatusCode = Double
  type SummaryList = js.Array[Summary]
  type TagFilterList = js.Array[TagFilter]
  type TagKey = String
  type TagKeyFilterList = js.Array[TagKey]
  type TagKeyList = js.Array[TagKey]
  type TagKeyListForUntag = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagMap = StringDictionary[TagValue]
  type TagValue = String
  type TagValueList = js.Array[TagValue]
  type TagValuesOutputList = js.Array[TagValue]
  type TagsPerPage = Double
  type TargetId = String
  type TargetIdFilterList = js.Array[TargetId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACCOUNT
    - typings.awsDashSdk.awsDashSdkStrings.OU
    - typings.awsDashSdk.awsDashSdkStrings.ROOT
    - java.lang.String
  */
  type TargetIdType = _TargetIdType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-01-26`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
