package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessLogSettings extends js.Object {
  /**
    * The ARN of the CloudWatch Logs log group to receive access logs.
    */
  var destinationArn: js.UndefOr[String] = js.undefined
  /**
    * A single line format of the access logs of data, as specified by selected $context variables. The format must include at least $context.requestId.
    */
  var format: js.UndefOr[String] = js.undefined
}

object AccessLogSettings {
  @scala.inline
  def apply(destinationArn: String = null, format: String = null): AccessLogSettings = {
    val __obj = js.Dynamic.literal()
    if (destinationArn != null) __obj.updateDynamic("destinationArn")(destinationArn)
    if (format != null) __obj.updateDynamic("format")(format)
    __obj.asInstanceOf[AccessLogSettings]
  }
}

