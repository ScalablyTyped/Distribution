package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Offers access to complex column and row descriptions.
  *
  * Can be obtained from interface {@link XChartDocument} via method {@link getData()} .
  * @since OOo 3.3
  */
trait XComplexDescriptionAccess extends XChartDataArray {
  /**
    * retrieves the description texts for all columns.
    * @returns a sequence of sequences of strings representing the descriptions of all columns. The outer index represents different columns. The inner index re
    */
  var ComplexColumnDescriptions: stdLib.SafeArray[stdLib.SafeArray[java.lang.String]]
  /**
    * retrieves the description texts for all rows.
    * @returns a sequence of sequences of strings representing the descriptions of all rows. The outer index represents different rows. The inner index represen
    */
  var ComplexRowDescriptions: stdLib.SafeArray[stdLib.SafeArray[java.lang.String]]
  /**
    * retrieves the description texts for all columns.
    * @returns a sequence of sequences of strings representing the descriptions of all columns. The outer index represents different columns. The inner index re
    */
  def getComplexColumnDescriptions(): stdLib.SafeArray[stdLib.SafeArray[java.lang.String]]
  /**
    * retrieves the description texts for all rows.
    * @returns a sequence of sequences of strings representing the descriptions of all rows. The outer index represents different rows. The inner index represen
    */
  def getComplexRowDescriptions(): stdLib.SafeArray[stdLib.SafeArray[java.lang.String]]
  /**
    * sets the description texts for all columns.
    * @param rColumnDescriptions a sequence of sequences of strings which represent the descriptions of all columns. The outer index represents different colu
    */
  def setComplexColumnDescriptions(
    rColumnDescriptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]]
  ): scala.Unit
  /**
    * sets the description texts for all rows.
    * @param rRowDescriptions a sequence of sequences of strings representing the descriptions of all rows. The outer index represents different rows. The inn
    */
  def setComplexRowDescriptions(
    rRowDescriptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]]
  ): scala.Unit
}

object XComplexDescriptionAccess {
  @scala.inline
  def apply(
    ColumnDescriptions: stdLib.SafeArray[java.lang.String],
    ComplexColumnDescriptions: stdLib.SafeArray[stdLib.SafeArray[java.lang.String]],
    ComplexRowDescriptions: stdLib.SafeArray[stdLib.SafeArray[java.lang.String]],
    Data: stdLib.SafeArray[stdLib.SafeArray[scala.Double]],
    NotANumber: scala.Double,
    RowDescriptions: stdLib.SafeArray[java.lang.String],
    acquire: () => scala.Unit,
    addChartDataChangeEventListener: XChartDataChangeEventListener => scala.Unit,
    getColumnDescriptions: () => stdLib.SafeArray[java.lang.String],
    getComplexColumnDescriptions: () => stdLib.SafeArray[stdLib.SafeArray[java.lang.String]],
    getComplexRowDescriptions: () => stdLib.SafeArray[stdLib.SafeArray[java.lang.String]],
    getData: () => stdLib.SafeArray[stdLib.SafeArray[scala.Double]],
    getNotANumber: () => scala.Double,
    getRowDescriptions: () => stdLib.SafeArray[java.lang.String],
    isNotANumber: scala.Double => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeChartDataChangeEventListener: XChartDataChangeEventListener => scala.Unit,
    setColumnDescriptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String] => scala.Unit,
    setComplexColumnDescriptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]] => scala.Unit,
    setComplexRowDescriptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]] => scala.Unit,
    setData: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]] => scala.Unit,
    setRowDescriptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String] => scala.Unit
  ): XComplexDescriptionAccess = {
    val __obj = js.Dynamic.literal(ColumnDescriptions = ColumnDescriptions, ComplexColumnDescriptions = ComplexColumnDescriptions, ComplexRowDescriptions = ComplexRowDescriptions, Data = Data, NotANumber = NotANumber, RowDescriptions = RowDescriptions, acquire = js.Any.fromFunction0(acquire), addChartDataChangeEventListener = js.Any.fromFunction1(addChartDataChangeEventListener), getColumnDescriptions = js.Any.fromFunction0(getColumnDescriptions), getComplexColumnDescriptions = js.Any.fromFunction0(getComplexColumnDescriptions), getComplexRowDescriptions = js.Any.fromFunction0(getComplexRowDescriptions), getData = js.Any.fromFunction0(getData), getNotANumber = js.Any.fromFunction0(getNotANumber), getRowDescriptions = js.Any.fromFunction0(getRowDescriptions), isNotANumber = js.Any.fromFunction1(isNotANumber), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChartDataChangeEventListener = js.Any.fromFunction1(removeChartDataChangeEventListener), setColumnDescriptions = js.Any.fromFunction1(setColumnDescriptions), setComplexColumnDescriptions = js.Any.fromFunction1(setComplexColumnDescriptions), setComplexRowDescriptions = js.Any.fromFunction1(setComplexRowDescriptions), setData = js.Any.fromFunction1(setData), setRowDescriptions = js.Any.fromFunction1(setRowDescriptions))
  
    __obj.asInstanceOf[XComplexDescriptionAccess]
  }
}

