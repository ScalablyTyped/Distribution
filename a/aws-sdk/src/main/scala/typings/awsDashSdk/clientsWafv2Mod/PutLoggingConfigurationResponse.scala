package typings.awsDashSdk.clientsWafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutLoggingConfigurationResponse extends js.Object {
  /**
    * 
    */
  var LoggingConfiguration: js.UndefOr[typings.awsDashSdk.clientsWafv2Mod.LoggingConfiguration] = js.native
}

object PutLoggingConfigurationResponse {
  @scala.inline
  def apply(LoggingConfiguration: LoggingConfiguration = null): PutLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (LoggingConfiguration != null) __obj.updateDynamic("LoggingConfiguration")(LoggingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLoggingConfigurationResponse]
  }
}

