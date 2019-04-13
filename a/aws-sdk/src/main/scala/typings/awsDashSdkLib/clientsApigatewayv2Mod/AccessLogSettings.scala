package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessLogSettings extends js.Object {
  /**
    * The ARN of the CloudWatch Logs log group to receive access logs.
    */
  var DestinationArn: js.UndefOr[Arn] = js.undefined
  /**
    * A single line format of the access logs of data, as specified by selected $context
    variables. The format must include at least $context.requestId.
    */
  var Format: js.UndefOr[StringWithLengthBetween1And1024] = js.undefined
}

object AccessLogSettings {
  @scala.inline
  def apply(DestinationArn: Arn = null, Format: StringWithLengthBetween1And1024 = null): AccessLogSettings = {
    val __obj = js.Dynamic.literal()
    if (DestinationArn != null) __obj.updateDynamic("DestinationArn")(DestinationArn)
    if (Format != null) __obj.updateDynamic("Format")(Format)
    __obj.asInstanceOf[AccessLogSettings]
  }
}

