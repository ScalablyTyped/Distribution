package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the possibility to write changes made on a result set back to database. */
@js.native
trait XResultSetUpdate extends XInterface {
  /**
    * cancels the updates made to a row.
    *
    * This method may be called after calling an `updateXXX` method(s) and before calling {@link com.sun.star.sdbc.XResultSetUpdate.updateRow()} to rollback
    * the updates made to a row. If no updates have been made or `updateRow` has already been called, then this method has no effect.
    * @throws SQLException if a database access error occurs.
    */
  def cancelRowUpdates(): Unit = js.native
  /**
    * deletes the current row from the result set and the underlying database. Cannot be called when on the insert row.
    * @throws SQLException if a database access error occurs.
    */
  def deleteRow(): Unit = js.native
  /**
    * inserts the contents of the insert row into the result set and the database. Must be on the insert row when this method is called.
    * @throws SQLException if a database access error occurs.
    */
  def insertRow(): Unit = js.native
  /**
    * moves the cursor to the remembered cursor position, usually the current row. This method has no effect if the cursor is not on the insert row.
    * @throws SQLException if a database access error occurs.
    */
  def moveToCurrentRow(): Unit = js.native
  /**
    * moves the cursor to the insert row. The current cursor position is remembered while the cursor is positioned on the insert row.
    *
    * The insert row is a special row associated with an updatable result set. It is essentially a buffer where a new row may be constructed by calling the
    * `updateXXX` methods prior to inserting the row into the result set.
    *
    * Only the `updateXXX` , `getXXX` , and {@link com.sun.star.sdbc.XResultSetUpdate.insertRow()} methods may be called when the cursor is on the insert
    * row. All of the columns in a result set must be given a value each time this method is called before calling `insertRow` . The method `updateXXX` must
    * be called before a `getXXX` method can be called on a column value.
    * @throws SQLException if a database access error occurs.
    */
  def moveToInsertRow(): Unit = js.native
  /**
    * updates the underlying database with the new contents of the current row. Cannot be called when on the insert row.
    * @throws SQLException if a database access error occurs.
    */
  def updateRow(): Unit = js.native
}

object XResultSetUpdate {
  @scala.inline
  def apply(
    acquire: () => Unit,
    cancelRowUpdates: () => Unit,
    deleteRow: () => Unit,
    insertRow: () => Unit,
    moveToCurrentRow: () => Unit,
    moveToInsertRow: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    updateRow: () => Unit
  ): XResultSetUpdate = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cancelRowUpdates = js.Any.fromFunction0(cancelRowUpdates), deleteRow = js.Any.fromFunction0(deleteRow), insertRow = js.Any.fromFunction0(insertRow), moveToCurrentRow = js.Any.fromFunction0(moveToCurrentRow), moveToInsertRow = js.Any.fromFunction0(moveToInsertRow), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateRow = js.Any.fromFunction0(updateRow))
    __obj.asInstanceOf[XResultSetUpdate]
  }
  @scala.inline
  implicit class XResultSetUpdateOps[Self <: XResultSetUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCancelRowUpdates(value: () => Unit): Self = this.set("cancelRowUpdates", js.Any.fromFunction0(value))
    @scala.inline
    def setDeleteRow(value: () => Unit): Self = this.set("deleteRow", js.Any.fromFunction0(value))
    @scala.inline
    def setInsertRow(value: () => Unit): Self = this.set("insertRow", js.Any.fromFunction0(value))
    @scala.inline
    def setMoveToCurrentRow(value: () => Unit): Self = this.set("moveToCurrentRow", js.Any.fromFunction0(value))
    @scala.inline
    def setMoveToInsertRow(value: () => Unit): Self = this.set("moveToInsertRow", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdateRow(value: () => Unit): Self = this.set("updateRow", js.Any.fromFunction0(value))
  }
  
}

