package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselMaxRow extends js.Object {
  var carouselMaxRow: Double
  var columnNum: Double
  var data: js.Array[scala.Nothing]
  var hasLine: Boolean
  var isCarousel: Boolean
  var prefixCls: String
  var square: Boolean
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
}

