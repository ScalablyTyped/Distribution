package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** has to be supported by charts providing the capabilities of a horizontal axis, i.e., an **x** -axis. */
@js.native
trait ChartAxisXSupplier extends XAxisXSupplier {
  
  /**
    * This property determines if the x-axis is shown or hidden.
    * @see ChartAxis
    */
  var HasXAxis: Boolean = js.native
  
  /** Determines if the description of the x-axis is shown or hidden. */
  var HasXAxisDescription: Boolean = js.native
  
  /**
    * Determines if the major grid of the x-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasXAxisGrid: Boolean = js.native
  
  /**
    * Determines if the minor grid of the x-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasXAxisHelpGrid: Boolean = js.native
  
  /**
    * Determines if the title of the x-axis is shown or hidden.
    * @see ChartTitle
    */
  var HasXAxisTitle: Boolean = js.native
}
object ChartAxisXSupplier {
  
  @scala.inline
  def apply(
    HasXAxis: Boolean,
    HasXAxisDescription: Boolean,
    HasXAxisGrid: Boolean,
    HasXAxisHelpGrid: Boolean,
    HasXAxisTitle: Boolean,
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
  ): ChartAxisXSupplier = {
    val __obj = js.Dynamic.literal(HasXAxis = HasXAxis.asInstanceOf[js.Any], HasXAxisDescription = HasXAxisDescription.asInstanceOf[js.Any], HasXAxisGrid = HasXAxisGrid.asInstanceOf[js.Any], HasXAxisHelpGrid = HasXAxisHelpGrid.asInstanceOf[js.Any], HasXAxisTitle = HasXAxisTitle.asInstanceOf[js.Any], XAxis = XAxis.asInstanceOf[js.Any], XAxisTitle = XAxisTitle.asInstanceOf[js.Any], XHelpGrid = XHelpGrid.asInstanceOf[js.Any], XMainGrid = XMainGrid.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getXAxis = js.Any.fromFunction0(getXAxis), getXAxisTitle = js.Any.fromFunction0(getXAxisTitle), getXHelpGrid = js.Any.fromFunction0(getXHelpGrid), getXMainGrid = js.Any.fromFunction0(getXMainGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[ChartAxisXSupplier]
  }
  
  @scala.inline
  implicit class ChartAxisXSupplierMutableBuilder[Self <: ChartAxisXSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasXAxis(value: Boolean): Self = StObject.set(x, "HasXAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasXAxisDescription(value: Boolean): Self = StObject.set(x, "HasXAxisDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasXAxisGrid(value: Boolean): Self = StObject.set(x, "HasXAxisGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasXAxisHelpGrid(value: Boolean): Self = StObject.set(x, "HasXAxisHelpGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasXAxisTitle(value: Boolean): Self = StObject.set(x, "HasXAxisTitle", value.asInstanceOf[js.Any])
  }
}
