package typings.amapJsApiScale.AMap.Scale

import typings.amapJsApi.AMap.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * 相对于地图容器左上角的偏移量
    */
  var offset: js.UndefOr[Pixel] = js.undefined
  /**
    * 控件停靠位置
    * LT:左上角;
    * RT:右上角;
    * LB:左下角;
    * RB:右下角;
    * 默认位置：LB
    */
  var position: js.UndefOr[Position] = js.undefined
  /**
    * 是否可见
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(offset: Pixel = null, position: Position = null, visible: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

