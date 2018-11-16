package typings
package antdLib.libAffixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AffixProps extends js.Object {
  var offset: js.UndefOr[scala.Double] = js.undefined
  /** 距离窗口底部达到指定偏移量后触发 */
  var offsetBottom: js.UndefOr[scala.Double] = js.undefined
  /**
       * 距离窗口顶部达到指定偏移量后触发
       */
  var offsetTop: js.UndefOr[scala.Double] = js.undefined
  /** 固定状态改变时触发的回调函数 */
  var onChange: js.UndefOr[js.Function1[/* affixed */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /** 设置 Affix 需要监听其滚动事件的元素，值为一个返回对应 DOM 元素的函数 */
  var target: js.UndefOr[js.Function0[stdLib.Window | reactLib.HTMLElement | scala.Null]] = js.undefined
}

