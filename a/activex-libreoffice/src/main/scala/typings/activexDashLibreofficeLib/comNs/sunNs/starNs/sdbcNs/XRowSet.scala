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

