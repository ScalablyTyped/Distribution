package typings.agGrid.gridSerializerMod

import typings.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridSerializingSession[T] extends js.Object {
  
  def addCustomFooter(customFooter: T): Unit = js.native
  
  /**
    * ROW METHODS
    */
  def addCustomHeader(customHeader: T): Unit = js.native
  
  def onNewBodyRow(): RowAccumulator = js.native
  
  def onNewHeaderGroupingRow(): RowSpanningAccumulator = js.native
  
  def onNewHeaderRow(): RowAccumulator = js.native
  
  /**
    * FINAL RESULT
    */
  def parse(): String = js.native
  
  /**
    * INITIAL METHOD
    */
  def prepare(columnsToExport: js.Array[Column]): Unit = js.native
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
  
  @scala.inline
  implicit class GridSerializingSessionOps[Self <: GridSerializingSession[_], T] (val x: Self with GridSerializingSession[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddCustomFooter(value: T => Unit): Self = this.set("addCustomFooter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddCustomHeader(value: T => Unit): Self = this.set("addCustomHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnNewBodyRow(value: () => RowAccumulator): Self = this.set("onNewBodyRow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnNewHeaderGroupingRow(value: () => RowSpanningAccumulator): Self = this.set("onNewHeaderGroupingRow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnNewHeaderRow(value: () => RowAccumulator): Self = this.set("onNewHeaderRow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParse(value: () => String): Self = this.set("parse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrepare(value: js.Array[Column] => Unit): Self = this.set("prepare", js.Any.fromFunction1(value))
  }
}
