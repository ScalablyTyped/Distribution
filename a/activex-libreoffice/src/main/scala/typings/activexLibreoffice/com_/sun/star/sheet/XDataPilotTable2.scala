package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * additional methods to extend {@link com.sun.star.sheet.XDataPilotTable} .
  *
  * {@link com.sun.star.sheet.XDataPilotTable2} extends the old {@link com.sun.star.sheet.XDataPilotTable} interface with additional methods.
  * @see com.sun.star.sheet.XDataPilotTable
  * @since OOo 3.0
  */
@js.native
trait XDataPilotTable2 extends XDataPilotTable {
  
  /**
    * When the address of a cell within the result area is given, {@link XDataPilotTable2.getDrillDownData()} returns its drill-down output table that
    * includes only those rows that contribute to the value of that cell.
    * @param aAddr cell address within the result area of a DataPilot table.
    * @returns drill-down output as 2-dimensional sequence, including the header row.
    * @see XDataPilotTable2.insertDrillDownSheet()
    */
  def getDrillDownData(aAddr: CellAddress): SafeArray[SafeArray[_]] = js.native
  
  /**
    * This method returns a different output range of a DataPilot table per specified output range type.
    * @returns {@link com.sun.star.table.CellRangeAddress} depicting the range specified. See {@link DataPilotOutputRangeType} for a set of possible output rang
    * @see com.sun.star.sheet.DataPilotOutputRangeType
    */
  def getOutputRangeByType(nType: Double): CellRangeAddress = js.native
  
  /**
    * Given a cell address, it returns the information about that cell. The type of information returned depends upon whether the cell is within the result
    * area or column/row header area.
    * @param aAddr address of the cell whose information is to be returned.
    * @returns {@link DataPilotTablePositionData} which contains the position type and the information for that cell position.
    * @see com.sun.star.sheet.DataPilotTablePositionData
    * @see com.sun.star.sheet.DataPilotTableHeaderData
    * @see com.sun.star.sheet.DataPilotTableResultData
    */
  def getPositionData(aAddr: CellAddress): DataPilotTablePositionData = js.native
  
  /**
    * This method inserts a new sheet to display the drill-down data for a specified result cell. A drill-down data for a result cell consists of a subset
    * of rows from the original data source that contribute to the value displayed in that cell.
    *
    * The new sheet is always inserted to the immediate left of the current sheet where the DataPilot table is. Note that when the drill-down data is empty,
    * no new sheet is inserted.
    * @param aAddr address of a result cell
    * @returns `VOID`
    */
  def insertDrillDownSheet(aAddr: CellAddress): Unit = js.native
}
object XDataPilotTable2 {
  
  @scala.inline
  def apply(
    OutputRange: CellRangeAddress,
    acquire: () => Unit,
    getDrillDownData: CellAddress => SafeArray[SafeArray[_]],
    getOutputRange: () => CellRangeAddress,
    getOutputRangeByType: Double => CellRangeAddress,
    getPositionData: CellAddress => DataPilotTablePositionData,
    insertDrillDownSheet: CellAddress => Unit,
    queryInterface: `type` => js.Any,
    refresh: () => Unit,
    release: () => Unit
  ): XDataPilotTable2 = {
    val __obj = js.Dynamic.literal(OutputRange = OutputRange.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDrillDownData = js.Any.fromFunction1(getDrillDownData), getOutputRange = js.Any.fromFunction0(getOutputRange), getOutputRangeByType = js.Any.fromFunction1(getOutputRangeByType), getPositionData = js.Any.fromFunction1(getPositionData), insertDrillDownSheet = js.Any.fromFunction1(insertDrillDownSheet), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataPilotTable2]
  }
  
  @scala.inline
  implicit class XDataPilotTable2Ops[Self <: XDataPilotTable2] (val x: Self) extends AnyVal {
    
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
    def setGetDrillDownData(value: CellAddress => SafeArray[SafeArray[_]]): Self = this.set("getDrillDownData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOutputRangeByType(value: Double => CellRangeAddress): Self = this.set("getOutputRangeByType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPositionData(value: CellAddress => DataPilotTablePositionData): Self = this.set("getPositionData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertDrillDownSheet(value: CellAddress => Unit): Self = this.set("insertDrillDownSheet", js.Any.fromFunction1(value))
  }
}
