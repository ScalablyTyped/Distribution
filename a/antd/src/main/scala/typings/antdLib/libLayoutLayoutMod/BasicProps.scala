package typings
package antdLib.libLayoutLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] {
  var hasSider: js.UndefOr[scala.Boolean] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
}

object BasicProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] = null,
    hasSider: js.UndefOr[scala.Boolean] = js.undefined,
    prefixCls: java.lang.String = null
  ): BasicProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(hasSider)) __obj.updateDynamic("hasSider")(hasSider)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.asInstanceOf[BasicProps]
  }
}

