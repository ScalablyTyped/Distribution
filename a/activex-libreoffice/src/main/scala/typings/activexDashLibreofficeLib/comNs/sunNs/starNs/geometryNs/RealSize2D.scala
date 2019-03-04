package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure contains data representing a two-dimensional size.
  *
  * The data is stored real-valued.
  * @since OOo 2.0
  */
trait RealSize2D extends js.Object {
  var Height: scala.Double
  var Width: scala.Double
}

object RealSize2D {
  @scala.inline
  def apply(Height: scala.Double, Width: scala.Double): RealSize2D = {
    val __obj = js.Dynamic.literal(Height = Height, Width = Width)
  
    __obj.asInstanceOf[RealSize2D]
  }
}

