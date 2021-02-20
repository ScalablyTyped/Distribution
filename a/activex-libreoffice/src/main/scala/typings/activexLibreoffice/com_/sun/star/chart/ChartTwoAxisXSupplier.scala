package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** a helper service for chart documents which supply primary and secondary x-axes. */
@js.native
trait ChartTwoAxisXSupplier
  extends XTwoAxisXSupplier
     with ChartAxisXSupplier {
  
  /**
    * determines if the secondary x-axis is shown or hidden.
    * @see ChartAxis
    */
  var HasSecondaryXAxis: Boolean = js.native
  
  /** determines for the secondary x-axis if the labels at the tick marks are shown or hidden. */
  var HasSecondaryXAxisDescription: Boolean = js.native
  
  /**
    * determines if the title of the secondary X-axis is shown or hidden.
    * @see ChartTitle
    * @since OOo 3.0
    */
  var HasSecondaryXAxisTitle: Boolean = js.native
}
object ChartTwoAxisXSupplier {
  
  @scala.inline
  def apply(
    HasSecondaryXAxis: Boolean,
    HasSecondaryXAxisDescription: Boolean,
    HasSecondaryXAxisTitle: Boolean,
    HasXAxis: Boolean,
    HasXAxisDescription: Boolean,
    HasXAxisGrid: Boolean,
    HasXAxisHelpGrid: Boolean,
    HasXAxisTitle: Boolean,
    SecondaryXAxis: XPropertySet,
    XAxis: XPropertySet,
    XAxisTitle: XShape,
    XHelpGrid: XPropertySet,
    XMainGrid: XPropertySet,
    acquire: () => Unit,
    getSecondaryXAxis: () => XPropertySet,
    getXAxis: () => XPropertySet,
    getXAxisTitle: () => XShape,
    getXHelpGrid: () => XPropertySet,
    getXMainGrid: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): ChartTwoAxisXSupplier = {
    val __obj = js.Dynamic.literal(HasSecondaryXAxis = HasSecondaryXAxis.asInstanceOf[js.Any], HasSecondaryXAxisDescription = HasSecondaryXAxisDescription.asInstanceOf[js.Any], HasSecondaryXAxisTitle = HasSecondaryXAxisTitle.asInstanceOf[js.Any], HasXAxis = HasXAxis.asInstanceOf[js.Any], HasXAxisDescription = HasXAxisDescription.asInstanceOf[js.Any], HasXAxisGrid = HasXAxisGrid.asInstanceOf[js.Any], HasXAxisHelpGrid = HasXAxisHelpGrid.asInstanceOf[js.Any], HasXAxisTitle = HasXAxisTitle.asInstanceOf[js.Any], SecondaryXAxis = SecondaryXAxis.asInstanceOf[js.Any], XAxis = XAxis.asInstanceOf[js.Any], XAxisTitle = XAxisTitle.asInstanceOf[js.Any], XHelpGrid = XHelpGrid.asInstanceOf[js.Any], XMainGrid = XMainGrid.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getSecondaryXAxis = js.Any.fromFunction0(getSecondaryXAxis), getXAxis = js.Any.fromFunction0(getXAxis), getXAxisTitle = js.Any.fromFunction0(getXAxisTitle), getXHelpGrid = js.Any.fromFunction0(getXHelpGrid), getXMainGrid = js.Any.fromFunction0(getXMainGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[ChartTwoAxisXSupplier]
  }
  
  @scala.inline
  implicit class ChartTwoAxisXSupplierMutableBuilder[Self <: ChartTwoAxisXSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasSecondaryXAxis(value: Boolean): Self = StObject.set(x, "HasSecondaryXAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSecondaryXAxisDescription(value: Boolean): Self = StObject.set(x, "HasSecondaryXAxisDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSecondaryXAxisTitle(value: Boolean): Self = StObject.set(x, "HasSecondaryXAxisTitle", value.asInstanceOf[js.Any])
  }
}
