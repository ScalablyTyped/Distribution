package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to control a data pilot table which has already been created.
  * @see com.sun.star.sheet.DataPilotTable
  */
trait XDataPilotTable
  extends StObject
     with XInterface {
  
  /** returns the address of the cell range that contains the data pilot table. */
  val OutputRange: CellRangeAddress
  
  /** returns the address of the cell range that contains the data pilot table. */
  def getOutputRange(): CellRangeAddress
  
  /** recreates the data pilot table with current data from the source cell range. */
  def refresh(): Unit
}
object XDataPilotTable {
  
  inline def apply(
    OutputRange: CellRangeAddress,
    acquire: () => Unit,
    getOutputRange: () => CellRangeAddress,
    queryInterface: `type` => Any,
    refresh: () => Unit,
    release: () => Unit
  ): XDataPilotTable = {
    val __obj = js.Dynamic.literal(OutputRange = OutputRange.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getOutputRange = js.Any.fromFunction0(getOutputRange), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataPilotTable]
  }
  
  extension [Self <: XDataPilotTable](x: Self) {
    
    inline def setGetOutputRange(value: () => CellRangeAddress): Self = StObject.set(x, "getOutputRange", js.Any.fromFunction0(value))
    
    inline def setOutputRange(value: CellRangeAddress): Self = StObject.set(x, "OutputRange", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
  }
}
