package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a single line for a {@link HomogenMatrix3} . */
trait HomogenMatrixLine3 extends js.Object {
  var Column1: scala.Double
  var Column2: scala.Double
  var Column3: scala.Double
}

object HomogenMatrixLine3 {
  @scala.inline
  def apply(Column1: scala.Double, Column2: scala.Double, Column3: scala.Double): HomogenMatrixLine3 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Column1")(Column1)
    __obj.updateDynamic("Column2")(Column2)
    __obj.updateDynamic("Column3")(Column3)
    __obj.asInstanceOf[HomogenMatrixLine3]
  }
}

