package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to get and set an array of data from a cell range.
  *
  * The outer sequence represents the rows and the inner sequence the columns of the array.
  */
trait XCellRangeData
  extends StObject
     with XInterface {
  
  /**
    * gets an array from the contents of the cell range.
    *
    * Each element of the result contains a `double` or a `string` .
    */
  val DataArray: SafeArray[SafeArray[js.Any]]
  
  /**
    * gets an array from the contents of the cell range.
    *
    * Each element of the result contains a `double` or a `string` .
    */
  def getDataArray(): SafeArray[SafeArray[js.Any]]
  
  /**
    * fills the cell range with values from an array.
    *
    * The size of the array must be the same as the size of the cell range. Each element of the array must contain a `double` or a `string` .
    * @throws com::sun::star::uno::RuntimeException If the size of the array is different from the current size.
    */
  def setDataArray(aArray: SeqEquiv[SeqEquiv[js.Any]]): Unit
}
object XCellRangeData {
  
  @scala.inline
  def apply(
    DataArray: SafeArray[SafeArray[js.Any]],
    acquire: () => Unit,
    getDataArray: () => SafeArray[SafeArray[js.Any]],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDataArray: SeqEquiv[SeqEquiv[js.Any]] => Unit
  ): XCellRangeData = {
    val __obj = js.Dynamic.literal(DataArray = DataArray.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDataArray = js.Any.fromFunction0(getDataArray), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDataArray = js.Any.fromFunction1(setDataArray))
    __obj.asInstanceOf[XCellRangeData]
  }
  
  @scala.inline
  implicit class XCellRangeDataMutableBuilder[Self <: XCellRangeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataArray(value: SafeArray[SafeArray[js.Any]]): Self = StObject.set(x, "DataArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDataArray(value: () => SafeArray[SafeArray[js.Any]]): Self = StObject.set(x, "getDataArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDataArray(value: SeqEquiv[SeqEquiv[js.Any]] => Unit): Self = StObject.set(x, "setDataArray", js.Any.fromFunction1(value))
  }
}
