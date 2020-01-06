package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLoggingConfigurationsResponse extends js.Object {
  /**
    * An array of LoggingConfiguration objects.
    */
  var LoggingConfigurations: js.UndefOr[typings.awsDashSdk.clientsWafMod.LoggingConfigurations] = js.native
  /**
    * If you have more LoggingConfigurations than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more LoggingConfigurations, submit another ListLoggingConfigurations request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsDashSdk.clientsWafMod.NextMarker] = js.native
}

object ListLoggingConfigurationsResponse {
  @scala.inline
  def apply(LoggingConfigurations: LoggingConfigurations = null, NextMarker: NextMarker = null): ListLoggingConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (LoggingConfigurations != null) __obj.updateDynamic("LoggingConfigurations")(LoggingConfigurations.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLoggingConfigurationsResponse]
  }
}

