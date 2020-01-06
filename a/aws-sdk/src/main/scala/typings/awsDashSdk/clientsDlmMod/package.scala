package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsDlmMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.EBS_SNAPSHOT_MANAGEMENT
  import typings.awsDashSdk.awsDashSdkStrings.HOURS
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AvailabilityZone = java.lang.String
  type AvailabilityZoneList = js.Array[AvailabilityZone]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CmkArn = java.lang.String
  type CopyTags = Boolean
  type CopyTagsNullable = Boolean
  type Count = Double
  type CrossRegionCopyRules = js.Array[CrossRegionCopyRule]
  type Encrypted = Boolean
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
  type PolicyArn = java.lang.String
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
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DAYS
    - typings.awsDashSdk.awsDashSdkStrings.WEEKS
    - typings.awsDashSdk.awsDashSdkStrings.MONTHS
    - typings.awsDashSdk.awsDashSdkStrings.YEARS
    - java.lang.String
  */
  type RetentionIntervalUnitValues = _RetentionIntervalUnitValues | java.lang.String
  type ScheduleList = js.Array[Schedule]
  type ScheduleName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type SettablePolicyStateValues = _SettablePolicyStateValues | java.lang.String
  type StatusMessage = java.lang.String
  type String = java.lang.String
  type TagFilter = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagMap = StringDictionary[TagValue]
  type TagValue = java.lang.String
  type TagsToAddFilterList = js.Array[TagFilter]
  type TagsToAddList = js.Array[Tag]
  type TargetRegion = java.lang.String
  type TargetTagList = js.Array[Tag]
  type TargetTagsFilterList = js.Array[TagFilter]
  type Time = java.lang.String
  type TimesList = js.Array[Time]
  type Timestamp = Date
  type VariableTagsList = js.Array[Tag]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-01-12`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
