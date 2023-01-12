package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the data pilot tables via name and inserting and removing data pilot tables.
  *
  * This interface extends the interface {@link com.sun.star.container.XNameAccess} which provides access to existing data pilot tables in the collection.
  * @see com.sun.star.sheet.DataPilotTables
  * @see com.sun.star.sheet.DataPilotTable
  */
trait XDataPilotTables
  extends StObject
     with XNameAccess {
  
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
  def insertNewByName(aName: String, OutputAddress: CellAddress, xDescriptor: XDataPilotDescriptor): Unit
  
  /** deletes a data pilot table from the collection. */
  def removeByName(aName: String): Unit
}
object XDataPilotTables {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    createDataPilotDescriptor: () => XDataPilotDescriptor,
    getByName: String => Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    insertNewByName: (String, CellAddress, XDataPilotDescriptor) => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeByName: String => Unit
  ): XDataPilotTables = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createDataPilotDescriptor = js.Any.fromFunction0(createDataPilotDescriptor), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertNewByName = js.Any.fromFunction3(insertNewByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName))
    __obj.asInstanceOf[XDataPilotTables]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XDataPilotTables] (val x: Self) extends AnyVal {
    
    inline def setCreateDataPilotDescriptor(value: () => XDataPilotDescriptor): Self = StObject.set(x, "createDataPilotDescriptor", js.Any.fromFunction0(value))
    
    inline def setInsertNewByName(value: (String, CellAddress, XDataPilotDescriptor) => Unit): Self = StObject.set(x, "insertNewByName", js.Any.fromFunction3(value))
    
    inline def setRemoveByName(value: String => Unit): Self = StObject.set(x, "removeByName", js.Any.fromFunction1(value))
  }
}
