package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessLogSettings extends js.Object {
  /**
    * The ARN of the CloudWatch Logs log group to receive access logs.
    */
  var destinationArn: js.UndefOr[String] = js.native
  /**
    * A single line format of the access logs of data, as specified by selected $context variables. The format must include at least $context.requestId.
    */
  var format: js.UndefOr[String] = js.native
}

object AccessLogSettings {
  @scala.inline
  def apply(destinationArn: String = null, format: String = null): AccessLogSettings = {
    val __obj = js.Dynamic.literal()
    if (destinationArn != null) __obj.updateDynamic("destinationArn")(destinationArn.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessLogSettings]
  }
}

