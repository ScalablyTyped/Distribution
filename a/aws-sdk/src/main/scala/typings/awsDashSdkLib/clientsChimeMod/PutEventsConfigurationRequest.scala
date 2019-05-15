package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutEventsConfigurationRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  /**
    * The bot ID.
    */
  var BotId: NonEmptyString
  /**
    * Lambda function ARN that allows the bot to receive outgoing events.
    */
  var LambdaFunctionArn: js.UndefOr[SensitiveString] = js.undefined
  /**
    * HTTPS endpoint that allows the bot to receive outgoing events.
    */
  var OutboundEventsHTTPSEndpoint: js.UndefOr[SensitiveString] = js.undefined
}

object PutEventsConfigurationRequest {
  @scala.inline
  def apply(
    AccountId: NonEmptyString,
    BotId: NonEmptyString,
    LambdaFunctionArn: SensitiveString = null,
    OutboundEventsHTTPSEndpoint: SensitiveString = null
  ): PutEventsConfigurationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, BotId = BotId)
    if (LambdaFunctionArn != null) __obj.updateDynamic("LambdaFunctionArn")(LambdaFunctionArn)
    if (OutboundEventsHTTPSEndpoint != null) __obj.updateDynamic("OutboundEventsHTTPSEndpoint")(OutboundEventsHTTPSEndpoint)
    __obj.asInstanceOf[PutEventsConfigurationRequest]
  }
}

