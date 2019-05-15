package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateBotResponse extends js.Object {
  /**
    * The updated bot details.
    */
  var Bot: js.UndefOr[Bot] = js.undefined
}

object UpdateBotResponse {
  @scala.inline
  def apply(Bot: Bot = null): UpdateBotResponse = {
    val __obj = js.Dynamic.literal()
    if (Bot != null) __obj.updateDynamic("Bot")(Bot)
    __obj.asInstanceOf[UpdateBotResponse]
  }
}

