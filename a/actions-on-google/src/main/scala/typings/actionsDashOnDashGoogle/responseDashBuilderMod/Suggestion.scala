package typings.actionsDashOnDashGoogle.responseDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Suggestion extends js.Object {
  /** Text of the suggestion. */
  var title: String
}

object Suggestion {
  @scala.inline
  def apply(title: String): Suggestion = {
    val __obj = js.Dynamic.literal(title = title)
  
    __obj.asInstanceOf[Suggestion]
  }
}

