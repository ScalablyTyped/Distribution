package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBotResponse extends js.Object {
  /**
    * The chat bot details.
    */
  var Bot: js.UndefOr[typings.awsDashSdk.clientsChimeMod.Bot] = js.native
}

object GetBotResponse {
  @scala.inline
  def apply(Bot: Bot = null): GetBotResponse = {
    val __obj = js.Dynamic.literal()
    if (Bot != null) __obj.updateDynamic("Bot")(Bot.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBotResponse]
  }
}

