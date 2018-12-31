package typings
package antdLib.libLayoutSiderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiderProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] {
  var breakpoint: js.UndefOr[
    antdLib.antdLibStrings.xs | antdLib.antdLibStrings.sm | antdLib.antdLibStrings.md | antdLib.antdLibStrings.lg | antdLib.antdLibStrings.xl | antdLib.antdLibStrings.xxl
  ] = js.undefined
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  var collapsedWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var collapsible: js.UndefOr[scala.Boolean] = js.undefined
  var defaultCollapsed: js.UndefOr[scala.Boolean] = js.undefined
  var onBreakpoint: js.UndefOr[js.Function1[/* broken */ scala.Boolean, scala.Unit]] = js.undefined
  var onCollapse: js.UndefOr[js.Function2[/* collapsed */ scala.Boolean, /* type */ CollapseType, scala.Unit]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var reverseArrow: js.UndefOr[scala.Boolean] = js.undefined
  var theme: js.UndefOr[SiderTheme] = js.undefined
  var trigger: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

