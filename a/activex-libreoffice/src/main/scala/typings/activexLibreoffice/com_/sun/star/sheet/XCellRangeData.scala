package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to get and set an array of data from a cell range.
  *
  * The outer sequence represents the rows and the inner sequence the columns of the array.
  */
trait XCellRangeData extends XInterface {
  /**
    * gets an array from the contents of the cell range.
    *
    * Each element of the result contains a `double` or a `string` .
    */
  val DataArray: SafeArray[SafeArray[_]]
  /**
    * gets an array from the contents of the cell range.
    *
    * Each element of the result contains a `double` or a `string` .
    */
  def getDataArray(): SafeArray[SafeArray[_]]
  /**
    * fills the cell range with values from an array.
    *
    * The size of the array must be the same as the size of the cell range. Each element of the array must contain a `double` or a `string` .
    * @throws com::sun::star::uno::RuntimeException If the size of the array is different from the current size.
    */
  def setDataArray(aArray: SeqEquiv[SeqEquiv[_]]): Unit
}

object XCellRangeData {
  @scala.inline
  def apply(
    DataArray: SafeArray[SafeArray[_]],
    acquire: () => Unit,
    getDataArray: () => SafeArray[SafeArray[_]],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDataArray: SeqEquiv[SeqEquiv[_]] => Unit
  ): XCellRangeData = {
    val __obj = js.Dynamic.literal(DataArray = DataArray.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDataArray = js.Any.fromFunction0(getDataArray), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDataArray = js.Any.fromFunction1(setDataArray))
    __obj.asInstanceOf[XCellRangeData]
  }
}

