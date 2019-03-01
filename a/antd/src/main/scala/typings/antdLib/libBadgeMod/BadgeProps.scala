package typings
package antdLib.libBadgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Number to show in badge */
  var count: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** whether to show red dot without number */
  var dot: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[js.Tuple2[scala.Double | java.lang.String, scala.Double | java.lang.String]] = js.undefined
  /** Max count to show */
  var overflowCount: js.UndefOr[scala.Double] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var scrollNumberPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var showZero: js.UndefOr[scala.Boolean] = js.undefined
  var status: js.UndefOr[
    antdLib.antdLibStrings.success | antdLib.antdLibStrings.processing | antdLib.antdLibStrings.default | antdLib.antdLibStrings.error | antdLib.antdLibStrings.warning
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object BadgeProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    count: reactLib.reactMod.ReactNs.ReactNode = null,
    dot: js.UndefOr[scala.Boolean] = js.undefined,
    offset: js.Tuple2[scala.Double | java.lang.String, scala.Double | java.lang.String] = null,
    overflowCount: scala.Int | scala.Double = null,
    prefixCls: java.lang.String = null,
    scrollNumberPrefixCls: java.lang.String = null,
    showZero: js.UndefOr[scala.Boolean] = js.undefined,
    status: antdLib.antdLibStrings.success | antdLib.antdLibStrings.processing | antdLib.antdLibStrings.default | antdLib.antdLibStrings.error | antdLib.antdLibStrings.warning = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    text: java.lang.String = null,
    title: java.lang.String = null
  ): BadgeProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (overflowCount != null) __obj.updateDynamic("overflowCount")(overflowCount.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (scrollNumberPrefixCls != null) __obj.updateDynamic("scrollNumberPrefixCls")(scrollNumberPrefixCls)
    if (!js.isUndefined(showZero)) __obj.updateDynamic("showZero")(showZero)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[BadgeProps]
  }
}

