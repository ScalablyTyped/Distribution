package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * manages the data of the chart.
  * @see XChartDocument
  */
trait XChartData
  extends StObject
     with XInterface {
  
  /** @returns the value which is to be used as an indicator for a missing value in the data.  In IEEE arithmetic format it is one of the NaN values, so there a */
  val NotANumber: Double
  
  /**
    * allows a component supporting the {@link XChartDataChangeEventListener} interface to register as listener. The component will be notified with a
    * {@link ChartDataChangeEvent} every time the chart's data changes.
    * @param aListener the component that is to be added as listener
    * @see XChartDataChangeEventListener
    * @see ChartDataChangeEvent
    */
  def addChartDataChangeEventListener(aListener: XChartDataChangeEventListener): Unit
  
  /** @returns the value which is to be used as an indicator for a missing value in the data.  In IEEE arithmetic format it is one of the NaN values, so there a */
  def getNotANumber(): Double
  
  /**
    * checks whether the value given is equal to the indicator value for a missing value.
    *
    * In IEEE arithmetic format it is one of the NaN values, so there are no conflicts with existing numeric values.
    *
    * Always use this method to check, if a value is **not a number** . If you compare the value returned by {@link XChartData.getNotANumber()} to another
    * double value using the = operator, you may not get the desired result!
    * @param nNumber the number that you want to check for validity.
    * @returns `TRUE` if the number given is interpreted by the chart as a missing value.
    */
  def isNotANumber(nNumber: Double): Boolean
  
  /**
    * removes a previously registered listener.
    * @param aListener the component that is to be removed
    */
  def removeChartDataChangeEventListener(aListener: XChartDataChangeEventListener): Unit
}
object XChartData {
  
  @scala.inline
  def apply(
    NotANumber: Double,
    acquire: () => Unit,
    addChartDataChangeEventListener: XChartDataChangeEventListener => Unit,
    getNotANumber: () => Double,
    isNotANumber: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChartDataChangeEventListener: XChartDataChangeEventListener => Unit
  ): XChartData = {
    val __obj = js.Dynamic.literal(NotANumber = NotANumber.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addChartDataChangeEventListener = js.Any.fromFunction1(addChartDataChangeEventListener), getNotANumber = js.Any.fromFunction0(getNotANumber), isNotANumber = js.Any.fromFunction1(isNotANumber), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChartDataChangeEventListener = js.Any.fromFunction1(removeChartDataChangeEventListener))
    __obj.asInstanceOf[XChartData]
  }
  
  @scala.inline
  implicit class XChartDataMutableBuilder[Self <: XChartData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddChartDataChangeEventListener(value: XChartDataChangeEventListener => Unit): Self = StObject.set(x, "addChartDataChangeEventListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNotANumber(value: () => Double): Self = StObject.set(x, "getNotANumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNotANumber(value: Double => Boolean): Self = StObject.set(x, "isNotANumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotANumber(value: Double): Self = StObject.set(x, "NotANumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveChartDataChangeEventListener(value: XChartDataChangeEventListener => Unit): Self = StObject.set(x, "removeChartDataChangeEventListener", js.Any.fromFunction1(value))
  }
}
