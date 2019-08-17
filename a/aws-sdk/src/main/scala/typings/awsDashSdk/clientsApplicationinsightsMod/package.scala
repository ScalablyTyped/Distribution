package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsApplicationinsightsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.INSIGHTS_FEEDBACK
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AffectedResource = String
  type ApplicationComponentList = js.Array[ApplicationComponent]
  type ApplicationInfoList = js.Array[ApplicationInfo]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ComponentConfiguration = String
  type ComponentName = String
  type EndTime = Date
  type Feedback = StringDictionary[FeedbackValue]
  type FeedbackKey = INSIGHTS_FEEDBACK | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NOT_SPECIFIED
    - typings.awsDashSdk.awsDashSdkStrings.USEFUL
    - typings.awsDashSdk.awsDashSdkStrings.NOT_USEFUL
    - java.lang.String
  */
  type FeedbackValue = _FeedbackValue | String
  type Insights = String
  type LifeCycle = String
  type LineTime = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - typings.awsDashSdk.awsDashSdkStrings.WARN
    - typings.awsDashSdk.awsDashSdkStrings.INFO
    - java.lang.String
  */
  type LogFilter = _LogFilter | String
  type LogGroup = String
  type LogText = String
  type MaxEntities = Double
  type MetricName = String
  type MetricNamespace = String
  type Monitor = Boolean
  type NewComponentName = String
  type ObservationId = String
  type ObservationList = js.Array[Observation]
  type OpsCenterEnabled = Boolean
  type OpsItemSNSTopicArn = String
  type PaginationToken = String
  type ProblemId = String
  type ProblemList = js.Array[Problem]
  type Remarks = String
  type RemoveSNSTopic = Boolean
  type ResourceARN = String
  type ResourceGroupName = String
  type ResourceList = js.Array[ResourceARN]
  type ResourceType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.LOW
    - typings.awsDashSdk.awsDashSdkStrings.MEDIUM
    - typings.awsDashSdk.awsDashSdkStrings.HIGH
    - java.lang.String
  */
  type SeverityLevel = _SeverityLevel | String
  type SourceARN = String
  type SourceType = String
  type StartTime = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IGNORE
    - typings.awsDashSdk.awsDashSdkStrings.RESOLVED
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - java.lang.String
  */
  type Status = _Status | String
  type Tier = String
  type Title = String
  type Unit = String
  type Value = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-11-25`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
