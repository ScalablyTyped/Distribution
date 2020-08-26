package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessLogSettings extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or Kinesis Data Firehose delivery stream to receive access logs. If you specify a Kinesis Data Firehose delivery stream, the stream name must begin with amazon-apigateway-.
    */
  var destinationArn: js.UndefOr[String] = js.native
  /**
    * A single line format of the access logs of data, as specified by selected $context variables. The format must include at least $context.requestId.
    */
  var format: js.UndefOr[String] = js.native
}

object AccessLogSettings {
  @scala.inline
  def apply(): AccessLogSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessLogSettings]
  }
  @scala.inline
  implicit class AccessLogSettingsOps[Self <: AccessLogSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestinationArn(value: String): Self = this.set("destinationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationArn: Self = this.set("destinationArn", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
  
}

