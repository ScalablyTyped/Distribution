package typings.activexDashLibreoffice.comNs.sunNs.starNs.geometryNs

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
  var Height: Double
  var Width: Double
}

object RealSize2D {
  @scala.inline
  def apply(Height: Double, Width: Double): RealSize2D = {
    val __obj = js.Dynamic.literal(Height = Height, Width = Width)
  
    __obj.asInstanceOf[RealSize2D]
  }
}

