package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutLoggingConfigurationResponse extends js.Object {
  /**
    * The LoggingConfiguration that you submitted in the request.
    */
  var LoggingConfiguration: js.UndefOr[typings.awsDashSdk.clientsWafMod.LoggingConfiguration] = js.native
}

object PutLoggingConfigurationResponse {
  @scala.inline
  def apply(LoggingConfiguration: LoggingConfiguration = null): PutLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (LoggingConfiguration != null) __obj.updateDynamic("LoggingConfiguration")(LoggingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLoggingConfigurationResponse]
  }
}

