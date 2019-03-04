package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * enhances the functionality of a result set. It allows implementation of a special behavior for a result set and notifies an application on certain row
  * set events such as a change in its value.
  *
  * The {@link XRowSet} interface is unique in that it is intended to be a software layer on top of an SDBC driver. Implementations of the {@link RowSet}
  * interface can be provided by anyone.
  */
trait XRowSet extends XResultSet {
  /**
    * adds the specified listener to receive the events "cursorMoved", "rowChanged", and "rowSetChanged".
    * @param listener the listener which should be registered
    */
  def addRowSetListener(listener: XRowSetListener): scala.Unit
  /**
    * populates a row set with data. The description of the data source and other important information for filling the row set with data.
    * @throws SQLException if a database access error occurs.
    */
  def execute(): scala.Unit
  /**
    * removes the specified listener.
    * @param listener the listener which should be registered
    */
  def removeRowSetListener(listener: XRowSetListener): scala.Unit
}

object XRowSet {
  @scala.inline
  def apply(
    Row: scala.Double,
    Statement: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    absolute: js.Function1[scala.Double, scala.Boolean],
    acquire: js.Function0[scala.Unit],
    addRowSetListener: js.Function1[XRowSetListener, scala.Unit],
    afterLast: js.Function0[scala.Unit],
    beforeFirst: js.Function0[scala.Unit],
    execute: js.Function0[scala.Unit],
    first: js.Function0[scala.Boolean],
    getRow: js.Function0[scala.Double],
    getStatement: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    isAfterLast: js.Function0[scala.Boolean],
    isBeforeFirst: js.Function0[scala.Boolean],
    isFirst: js.Function0[scala.Boolean],
    isLast: js.Function0[scala.Boolean],
    last: js.Function0[scala.Boolean],
    next: js.Function0[scala.Boolean],
    previous: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    refreshRow: js.Function0[scala.Unit],
    relative: js.Function1[scala.Double, scala.Boolean],
    release: js.Function0[scala.Unit],
    removeRowSetListener: js.Function1[XRowSetListener, scala.Unit],
    rowDeleted: js.Function0[scala.Boolean],
    rowInserted: js.Function0[scala.Boolean],
    rowUpdated: js.Function0[scala.Boolean]
  ): XRowSet = {
    val __obj = js.Dynamic.literal(Row = Row, Statement = Statement, absolute = absolute, acquire = acquire, addRowSetListener = addRowSetListener, afterLast = afterLast, beforeFirst = beforeFirst, execute = execute, first = first, getRow = getRow, getStatement = getStatement, isAfterLast = isAfterLast, isBeforeFirst = isBeforeFirst, isFirst = isFirst, isLast = isLast, last = last, next = next, previous = previous, queryInterface = queryInterface, refreshRow = refreshRow, relative = relative, release = release, removeRowSetListener = removeRowSetListener, rowDeleted = rowDeleted, rowInserted = rowInserted, rowUpdated = rowUpdated)
  
    __obj.asInstanceOf[XRowSet]
  }
}

