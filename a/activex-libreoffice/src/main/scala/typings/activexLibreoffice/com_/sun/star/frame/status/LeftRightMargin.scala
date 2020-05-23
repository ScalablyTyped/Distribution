package typings.activexLibreoffice.com_.sun.star.frame.status

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a left and right margin.
  * @since OOo 2.0
  */
trait LeftRightMargin extends js.Object {
  /** specifies a left side margin in 1/100th mm. */
  var Left: Double
  /** specifies a right side margin in 1/100th mm. */
  var Right: Double
}

object LeftRightMargin {
  @scala.inline
  def apply(Left: Double, Right: Double): LeftRightMargin = {
    val __obj = js.Dynamic.literal(Left = Left.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftRightMargin]
  }
}

