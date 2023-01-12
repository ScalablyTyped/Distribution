package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A data series represents the object that has all the knowledge to be rendered as a visual data series. */
trait XDataSeries
  extends StObject
     with XInterface {
  
  /**
    * @param nIndex specifies the index of the data point within the series. The first index is 0.
    * @returns the element at the specified index.
    * @throws com::sun::star::lang::IndexOutOfBoundException if the index is not valid.
    */
  def getDataPointByIndex(nIndex: Double): XPropertySet
  
  /** all data point formatting are cleared */
  def resetAllDataPoints(): Unit
  
  /**
    * the formatting of the specified data point is cleared
    * @param nIndex specifies the index of the data point within the series. The first index is 0.
    */
  def resetDataPoint(nIndex: Double): Unit
}
object XDataSeries {
  
  inline def apply(
    acquire: () => Unit,
    getDataPointByIndex: Double => XPropertySet,
    queryInterface: `type` => Any,
    release: () => Unit,
    resetAllDataPoints: () => Unit,
    resetDataPoint: Double => Unit
  ): XDataSeries = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDataPointByIndex = js.Any.fromFunction1(getDataPointByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), resetAllDataPoints = js.Any.fromFunction0(resetAllDataPoints), resetDataPoint = js.Any.fromFunction1(resetDataPoint))
    __obj.asInstanceOf[XDataSeries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XDataSeries] (val x: Self) extends AnyVal {
    
    inline def setGetDataPointByIndex(value: Double => XPropertySet): Self = StObject.set(x, "getDataPointByIndex", js.Any.fromFunction1(value))
    
    inline def setResetAllDataPoints(value: () => Unit): Self = StObject.set(x, "resetAllDataPoints", js.Any.fromFunction0(value))
    
    inline def setResetDataPoint(value: Double => Unit): Self = StObject.set(x, "resetDataPoint", js.Any.fromFunction1(value))
  }
}
