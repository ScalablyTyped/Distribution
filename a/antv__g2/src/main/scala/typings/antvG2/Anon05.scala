package typings.antvG2

import typings.antvG2.antvG2Numbers.`0.5`
import typings.antvG2.antvG2Strings.`39Percentsign`
import typings.antvG2.antvG2Strings.center
import typings.antvG2.antvG2Strings.end
import typings.antvG2.antvG2Strings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon05 extends js.Object {
  /**
    * 是否沿线的角度排布，默认为 true
    */
  var autoRotate: js.UndefOr[Boolean] = js.undefined
  /**
    * 文本的内容
    */
  var content: js.UndefOr[String] = js.undefined
  /**
    * x 方向的偏移量
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  /**
    * y 方向的偏移量
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  /**
    * 文本的显示位置
    */
  var position: js.UndefOr[start | center | end | `39Percentsign` | `0.5`] = js.undefined
  /**
    * 文本图形样式配置
    */
  var style: js.UndefOr[js.Any] = js.undefined
}

object Anon05 {
  @scala.inline
  def apply(
    autoRotate: js.UndefOr[Boolean] = js.undefined,
    content: String = null,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null,
    position: start | center | end | `39Percentsign` | `0.5` = null,
    style: js.Any = null
  ): Anon05 = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRotate)) __obj.updateDynamic("autoRotate")(autoRotate.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon05]
  }
}

