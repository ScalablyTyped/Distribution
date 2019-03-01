package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Primary interface for the {@link com.sun.star.sheet.ExternalSheetCache} service.
  * @see com.sun.star.sheet.ExternalSheetCache
  * @since OOo 3.1
  */
trait XExternalSheetCache extends js.Object {
  /**
    * It returns a list of all row numbers where a cached cell or cells exist. The row numbers are sorted in ascending order.
    * @returns sequence<long> list of all row numbers with cached cell(s)
    */
  val AllRows: activexDashInteropLib.SafeArray[scala.Double]
  /**
    * Index corresponding to this instance of an external sheet cache for usage in formula tokens.
    *
    * This index to the external sheet cache is expected in the {@link SingleReference.Sheet} member if it is part of an external reference token.
    *
    * Each external sheet cache has a unique index value inside the {@link ExternalDocLink} instance.
    * @see FormulaToken
    * @see ExternalReference
    */
  var TokenIndex: scala.Double
  /**
    * Given a row number, this method returns a list of all columns numbers that store cached cell values in that row. The column numbers are sorted in
    * ascending order.
    * @returns sequence<long> list of all columns numbers with cached cell values
    */
  def getAllColumns(nRow: scala.Double): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * It returns a list of all row numbers where a cached cell or cells exist. The row numbers are sorted in ascending order.
    * @returns sequence<long> list of all row numbers with cached cell(s)
    */
  def getAllRows(): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * It retrieves a cached value from a specified cell position. The cached value can be either string or double.
    * @returns any cached cell value
    */
  def getCellValue(nColumn: scala.Double, nRow: scala.Double): js.Any
  /**
    * It sets a cached value for a specified cell position. The value is expected to be either of type string or of type double. No other data types are
    * supported.
    * @param nRow row position (0-based)
    * @param nColumn column position (0-based)
    * @param aValue cell value to be cached
    */
  def setCellValue(nColumn: scala.Double, nRow: scala.Double, aValue: js.Any): scala.Unit
}

object XExternalSheetCache {
  @scala.inline
  def apply(
    AllRows: activexDashInteropLib.SafeArray[scala.Double],
    TokenIndex: scala.Double,
    getAllColumns: js.Function1[scala.Double, activexDashInteropLib.SafeArray[scala.Double]],
    getAllRows: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getCellValue: js.Function2[scala.Double, scala.Double, js.Any],
    setCellValue: js.Function3[scala.Double, scala.Double, js.Any, scala.Unit]
  ): XExternalSheetCache = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AllRows")(AllRows)
    __obj.updateDynamic("TokenIndex")(TokenIndex)
    __obj.updateDynamic("getAllColumns")(getAllColumns)
    __obj.updateDynamic("getAllRows")(getAllRows)
    __obj.updateDynamic("getCellValue")(getCellValue)
    __obj.updateDynamic("setCellValue")(setCellValue)
    __obj.asInstanceOf[XExternalSheetCache]
  }
}

