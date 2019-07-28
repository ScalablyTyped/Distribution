package typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access columns via index and to insert and remove columns.
  * @see com.sun.star.table.TableColumns
  */
trait XTableColumns extends XIndexAccess {
  /**
    * inserts new columns.
    * @param nIndex is the index the first inserted column will have.
    * @param nCount is the number of columns to insert.
    */
  def insertByIndex(nIndex: Double, nCount: Double): Unit
  /**
    * deletes columns.
    * @param nIndex is the index of the first column to delete.
    * @param nCount is the number of columns to delete.
    */
  def removeByIndex(nIndex: Double, nCount: Double): Unit
}

object XTableColumns {
  @scala.inline
  def apply(
    Count: Double,
    ElementType: `type`,
    acquire: () => Unit,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    insertByIndex: (Double, Double) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByIndex: (Double, Double) => Unit
  ): XTableColumns = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), insertByIndex = js.Any.fromFunction2(insertByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction2(removeByIndex))
  
    __obj.asInstanceOf[XTableColumns]
  }
}

