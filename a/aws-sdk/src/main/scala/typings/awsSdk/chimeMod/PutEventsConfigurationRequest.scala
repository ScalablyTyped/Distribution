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
  def apply(AccountId: NonEmptyString, BotId: NonEmptyString): PutEventsConfigurationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BotId = BotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventsConfigurationRequest]
  }
  @scala.inline
  implicit class PutEventsConfigurationRequestOps[Self <: PutEventsConfigurationRequest] (val x: Self) extends AnyVal {
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
    def setAccountId(value: NonEmptyString): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBotId(value: NonEmptyString): Self = this.set("BotId", value.asInstanceOf[js.Any])
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

