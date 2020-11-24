package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to get and set an array of data from a cell range.
  *
  * The outer sequence represents the rows and the inner sequence the columns of the array.
  */
@js.native
trait XCellRangeData extends XInterface {
  
  /**
    * gets an array from the contents of the cell range.
    *
    * Each element of the result contains a `double` or a `string` .
    */
  val DataArray: SafeArray[SafeArray[_]] = js.native
  
  /**
    * gets an array from the contents of the cell range.
    *
    * Each element of the result contains a `double` or a `string` .
    */
  def getDataArray(): SafeArray[SafeArray[_]] = js.native
  
  /**
    * fills the cell range with values from an array.
    *
    * The size of the array must be the same as the size of the cell range. Each element of the array must contain a `double` or a `string` .
    * @throws com::sun::star::uno::RuntimeException If the size of the array is different from the current size.
    */
  def setDataArray(aArray: SeqEquiv[SeqEquiv[_]]): Unit = js.native
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
  
  @scala.inline
  implicit class XCellRangeDataOps[Self <: XCellRangeData] (val x: Self) extends AnyVal {
    
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
    def setDataArray(value: SafeArray[SafeArray[_]]): Self = this.set("DataArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDataArray(value: () => SafeArray[SafeArray[_]]): Self = this.set("getDataArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDataArray(value: SeqEquiv[SeqEquiv[_]] => Unit): Self = this.set("setDataArray", js.Any.fromFunction1(value))
  }
}
