package typings
package actionsDashOnDashGoogleLib.responseDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Suggestion extends js.Object {
  /** Text of the suggestion. */
  var title: java.lang.String
}

object Suggestion {
  @scala.inline
  def apply(title: java.lang.String): Suggestion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Suggestion]
  }
}

