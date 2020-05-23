package typings.activexLibreoffice.com_.sun.star.frame.status

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies an upper and lower margin.
  * @since OOo 2.0
  */
trait UpperLowerMarginScale extends js.Object {
  /** specifies a lower margin in 1/100th mm. */
  var Lower: Double
  /** specifies a scale value for the lower margin. */
  var ScaleLower: Double
  /** specifies a scale value for the upper margin. */
  var ScaleUpper: Double
  /** specifies a upper margin in 1/100th mm. */
  var Upper: Double
}

object UpperLowerMarginScale {
  @scala.inline
  def apply(Lower: Double, ScaleLower: Double, ScaleUpper: Double, Upper: Double): UpperLowerMarginScale = {
    val __obj = js.Dynamic.literal(Lower = Lower.asInstanceOf[js.Any], ScaleLower = ScaleLower.asInstanceOf[js.Any], ScaleUpper = ScaleUpper.asInstanceOf[js.Any], Upper = Upper.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpperLowerMarginScale]
  }
}

