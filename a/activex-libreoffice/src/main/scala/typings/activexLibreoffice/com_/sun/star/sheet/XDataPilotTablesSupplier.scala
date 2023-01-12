package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * grants access to a collection of data pilot tables.
  * @see com.sun.star.sheet.Spreadsheet
  */
trait XDataPilotTablesSupplier
  extends StObject
     with XInterface {
  
  /**
    * Returns the collection of data pilot tables.
    * @see com.sun.star.sheet.DataPilotTables
    */
  val DataPilotTables: XDataPilotTables
  
  /**
    * Returns the collection of data pilot tables.
    * @see com.sun.star.sheet.DataPilotTables
    */
  def getDataPilotTables(): XDataPilotTables
}
object XDataPilotTablesSupplier {
  
  inline def apply(
    DataPilotTables: XDataPilotTables,
    acquire: () => Unit,
    getDataPilotTables: () => XDataPilotTables,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XDataPilotTablesSupplier = {
    val __obj = js.Dynamic.literal(DataPilotTables = DataPilotTables.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDataPilotTables = js.Any.fromFunction0(getDataPilotTables), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataPilotTablesSupplier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XDataPilotTablesSupplier] (val x: Self) extends AnyVal {
    
    inline def setDataPilotTables(value: XDataPilotTables): Self = StObject.set(x, "DataPilotTables", value.asInstanceOf[js.Any])
    
    inline def setGetDataPilotTables(value: () => XDataPilotTables): Self = StObject.set(x, "getDataPilotTables", js.Any.fromFunction0(value))
  }
}
