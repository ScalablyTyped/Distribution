package typings
package adoneLib.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchPathOptions extends js.Object {
  var dot: js.UndefOr[scala.Boolean] = js.undefined
  var end: js.UndefOr[scala.Double] = js.undefined
  var index: js.UndefOr[scala.Boolean] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
}

object MatchPathOptions {
  @scala.inline
  def apply(
    dot: js.UndefOr[scala.Boolean] = js.undefined,
    end: scala.Int | scala.Double = null,
    index: js.UndefOr[scala.Boolean] = js.undefined,
    start: scala.Int | scala.Double = null
  ): MatchPathOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchPathOptions]
  }
}

