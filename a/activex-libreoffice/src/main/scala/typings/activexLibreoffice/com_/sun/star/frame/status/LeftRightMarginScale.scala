package typings.activexLibreoffice.com_.sun.star.frame.status

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a left and right margin.
  * @since LibreOffice 5.3
  */
trait LeftRightMarginScale extends js.Object {
  /** specifies if the automatic calculation of the first line indent occurs. */
  var AutoFirstLine: Boolean
  /** specifies a first line indent relative to TextLeft in 1/100th mm. */
  var FirstLine: Double
  /** specifies a left margin in 1/100th mm. */
  var Left: Double
  /** specifies a right margin in 1/100th mm. */
  var Right: Double
  /** specifies a scale value for the first line margin in percent. */
  var ScaleFirstLine: Double
  /** specifies a scale value for the left margin in percent. */
  var ScaleLeft: Double
  /** specifies a scale value for the right margin in percent. */
  var ScaleRight: Double
  /** specifies a left text margin in 1/100th mm. */
  var TextLeft: Double
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
}

