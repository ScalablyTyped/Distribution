package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsApplicationinsightsMod {
  type AffectedResource = java.lang.String
  type ApplicationComponentList = js.Array[ApplicationComponent]
  type ApplicationInfoList = js.Array[ApplicationInfo]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ComponentConfiguration = java.lang.String
  type ComponentName = java.lang.String
  type EndTime = stdLib.Date
  type Feedback = org.scalablytyped.runtime.StringDictionary[FeedbackValue]
  type FeedbackKey = awsDashSdkLib.awsDashSdkLibStrings.INSIGHTS_FEEDBACK | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_SPECIFIED
    - awsDashSdkLib.awsDashSdkLibStrings.USEFUL
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_USEFUL
    - java.lang.String
  */
  type FeedbackValue = _FeedbackValue | java.lang.String
  type Insights = java.lang.String
  type LifeCycle = java.lang.String
  type LineTime = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.WARN
    - awsDashSdkLib.awsDashSdkLibStrings.INFO
    - java.lang.String
  */
  type LogFilter = _LogFilter | java.lang.String
  type LogGroup = java.lang.String
  type LogText = java.lang.String
  type MaxEntities = scala.Double
  type MetricName = java.lang.String
  type MetricNamespace = java.lang.String
  type Monitor = scala.Boolean
  type NewComponentName = java.lang.String
  type ObservationId = java.lang.String
  type ObservationList = js.Array[Observation]
  type PaginationToken = java.lang.String
  type ProblemId = java.lang.String
  type ProblemList = js.Array[Problem]
  type Remarks = java.lang.String
  type ResourceARN = java.lang.String
  type ResourceGroupName = java.lang.String
  type ResourceList = js.Array[ResourceARN]
  type ResourceType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.LOW
    - awsDashSdkLib.awsDashSdkLibStrings.MEDIUM
    - awsDashSdkLib.awsDashSdkLibStrings.HIGH
    - java.lang.String
  */
  type SeverityLevel = _SeverityLevel | java.lang.String
  type SourceARN = java.lang.String
  type SourceType = java.lang.String
  type StartTime = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IGNORE
    - awsDashSdkLib.awsDashSdkLibStrings.RESOLVED
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - java.lang.String
  */
  type Status = _Status | java.lang.String
  type Tier = java.lang.String
  type Title = java.lang.String
  type Unit = java.lang.String
  type Value = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-11-25`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
