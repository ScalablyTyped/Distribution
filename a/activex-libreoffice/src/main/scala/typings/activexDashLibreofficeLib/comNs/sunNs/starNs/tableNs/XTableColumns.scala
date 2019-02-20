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

