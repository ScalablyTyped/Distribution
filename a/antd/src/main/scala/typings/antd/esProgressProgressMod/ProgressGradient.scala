package typings.antd.esProgressProgressMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  direction ? :string} & antd.antd/es/progress/progress.StringGradients | antd.antd/es/progress/progress.FromToGradients */
trait ProgressGradient extends /* percentage */ StringDictionary[String] {
  var direction: js.UndefOr[String] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var to: js.UndefOr[String] = js.undefined
}

object ProgressGradient {
  @scala.inline
  def apply(
    StringDictionary: /* percentage */ StringDictionary[String] = null,
    direction: String = null,
    from: String = null,
    to: String = null
  ): ProgressGradient = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (from != null) __obj.updateDynamic("from")(from)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[ProgressGradient]
  }
}

