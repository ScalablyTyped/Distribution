package typings.adone.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchPathOptions extends js.Object {
  var dot: js.UndefOr[Boolean] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var index: js.UndefOr[Boolean] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object MatchPathOptions {
  @scala.inline
  def apply(
    dot: js.UndefOr[Boolean] = js.undefined,
    end: Int | Double = null,
    index: js.UndefOr[Boolean] = js.undefined,
    start: Int | Double = null
  ): MatchPathOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchPathOptions]
  }
}

