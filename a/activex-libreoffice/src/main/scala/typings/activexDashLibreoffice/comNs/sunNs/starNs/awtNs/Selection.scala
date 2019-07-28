package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

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
    val __obj = js.Dynamic.literal(Max = Max, Min = Min)
  
    __obj.asInstanceOf[Selection]
  }
}

