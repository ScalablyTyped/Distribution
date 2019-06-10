package typings
package antdLib.esDividerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DividerProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var dashed: js.UndefOr[scala.Boolean] = js.undefined
  var orientation: js.UndefOr[
    antdLib.antdLibStrings.left | antdLib.antdLibStrings.right | antdLib.antdLibStrings.center
  ] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var `type`: js.UndefOr[antdLib.antdLibStrings.horizontal | antdLib.antdLibStrings.vertical] = js.undefined
}

object DividerProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    dashed: js.UndefOr[scala.Boolean] = js.undefined,
    orientation: antdLib.antdLibStrings.left | antdLib.antdLibStrings.right | antdLib.antdLibStrings.center = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    `type`: antdLib.antdLibStrings.horizontal | antdLib.antdLibStrings.vertical = null
  ): DividerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(dashed)) __obj.updateDynamic("dashed")(dashed)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DividerProps]
  }
}

