package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides functions to manage a collection of database ranges.
  * @see com.sun.star.sheet.DatabaseRanges
  */
trait XDatabaseRanges
  extends StObject
     with XNameAccess {
  
  /** adds a new database range to the collection. */
  def addNewByName(aName: String, aRange: CellRangeAddress): Unit
  
  /** removes a database range from the collection. */
  def removeByName(aName: String): Unit
}
object XDatabaseRanges {
  
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    addNewByName: (String, CellRangeAddress) => Unit,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByName: String => Unit
  ): XDatabaseRanges = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addNewByName = js.Any.fromFunction2(addNewByName), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName))
    __obj.asInstanceOf[XDatabaseRanges]
  }
  
  @scala.inline
  implicit class XDatabaseRangesMutableBuilder[Self <: XDatabaseRanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddNewByName(value: (String, CellRangeAddress) => Unit): Self = StObject.set(x, "addNewByName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveByName(value: String => Unit): Self = StObject.set(x, "removeByName", js.Any.fromFunction1(value))
  }
}
