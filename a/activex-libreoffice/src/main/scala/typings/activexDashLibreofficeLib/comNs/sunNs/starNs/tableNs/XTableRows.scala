package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access rows via index and to insert and remove rows.
  * @see com.sun.star.table.TableRows
  */
trait XTableRows
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess {
  /**
    * inserts new rows.
    *
    * When the index or combination of index and count is out of bounds an exception will be thrown.
    * @param nIndex is the index the first inserted row will have.
    * @param nCount is the number of rows to insert.
    */
  def insertByIndex(nIndex: scala.Double, nCount: scala.Double): scala.Unit
  /**
    * deletes rows.
    *
    * When the index or combination of index and count is out of bounds an exception will be thrown.
    * @param nIndex is the index of the first row to delete.
    * @param nCount is the number of rows to delete.
    */
  def removeByIndex(nIndex: scala.Double, nCount: scala.Double): scala.Unit
}

object XTableRows {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    getByIndex: scala.Double => js.Any,
    getCount: () => scala.Double,
    getElementType: () => activexDashLibreofficeLib.`type`,
    hasElements: () => scala.Boolean,
    insertByIndex: (scala.Double, scala.Double) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeByIndex: (scala.Double, scala.Double) => scala.Unit
  ): XTableRows = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), insertByIndex = js.Any.fromFunction2(insertByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction2(removeByIndex))
  
    __obj.asInstanceOf[XTableRows]
  }
}

