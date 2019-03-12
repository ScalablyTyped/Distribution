package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Offers any access to column and row descriptions. This allows to set date values as categories.
  *
  * Can be obtained from interface {@link XChartDocument} via method {@link getData()} .
  * @since OOo 3.4
  */
trait XAnyDescriptionAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.XComplexDescriptionAccess {
  /**
    * retrieves the descriptions for all columns.
    * @returns a sequence of sequences of anys representing the descriptions of all columns. The outer index represents different columns. The inner index repre
    */
  val AnyColumnDescriptions: stdLib.SafeArray[stdLib.SafeArray[_]]
  /**
    * retrieves the descriptions for all rows.
    * @returns a sequence of sequences of anys representing the descriptions of all rows. The outer index represents different rows. The inner index represents
    */
  val AnyRowDescriptions: stdLib.SafeArray[stdLib.SafeArray[_]]
  /**
    * retrieves the descriptions for all columns.
    * @returns a sequence of sequences of anys representing the descriptions of all columns. The outer index represents different columns. The inner index repre
    */
  def getAnyColumnDescriptions(): stdLib.SafeArray[stdLib.SafeArray[_]]
  /**
    * retrieves the descriptions for all rows.
    * @returns a sequence of sequences of anys representing the descriptions of all rows. The outer index represents different rows. The inner index represents
    */
  def getAnyRowDescriptions(): stdLib.SafeArray[stdLib.SafeArray[_]]
  /**
    * sets the descriptions for all columns.
    * @param rColumnDescriptions a sequence of sequences of anys which represent the descriptions of all columns. The outer index represents different columns
    */
  def setAnyColumnDescriptions(
    rColumnDescriptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]]
  ): scala.Unit
  /**
    * sets the descriptions for all rows.
    * @param rRowDescriptions a sequence of sequences of anys representing the descriptions of all rows. The outer index represents different rows. The inner
    */
  def setAnyRowDescriptions(
    rRowDescriptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]]
  ): scala.Unit
}

object XAnyDescriptionAccess {
  @scala.inline
  def apply(
    AnyColumnDescriptions: stdLib.SafeArray[stdLib.SafeArray[_]],
    AnyRowDescriptions: stdLib.SafeArray[stdLib.SafeArray[_]],
    ColumnDescriptions: stdLib.SafeArray[java.lang.String],
    ComplexColumnDescriptions: stdLib.SafeArray[stdLib.SafeArray[java.lang.String]],
    ComplexRowDescriptions: stdLib.SafeArray[stdLib.SafeArray[java.lang.String]],
    Data: stdLib.SafeArray[stdLib.SafeArray[scala.Double]],
    NotANumber: scala.Double,
    RowDescriptions: stdLib.SafeArray[java.lang.String],
    acquire: () => scala.Unit,
    addChartDataChangeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.XChartDataChangeEventListener => scala.Unit,
    getAnyColumnDescriptions: () => stdLib.SafeArray[stdLib.SafeArray[_]],
    getAnyRowDescriptions: () => stdLib.SafeArray[stdLib.SafeArray[_]],
    getColumnDescriptions: () => stdLib.SafeArray[java.lang.String],
    getComplexColumnDescriptions: () => stdLib.SafeArray[stdLib.SafeArray[java.lang.String]],
    getComplexRowDescriptions: () => stdLib.SafeArray[stdLib.SafeArray[java.lang.String]],
    getData: () => stdLib.SafeArray[stdLib.SafeArray[scala.Double]],
    getNotANumber: () => scala.Double,
    getRowDescriptions: () => stdLib.SafeArray[java.lang.String],
    isNotANumber: scala.Double => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeChartDataChangeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.XChartDataChangeEventListener => scala.Unit,
    setAnyColumnDescriptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]] => scala.Unit,
    setAnyRowDescriptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]] => scala.Unit,
    setColumnDescriptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String] => scala.Unit,
    setComplexColumnDescriptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]] => scala.Unit,
    setComplexRowDescriptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]] => scala.Unit,
    setData: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]] => scala.Unit,
    setRowDescriptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String] => scala.Unit
  ): XAnyDescriptionAccess = {
    val __obj = js.Dynamic.literal(AnyColumnDescriptions = AnyColumnDescriptions, AnyRowDescriptions = AnyRowDescriptions, ColumnDescriptions = ColumnDescriptions, ComplexColumnDescriptions = ComplexColumnDescriptions, ComplexRowDescriptions = ComplexRowDescriptions, Data = Data, NotANumber = NotANumber, RowDescriptions = RowDescriptions, acquire = js.Any.fromFunction0(acquire), addChartDataChangeEventListener = js.Any.fromFunction1(addChartDataChangeEventListener), getAnyColumnDescriptions = js.Any.fromFunction0(getAnyColumnDescriptions), getAnyRowDescriptions = js.Any.fromFunction0(getAnyRowDescriptions), getColumnDescriptions = js.Any.fromFunction0(getColumnDescriptions), getComplexColumnDescriptions = js.Any.fromFunction0(getComplexColumnDescriptions), getComplexRowDescriptions = js.Any.fromFunction0(getComplexRowDescriptions), getData = js.Any.fromFunction0(getData), getNotANumber = js.Any.fromFunction0(getNotANumber), getRowDescriptions = js.Any.fromFunction0(getRowDescriptions), isNotANumber = js.Any.fromFunction1(isNotANumber), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChartDataChangeEventListener = js.Any.fromFunction1(removeChartDataChangeEventListener), setAnyColumnDescriptions = js.Any.fromFunction1(setAnyColumnDescriptions), setAnyRowDescriptions = js.Any.fromFunction1(setAnyRowDescriptions), setColumnDescriptions = js.Any.fromFunction1(setColumnDescriptions), setComplexColumnDescriptions = js.Any.fromFunction1(setComplexColumnDescriptions), setComplexRowDescriptions = js.Any.fromFunction1(setComplexRowDescriptions), setData = js.Any.fromFunction1(setData), setRowDescriptions = js.Any.fromFunction1(setRowDescriptions))
  
    __obj.asInstanceOf[XAnyDescriptionAccess]
  }
}

