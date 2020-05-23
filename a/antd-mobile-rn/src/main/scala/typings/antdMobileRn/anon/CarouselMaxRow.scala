package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselMaxRow extends js.Object {
  var carouselMaxRow: Double
  var columnNum: Double
  var data: js.Array[scala.Nothing]
  var hasLine: Boolean
  var isCarousel: Boolean
  var styles: StringDictionary[RegisteredStyle[_]]
}

object CarouselMaxRow {
  @scala.inline
  def apply(
    carouselMaxRow: Double,
    columnNum: Double,
    data: js.Array[scala.Nothing],
    hasLine: Boolean,
    isCarousel: Boolean,
    styles: StringDictionary[RegisteredStyle[_]]
  ): CarouselMaxRow = {
    val __obj = js.Dynamic.literal(carouselMaxRow = carouselMaxRow.asInstanceOf[js.Any], columnNum = columnNum.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], hasLine = hasLine.asInstanceOf[js.Any], isCarousel = isCarousel.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselMaxRow]
  }
}

