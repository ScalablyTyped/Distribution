package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XChartTypeContainer
  extends StObject
     with XInterface {
  
  /** retrieve all chart types */
  var ChartTypes: SafeArray[XChartType]
  
  /**
    * add a chart type to the chart type container
    * @throws IllegalArgumentException If the given chart type is already contained in the chart type container.
    */
  def addChartType(aChartType: XChartType): Unit
  
  /** retrieve all chart types */
  def getChartTypes(): SafeArray[XChartType]
  
  /** removes one data series from the chart type container. */
  def removeChartType(aChartType: XChartType): Unit
  
  /** set all chart types */
  def setChartTypes(aChartTypes: SeqEquiv[XChartType]): Unit
}
object XChartTypeContainer {
  
  @scala.inline
  def apply(
    ChartTypes: SafeArray[XChartType],
    acquire: () => Unit,
    addChartType: XChartType => Unit,
    getChartTypes: () => SafeArray[XChartType],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChartType: XChartType => Unit,
    setChartTypes: SeqEquiv[XChartType] => Unit
  ): XChartTypeContainer = {
    val __obj = js.Dynamic.literal(ChartTypes = ChartTypes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addChartType = js.Any.fromFunction1(addChartType), getChartTypes = js.Any.fromFunction0(getChartTypes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChartType = js.Any.fromFunction1(removeChartType), setChartTypes = js.Any.fromFunction1(setChartTypes))
    __obj.asInstanceOf[XChartTypeContainer]
  }
  
  @scala.inline
  implicit class XChartTypeContainerMutableBuilder[Self <: XChartTypeContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddChartType(value: XChartType => Unit): Self = StObject.set(x, "addChartType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChartTypes(value: SafeArray[XChartType]): Self = StObject.set(x, "ChartTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetChartTypes(value: () => SafeArray[XChartType]): Self = StObject.set(x, "getChartTypes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveChartType(value: XChartType => Unit): Self = StObject.set(x, "removeChartType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetChartTypes(value: SeqEquiv[XChartType] => Unit): Self = StObject.set(x, "setChartTypes", js.Any.fromFunction1(value))
  }
}
