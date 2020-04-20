package typings.agGrid.gridSerializerMod

import typings.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridSerializingSession[T] extends js.Object {
  def addCustomFooter(customFooter: T): Unit
  /**
    * ROW METHODS
    */
  def addCustomHeader(customHeader: T): Unit
  def onNewBodyRow(): RowAccumulator
  def onNewHeaderGroupingRow(): RowSpanningAccumulator
  def onNewHeaderRow(): RowAccumulator
  /**
    * FINAL RESULT
    */
  def parse(): String
  /**
    * INITIAL METHOD
    */
  def prepare(columnsToExport: js.Array[Column]): Unit
}

object GridSerializingSession {
  @scala.inline
  def apply[T](
    addCustomFooter: T => Unit,
    addCustomHeader: T => Unit,
    onNewBodyRow: () => RowAccumulator,
    onNewHeaderGroupingRow: () => RowSpanningAccumulator,
    onNewHeaderRow: () => RowAccumulator,
    parse: () => String,
    prepare: js.Array[Column] => Unit
  ): GridSerializingSession[T] = {
    val __obj = js.Dynamic.literal(addCustomFooter = js.Any.fromFunction1(addCustomFooter), addCustomHeader = js.Any.fromFunction1(addCustomHeader), onNewBodyRow = js.Any.fromFunction0(onNewBodyRow), onNewHeaderGroupingRow = js.Any.fromFunction0(onNewHeaderGroupingRow), onNewHeaderRow = js.Any.fromFunction0(onNewHeaderRow), parse = js.Any.fromFunction0(parse), prepare = js.Any.fromFunction1(prepare))
    __obj.asInstanceOf[GridSerializingSession[T]]
  }
}

