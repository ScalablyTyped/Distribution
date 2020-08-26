package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselMaxRow extends js.Object {
  var carouselMaxRow: Double = js.native
  var columnNum: Double = js.native
  var data: js.Array[scala.Nothing] = js.native
  var hasLine: Boolean = js.native
  var isCarousel: Boolean = js.native
  var prefixCls: String = js.native
  var square: Boolean = js.native
}

object CarouselMaxRow {
  @scala.inline
  def apply(
    carouselMaxRow: Double,
    columnNum: Double,
    data: js.Array[scala.Nothing],
    hasLine: Boolean,
    isCarousel: Boolean,
    prefixCls: String,
    square: Boolean
  ): CarouselMaxRow = {
    val __obj = js.Dynamic.literal(carouselMaxRow = carouselMaxRow.asInstanceOf[js.Any], columnNum = columnNum.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], hasLine = hasLine.asInstanceOf[js.Any], isCarousel = isCarousel.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], square = square.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselMaxRow]
  }
  @scala.inline
  implicit class CarouselMaxRowOps[Self <: CarouselMaxRow] (val x: Self) extends AnyVal {
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
    def setCarouselMaxRow(value: Double): Self = this.set("carouselMaxRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnNum(value: Double): Self = this.set("columnNum", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: scala.Nothing*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[scala.Nothing]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasLine(value: Boolean): Self = this.set("hasLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCarousel(value: Boolean): Self = this.set("isCarousel", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setSquare(value: Boolean): Self = this.set("square", value.asInstanceOf[js.Any])
  }
  
}

