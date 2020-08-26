package typings.activexLibreoffice.com_.sun.star.frame.status

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a left and right margin.
  * @since LibreOffice 5.3
  */
@js.native
trait LeftRightMarginScale extends js.Object {
  /** specifies if the automatic calculation of the first line indent occurs. */
  var AutoFirstLine: Boolean = js.native
  /** specifies a first line indent relative to TextLeft in 1/100th mm. */
  var FirstLine: Double = js.native
  /** specifies a left margin in 1/100th mm. */
  var Left: Double = js.native
  /** specifies a right margin in 1/100th mm. */
  var Right: Double = js.native
  /** specifies a scale value for the first line margin in percent. */
  var ScaleFirstLine: Double = js.native
  /** specifies a scale value for the left margin in percent. */
  var ScaleLeft: Double = js.native
  /** specifies a scale value for the right margin in percent. */
  var ScaleRight: Double = js.native
  /** specifies a left text margin in 1/100th mm. */
  var TextLeft: Double = js.native
}

object LeftRightMarginScale {
  @scala.inline
  def apply(
    AutoFirstLine: Boolean,
    FirstLine: Double,
    Left: Double,
    Right: Double,
    ScaleFirstLine: Double,
    ScaleLeft: Double,
    ScaleRight: Double,
    TextLeft: Double
  ): LeftRightMarginScale = {
    val __obj = js.Dynamic.literal(AutoFirstLine = AutoFirstLine.asInstanceOf[js.Any], FirstLine = FirstLine.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any], ScaleFirstLine = ScaleFirstLine.asInstanceOf[js.Any], ScaleLeft = ScaleLeft.asInstanceOf[js.Any], ScaleRight = ScaleRight.asInstanceOf[js.Any], TextLeft = TextLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftRightMarginScale]
  }
  @scala.inline
  implicit class LeftRightMarginScaleOps[Self <: LeftRightMarginScale] (val x: Self) extends AnyVal {
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
    def setAutoFirstLine(value: Boolean): Self = this.set("AutoFirstLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstLine(value: Double): Self = this.set("FirstLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("Left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Double): Self = this.set("Right", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleFirstLine(value: Double): Self = this.set("ScaleFirstLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleLeft(value: Double): Self = this.set("ScaleLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleRight(value: Double): Self = this.set("ScaleRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextLeft(value: Double): Self = this.set("TextLeft", value.asInstanceOf[js.Any])
  }
  
}

