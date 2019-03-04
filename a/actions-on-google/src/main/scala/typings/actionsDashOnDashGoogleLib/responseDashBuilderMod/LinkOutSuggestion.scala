package typings
package actionsDashOnDashGoogleLib.responseDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkOutSuggestion extends js.Object {
  /** Text shown on the suggestion chip. */
  var title: java.lang.String
  /** String URL to open. */
  var url: java.lang.String
}

object LinkOutSuggestion {
  @scala.inline
  def apply(title: java.lang.String, url: java.lang.String): LinkOutSuggestion = {
    val __obj = js.Dynamic.literal(title = title, url = url)
  
    __obj.asInstanceOf[LinkOutSuggestion]
  }
}

