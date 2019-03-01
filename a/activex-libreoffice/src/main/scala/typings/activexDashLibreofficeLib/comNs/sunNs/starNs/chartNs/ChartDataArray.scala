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
    ColumnDescriptions: activexDashInteropLib.SafeArray[java.lang.String],
    Data: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[scala.Double]],
    NotANumber: scala.Double,
    RowDescriptions: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    addChartDataChangeEventListener: js.Function1[XChartDataChangeEventListener, scala.Unit],
    getColumnDescriptions: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getData: js.Function0[activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[scala.Double]]],
    getNotANumber: js.Function0[scala.Double],
    getRowDescriptions: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    isNotANumber: js.Function1[scala.Double, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeChartDataChangeEventListener: js.Function1[XChartDataChangeEventListener, scala.Unit],
    setColumnDescriptions: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], scala.Unit],
    setData: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      scala.Unit
    ],
    setRowDescriptions: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], scala.Unit]
  ): ChartDataArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ColumnDescriptions")(ColumnDescriptions)
    __obj.updateDynamic("Data")(Data)
    __obj.updateDynamic("NotANumber")(NotANumber)
    __obj.updateDynamic("RowDescriptions")(RowDescriptions)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addChartDataChangeEventListener")(addChartDataChangeEventListener)
    __obj.updateDynamic("getColumnDescriptions")(getColumnDescriptions)
    __obj.updateDynamic("getData")(getData)
    __obj.updateDynamic("getNotANumber")(getNotANumber)
    __obj.updateDynamic("getRowDescriptions")(getRowDescriptions)
    __obj.updateDynamic("isNotANumber")(isNotANumber)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeChartDataChangeEventListener")(removeChartDataChangeEventListener)
    __obj.updateDynamic("setColumnDescriptions")(setColumnDescriptions)
    __obj.updateDynamic("setData")(setData)
    __obj.updateDynamic("setRowDescriptions")(setRowDescriptions)
    __obj.asInstanceOf[ChartDataArray]
  }
}

