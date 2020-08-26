package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access rows via index and to insert and remove rows.
  * @see com.sun.star.table.TableRows
  */
@js.native
trait XTableRows extends XIndexAccess {
  /**
    * inserts new rows.
    *
    * When the index or combination of index and count is out of bounds an exception will be thrown.
    * @param nIndex is the index the first inserted row will have.
    * @param nCount is the number of rows to insert.
    */
  def insertByIndex(nIndex: Double, nCount: Double): Unit = js.native
  /**
    * deletes rows.
    *
    * When the index or combination of index and count is out of bounds an exception will be thrown.
    * @param nIndex is the index of the first row to delete.
    * @param nCount is the number of rows to delete.
    */
  def removeByIndex(nIndex: Double, nCount: Double): Unit = js.native
}

object XTableRows {
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
  ): XTableRows = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), insertByIndex = js.Any.fromFunction2(insertByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction2(removeByIndex))
    __obj.asInstanceOf[XTableRows]
  }
  @scala.inline
  implicit class XTableRowsOps[Self <: XTableRows] (val x: Self) extends AnyVal {
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
    def setInsertByIndex(value: (Double, Double) => Unit): Self = this.set("insertByIndex", js.Any.fromFunction2(value))
    @scala.inline
    def setRemoveByIndex(value: (Double, Double) => Unit): Self = this.set("removeByIndex", js.Any.fromFunction2(value))
  }
  
}

