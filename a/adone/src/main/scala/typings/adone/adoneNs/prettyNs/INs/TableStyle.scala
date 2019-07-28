package typings.adone.adoneNs.prettyNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableStyle extends js.Object {
  var broder: js.UndefOr[js.Array[String]] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  var head: js.UndefOr[js.Array[String]] = js.undefined
  var `padding-left`: js.UndefOr[Double] = js.undefined
  var `padding-right`: js.UndefOr[Double] = js.undefined
}

object TableStyle {
  @scala.inline
  def apply(
    broder: js.Array[String] = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    head: js.Array[String] = null,
    `padding-left`: Int | Double = null,
    `padding-right`: Int | Double = null
  ): TableStyle = {
    val __obj = js.Dynamic.literal()
    if (broder != null) __obj.updateDynamic("broder")(broder)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (head != null) __obj.updateDynamic("head")(head)
    if (`padding-left` != null) __obj.updateDynamic("padding-left")(`padding-left`.asInstanceOf[js.Any])
    if (`padding-right` != null) __obj.updateDynamic("padding-right")(`padding-right`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableStyle]
  }
}

