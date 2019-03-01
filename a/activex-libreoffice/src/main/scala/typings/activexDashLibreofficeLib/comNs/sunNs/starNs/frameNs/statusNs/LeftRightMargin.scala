package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.statusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a left and right margin.
  * @since OOo 2.0
  */
trait LeftRightMargin extends js.Object {
  /** specifies a left side margin in 1/100th mm. */
  var Left: scala.Double
  /** specifies a right side margin in 1/100th mm. */
  var Right: scala.Double
}

object LeftRightMargin {
  @scala.inline
  def apply(Left: scala.Double, Right: scala.Double): LeftRightMargin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Left")(Left)
    __obj.updateDynamic("Right")(Right)
    __obj.asInstanceOf[LeftRightMargin]
  }
}

