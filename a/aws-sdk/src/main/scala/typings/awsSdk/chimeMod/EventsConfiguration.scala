package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsConfiguration extends js.Object {
  /**
    * The bot ID.
    */
  var BotId: js.UndefOr[String] = js.native
  /**
    * Lambda function ARN that allows a bot to receive outgoing events.
    */
  var LambdaFunctionArn: js.UndefOr[SensitiveString] = js.native
  /**
    * HTTPS endpoint that allows a bot to receive outgoing events.
    */
  var OutboundEventsHTTPSEndpoint: js.UndefOr[SensitiveString] = js.native
}

object EventsConfiguration {
  @scala.inline
  def apply(): EventsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventsConfiguration]
  }
  @scala.inline
  implicit class EventsConfigurationOps[Self <: EventsConfiguration] (val x: Self) extends AnyVal {
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
    def setBotId(value: String): Self = this.set("BotId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBotId: Self = this.set("BotId", js.undefined)
    @scala.inline
    def setLambdaFunctionArn(value: SensitiveString): Self = this.set("LambdaFunctionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaFunctionArn: Self = this.set("LambdaFunctionArn", js.undefined)
    @scala.inline
    def setOutboundEventsHTTPSEndpoint(value: SensitiveString): Self = this.set("OutboundEventsHTTPSEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutboundEventsHTTPSEndpoint: Self = this.set("OutboundEventsHTTPSEndpoint", js.undefined)
  }
  
}

