package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBotResponse extends js.Object {
  /**
    * The updated bot details.
    */
  var Bot: js.UndefOr[typings.awsDashSdk.clientsChimeMod.Bot] = js.native
}

object UpdateBotResponse {
  @scala.inline
  def apply(Bot: Bot = null): UpdateBotResponse = {
    val __obj = js.Dynamic.literal()
    if (Bot != null) __obj.updateDynamic("Bot")(Bot.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBotResponse]
  }
}

