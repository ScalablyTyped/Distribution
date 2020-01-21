package typings.atom.linterMod

import typings.atom.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplacementSolution extends js.Object {
  var currentText: js.UndefOr[String] = js.undefined
  var position: Range
  var priority: js.UndefOr[Double] = js.undefined
  var replaceWith: String
  var title: js.UndefOr[String] = js.undefined
}

object ReplacementSolution {
  @scala.inline
  def apply(
    position: Range,
    replaceWith: String,
    currentText: String = null,
    priority: Int | Double = null,
    title: String = null
  ): ReplacementSolution = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], replaceWith = replaceWith.asInstanceOf[js.Any])
    if (currentText != null) __obj.updateDynamic("currentText")(currentText.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplacementSolution]
  }
}

