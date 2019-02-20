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
  var ColumnDescriptions: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * retrieves the numerical data as a nested sequence of values.
    * @returns the values as a sequence of sequences. The inner sequence represents rows.
    */
  var Data: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[scala.Double]]
  /**
    * retrieves the description texts for all rows.
    * @returns a sequence of strings, each representing the description of a row.
    */
  var RowDescriptions: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * retrieves the description texts for all columns.
    * @returns a sequence of strings, each representing the description of a column.
    */
  def getColumnDescriptions(): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * retrieves the numerical data as a nested sequence of values.
    * @returns the values as a sequence of sequences. The inner sequence represents rows.
    */
  def getData(): activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[scala.Double]]
  /**
    * retrieves the description texts for all rows.
    * @returns a sequence of strings, each representing the description of a row.
    */
  def getRowDescriptions(): activexDashInteropLib.SafeArray[java.lang.String]
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

