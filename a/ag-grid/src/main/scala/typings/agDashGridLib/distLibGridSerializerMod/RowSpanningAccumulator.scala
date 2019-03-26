package typings
package agDashGridLib.distLibGridSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowSpanningAccumulator extends js.Object {
  def onColumn(header: java.lang.String, index: scala.Double, span: scala.Double): scala.Unit
}

object RowSpanningAccumulator {
  @scala.inline
  def apply(onColumn: (java.lang.String, scala.Double, scala.Double) => scala.Unit): RowSpanningAccumulator = {
    val __obj = js.Dynamic.literal(onColumn = js.Any.fromFunction3(onColumn))
  
    __obj.asInstanceOf[RowSpanningAccumulator]
  }
}

