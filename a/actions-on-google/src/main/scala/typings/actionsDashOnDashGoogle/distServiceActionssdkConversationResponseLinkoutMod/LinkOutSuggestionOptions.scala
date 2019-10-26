package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseLinkoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkOutSuggestionOptions extends js.Object {
  /**
    * Text shown on the suggestion chip.
    * @public
    */
  var name: String
  /**
    * String URL to open.
    * @public
    */
  var url: String
}

object LinkOutSuggestionOptions {
  @scala.inline
  def apply(name: String, url: String): LinkOutSuggestionOptions = {
    val __obj = js.Dynamic.literal(name = name, url = url)
  
    __obj.asInstanceOf[LinkOutSuggestionOptions]
  }
}

