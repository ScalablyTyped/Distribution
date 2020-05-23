package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access cell annotations via index and to insert and remove annotations.
  * @see com.sun.star.sheet.CellAnnotation
  * @see com.sun.star.sheet.SheetCell
  */
trait XSheetAnnotations extends XIndexAccess {
  /**
    * creates a new annotation.
    *
    * This method creates a new annotation object, attaches it to the specified cell and inserts it into the collection.
    * @param aPosition contains the address of the cell that will contain the annotation.
    * @param aText contains the annotation text.
    */
  def insertNew(aPosition: CellAddress, aText: String): Unit
  /**
    * removes a cell annotation from the collection.
    *
    * This method removes the annotation from its cell and from the collection.
    * @param nIndex is the index of the annotation in the collection.
    */
  def removeByIndex(nIndex: Double): Unit
}

object XSheetAnnotations {
  @scala.inline
  def apply(
    Count: Double,
    ElementType: `type`,
    acquire: () => Unit,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    insertNew: (CellAddress, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByIndex: Double => Unit
  ): XSheetAnnotations = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), insertNew = js.Any.fromFunction2(insertNew), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex))
    __obj.asInstanceOf[XSheetAnnotations]
  }
}

