package typings.actionsDashOnDashGoogle.responseDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkOutSuggestion extends js.Object {
  /** Text shown on the suggestion chip. */
  var title: String
  /** String URL to open. */
  var url: String
}

object LinkOutSuggestion {
  @scala.inline
  def apply(title: String, url: String): LinkOutSuggestion = {
    val __obj = js.Dynamic.literal(title = title, url = url)
  
    __obj.asInstanceOf[LinkOutSuggestion]
  }
}

