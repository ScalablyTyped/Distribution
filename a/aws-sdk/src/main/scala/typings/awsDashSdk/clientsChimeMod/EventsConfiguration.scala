package typings.awsDashSdk.clientsChimeMod

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
  def apply(
    BotId: String = null,
    LambdaFunctionArn: SensitiveString = null,
    OutboundEventsHTTPSEndpoint: SensitiveString = null
  ): EventsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (BotId != null) __obj.updateDynamic("BotId")(BotId.asInstanceOf[js.Any])
    if (LambdaFunctionArn != null) __obj.updateDynamic("LambdaFunctionArn")(LambdaFunctionArn.asInstanceOf[js.Any])
    if (OutboundEventsHTTPSEndpoint != null) __obj.updateDynamic("OutboundEventsHTTPSEndpoint")(OutboundEventsHTTPSEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsConfiguration]
  }
}

