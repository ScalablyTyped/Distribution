package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a pane in a view of a spreadsheet document.
  * @see com.sun.star.sheet.SpreadsheetViewPane
  */
@js.native
trait XViewPane extends XInterface {
  
  /** returns the first column that is visible in the pane. */
  var FirstVisibleColumn: Double = js.native
  
  /** returns the first row that is visible in the pane. */
  var FirstVisibleRow: Double = js.native
  
  /** returns the address of the cell range that consists of the cells which are visible in the pane. */
  val VisibleRange: CellRangeAddress = js.native
  
  /** returns the first column that is visible in the pane. */
  def getFirstVisibleColumn(): Double = js.native
  
  /** returns the first row that is visible in the pane. */
  def getFirstVisibleRow(): Double = js.native
  
  /** returns the address of the cell range that consists of the cells which are visible in the pane. */
  def getVisibleRange(): CellRangeAddress = js.native
  
  /** sets the first column that is visible in the pane. */
  def setFirstVisibleColumn(nFirstVisibleColumn: Double): Unit = js.native
  
  /** sets the first row that is visible in the pane. */
  def setFirstVisibleRow(nFirstVisibleRow: Double): Unit = js.native
}
object XViewPane {
  
  @scala.inline
  def apply(
    FirstVisibleColumn: Double,
    FirstVisibleRow: Double,
    VisibleRange: CellRangeAddress,
    acquire: () => Unit,
    getFirstVisibleColumn: () => Double,
    getFirstVisibleRow: () => Double,
    getVisibleRange: () => CellRangeAddress,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFirstVisibleColumn: Double => Unit,
    setFirstVisibleRow: Double => Unit
  ): XViewPane = {
    val __obj = js.Dynamic.literal(FirstVisibleColumn = FirstVisibleColumn.asInstanceOf[js.Any], FirstVisibleRow = FirstVisibleRow.asInstanceOf[js.Any], VisibleRange = VisibleRange.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFirstVisibleColumn = js.Any.fromFunction0(getFirstVisibleColumn), getFirstVisibleRow = js.Any.fromFunction0(getFirstVisibleRow), getVisibleRange = js.Any.fromFunction0(getVisibleRange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFirstVisibleColumn = js.Any.fromFunction1(setFirstVisibleColumn), setFirstVisibleRow = js.Any.fromFunction1(setFirstVisibleRow))
    __obj.asInstanceOf[XViewPane]
  }
  
  @scala.inline
  implicit class XViewPaneMutableBuilder[Self <: XViewPane] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstVisibleColumn(value: Double): Self = StObject.set(x, "FirstVisibleColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstVisibleRow(value: Double): Self = StObject.set(x, "FirstVisibleRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFirstVisibleColumn(value: () => Double): Self = StObject.set(x, "getFirstVisibleColumn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFirstVisibleRow(value: () => Double): Self = StObject.set(x, "getFirstVisibleRow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVisibleRange(value: () => CellRangeAddress): Self = StObject.set(x, "getVisibleRange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFirstVisibleColumn(value: Double => Unit): Self = StObject.set(x, "setFirstVisibleColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFirstVisibleRow(value: Double => Unit): Self = StObject.set(x, "setFirstVisibleRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVisibleRange(value: CellRangeAddress): Self = StObject.set(x, "VisibleRange", value.asInstanceOf[js.Any])
  }
}
