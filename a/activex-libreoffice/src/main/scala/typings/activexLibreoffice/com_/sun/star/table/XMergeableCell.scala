package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to access information about a cell that is mergeable with other sells.
  * @see com.sun.star.table.Cell
  */
@js.native
trait XMergeableCell extends XCell {
  
  /** returns the number of rows this cell spans. */
  val ColumnSpan: Double = js.native
  
  /** returns the number of columns this cell spans. */
  val RowSpan: Double = js.native
  
  /** returns the number of rows this cell spans. */
  def getColumnSpan(): Double = js.native
  
  /** returns the number of columns this cell spans. */
  def getRowSpan(): Double = js.native
  
  /** returns `TRUE` if this cell is merged with another cell. */
  def isMerged(): Boolean = js.native
}
object XMergeableCell {
  
  @scala.inline
  def apply(
    ColumnSpan: Double,
    Error: Double,
    Formula: String,
    RowSpan: Double,
    Type: CellContentType,
    Value: Double,
    acquire: () => Unit,
    getColumnSpan: () => Double,
    getError: () => Double,
    getFormula: () => String,
    getRowSpan: () => Double,
    getType: () => CellContentType,
    getValue: () => Double,
    isMerged: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFormula: String => Unit,
    setValue: Double => Unit
  ): XMergeableCell = {
    val __obj = js.Dynamic.literal(ColumnSpan = ColumnSpan.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], RowSpan = RowSpan.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getColumnSpan = js.Any.fromFunction0(getColumnSpan), getError = js.Any.fromFunction0(getError), getFormula = js.Any.fromFunction0(getFormula), getRowSpan = js.Any.fromFunction0(getRowSpan), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue), isMerged = js.Any.fromFunction0(isMerged), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFormula = js.Any.fromFunction1(setFormula), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[XMergeableCell]
  }
  
  @scala.inline
  implicit class XMergeableCellOps[Self <: XMergeableCell] (val x: Self) extends AnyVal {
    
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
    def setColumnSpan(value: Double): Self = this.set("ColumnSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("RowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetColumnSpan(value: () => Double): Self = this.set("getColumnSpan", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRowSpan(value: () => Double): Self = this.set("getRowSpan", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMerged(value: () => Boolean): Self = this.set("isMerged", js.Any.fromFunction0(value))
  }
}
