package typings.antdDashMobileDashRn.libBadgePropsTypeMod

import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.large
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgePropsTypes extends js.Object {
  var corner: js.UndefOr[Boolean] = js.undefined
  var dot: js.UndefOr[Boolean] = js.undefined
  var overflowCount: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[large | small] = js.undefined
  var text: js.UndefOr[js.Any] = js.undefined
}

object BadgePropsTypes {
  @scala.inline
  def apply(
    corner: js.UndefOr[Boolean] = js.undefined,
    dot: js.UndefOr[Boolean] = js.undefined,
    overflowCount: Int | Double = null,
    size: large | small = null,
    text: js.Any = null
  ): BadgePropsTypes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(corner)) __obj.updateDynamic("corner")(corner)
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (overflowCount != null) __obj.updateDynamic("overflowCount")(overflowCount.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[BadgePropsTypes]
  }
}

