package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the 2-dimensional size of an area using width and height. */
trait Size extends js.Object {
  /** specifies the height. */
  var Height: Double
  /** specifies the width. */
  var Width: Double
}

object Size {
  @scala.inline
  def apply(Height: Double, Width: Double): Size = {
    val __obj = js.Dynamic.literal(Height = Height, Width = Width)
  
    __obj.asInstanceOf[Size]
  }
}

