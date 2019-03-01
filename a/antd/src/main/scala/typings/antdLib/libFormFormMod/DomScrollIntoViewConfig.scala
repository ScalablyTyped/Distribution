package typings
package antdLib.libFormFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomScrollIntoViewConfig extends js.Object {
  /** 是否和左边界对齐 */
  var alignWithLeft: js.UndefOr[scala.Boolean] = js.undefined
  /** 是否和上边界对齐  */
  var alignWithTop: js.UndefOr[scala.Boolean] = js.undefined
  /** 是否允许容器水平滚动 */
  var allowHorizontalScroll: js.UndefOr[scala.Boolean] = js.undefined
  /** 底部偏移量 */
  var offsetBottom: js.UndefOr[scala.Double] = js.undefined
  /** 左侧偏移量 */
  var offsetLeft: js.UndefOr[scala.Double] = js.undefined
  /** 右侧偏移量 */
  var offsetRight: js.UndefOr[scala.Double] = js.undefined
  /** 顶部偏移量 */
  var offsetTop: js.UndefOr[scala.Double] = js.undefined
  /** 当内容可见时是否允许滚动容器 */
  var onlyScrollIfNeeded: js.UndefOr[scala.Boolean] = js.undefined
}

object DomScrollIntoViewConfig {
  @scala.inline
  def apply(
    alignWithLeft: js.UndefOr[scala.Boolean] = js.undefined,
    alignWithTop: js.UndefOr[scala.Boolean] = js.undefined,
    allowHorizontalScroll: js.UndefOr[scala.Boolean] = js.undefined,
    offsetBottom: scala.Int | scala.Double = null,
    offsetLeft: scala.Int | scala.Double = null,
    offsetRight: scala.Int | scala.Double = null,
    offsetTop: scala.Int | scala.Double = null,
    onlyScrollIfNeeded: js.UndefOr[scala.Boolean] = js.undefined
  ): DomScrollIntoViewConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignWithLeft)) __obj.updateDynamic("alignWithLeft")(alignWithLeft)
    if (!js.isUndefined(alignWithTop)) __obj.updateDynamic("alignWithTop")(alignWithTop)
    if (!js.isUndefined(allowHorizontalScroll)) __obj.updateDynamic("allowHorizontalScroll")(allowHorizontalScroll)
    if (offsetBottom != null) __obj.updateDynamic("offsetBottom")(offsetBottom.asInstanceOf[js.Any])
    if (offsetLeft != null) __obj.updateDynamic("offsetLeft")(offsetLeft.asInstanceOf[js.Any])
    if (offsetRight != null) __obj.updateDynamic("offsetRight")(offsetRight.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyScrollIfNeeded)) __obj.updateDynamic("onlyScrollIfNeeded")(onlyScrollIfNeeded)
    __obj.asInstanceOf[DomScrollIntoViewConfig]
  }
}

