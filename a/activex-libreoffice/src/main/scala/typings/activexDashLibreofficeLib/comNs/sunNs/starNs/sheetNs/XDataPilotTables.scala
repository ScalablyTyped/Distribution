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
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    createDataPilotDescriptor: js.Function0[XDataPilotDescriptor],
    getByName: js.Function1[java.lang.String, js.Any],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    insertNewByName: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, 
      XDataPilotDescriptor, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByName: js.Function1[java.lang.String, scala.Unit]
  ): XDataPilotTables = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ElementNames")(ElementNames)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createDataPilotDescriptor")(createDataPilotDescriptor)
    __obj.updateDynamic("getByName")(getByName)
    __obj.updateDynamic("getElementNames")(getElementNames)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("hasByName")(hasByName)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("insertNewByName")(insertNewByName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeByName")(removeByName)
    __obj.asInstanceOf[XDataPilotTables]
  }
}

