package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.chart.XChartDataChangeEventListener
import typings.activexLibreoffice.com_.sun.star.chart.XComplexDescriptionAccess
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Offers any access to column and row descriptions. This allows to set date values as categories.
  *
  * Can be obtained from interface {@link XChartDocument} via method {@link getData()} .
  * @since OOo 3.4
  */
trait XAnyDescriptionAccess
  extends StObject
     with XComplexDescriptionAccess {
  
  /**
    * retrieves the descriptions for all columns.
    * @returns a sequence of sequences of anys representing the descriptions of all columns. The outer index represents different columns. The inner index repre
    */
  val AnyColumnDescriptions: SafeArray[SafeArray[Any]]
  
  /**
    * retrieves the descriptions for all rows.
    * @returns a sequence of sequences of anys representing the descriptions of all rows. The outer index represents different rows. The inner index represents
    */
  val AnyRowDescriptions: SafeArray[SafeArray[Any]]
  
  /**
    * retrieves the descriptions for all columns.
    * @returns a sequence of sequences of anys representing the descriptions of all columns. The outer index represents different columns. The inner index repre
    */
  def getAnyColumnDescriptions(): SafeArray[SafeArray[Any]]
  
  /**
    * retrieves the descriptions for all rows.
    * @returns a sequence of sequences of anys representing the descriptions of all rows. The outer index represents different rows. The inner index represents
    */
  def getAnyRowDescriptions(): SafeArray[SafeArray[Any]]
  
  /**
    * sets the descriptions for all columns.
    * @param rColumnDescriptions a sequence of sequences of anys which represent the descriptions of all columns. The outer index represents different columns
    */
  def setAnyColumnDescriptions(rColumnDescriptions: SeqEquiv[SeqEquiv[Any]]): Unit
  
  /**
    * sets the descriptions for all rows.
    * @param rRowDescriptions a sequence of sequences of anys representing the descriptions of all rows. The outer index represents different rows. The inner
    */
  def setAnyRowDescriptions(rRowDescriptions: SeqEquiv[SeqEquiv[Any]]): Unit
}
object XAnyDescriptionAccess {
  
  inline def apply(
    AnyColumnDescriptions: SafeArray[SafeArray[Any]],
    AnyRowDescriptions: SafeArray[SafeArray[Any]],
    ColumnDescriptions: SafeArray[String],
    ComplexColumnDescriptions: SafeArray[SafeArray[String]],
    ComplexRowDescriptions: SafeArray[SafeArray[String]],
    Data: SafeArray[SafeArray[Double]],
    NotANumber: Double,
    RowDescriptions: SafeArray[String],
    acquire: () => Unit,
    addChartDataChangeEventListener: XChartDataChangeEventListener => Unit,
    getAnyColumnDescriptions: () => SafeArray[SafeArray[Any]],
    getAnyRowDescriptions: () => SafeArray[SafeArray[Any]],
    getColumnDescriptions: () => SafeArray[String],
    getComplexColumnDescriptions: () => SafeArray[SafeArray[String]],
    getComplexRowDescriptions: () => SafeArray[SafeArray[String]],
    getData: () => SafeArray[SafeArray[Double]],
    getNotANumber: () => Double,
    getRowDescriptions: () => SafeArray[String],
    isNotANumber: Double => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeChartDataChangeEventListener: XChartDataChangeEventListener => Unit,
    setAnyColumnDescriptions: SeqEquiv[SeqEquiv[Any]] => Unit,
    setAnyRowDescriptions: SeqEquiv[SeqEquiv[Any]] => Unit,
    setColumnDescriptions: SeqEquiv[String] => Unit,
    setComplexColumnDescriptions: SeqEquiv[SeqEquiv[String]] => Unit,
    setComplexRowDescriptions: SeqEquiv[SeqEquiv[String]] => Unit,
    setData: SeqEquiv[SeqEquiv[Double]] => Unit,
    setRowDescriptions: SeqEquiv[String] => Unit
  ): XAnyDescriptionAccess = {
    val __obj = js.Dynamic.literal(AnyColumnDescriptions = AnyColumnDescriptions.asInstanceOf[js.Any], AnyRowDescriptions = AnyRowDescriptions.asInstanceOf[js.Any], ColumnDescriptions = ColumnDescriptions.asInstanceOf[js.Any], ComplexColumnDescriptions = ComplexColumnDescriptions.asInstanceOf[js.Any], ComplexRowDescriptions = ComplexRowDescriptions.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], NotANumber = NotANumber.asInstanceOf[js.Any], RowDescriptions = RowDescriptions.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addChartDataChangeEventListener = js.Any.fromFunction1(addChartDataChangeEventListener), getAnyColumnDescriptions = js.Any.fromFunction0(getAnyColumnDescriptions), getAnyRowDescriptions = js.Any.fromFunction0(getAnyRowDescriptions), getColumnDescriptions = js.Any.fromFunction0(getColumnDescriptions), getComplexColumnDescriptions = js.Any.fromFunction0(getComplexColumnDescriptions), getComplexRowDescriptions = js.Any.fromFunction0(getComplexRowDescriptions), getData = js.Any.fromFunction0(getData), getNotANumber = js.Any.fromFunction0(getNotANumber), getRowDescriptions = js.Any.fromFunction0(getRowDescriptions), isNotANumber = js.Any.fromFunction1(isNotANumber), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChartDataChangeEventListener = js.Any.fromFunction1(removeChartDataChangeEventListener), setAnyColumnDescriptions = js.Any.fromFunction1(setAnyColumnDescriptions), setAnyRowDescriptions = js.Any.fromFunction1(setAnyRowDescriptions), setColumnDescriptions = js.Any.fromFunction1(setColumnDescriptions), setComplexColumnDescriptions = js.Any.fromFunction1(setComplexColumnDescriptions), setComplexRowDescriptions = js.Any.fromFunction1(setComplexRowDescriptions), setData = js.Any.fromFunction1(setData), setRowDescriptions = js.Any.fromFunction1(setRowDescriptions))
    __obj.asInstanceOf[XAnyDescriptionAccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XAnyDescriptionAccess] (val x: Self) extends AnyVal {
    
    inline def setAnyColumnDescriptions(value: SafeArray[SafeArray[Any]]): Self = StObject.set(x, "AnyColumnDescriptions", value.asInstanceOf[js.Any])
    
    inline def setAnyRowDescriptions(value: SafeArray[SafeArray[Any]]): Self = StObject.set(x, "AnyRowDescriptions", value.asInstanceOf[js.Any])
    
    inline def setGetAnyColumnDescriptions(value: () => SafeArray[SafeArray[Any]]): Self = StObject.set(x, "getAnyColumnDescriptions", js.Any.fromFunction0(value))
    
    inline def setGetAnyRowDescriptions(value: () => SafeArray[SafeArray[Any]]): Self = StObject.set(x, "getAnyRowDescriptions", js.Any.fromFunction0(value))
    
    inline def setSetAnyColumnDescriptions(value: SeqEquiv[SeqEquiv[Any]] => Unit): Self = StObject.set(x, "setAnyColumnDescriptions", js.Any.fromFunction1(value))
    
    inline def setSetAnyRowDescriptions(value: SeqEquiv[SeqEquiv[Any]] => Unit): Self = StObject.set(x, "setAnyRowDescriptions", js.Any.fromFunction1(value))
  }
}
