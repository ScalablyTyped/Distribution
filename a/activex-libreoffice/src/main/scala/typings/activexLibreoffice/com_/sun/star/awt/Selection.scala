package typings.activexLibreoffice.com_.sun.star.awt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a numerical range. */
trait Selection extends js.Object {
  /** specifies the upper limit of the range. */
  var Max: Double
  /** specifies the lower limit of the range. */
  var Min: Double
}

object Selection {
  @scala.inline
  def apply(Max: Double, Min: Double): Selection = {
    val __obj = js.Dynamic.literal(Max = Max.asInstanceOf[js.Any], Min = Min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
}

