package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to the **x** -axis of a chart.
  *
  * Note that not all diagrams are capable of displaying an **x** -axis, e.g., the {@link PieDiagram} .
  * @see XDiagram
  */
@js.native
trait XAxisXSupplier extends XInterface {
  
  /**
    * @returns the properties of the **x** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  val XAxis: XPropertySet = js.native
  
  /**
    * @returns the **x** -axis title shape.
    * @see ChartTitle
    */
  val XAxisTitle: XShape = js.native
  
  /**
    * @returns the properties of the help grid (minor grid) of the **x** -axis of the diagram.
    * @see ChartGrid
    */
  val XHelpGrid: XPropertySet = js.native
  
  /**
    * @returns the properties of the main grid (major grid) of the **x** -axis of the diagram.
    * @see ChartGrid
    */
  val XMainGrid: XPropertySet = js.native
  
  /**
    * @returns the properties of the **x** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  def getXAxis(): XPropertySet = js.native
  
  /**
    * @returns the **x** -axis title shape.
    * @see ChartTitle
    */
  def getXAxisTitle(): XShape = js.native
  
  /**
    * @returns the properties of the help grid (minor grid) of the **x** -axis of the diagram.
    * @see ChartGrid
    */
  def getXHelpGrid(): XPropertySet = js.native
  
  /**
    * @returns the properties of the main grid (major grid) of the **x** -axis of the diagram.
    * @see ChartGrid
    */
  def getXMainGrid(): XPropertySet = js.native
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
  implicit class XAxisXSupplierOps[Self <: XAxisXSupplier] (val x: Self) extends AnyVal {
    
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
    def setXAxis(value: XPropertySet): Self = this.set("XAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisTitle(value: XShape): Self = this.set("XAxisTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXHelpGrid(value: XPropertySet): Self = this.set("XHelpGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXMainGrid(value: XPropertySet): Self = this.set("XMainGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetXAxis(value: () => XPropertySet): Self = this.set("getXAxis", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetXAxisTitle(value: () => XShape): Self = this.set("getXAxisTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetXHelpGrid(value: () => XPropertySet): Self = this.set("getXHelpGrid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetXMainGrid(value: () => XPropertySet): Self = this.set("getXMainGrid", js.Any.fromFunction0(value))
  }
}
