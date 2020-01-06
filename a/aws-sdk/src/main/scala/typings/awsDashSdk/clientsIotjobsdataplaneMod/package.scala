package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsIotjobsdataplaneMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  type ApproximateSecondsBeforeTimedOut = Double
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type DescribeJobExecutionJobId = String
  type DetailsKey = String
  type DetailsMap = StringDictionary[DetailsValue]
  type DetailsValue = String
  type ExecutionNumber = Double
  type ExpectedVersion = Double
  type IncludeExecutionState = Boolean
  type IncludeJobDocument = Boolean
  type JobDocument = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.QUEUED
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.TIMED_OUT
    - typings.awsDashSdk.awsDashSdkStrings.REJECTED
    - typings.awsDashSdk.awsDashSdkStrings.REMOVED
    - typings.awsDashSdk.awsDashSdkStrings.CANCELED
    - java.lang.String
  */
  type JobExecutionStatus = _JobExecutionStatus | String
  type JobExecutionSummaryList = js.Array[JobExecutionSummary]
  type JobId = String
  type LastUpdatedAt = Double
  type QueuedAt = Double
  type StartedAt = Double
  type StepTimeoutInMinutes = Double
  type ThingName = String
  type VersionNumber = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-09-29`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
