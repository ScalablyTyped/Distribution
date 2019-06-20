package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsResourcegroupstaggingapiMod {
  type AmazonResourceType = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ComplianceStatus = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.InternalServiceException
    - awsDashSdkLib.awsDashSdkLibStrings.InvalidParameterException
    - java.lang.String
  */
  type ErrorCode = _ErrorCode | java.lang.String
  type ErrorMessage = java.lang.String
  type ExcludeCompliantResources = scala.Boolean
  type FailedResourcesMap = org.scalablytyped.runtime.StringDictionary[FailureInfo]
  type GroupBy = js.Array[GroupByAttribute]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TARGET_ID
    - awsDashSdkLib.awsDashSdkLibStrings.REGION
    - awsDashSdkLib.awsDashSdkLibStrings.RESOURCE_TYPE
    - java.lang.String
  */
  type GroupByAttribute = _GroupByAttribute | java.lang.String
  type IncludeComplianceDetails = scala.Boolean
  type LastUpdated = stdLib.Date
  type MaxResultTagsDS1 = scala.Double
  type MaxResultsGetComplianceSummary = scala.Double
  type NonCompliantResources = scala.Double
  type PaginationToken = java.lang.String
  type Policy = java.lang.String
  type Region = java.lang.String
  type RegionFilterList = js.Array[Region]
  type ResourceARN = java.lang.String
  type ResourceARNList = js.Array[ResourceARN]
  type ResourceTagMappingList = js.Array[ResourceTagMapping]
  type ResourceTypeFilterList = js.Array[AmazonResourceType]
  type ResourcesPerPage = scala.Double
  type RootId = java.lang.String
  type S3Bucket = java.lang.String
  type S3Location = java.lang.String
  type Status = java.lang.String
  type StatusCode = scala.Double
  type SummaryList = js.Array[Summary]
  type TagFilterList = js.Array[TagFilter]
  type TagKey = java.lang.String
  type TagKeyFilterList = js.Array[TagKey]
  type TagKeyList = js.Array[TagKey]
  type TagKeyListForUntag = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagMap = org.scalablytyped.runtime.StringDictionary[TagValue]
  type TagValue = java.lang.String
  type TagValueList = js.Array[TagValue]
  type TagValuesOutputList = js.Array[TagValue]
  type TagsPerPage = scala.Double
  type TargetId = java.lang.String
  type TargetIdFilterList = js.Array[TargetId]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-01-26`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
