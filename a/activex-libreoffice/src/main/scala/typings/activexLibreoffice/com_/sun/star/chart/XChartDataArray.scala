package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to data represented as an array of rows.
  *
  * Can be obtained from interface {@link XChartDocument} via method {@link getData()} .
  *
  * If used for an {@link XYDiagram} , the row number 0 represents the **x** -values.
  */
@js.native
trait XChartDataArray extends XChartData {
  
  /**
    * retrieves the description texts for all columns.
    * @returns a sequence of strings, each representing the description of a column.
    */
  var ColumnDescriptions: SafeArray[String] = js.native
  
  /**
    * retrieves the numerical data as a nested sequence of values.
    * @returns the values as a sequence of sequences. The inner sequence represents rows.
    */
  var Data: SafeArray[SafeArray[Double]] = js.native
  
  /**
    * retrieves the description texts for all rows.
    * @returns a sequence of strings, each representing the description of a row.
    */
  var RowDescriptions: SafeArray[String] = js.native
  
  /**
    * retrieves the description texts for all columns.
    * @returns a sequence of strings, each representing the description of a column.
    */
  def getColumnDescriptions(): SafeArray[String] = js.native
  
  /**
    * retrieves the numerical data as a nested sequence of values.
    * @returns the values as a sequence of sequences. The inner sequence represents rows.
    */
  def getData(): SafeArray[SafeArray[Double]] = js.native
  
  /**
    * retrieves the description texts for all rows.
    * @returns a sequence of strings, each representing the description of a row.
    */
  def getRowDescriptions(): SafeArray[String] = js.native
  
  /**
    * sets the description texts for all columns.
    * @param aColumnDescriptions a sequence of strings which represent a description for each column.
    */
  def setColumnDescriptions(aColumnDescriptions: SeqEquiv[String]): Unit = js.native
  
  /**
    * sets the chart data as an array of numbers.
    * @param aData the values as a sequence of sequences. The inner sequence represents rows.
    */
  def setData(aData: SeqEquiv[SeqEquiv[Double]]): Unit = js.native
  
  /**
    * sets the description texts for all rows.
    * @param aRowDescriptions a sequence of strings which represent a description for each row.
    */
  def setRowDescriptions(aRowDescriptions: SeqEquiv[String]): Unit = js.native
}
object XChartDataArray {
  
  @scala.inline
  def apply(
    ColumnDescriptions: SafeArray[String],
    Data: SafeArray[SafeArray[Double]],
    NotANumber: Double,
    RowDescriptions: SafeArray[String],
    acquire: () => Unit,
    addChartDataChangeEventListener: XChartDataChangeEventListener => Unit,
    getColumnDescriptions: () => SafeArray[String],
    getData: () => SafeArray[SafeArray[Double]],
    getNotANumber: () => Double,
    getRowDescriptions: () => SafeArray[String],
    isNotANumber: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChartDataChangeEventListener: XChartDataChangeEventListener => Unit,
    setColumnDescriptions: SeqEquiv[String] => Unit,
    setData: SeqEquiv[SeqEquiv[Double]] => Unit,
    setRowDescriptions: SeqEquiv[String] => Unit
  ): XChartDataArray = {
    val __obj = js.Dynamic.literal(ColumnDescriptions = ColumnDescriptions.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], NotANumber = NotANumber.asInstanceOf[js.Any], RowDescriptions = RowDescriptions.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addChartDataChangeEventListener = js.Any.fromFunction1(addChartDataChangeEventListener), getColumnDescriptions = js.Any.fromFunction0(getColumnDescriptions), getData = js.Any.fromFunction0(getData), getNotANumber = js.Any.fromFunction0(getNotANumber), getRowDescriptions = js.Any.fromFunction0(getRowDescriptions), isNotANumber = js.Any.fromFunction1(isNotANumber), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChartDataChangeEventListener = js.Any.fromFunction1(removeChartDataChangeEventListener), setColumnDescriptions = js.Any.fromFunction1(setColumnDescriptions), setData = js.Any.fromFunction1(setData), setRowDescriptions = js.Any.fromFunction1(setRowDescriptions))
    __obj.asInstanceOf[XChartDataArray]
  }
  
  @scala.inline
  implicit class XChartDataArrayOps[Self <: XChartDataArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumnDescriptions(value: SafeArray[String]): Self = this.set("ColumnDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: SafeArray[SafeArray[Double]]): Self = this.set("Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDescriptions(value: SafeArray[String]): Self = this.set("RowDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetColumnDescriptions(value: () => SafeArray[String]): Self = this.set("getColumnDescriptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetData(value: () => SafeArray[SafeArray[Double]]): Self = this.set("getData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRowDescriptions(value: () => SafeArray[String]): Self = this.set("getRowDescriptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetColumnDescriptions(value: SeqEquiv[String] => Unit): Self = this.set("setColumnDescriptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetData(value: SeqEquiv[SeqEquiv[Double]] => Unit): Self = this.set("setData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRowDescriptions(value: SeqEquiv[String] => Unit): Self = this.set("setRowDescriptions", js.Any.fromFunction1(value))
  }
}
