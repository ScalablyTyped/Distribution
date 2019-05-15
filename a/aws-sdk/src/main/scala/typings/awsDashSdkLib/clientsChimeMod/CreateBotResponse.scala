package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBotResponse extends js.Object {
  /**
    * The bot details.
    */
  var Bot: js.UndefOr[Bot] = js.undefined
}

object CreateBotResponse {
  @scala.inline
  def apply(Bot: Bot = null): CreateBotResponse = {
    val __obj = js.Dynamic.literal()
    if (Bot != null) __obj.updateDynamic("Bot")(Bot)
    __obj.asInstanceOf[CreateBotResponse]
  }
}

