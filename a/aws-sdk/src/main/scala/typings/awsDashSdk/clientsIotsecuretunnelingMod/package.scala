package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsIotsecuretunnelingMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AmazonResourceName = String
  type ClientAccessToken = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CONNECTED
    - typings.awsDashSdk.awsDashSdkStrings.DISCONNECTED
    - java.lang.String
  */
  type ConnectionStatus = _ConnectionStatus | String
  type DateType = Date
  type DeleteFlag = Boolean
  type Description = String
  type MaxResults = Double
  type NextToken = String
  type Service = String
  type ServiceList = js.Array[Service]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type ThingName = String
  type TimeoutInMin = Double
  type TunnelArn = String
  type TunnelId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OPEN
    - typings.awsDashSdk.awsDashSdkStrings.CLOSED
    - java.lang.String
  */
  type TunnelStatus = _TunnelStatus | String
  type TunnelSummaryList = js.Array[TunnelSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-10-05`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
