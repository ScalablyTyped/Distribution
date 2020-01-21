package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBotResponse extends js.Object {
  /**
    * The bot details.
    */
  var Bot: js.UndefOr[typings.awsSdk.chimeMod.Bot] = js.native
}

object CreateBotResponse {
  @scala.inline
  def apply(Bot: Bot = null): CreateBotResponse = {
    val __obj = js.Dynamic.literal()
    if (Bot != null) __obj.updateDynamic("Bot")(Bot.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBotResponse]
  }
}

