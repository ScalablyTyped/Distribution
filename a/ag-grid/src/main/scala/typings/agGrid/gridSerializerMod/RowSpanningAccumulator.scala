package typings.agGrid.gridSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowSpanningAccumulator extends js.Object {
  def onColumn(header: String, index: Double, span: Double): Unit
}

object RowSpanningAccumulator {
  @scala.inline
  def apply(onColumn: (String, Double, Double) => Unit): RowSpanningAccumulator = {
    val __obj = js.Dynamic.literal(onColumn = js.Any.fromFunction3(onColumn))
    __obj.asInstanceOf[RowSpanningAccumulator]
  }
}

