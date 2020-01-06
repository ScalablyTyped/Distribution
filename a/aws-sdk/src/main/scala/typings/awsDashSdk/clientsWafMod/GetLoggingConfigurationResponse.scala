package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoggingConfigurationResponse extends js.Object {
  /**
    * The LoggingConfiguration for the specified web ACL.
    */
  var LoggingConfiguration: js.UndefOr[typings.awsDashSdk.clientsWafMod.LoggingConfiguration] = js.native
}

object GetLoggingConfigurationResponse {
  @scala.inline
  def apply(LoggingConfiguration: LoggingConfiguration = null): GetLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (LoggingConfiguration != null) __obj.updateDynamic("LoggingConfiguration")(LoggingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoggingConfigurationResponse]
  }
}

