package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to get and set an array of data from a cell range.
  *
  * The outer sequence represents the rows and the inner sequence the columns of the array.
  */
trait XCellRangeData
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * gets an array from the contents of the cell range.
    *
    * Each element of the result contains a `double` or a `string` .
    */
  val DataArray: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[_]]
  /**
    * gets an array from the contents of the cell range.
    *
    * Each element of the result contains a `double` or a `string` .
    */
  def getDataArray(): activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[_]]
  /**
    * fills the cell range with values from an array.
    *
    * The size of the array must be the same as the size of the cell range. Each element of the array must contain a `double` or a `string` .
    * @throws com::sun::star::uno::RuntimeException If the size of the array is different from the current size.
    */
  def setDataArray(
    aArray: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]]
  ): scala.Unit
}

object XCellRangeData {
  @scala.inline
  def apply(
    DataArray: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[_]],
    acquire: js.Function0[scala.Unit],
    getDataArray: js.Function0[activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[_]]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDataArray: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]], 
      scala.Unit
    ]
  ): XCellRangeData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DataArray")(DataArray)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getDataArray")(getDataArray)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setDataArray")(setDataArray)
    __obj.asInstanceOf[XCellRangeData]
  }
}

