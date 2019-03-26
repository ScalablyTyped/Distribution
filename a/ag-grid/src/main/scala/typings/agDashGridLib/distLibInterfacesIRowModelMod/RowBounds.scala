package typings
package agDashGridLib.distLibInterfacesIRowModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowBounds extends js.Object {
  var rowHeight: scala.Double
  var rowTop: scala.Double
}

object RowBounds {
  @scala.inline
  def apply(rowHeight: scala.Double, rowTop: scala.Double): RowBounds = {
    val __obj = js.Dynamic.literal(rowHeight = rowHeight, rowTop = rowTop)
  
    __obj.asInstanceOf[RowBounds]
  }
}

