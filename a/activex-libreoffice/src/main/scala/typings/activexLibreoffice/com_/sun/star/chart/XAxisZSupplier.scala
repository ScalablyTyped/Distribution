package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to the **z** -axis of a chart.
  * @see XDiagram
  */
trait XAxisZSupplier
  extends StObject
     with XInterface {
  
  /**
    * @returns the properties of the **z** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  val ZAxis: XPropertySet
  
  /**
    * @returns the **z** -axis title shape.
    * @see ChartTitle
    */
  val ZAxisTitle: XShape
  
  /**
    * @returns the properties of the help grid (minor grid) of the **z** -axis of the diagram.
    * @see ChartGrid
    */
  val ZHelpGrid: XPropertySet
  
  /**
    * @returns the properties of the main grid (major grid) of the **z** -axis of the diagram.
    * @see ChartGrid
    */
  val ZMainGrid: XPropertySet
  
  /**
    * @returns the properties of the **z** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  def getZAxis(): XPropertySet
  
  /**
    * @returns the **z** -axis title shape.
    * @see ChartTitle
    */
  def getZAxisTitle(): XShape
  
  /**
    * @returns the properties of the help grid (minor grid) of the **z** -axis of the diagram.
    * @see ChartGrid
    */
  def getZHelpGrid(): XPropertySet
  
  /**
    * @returns the properties of the main grid (major grid) of the **z** -axis of the diagram.
    * @see ChartGrid
    */
  def getZMainGrid(): XPropertySet
}
object XAxisZSupplier {
  
  inline def apply(
    ZAxis: XPropertySet,
    ZAxisTitle: XShape,
    ZHelpGrid: XPropertySet,
    ZMainGrid: XPropertySet,
    acquire: () => Unit,
    getZAxis: () => XPropertySet,
    getZAxisTitle: () => XShape,
    getZHelpGrid: () => XPropertySet,
    getZMainGrid: () => XPropertySet,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XAxisZSupplier = {
    val __obj = js.Dynamic.literal(ZAxis = ZAxis.asInstanceOf[js.Any], ZAxisTitle = ZAxisTitle.asInstanceOf[js.Any], ZHelpGrid = ZHelpGrid.asInstanceOf[js.Any], ZMainGrid = ZMainGrid.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getZAxis = js.Any.fromFunction0(getZAxis), getZAxisTitle = js.Any.fromFunction0(getZAxisTitle), getZHelpGrid = js.Any.fromFunction0(getZHelpGrid), getZMainGrid = js.Any.fromFunction0(getZMainGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAxisZSupplier]
  }
  
  extension [Self <: XAxisZSupplier](x: Self) {
    
    inline def setGetZAxis(value: () => XPropertySet): Self = StObject.set(x, "getZAxis", js.Any.fromFunction0(value))
    
    inline def setGetZAxisTitle(value: () => XShape): Self = StObject.set(x, "getZAxisTitle", js.Any.fromFunction0(value))
    
    inline def setGetZHelpGrid(value: () => XPropertySet): Self = StObject.set(x, "getZHelpGrid", js.Any.fromFunction0(value))
    
    inline def setGetZMainGrid(value: () => XPropertySet): Self = StObject.set(x, "getZMainGrid", js.Any.fromFunction0(value))
    
    inline def setZAxis(value: XPropertySet): Self = StObject.set(x, "ZAxis", value.asInstanceOf[js.Any])
    
    inline def setZAxisTitle(value: XShape): Self = StObject.set(x, "ZAxisTitle", value.asInstanceOf[js.Any])
    
    inline def setZHelpGrid(value: XPropertySet): Self = StObject.set(x, "ZHelpGrid", value.asInstanceOf[js.Any])
    
    inline def setZMainGrid(value: XPropertySet): Self = StObject.set(x, "ZMainGrid", value.asInstanceOf[js.Any])
  }
}
