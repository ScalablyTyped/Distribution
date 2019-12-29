package typings.antDashDesignDashPro.libTrendMod

import typings.antDashDesignDashPro.antDashDesignDashProStrings.down
import typings.antDashDesignDashPro.antDashDesignDashProStrings.up
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITrendProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var colorful: js.UndefOr[Boolean] = js.undefined
  var flag: up | down
  var reverseColor: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ITrendProps {
  @scala.inline
  def apply(
    flag: up | down,
    className: String = null,
    colorful: js.UndefOr[Boolean] = js.undefined,
    reverseColor: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): ITrendProps = {
    val __obj = js.Dynamic.literal(flag = flag.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(colorful)) __obj.updateDynamic("colorful")(colorful.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseColor)) __obj.updateDynamic("reverseColor")(reverseColor.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITrendProps]
  }
}

