package typings.activexLibreoffice.com_.sun.star.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Size used for layouting windows. It specifies a range of valid values and a preferred value. The values must not violate the relation 0 <&#61; Minimum
  * <&#61; Preferred <&#61; Maximum.
  * @param Minimum Zero or positive. The value itself is included in the valid range.
  * @param Maximum A value larger than or equal to Minimum. The special value -1 means that there is no upper bound. Every value larger than or equal to Min
  * @param Preferred The preferred size inside the valid range.
  */
trait LayoutSize extends js.Object {
  var Maximum: Double
  var Minimum: Double
  var Preferred: Double
}

object LayoutSize {
  @scala.inline
  def apply(Maximum: Double, Minimum: Double, Preferred: Double): LayoutSize = {
    val __obj = js.Dynamic.literal(Maximum = Maximum.asInstanceOf[js.Any], Minimum = Minimum.asInstanceOf[js.Any], Preferred = Preferred.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutSize]
  }
}

