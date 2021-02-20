package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A helper service for the y-axis. */
@js.native
trait ChartAxisYSupplier extends XAxisYSupplier {
  
  /**
    * Determines if the y-axis is shown or hidden.
    * @see ChartAxis
    */
  var HasYAxis: Boolean = js.native
  
  /** Determines if the description of the y-axis is shown or hidden. */
  var HasYAxisDescription: Boolean = js.native
  
  /**
    * Determines if the major grid of the y-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasYAxisGrid: Boolean = js.native
  
  /**
    * Determines if the minor grid of the y-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasYAxisHelpGrid: Boolean = js.native
  
  /**
    * Determines if the title of the y-axis is shown or hidden.
    * @see ChartTitle
    */
  var HasYAxisTitle: Boolean = js.native
}
object ChartAxisYSupplier {
  
  @scala.inline
  def apply(
    HasYAxis: Boolean,
    HasYAxisDescription: Boolean,
    HasYAxisGrid: Boolean,
    HasYAxisHelpGrid: Boolean,
    HasYAxisTitle: Boolean,
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
  ): ChartAxisYSupplier = {
    val __obj = js.Dynamic.literal(HasYAxis = HasYAxis.asInstanceOf[js.Any], HasYAxisDescription = HasYAxisDescription.asInstanceOf[js.Any], HasYAxisGrid = HasYAxisGrid.asInstanceOf[js.Any], HasYAxisHelpGrid = HasYAxisHelpGrid.asInstanceOf[js.Any], HasYAxisTitle = HasYAxisTitle.asInstanceOf[js.Any], YAxis = YAxis.asInstanceOf[js.Any], YAxisTitle = YAxisTitle.asInstanceOf[js.Any], YHelpGrid = YHelpGrid.asInstanceOf[js.Any], YMainGrid = YMainGrid.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getYAxis = js.Any.fromFunction0(getYAxis), getYAxisTitle = js.Any.fromFunction0(getYAxisTitle), getYHelpGrid = js.Any.fromFunction0(getYHelpGrid), getYMainGrid = js.Any.fromFunction0(getYMainGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[ChartAxisYSupplier]
  }
  
  @scala.inline
  implicit class ChartAxisYSupplierMutableBuilder[Self <: ChartAxisYSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasYAxis(value: Boolean): Self = StObject.set(x, "HasYAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasYAxisDescription(value: Boolean): Self = StObject.set(x, "HasYAxisDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasYAxisGrid(value: Boolean): Self = StObject.set(x, "HasYAxisGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasYAxisHelpGrid(value: Boolean): Self = StObject.set(x, "HasYAxisHelpGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasYAxisTitle(value: Boolean): Self = StObject.set(x, "HasYAxisTitle", value.asInstanceOf[js.Any])
  }
}
