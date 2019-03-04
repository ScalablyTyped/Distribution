package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access columns via index and to insert and remove columns.
  * @see com.sun.star.table.TableColumns
  */
trait XTableColumns
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess {
  /**
    * inserts new columns.
    * @param nIndex is the index the first inserted column will have.
    * @param nCount is the number of columns to insert.
    */
  def insertByIndex(nIndex: scala.Double, nCount: scala.Double): scala.Unit
  /**
    * deletes columns.
    * @param nIndex is the index of the first column to delete.
    * @param nCount is the number of columns to delete.
    */
  def removeByIndex(nIndex: scala.Double, nCount: scala.Double): scala.Unit
}

object XTableColumns {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasElements: js.Function0[scala.Boolean],
    insertByIndex: js.Function2[scala.Double, scala.Double, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByIndex: js.Function2[scala.Double, scala.Double, scala.Unit]
  ): XTableColumns = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = acquire, getByIndex = getByIndex, getCount = getCount, getElementType = getElementType, hasElements = hasElements, insertByIndex = insertByIndex, queryInterface = queryInterface, release = release, removeByIndex = removeByIndex)
  
    __obj.asInstanceOf[XTableColumns]
  }
}

