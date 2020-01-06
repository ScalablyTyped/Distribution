package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsAugmentedairuntimeMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FreeOfPersonallyIdentifiableInformation
    - typings.awsDashSdk.awsDashSdkStrings.FreeOfAdultContent
    - java.lang.String
  */
  type ContentClassifier = _ContentClassifier | java.lang.String
  type ContentClassifiers = js.Array[ContentClassifier]
  type FailureReason = java.lang.String
  type FlowDefinitionArn = java.lang.String
  type HumanLoopArn = java.lang.String
  type HumanLoopName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InProgress_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Completed_
    - typings.awsDashSdk.awsDashSdkStrings.Stopped_
    - typings.awsDashSdk.awsDashSdkStrings.Stopping_
    - java.lang.String
  */
  type HumanLoopStatus = _HumanLoopStatus | java.lang.String
  type HumanLoopSummaries = js.Array[HumanLoopSummary]
  type InputContent = java.lang.String
  type MaxResults = Double
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Ascending_
    - typings.awsDashSdk.awsDashSdkStrings.Descending_
    - java.lang.String
  */
  type SortOrder = _SortOrder | java.lang.String
  type String = java.lang.String
  type Timestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2019-11-07`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
