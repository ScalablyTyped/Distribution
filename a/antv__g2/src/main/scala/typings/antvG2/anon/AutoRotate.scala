package typings.antvG2.anon

import typings.antvG2.antvG2Numbers.`0.5`
import typings.antvG2.antvG2Strings.`39Percentsign`
import typings.antvG2.antvG2Strings.center
import typings.antvG2.antvG2Strings.end
import typings.antvG2.antvG2Strings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoRotate extends js.Object {
  /**
    * 是否沿线的角度排布，默认为 true
    */
  var autoRotate: js.UndefOr[Boolean] = js.native
  /**
    * 文本的内容
    */
  var content: js.UndefOr[String] = js.native
  /**
    * x 方向的偏移量
    */
  var offsetX: js.UndefOr[Double] = js.native
  /**
    * y 方向的偏移量
    */
  var offsetY: js.UndefOr[Double] = js.native
  /**
    * 文本的显示位置
    */
  var position: js.UndefOr[start | center | end | `39Percentsign` | `0.5`] = js.native
  /**
    * 文本图形样式配置
    */
  var style: js.UndefOr[js.Any] = js.native
}

object AutoRotate {
  @scala.inline
  def apply(): AutoRotate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoRotate]
  }
  @scala.inline
  implicit class AutoRotateOps[Self <: AutoRotate] (val x: Self) extends AnyVal {
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
    def setAutoRotate(value: Boolean): Self = this.set("autoRotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRotate: Self = this.set("autoRotate", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    @scala.inline
    def setPosition(value: start | center | end | `39Percentsign` | `0.5`): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

