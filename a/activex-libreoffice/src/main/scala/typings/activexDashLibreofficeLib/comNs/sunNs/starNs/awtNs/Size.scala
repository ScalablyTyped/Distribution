package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the 2-dimensional size of an area using width and height. */
trait Size extends js.Object {
  /** specifies the height. */
  var Height: scala.Double
  /** specifies the width. */
  var Width: scala.Double
}

object Size {
  @scala.inline
  def apply(Height: scala.Double, Width: scala.Double): Size = {
    val __obj = js.Dynamic.literal(Height = Height, Width = Width)
  
    __obj.asInstanceOf[Size]
  }
}

