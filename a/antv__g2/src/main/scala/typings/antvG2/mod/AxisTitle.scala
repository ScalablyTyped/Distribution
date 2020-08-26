package typings.antvG2.mod

import typings.antvG2.antvG2Strings.center
import typings.antvG2.antvG2Strings.end
import typings.antvG2.antvG2Strings.start
import typings.antvG2.mod.Styles.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 坐标轴线
  */
@js.native
trait AxisTitle extends js.Object {
  /**
    * 是否需要自动旋转，默认为 `true`
    */
  var autoRotate: js.UndefOr[Boolean] = js.native
  /**
    * 数值，设置坐标轴标题距离坐标轴线的距离
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * 标题的显示位置（相对于坐标轴线）
    */
  var position: js.UndefOr[start | center | end] = js.native
  /**
    * 设置标题的文本样式
    */
  var textStyle: js.UndefOr[text] = js.native
}

object AxisTitle {
  @scala.inline
  def apply(): AxisTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisTitle]
  }
  @scala.inline
  implicit class AxisTitleOps[Self <: AxisTitle] (val x: Self) extends AnyVal {
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
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPosition(value: start | center | end): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setTextStyle(value: text): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
  }
  
}

