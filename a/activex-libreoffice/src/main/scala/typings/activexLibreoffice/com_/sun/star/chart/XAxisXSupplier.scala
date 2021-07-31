package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to the **x** -axis of a chart.
  *
  * Note that not all diagrams are capable of displaying an **x** -axis, e.g., the {@link PieDiagram} .
  * @see XDiagram
  */
trait XAxisXSupplier
  extends StObject
     with XInterface {
  
  /**
    * @returns the properties of the **x** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  val XAxis: XPropertySet
  
  /**
    * @returns the **x** -axis title shape.
    * @see ChartTitle
    */
  val XAxisTitle: XShape
  
  /**
    * @returns the properties of the help grid (minor grid) of the **x** -axis of the diagram.
    * @see ChartGrid
    */
  val XHelpGrid: XPropertySet
  
  /**
    * @returns the properties of the main grid (major grid) of the **x** -axis of the diagram.
    * @see ChartGrid
    */
  val XMainGrid: XPropertySet
  
  /**
    * @returns the properties of the **x** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  def getXAxis(): XPropertySet
  
  /**
    * @returns the **x** -axis title shape.
    * @see ChartTitle
    */
  def getXAxisTitle(): XShape
  
  /**
    * @returns the properties of the help grid (minor grid) of the **x** -axis of the diagram.
    * @see ChartGrid
    */
  def getXHelpGrid(): XPropertySet
  
  /**
    * @returns the properties of the main grid (major grid) of the **x** -axis of the diagram.
    * @see ChartGrid
    */
  def getXMainGrid(): XPropertySet
}
object XAxisXSupplier {
  
  @scala.inline
  def apply(
    XAxis: XPropertySet,
    XAxisTitle: XShape,
    XHelpGrid: XPropertySet,
    XMainGrid: XPropertySet,
    acquire: () => Unit,
    getXAxis: () => XPropertySet,
    getXAxisTitle: () => XShape,
    getXHelpGrid: () => XPropertySet,
    getXMainGrid: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAxisXSupplier = {
    val __obj = js.Dynamic.literal(XAxis = XAxis.asInstanceOf[js.Any], XAxisTitle = XAxisTitle.asInstanceOf[js.Any], XHelpGrid = XHelpGrid.asInstanceOf[js.Any], XMainGrid = XMainGrid.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getXAxis = js.Any.fromFunction0(getXAxis), getXAxisTitle = js.Any.fromFunction0(getXAxisTitle), getXHelpGrid = js.Any.fromFunction0(getXHelpGrid), getXMainGrid = js.Any.fromFunction0(getXMainGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAxisXSupplier]
  }
  
  @scala.inline
  implicit class XAxisXSupplierMutableBuilder[Self <: XAxisXSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetXAxis(value: () => XPropertySet): Self = StObject.set(x, "getXAxis", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetXAxisTitle(value: () => XShape): Self = StObject.set(x, "getXAxisTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetXHelpGrid(value: () => XPropertySet): Self = StObject.set(x, "getXHelpGrid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetXMainGrid(value: () => XPropertySet): Self = StObject.set(x, "getXMainGrid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setXAxis(value: XPropertySet): Self = StObject.set(x, "XAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisTitle(value: XShape): Self = StObject.set(x, "XAxisTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXHelpGrid(value: XPropertySet): Self = StObject.set(x, "XHelpGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXMainGrid(value: XPropertySet): Self = StObject.set(x, "XMainGrid", value.asInstanceOf[js.Any])
  }
}
