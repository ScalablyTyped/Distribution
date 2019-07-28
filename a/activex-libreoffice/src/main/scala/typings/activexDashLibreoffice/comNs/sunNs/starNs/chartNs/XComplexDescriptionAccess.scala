package typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.std.SafeArray
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
  var ComplexColumnDescriptions: SafeArray[SafeArray[String]]
  /**
    * retrieves the description texts for all rows.
    * @returns a sequence of sequences of strings representing the descriptions of all rows. The outer index represents different rows. The inner index represen
    */
  var ComplexRowDescriptions: SafeArray[SafeArray[String]]
  /**
    * retrieves the description texts for all columns.
    * @returns a sequence of sequences of strings representing the descriptions of all columns. The outer index represents different columns. The inner index re
    */
  def getComplexColumnDescriptions(): SafeArray[SafeArray[String]]
  /**
    * retrieves the description texts for all rows.
    * @returns a sequence of sequences of strings representing the descriptions of all rows. The outer index represents different rows. The inner index represen
    */
  def getComplexRowDescriptions(): SafeArray[SafeArray[String]]
  /**
    * sets the description texts for all columns.
    * @param rColumnDescriptions a sequence of sequences of strings which represent the descriptions of all columns. The outer index represents different colu
    */
  def setComplexColumnDescriptions(rColumnDescriptions: SeqEquiv[SeqEquiv[String]]): Unit
  /**
    * sets the description texts for all rows.
    * @param rRowDescriptions a sequence of sequences of strings representing the descriptions of all rows. The outer index represents different rows. The inn
    */
  def setComplexRowDescriptions(rRowDescriptions: SeqEquiv[SeqEquiv[String]]): Unit
}

object XComplexDescriptionAccess {
  @scala.inline
  def apply(
    ColumnDescriptions: SafeArray[String],
    ComplexColumnDescriptions: SafeArray[SafeArray[String]],
    ComplexRowDescriptions: SafeArray[SafeArray[String]],
    Data: SafeArray[SafeArray[Double]],
    NotANumber: Double,
    RowDescriptions: SafeArray[String],
    acquire: () => Unit,
    addChartDataChangeEventListener: XChartDataChangeEventListener => Unit,
    getColumnDescriptions: () => SafeArray[String],
    getComplexColumnDescriptions: () => SafeArray[SafeArray[String]],
    getComplexRowDescriptions: () => SafeArray[SafeArray[String]],
    getData: () => SafeArray[SafeArray[Double]],
    getNotANumber: () => Double,
    getRowDescriptions: () => SafeArray[String],
    isNotANumber: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChartDataChangeEventListener: XChartDataChangeEventListener => Unit,
    setColumnDescriptions: SeqEquiv[String] => Unit,
    setComplexColumnDescriptions: SeqEquiv[SeqEquiv[String]] => Unit,
    setComplexRowDescriptions: SeqEquiv[SeqEquiv[String]] => Unit,
    setData: SeqEquiv[SeqEquiv[Double]] => Unit,
    setRowDescriptions: SeqEquiv[String] => Unit
  ): XComplexDescriptionAccess = {
    val __obj = js.Dynamic.literal(ColumnDescriptions = ColumnDescriptions, ComplexColumnDescriptions = ComplexColumnDescriptions, ComplexRowDescriptions = ComplexRowDescriptions, Data = Data, NotANumber = NotANumber, RowDescriptions = RowDescriptions, acquire = js.Any.fromFunction0(acquire), addChartDataChangeEventListener = js.Any.fromFunction1(addChartDataChangeEventListener), getColumnDescriptions = js.Any.fromFunction0(getColumnDescriptions), getComplexColumnDescriptions = js.Any.fromFunction0(getComplexColumnDescriptions), getComplexRowDescriptions = js.Any.fromFunction0(getComplexRowDescriptions), getData = js.Any.fromFunction0(getData), getNotANumber = js.Any.fromFunction0(getNotANumber), getRowDescriptions = js.Any.fromFunction0(getRowDescriptions), isNotANumber = js.Any.fromFunction1(isNotANumber), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChartDataChangeEventListener = js.Any.fromFunction1(removeChartDataChangeEventListener), setColumnDescriptions = js.Any.fromFunction1(setColumnDescriptions), setComplexColumnDescriptions = js.Any.fromFunction1(setComplexColumnDescriptions), setComplexRowDescriptions = js.Any.fromFunction1(setComplexRowDescriptions), setData = js.Any.fromFunction1(setData), setRowDescriptions = js.Any.fromFunction1(setRowDescriptions))
  
    __obj.asInstanceOf[XComplexDescriptionAccess]
  }
}

