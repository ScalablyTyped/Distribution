package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
  def addRowSetListener(listener: XRowSetListener): Unit
  /**
    * populates a row set with data. The description of the data source and other important information for filling the row set with data.
    * @throws SQLException if a database access error occurs.
    */
  def execute(): Unit
  /**
    * removes the specified listener.
    * @param listener the listener which should be registered
    */
  def removeRowSetListener(listener: XRowSetListener): Unit
}

object XRowSet {
  @scala.inline
  def apply(
    Row: Double,
    Statement: XInterface,
    absolute: Double => Boolean,
    acquire: () => Unit,
    addRowSetListener: XRowSetListener => Unit,
    afterLast: () => Unit,
    beforeFirst: () => Unit,
    execute: () => Unit,
    first: () => Boolean,
    getRow: () => Double,
    getStatement: () => XInterface,
    isAfterLast: () => Boolean,
    isBeforeFirst: () => Boolean,
    isFirst: () => Boolean,
    isLast: () => Boolean,
    last: () => Boolean,
    next: () => Boolean,
    previous: () => Boolean,
    queryInterface: `type` => js.Any,
    refreshRow: () => Unit,
    relative: Double => Boolean,
    release: () => Unit,
    removeRowSetListener: XRowSetListener => Unit,
    rowDeleted: () => Boolean,
    rowInserted: () => Boolean,
    rowUpdated: () => Boolean
  ): XRowSet = {
    val __obj = js.Dynamic.literal(Row = Row.asInstanceOf[js.Any], Statement = Statement.asInstanceOf[js.Any], absolute = js.Any.fromFunction1(absolute), acquire = js.Any.fromFunction0(acquire), addRowSetListener = js.Any.fromFunction1(addRowSetListener), afterLast = js.Any.fromFunction0(afterLast), beforeFirst = js.Any.fromFunction0(beforeFirst), execute = js.Any.fromFunction0(execute), first = js.Any.fromFunction0(first), getRow = js.Any.fromFunction0(getRow), getStatement = js.Any.fromFunction0(getStatement), isAfterLast = js.Any.fromFunction0(isAfterLast), isBeforeFirst = js.Any.fromFunction0(isBeforeFirst), isFirst = js.Any.fromFunction0(isFirst), isLast = js.Any.fromFunction0(isLast), last = js.Any.fromFunction0(last), next = js.Any.fromFunction0(next), previous = js.Any.fromFunction0(previous), queryInterface = js.Any.fromFunction1(queryInterface), refreshRow = js.Any.fromFunction0(refreshRow), relative = js.Any.fromFunction1(relative), release = js.Any.fromFunction0(release), removeRowSetListener = js.Any.fromFunction1(removeRowSetListener), rowDeleted = js.Any.fromFunction0(rowDeleted), rowInserted = js.Any.fromFunction0(rowInserted), rowUpdated = js.Any.fromFunction0(rowUpdated))
    __obj.asInstanceOf[XRowSet]
  }
}

