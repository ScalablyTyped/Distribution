package typings
package atomLib.linterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplacementSolution extends js.Object {
  var currentText: js.UndefOr[java.lang.String] = js.undefined
  var position: atomLib.atomMod.Range
  var priority: js.UndefOr[scala.Double] = js.undefined
  var replaceWith: java.lang.String
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ReplacementSolution {
  @scala.inline
  def apply(
    position: atomLib.atomMod.Range,
    replaceWith: java.lang.String,
    currentText: java.lang.String = null,
    priority: scala.Int | scala.Double = null,
    title: java.lang.String = null
  ): ReplacementSolution = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("replaceWith")(replaceWith)
    if (currentText != null) __obj.updateDynamic("currentText")(currentText)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ReplacementSolution]
  }
}

