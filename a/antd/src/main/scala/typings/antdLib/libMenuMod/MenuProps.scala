package typings
package antdLib.libMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MenuProps
  extends antdLib.libConfigDashProviderMod.ConfigProviderProps {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultOpenKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var defaultSelectedKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var focusable: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var inlineCollapsed: js.UndefOr[scala.Boolean] = js.undefined
  var inlineIndent: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[MenuMode] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* param */ ClickParam, scala.Unit]] = js.undefined
  var onDeselect: js.UndefOr[js.Function1[/* param */ SelectParam, scala.Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* e */ reactLib.MouseEvent, scala.Unit]] = js.undefined
  var onOpenChange: js.UndefOr[js.Function1[/* openKeys */ js.Array[java.lang.String], scala.Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* param */ SelectParam, scala.Unit]] = js.undefined
  var openAnimation: js.UndefOr[java.lang.String | js.Object] = js.undefined
  var openKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var openTransitionName: js.UndefOr[java.lang.String | js.Object] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  var selectedKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var subMenuCloseDelay: js.UndefOr[scala.Double] = js.undefined
  var subMenuOpenDelay: js.UndefOr[scala.Double] = js.undefined
  var theme: js.UndefOr[MenuTheme] = js.undefined
}

