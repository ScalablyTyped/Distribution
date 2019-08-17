package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsDlmMod {
  import typings.awsDashSdk.awsDashSdkStrings.EBS_SNAPSHOT_MANAGEMENT
  import typings.awsDashSdk.awsDashSdkStrings.HOURS
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CopyTags = Boolean
  type Count = Double
  type ExcludeBootVolume = Boolean
  type ExecutionRoleArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - java.lang.String
  */
  type GettablePolicyStateValues = _GettablePolicyStateValues | java.lang.String
  type Interval = Double
  type IntervalUnitValues = HOURS | java.lang.String
  type LifecyclePolicySummaryList = js.Array[LifecyclePolicySummary]
  type PolicyDescription = java.lang.String
  type PolicyId = java.lang.String
  type PolicyIdList = js.Array[PolicyId]
  type PolicyTypeValues = EBS_SNAPSHOT_MANAGEMENT | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.VOLUME
    - typings.awsDashSdk.awsDashSdkStrings.INSTANCE
    - java.lang.String
  */
  type ResourceTypeValues = _ResourceTypeValues | java.lang.String
  type ResourceTypeValuesList = js.Array[ResourceTypeValues]
  type ScheduleList = js.Array[Schedule]
  type ScheduleName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type SettablePolicyStateValues = _SettablePolicyStateValues | java.lang.String
  type String = java.lang.String
  type TagFilter = java.lang.String
  type TagsToAddFilterList = js.Array[TagFilter]
  type TagsToAddList = js.Array[Tag]
  type TargetTagList = js.Array[Tag]
  type TargetTagsFilterList = js.Array[TagFilter]
  type Time = java.lang.String
  type TimesList = js.Array[Time]
  type Timestamp = Date
  type VariableTagsList = js.Array[Tag]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-01-12`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
