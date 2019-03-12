package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * must be supported by each data source for charts, where you want to access the values directly.
  *
  * It contains the data values as well as the descriptions for each row and column.
  */
trait ChartDataArray extends XChartDataArray

object ChartDataArray {
  @scala.inline
  def apply(
    ColumnDescriptions: stdLib.SafeArray[java.lang.String],
    Data: stdLib.SafeArray[stdLib.SafeArray[scala.Double]],
    NotANumber: scala.Double,
    RowDescriptions: stdLib.SafeArray[java.lang.String],
    acquire: () => scala.Unit,
    addChartDataChangeEventListener: XChartDataChangeEventListener => scala.Unit,
    getColumnDescriptions: () => stdLib.SafeArray[java.lang.String],
    getData: () => stdLib.SafeArray[stdLib.SafeArray[scala.Double]],
    getNotANumber: () => scala.Double,
    getRowDescriptions: () => stdLib.SafeArray[java.lang.String],
    isNotANumber: scala.Double => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeChartDataChangeEventListener: XChartDataChangeEventListener => scala.Unit,
    setColumnDescriptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String] => scala.Unit,
    setData: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]] => scala.Unit,
    setRowDescriptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String] => scala.Unit
  ): ChartDataArray = {
    val __obj = js.Dynamic.literal(ColumnDescriptions = ColumnDescriptions, Data = Data, NotANumber = NotANumber, RowDescriptions = RowDescriptions, acquire = js.Any.fromFunction0(acquire), addChartDataChangeEventListener = js.Any.fromFunction1(addChartDataChangeEventListener), getColumnDescriptions = js.Any.fromFunction0(getColumnDescriptions), getData = js.Any.fromFunction0(getData), getNotANumber = js.Any.fromFunction0(getNotANumber), getRowDescriptions = js.Any.fromFunction0(getRowDescriptions), isNotANumber = js.Any.fromFunction1(isNotANumber), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChartDataChangeEventListener = js.Any.fromFunction1(removeChartDataChangeEventListener), setColumnDescriptions = js.Any.fromFunction1(setColumnDescriptions), setData = js.Any.fromFunction1(setData), setRowDescriptions = js.Any.fromFunction1(setRowDescriptions))
  
    __obj.asInstanceOf[ChartDataArray]
  }
}

