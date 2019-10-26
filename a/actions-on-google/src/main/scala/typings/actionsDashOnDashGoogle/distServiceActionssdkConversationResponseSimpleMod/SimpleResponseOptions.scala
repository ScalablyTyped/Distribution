package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseSimpleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleResponseOptions extends js.Object {
  /**
    * Speech to be spoken to user. SSML allowed.
    * @public
    */
  var speech: String
  /**
    * Optional text to be shown to user
    * @public
    */
  var text: js.UndefOr[String] = js.undefined
}

object SimpleResponseOptions {
  @scala.inline
  def apply(speech: String, text: String = null): SimpleResponseOptions = {
    val __obj = js.Dynamic.literal(speech = speech)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[SimpleResponseOptions]
  }
}

