package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to the **y** -axis of a chart.
  *
  * Note that not all diagrams are capable of displaying a **y** -axis, e.g., the {@link PieDiagram} .
  * @see XDiagram
  */
trait XAxisYSupplier
  extends StObject
     with XInterface {
  
  /**
    * @returns the properties of the **y** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  val YAxis: XPropertySet
  
  /**
    * @returns the **y** -axis title shape.
    * @see ChartTitle
    */
  val YAxisTitle: XShape
  
  /**
    * @returns the properties of the help grid (minor grid) of the **y** -axis of the diagram.
    * @see ChartGrid
    */
  val YHelpGrid: XPropertySet
  
  /**
    * @returns the properties of the main grid (major grid) of the **y** -axis of the diagram.
    * @see ChartGrid
    */
  val YMainGrid: XPropertySet
  
  /**
    * @returns the properties of the **y** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  def getYAxis(): XPropertySet
  
  /**
    * @returns the **y** -axis title shape.
    * @see ChartTitle
    */
  def getYAxisTitle(): XShape
  
  /**
    * @returns the properties of the help grid (minor grid) of the **y** -axis of the diagram.
    * @see ChartGrid
    */
  def getYHelpGrid(): XPropertySet
  
  /**
    * @returns the properties of the main grid (major grid) of the **y** -axis of the diagram.
    * @see ChartGrid
    */
  def getYMainGrid(): XPropertySet
}
object XAxisYSupplier {
  
  @scala.inline
  def apply(
    YAxis: XPropertySet,
    YAxisTitle: XShape,
    YHelpGrid: XPropertySet,
    YMainGrid: XPropertySet,
    acquire: () => Unit,
    getYAxis: () => XPropertySet,
    getYAxisTitle: () => XShape,
    getYHelpGrid: () => XPropertySet,
    getYMainGrid: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAxisYSupplier = {
    val __obj = js.Dynamic.literal(YAxis = YAxis.asInstanceOf[js.Any], YAxisTitle = YAxisTitle.asInstanceOf[js.Any], YHelpGrid = YHelpGrid.asInstanceOf[js.Any], YMainGrid = YMainGrid.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getYAxis = js.Any.fromFunction0(getYAxis), getYAxisTitle = js.Any.fromFunction0(getYAxisTitle), getYHelpGrid = js.Any.fromFunction0(getYHelpGrid), getYMainGrid = js.Any.fromFunction0(getYMainGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAxisYSupplier]
  }
  
  @scala.inline
  implicit class XAxisYSupplierMutableBuilder[Self <: XAxisYSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetYAxis(value: () => XPropertySet): Self = StObject.set(x, "getYAxis", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetYAxisTitle(value: () => XShape): Self = StObject.set(x, "getYAxisTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetYHelpGrid(value: () => XPropertySet): Self = StObject.set(x, "getYHelpGrid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetYMainGrid(value: () => XPropertySet): Self = StObject.set(x, "getYMainGrid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setYAxis(value: XPropertySet): Self = StObject.set(x, "YAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisTitle(value: XShape): Self = StObject.set(x, "YAxisTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYHelpGrid(value: XPropertySet): Self = StObject.set(x, "YHelpGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYMainGrid(value: XPropertySet): Self = StObject.set(x, "YMainGrid", value.asInstanceOf[js.Any])
  }
}
