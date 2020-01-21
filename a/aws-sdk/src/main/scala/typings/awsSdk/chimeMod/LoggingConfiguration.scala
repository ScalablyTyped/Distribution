package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingConfiguration extends js.Object {
  /**
    * When true, enables SIP message logs for sending to Amazon CloudWatch Logs.
    */
  var EnableSIPLogs: js.UndefOr[Boolean] = js.native
}

object LoggingConfiguration {
  @scala.inline
  def apply(EnableSIPLogs: js.UndefOr[scala.Boolean] = js.undefined): LoggingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(EnableSIPLogs)) __obj.updateDynamic("EnableSIPLogs")(EnableSIPLogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfiguration]
  }
}

