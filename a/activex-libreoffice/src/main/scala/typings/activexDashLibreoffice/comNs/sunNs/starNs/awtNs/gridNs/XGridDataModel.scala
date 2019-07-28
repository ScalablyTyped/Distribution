package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.gridNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XCloneable
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of this interface is used by the {@link UnoControlGrid} to retrieve the content data that is displayed in the actual control.
  *
  * If you do not need your own model implementation, you can also use the {@link DefaultGridDataModel} .
  * @since OOo 3.3
  */
trait XGridDataModel
  extends XComponent
     with XCloneable {
  /** denotes the number of columns for which the model can provide data */
  var ColumnCount: Double
  /** denotes the number of rows for which the model can provide data */
  var RowCount: Double
  /**
    * retrieves the data for a given cell
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the column or row index do not denote a valid cell position.
    */
  def getCellData(Column: Double, RowIndex: Double): js.Any
  /**
    * retrieves the tool tip to be displayed when the mouse hovers over a given cell
    *
    * At the moment, only string tool tips are supported.
    *
    * If `VOID` is returned here, the cell's content will be displayed as tip, but only if it does not fit into the cell.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the column or row index do not denote a valid cell position.
    */
  def getCellToolTip(Column: Double, RowIndex: Double): js.Any
  /**
    * retrieves the data for a complete row
    *
    * This method is provided for performance and convenience reasons, it delivers the same result as subsequent calls to {@link getCellData()} would.
    * @param RowIndex the index of the row whose data should is to be retrieved.
    * @throws com::sun::star::lang::IndexOutOfBoundsException of the given row index does not denote a valid row.
    */
  def getRowData(RowIndex: Double): SafeArray[_]
  /**
    * retrieves the heading of a given row
    *
    * A grid control will usually paint a row's title in the header column of the respective row.
    *
    * At the moment, only strings are supported as row headings.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given index does not denote a valid row.
    */
  def getRowHeading(RowIndex: Double): js.Any
}

object XGridDataModel {
  @scala.inline
  def apply(
    ColumnCount: Double,
    RowCount: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    createClone: () => XCloneable,
    dispose: () => Unit,
    getCellData: (Double, Double) => js.Any,
    getCellToolTip: (Double, Double) => js.Any,
    getRowData: Double => SafeArray[_],
    getRowHeading: Double => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): XGridDataModel = {
    val __obj = js.Dynamic.literal(ColumnCount = ColumnCount, RowCount = RowCount, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), createClone = js.Any.fromFunction0(createClone), dispose = js.Any.fromFunction0(dispose), getCellData = js.Any.fromFunction2(getCellData), getCellToolTip = js.Any.fromFunction2(getCellToolTip), getRowData = js.Any.fromFunction1(getRowData), getRowHeading = js.Any.fromFunction1(getRowHeading), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[XGridDataModel]
  }
}

