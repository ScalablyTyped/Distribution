package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * grants access to a collection of data pilot tables.
  * @see com.sun.star.sheet.Spreadsheet
  */
@js.native
trait XDataPilotTablesSupplier extends XInterface {
  
  /**
    * Returns the collection of data pilot tables.
    * @see com.sun.star.sheet.DataPilotTables
    */
  val DataPilotTables: XDataPilotTables = js.native
  
  /**
    * Returns the collection of data pilot tables.
    * @see com.sun.star.sheet.DataPilotTables
    */
  def getDataPilotTables(): XDataPilotTables = js.native
}
object XDataPilotTablesSupplier {
  
  @scala.inline
  def apply(
    DataPilotTables: XDataPilotTables,
    acquire: () => Unit,
    getDataPilotTables: () => XDataPilotTables,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDataPilotTablesSupplier = {
    val __obj = js.Dynamic.literal(DataPilotTables = DataPilotTables.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDataPilotTables = js.Any.fromFunction0(getDataPilotTables), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataPilotTablesSupplier]
  }
  
  @scala.inline
  implicit class XDataPilotTablesSupplierOps[Self <: XDataPilotTablesSupplier] (val x: Self) extends AnyVal {
    
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
    def setDataPilotTables(value: XDataPilotTables): Self = this.set("DataPilotTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDataPilotTables(value: () => XDataPilotTables): Self = this.set("getDataPilotTables", js.Any.fromFunction0(value))
  }
}
