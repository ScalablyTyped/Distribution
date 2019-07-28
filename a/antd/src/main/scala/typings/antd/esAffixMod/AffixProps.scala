package typings.antd.esAffixMod

import typings.react.reactMod.CSSProperties
import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AffixProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  /** 距离窗口底部达到指定偏移量后触发 */
  var offsetBottom: js.UndefOr[Double] = js.undefined
  /**
    * 距离窗口顶部达到指定偏移量后触发
    */
  var offsetTop: js.UndefOr[Double] = js.undefined
  /** 固定状态改变时触发的回调函数 */
  var onChange: js.UndefOr[js.Function1[/* affixed */ js.UndefOr[Boolean], Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  /** 设置 Affix 需要监听其滚动事件的元素，值为一个返回对应 DOM 元素的函数 */
  var target: js.UndefOr[js.Function0[Window | HTMLElement | Null]] = js.undefined
}

object AffixProps {
  @scala.inline
  def apply(
    className: String = null,
    offset: Int | Double = null,
    offsetBottom: Int | Double = null,
    offsetTop: Int | Double = null,
    onChange: /* affixed */ js.UndefOr[Boolean] => Unit = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    target: () => Window | HTMLElement | Null = null
  ): AffixProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (offsetBottom != null) __obj.updateDynamic("offsetBottom")(offsetBottom.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (target != null) __obj.updateDynamic("target")(js.Any.fromFunction0(target))
    __obj.asInstanceOf[AffixProps]
  }
}

