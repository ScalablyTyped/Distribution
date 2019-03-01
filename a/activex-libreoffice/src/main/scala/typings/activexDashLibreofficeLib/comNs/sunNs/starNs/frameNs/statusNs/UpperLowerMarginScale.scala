package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.statusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies an upper and lower margin.
  * @since OOo 2.0
  */
trait UpperLowerMarginScale extends js.Object {
  /** specifies a lower margin in 1/100th mm. */
  var Lower: scala.Double
  /** specifies a scale value for the lower margin. */
  var ScaleLower: scala.Double
  /** specifies a scale value for the upper margin. */
  var ScaleUpper: scala.Double
  /** specifies a upper margin in 1/100th mm. */
  var Upper: scala.Double
}

object UpperLowerMarginScale {
  @scala.inline
  def apply(Lower: scala.Double, ScaleLower: scala.Double, ScaleUpper: scala.Double, Upper: scala.Double): UpperLowerMarginScale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Lower")(Lower)
    __obj.updateDynamic("ScaleLower")(ScaleLower)
    __obj.updateDynamic("ScaleUpper")(ScaleUpper)
    __obj.updateDynamic("Upper")(Upper)
    __obj.asInstanceOf[UpperLowerMarginScale]
  }
}

