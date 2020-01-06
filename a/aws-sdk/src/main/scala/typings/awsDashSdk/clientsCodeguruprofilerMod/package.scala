package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCodeguruprofilerMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type AgentProfile = Buffer | Uint8Array | Blob | java.lang.String
  type AggregatedProfile = Buffer | Uint8Array | Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.P1D
    - typings.awsDashSdk.awsDashSdkStrings.PT1H
    - typings.awsDashSdk.awsDashSdkStrings.PT5M
    - java.lang.String
  */
  type AggregationPeriod = _AggregationPeriod | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientToken = java.lang.String
  type FleetInstanceId = java.lang.String
  type Integer = Double
  type MaxDepth = Double
  type MaxResults = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TimestampAscending
    - typings.awsDashSdk.awsDashSdkStrings.TimestampDescending
    - java.lang.String
  */
  type OrderBy = _OrderBy | java.lang.String
  type PaginationToken = java.lang.String
  type Period = java.lang.String
  type ProfileTimes = js.Array[ProfileTime]
  type ProfilingGroupArn = java.lang.String
  type ProfilingGroupDescriptions = js.Array[ProfilingGroupDescription]
  type ProfilingGroupName = java.lang.String
  type ProfilingGroupNames = js.Array[ProfilingGroupName]
  type String = java.lang.String
  type Timestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2019-07-18`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
