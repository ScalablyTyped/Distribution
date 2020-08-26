package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the data pilot tables via name and inserting and removing data pilot tables.
  *
  * This interface extends the interface {@link com.sun.star.container.XNameAccess} which provides access to existing data pilot tables in the collection.
  * @see com.sun.star.sheet.DataPilotTables
  * @see com.sun.star.sheet.DataPilotTable
  */
@js.native
trait XDataPilotTables extends XNameAccess {
  /**
    * creates a data pilot descriptor.
    *
    * This descriptor can be used with XDataPilotTables::addTable().
    * @see com.sun.star.sheet.DataPilotDescriptor
    */
  def createDataPilotDescriptor(): XDataPilotDescriptor = js.native
  /**
    * creates a new data pilot table and adds it to the collection.
    * @param aName the name of the data pilot table used in the collection.
    * @param OutputAddress the top left cell of the location of the data pilot table in the spreadsheet document.
    * @param xDescriptor the descriptor containing the settings of the data pilot table.
    * @see com.sun.star.sheet.DataPilotDescriptor
    */
  def insertNewByName(aName: String, OutputAddress: CellAddress, xDescriptor: XDataPilotDescriptor): Unit = js.native
  /** deletes a data pilot table from the collection. */
  def removeByName(aName: String): Unit = js.native
}

object XDataPilotTables {
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    createDataPilotDescriptor: () => XDataPilotDescriptor,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    insertNewByName: (String, CellAddress, XDataPilotDescriptor) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByName: String => Unit
  ): XDataPilotTables = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createDataPilotDescriptor = js.Any.fromFunction0(createDataPilotDescriptor), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertNewByName = js.Any.fromFunction3(insertNewByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName))
    __obj.asInstanceOf[XDataPilotTables]
  }
  @scala.inline
  implicit class XDataPilotTablesOps[Self <: XDataPilotTables] (val x: Self) extends AnyVal {
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
    def setCreateDataPilotDescriptor(value: () => XDataPilotDescriptor): Self = this.set("createDataPilotDescriptor", js.Any.fromFunction0(value))
    @scala.inline
    def setInsertNewByName(value: (String, CellAddress, XDataPilotDescriptor) => Unit): Self = this.set("insertNewByName", js.Any.fromFunction3(value))
    @scala.inline
    def setRemoveByName(value: String => Unit): Self = this.set("removeByName", js.Any.fromFunction1(value))
  }
  
}

