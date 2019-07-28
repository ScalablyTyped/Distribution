package typings.antd.libBadgeMod

import typings.antd.antdStrings.error
import typings.antd.antdStrings.processing
import typings.antd.antdStrings.success
import typings.antd.antdStrings.warning
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  /** Number to show in badge */
  var count: js.UndefOr[ReactNode] = js.undefined
  /** whether to show red dot without number */
  var dot: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.undefined
  /** Max count to show */
  var overflowCount: js.UndefOr[Double] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var scrollNumberPrefixCls: js.UndefOr[String] = js.undefined
  var showZero: js.UndefOr[Boolean] = js.undefined
  var status: js.UndefOr[success | processing | typings.antd.antdStrings.default | error | warning] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var text: js.UndefOr[ReactNode] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object BadgeProps {
  @scala.inline
  def apply(
    className: String = null,
    color: String = null,
    count: ReactNode = null,
    dot: js.UndefOr[Boolean] = js.undefined,
    offset: js.Tuple2[Double | String, Double | String] = null,
    overflowCount: Int | Double = null,
    prefixCls: String = null,
    scrollNumberPrefixCls: String = null,
    showZero: js.UndefOr[Boolean] = js.undefined,
    status: success | processing | typings.antd.antdStrings.default | error | warning = null,
    style: CSSProperties = null,
    text: ReactNode = null,
    title: String = null
  ): BadgeProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (overflowCount != null) __obj.updateDynamic("overflowCount")(overflowCount.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (scrollNumberPrefixCls != null) __obj.updateDynamic("scrollNumberPrefixCls")(scrollNumberPrefixCls)
    if (!js.isUndefined(showZero)) __obj.updateDynamic("showZero")(showZero)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[BadgeProps]
  }
}

