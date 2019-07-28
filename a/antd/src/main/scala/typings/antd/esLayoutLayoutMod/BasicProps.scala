package typings.antd.esLayoutLayoutMod

import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicProps extends HTMLAttributes[HTMLDivElement] {
  var hasSider: js.UndefOr[Boolean] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
}

object BasicProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    hasSider: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null
  ): BasicProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(hasSider)) __obj.updateDynamic("hasSider")(hasSider)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.asInstanceOf[BasicProps]
  }
}

