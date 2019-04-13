package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsIotjobsdataplaneMod {
  type ApproximateSecondsBeforeTimedOut = scala.Double
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DescribeJobExecutionJobId = java.lang.String
  type DetailsKey = java.lang.String
  type DetailsMap = org.scalablytyped.runtime.StringDictionary[DetailsValue]
  type DetailsValue = java.lang.String
  type ExecutionNumber = scala.Double
  type ExpectedVersion = scala.Double
  type IncludeExecutionState = scala.Boolean
  type IncludeJobDocument = scala.Boolean
  type JobDocument = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.QUEUED
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.TIMED_OUT
    - awsDashSdkLib.awsDashSdkLibStrings.REJECTED
    - awsDashSdkLib.awsDashSdkLibStrings.REMOVED
    - awsDashSdkLib.awsDashSdkLibStrings.CANCELED
    - java.lang.String
  */
  type JobExecutionStatus = _JobExecutionStatus | java.lang.String
  type JobExecutionSummaryList = js.Array[JobExecutionSummary]
  type JobId = java.lang.String
  type LastUpdatedAt = scala.Double
  type QueuedAt = scala.Double
  type StartedAt = scala.Double
  type StepTimeoutInMinutes = scala.Double
  type ThingName = java.lang.String
  type VersionNumber = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-09-29`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
