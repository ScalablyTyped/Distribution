package typings.amapDashJsDashApi.AMapNs.MassMarksNs

import typings.amapDashJsDashApi.AMapNs.Pixel
import typings.amapDashJsDashApi.AMapNs.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends js.Object {
  /**
    * 图标显示位置偏移量，以图标的左上角为基准点（0,0）点
    */
  var anchor: Pixel
  /**
    * 旋转角度
    */
  var rotation: js.UndefOr[Double] = js.undefined
  /**
    * 图标的尺寸
    */
  var size: Size
  /**
    * 图标的地址
    */
  var url: String
}

object Style {
  @scala.inline
  def apply(anchor: Pixel, size: Size, url: String, rotation: Int | Double = null): Style = {
    val __obj = js.Dynamic.literal(anchor = anchor, size = size, url = url)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
}

