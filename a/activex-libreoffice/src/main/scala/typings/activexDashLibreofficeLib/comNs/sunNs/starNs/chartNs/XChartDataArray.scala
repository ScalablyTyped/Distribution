package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to data represented as an array of rows.
  *
  * Can be obtained from interface {@link XChartDocument} via method {@link getData()} .
  *
  * If used for an {@link XYDiagram} , the row number 0 represents the **x** -values.
  */
trait XChartDataArray extends XChartData {
  /**
    * retrieves the description texts for all columns.
    * @returns a sequence of strings, each representing the description of a column.
    */
  var ColumnDescriptions: stdLib.SafeArray[java.lang.String]
  /**
    * retrieves the numerical data as a nested sequence of values.
    * @returns the values as a sequence of sequences. The inner sequence represents rows.
    */
  var Data: stdLib.SafeArray[stdLib.SafeArray[scala.Double]]
  /**
    * retrieves the description texts for all rows.
    * @returns a sequence of strings, each representing the description of a row.
    */
  var RowDescriptions: stdLib.SafeArray[java.lang.String]
  /**
    * retrieves the description texts for all columns.
    * @returns a sequence of strings, each representing the description of a column.
    */
  def getColumnDescriptions(): stdLib.SafeArray[java.lang.String]
  /**
    * retrieves the numerical data as a nested sequence of values.
    * @returns the values as a sequence of sequences. The inner sequence represents rows.
    */
  def getData(): stdLib.SafeArray[stdLib.SafeArray[scala.Double]]
  /**
    * retrieves the description texts for all rows.
    * @returns a sequence of strings, each representing the description of a row.
    */
  def getRowDescriptions(): stdLib.SafeArray[java.lang.String]
  /**
    * sets the description texts for all columns.
    * @param aColumnDescriptions a sequence of strings which represent a description for each column.
    */
  def setColumnDescriptions(aColumnDescriptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): scala.Unit
  /**
    * sets the chart data as an array of numbers.
    * @param aData the values as a sequence of sequences. The inner sequence represents rows.
    */
  def setData(
    aData: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]]
  ): scala.Unit
  /**
    * sets the description texts for all rows.
    * @param aRowDescriptions a sequence of strings which represent a description for each row.
    */
  def setRowDescriptions(aRowDescriptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): scala.Unit
}

object XChartDataArray {
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
  ): XChartDataArray = {
    val __obj = js.Dynamic.literal(ColumnDescriptions = ColumnDescriptions, Data = Data, NotANumber = NotANumber, RowDescriptions = RowDescriptions, acquire = js.Any.fromFunction0(acquire), addChartDataChangeEventListener = js.Any.fromFunction1(addChartDataChangeEventListener), getColumnDescriptions = js.Any.fromFunction0(getColumnDescriptions), getData = js.Any.fromFunction0(getData), getNotANumber = js.Any.fromFunction0(getNotANumber), getRowDescriptions = js.Any.fromFunction0(getRowDescriptions), isNotANumber = js.Any.fromFunction1(isNotANumber), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChartDataChangeEventListener = js.Any.fromFunction1(removeChartDataChangeEventListener), setColumnDescriptions = js.Any.fromFunction1(setColumnDescriptions), setData = js.Any.fromFunction1(setData), setRowDescriptions = js.Any.fromFunction1(setRowDescriptions))
  
    __obj.asInstanceOf[XChartDataArray]
  }
}

