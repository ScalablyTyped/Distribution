package typings.antd.dividerMod

import typings.antd.antdStrings.center
import typings.antd.antdStrings.horizontal
import typings.antd.antdStrings.left
import typings.antd.antdStrings.right
import typings.antd.antdStrings.vertical
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DividerProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var dashed: js.UndefOr[Boolean] = js.undefined
  var orientation: js.UndefOr[left | right | center] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var `type`: js.UndefOr[horizontal | vertical] = js.undefined
}

object DividerProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    className: String = null,
    dashed: js.UndefOr[Boolean] = js.undefined,
    orientation: left | right | center = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    `type`: horizontal | vertical = null
  ): DividerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(dashed)) __obj.updateDynamic("dashed")(dashed.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DividerProps]
  }
}

