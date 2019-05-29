package typings
package antdLib.libProgressProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  direction ? :string} & antd.antd/lib/progress/progress.StringGradients | antd.antd/lib/progress/progress.FromToGradients */
trait ProgressGradient
  extends /* percentage */ org.scalablytyped.runtime.StringDictionary[java.lang.String] {
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var from: js.UndefOr[java.lang.String] = js.undefined
  var to: js.UndefOr[java.lang.String] = js.undefined
}

object ProgressGradient {
  @scala.inline
  def apply(
    StringDictionary: /* percentage */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    direction: java.lang.String = null,
    from: java.lang.String = null,
    to: java.lang.String = null
  ): ProgressGradient = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (from != null) __obj.updateDynamic("from")(from)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[ProgressGradient]
  }
}

