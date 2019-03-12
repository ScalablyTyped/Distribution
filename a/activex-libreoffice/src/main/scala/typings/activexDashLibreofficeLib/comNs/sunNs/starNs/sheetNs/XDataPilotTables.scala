package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

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
trait XDataPilotTables
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess {
  /**
    * creates a data pilot descriptor.
    *
    * This descriptor can be used with XDataPilotTables::addTable().
    * @see com.sun.star.sheet.DataPilotDescriptor
    */
  def createDataPilotDescriptor(): XDataPilotDescriptor
  /**
    * creates a new data pilot table and adds it to the collection.
    * @param aName the name of the data pilot table used in the collection.
    * @param OutputAddress the top left cell of the location of the data pilot table in the spreadsheet document.
    * @param xDescriptor the descriptor containing the settings of the data pilot table.
    * @see com.sun.star.sheet.DataPilotDescriptor
    */
  def insertNewByName(
    aName: java.lang.String,
    OutputAddress: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    xDescriptor: XDataPilotDescriptor
  ): scala.Unit
  /** deletes a data pilot table from the collection. */
  def removeByName(aName: java.lang.String): scala.Unit
}

object XDataPilotTables {
  @scala.inline
  def apply(
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    createDataPilotDescriptor: () => XDataPilotDescriptor,
    getByName: java.lang.String => js.Any,
    getElementNames: () => stdLib.SafeArray[java.lang.String],
    getElementType: () => activexDashLibreofficeLib.`type`,
    hasByName: java.lang.String => scala.Boolean,
    hasElements: () => scala.Boolean,
    insertNewByName: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, XDataPilotDescriptor) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeByName: java.lang.String => scala.Unit
  ): XDataPilotTables = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), createDataPilotDescriptor = js.Any.fromFunction0(createDataPilotDescriptor), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertNewByName = js.Any.fromFunction3(insertNewByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName))
  
    __obj.asInstanceOf[XDataPilotTables]
  }
}

