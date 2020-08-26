package typings.amapJsApi.AMap.MassMarks

import typings.amapJsApi.AMap.Pixel
import typings.amapJsApi.AMap.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Style extends js.Object {
  /**
    * 图标显示位置偏移量，以图标的左上角为基准点（0,0）点
    */
  var anchor: Pixel = js.native
  /**
    * 旋转角度
    */
  var rotation: js.UndefOr[Double] = js.native
  /**
    * 图标的尺寸
    */
  var size: Size = js.native
  /**
    * 图标的地址
    */
  var url: String = js.native
}

object Style {
  @scala.inline
  def apply(anchor: Pixel, size: Size, url: String): Style = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
  @scala.inline
  implicit class StyleOps[Self <: Style] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnchor(value: Pixel): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
  }
  
}

