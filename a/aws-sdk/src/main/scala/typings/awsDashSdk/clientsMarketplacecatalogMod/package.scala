package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMarketplacecatalogMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  type ARN = String
  type Catalog = String
  type ChangeSetDescription = js.Array[ChangeSummary]
  type ChangeSetName = String
  type ChangeSetSummaryList = js.Array[ChangeSetSummaryListItem]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PREPARING
    - typings.awsDashSdk.awsDashSdkStrings.APPLYING
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.CANCELLED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type ChangeStatus = _ChangeStatus | String
  type ChangeType = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = String
  type DateTimeISO8601 = String
  type EntitySummaryList = js.Array[EntitySummary]
  type EntityType = String
  type ErrorDetailList = js.Array[ErrorDetail]
  type FilterList = js.Array[Filter]
  type FilterName = String
  type Identifier = String
  type Json = String
  type MaxResultInteger = Double
  type NextToken = String
  type RequestedChangeList = js.Array[Change]
  type ResourceId = String
  type ResourceIdList = js.Array[ResourceId]
  type SortBy = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ASCENDING
    - typings.awsDashSdk.awsDashSdkStrings.DESCENDING
    - java.lang.String
  */
  type SortOrder = _SortOrder | String
  type StringValue = String
  type ValueList = js.Array[StringValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-09-17`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
