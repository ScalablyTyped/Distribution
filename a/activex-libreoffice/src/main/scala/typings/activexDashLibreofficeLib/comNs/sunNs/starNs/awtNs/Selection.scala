package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a numerical range. */
trait Selection extends js.Object {
  /** specifies the upper limit of the range. */
  var Max: scala.Double
  /** specifies the lower limit of the range. */
  var Min: scala.Double
}

object Selection {
  @scala.inline
  def apply(Max: scala.Double, Min: scala.Double): Selection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Max")(Max)
    __obj.updateDynamic("Min")(Min)
    __obj.asInstanceOf[Selection]
  }
}

