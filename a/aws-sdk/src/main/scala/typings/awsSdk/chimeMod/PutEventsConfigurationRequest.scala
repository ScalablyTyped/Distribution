package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEventsConfigurationRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The bot ID.
    */
  var BotId: NonEmptyString = js.native
  /**
    * Lambda function ARN that allows the bot to receive outgoing events.
    */
  var LambdaFunctionArn: js.UndefOr[SensitiveString] = js.native
  /**
    * HTTPS endpoint that allows the bot to receive outgoing events.
    */
  var OutboundEventsHTTPSEndpoint: js.UndefOr[SensitiveString] = js.native
}

object PutEventsConfigurationRequest {
  @scala.inline
  def apply(
    AccountId: NonEmptyString,
    BotId: NonEmptyString,
    LambdaFunctionArn: SensitiveString = null,
    OutboundEventsHTTPSEndpoint: SensitiveString = null
  ): PutEventsConfigurationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BotId = BotId.asInstanceOf[js.Any])
    if (LambdaFunctionArn != null) __obj.updateDynamic("LambdaFunctionArn")(LambdaFunctionArn.asInstanceOf[js.Any])
    if (OutboundEventsHTTPSEndpoint != null) __obj.updateDynamic("OutboundEventsHTTPSEndpoint")(OutboundEventsHTTPSEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventsConfigurationRequest]
  }
}

