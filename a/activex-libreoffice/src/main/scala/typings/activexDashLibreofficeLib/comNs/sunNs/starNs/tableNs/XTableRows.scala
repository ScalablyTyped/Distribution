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

