package typings.atom.linterMod

import typings.atom.atomMod.Range
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
    val __obj = js.Dynamic.literal(position = position, replaceWith = replaceWith)
    if (currentText != null) __obj.updateDynamic("currentText")(currentText)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ReplacementSolution]
  }
}

