package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure contains data representing a two-dimensional size.
  *
  * The data is stored integer-valued.
  * @since OOo 2.0
  */
trait IntegerSize2D extends js.Object {
  var Height: scala.Double
  var Width: scala.Double
}

object IntegerSize2D {
  @scala.inline
  def apply(Height: scala.Double, Width: scala.Double): IntegerSize2D = {
    val __obj = js.Dynamic.literal(Height = Height, Width = Width)
  
    __obj.asInstanceOf[IntegerSize2D]
  }
}

